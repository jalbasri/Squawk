package com.jalbasri.squawk;

import android.util.Log;

import com.google.apphosting.api.DeadlineExceededException;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Servelet that handles connection to Twitter Service
 *
 */
public class TwitterServlet extends HttpServlet {

    private static final Logger logger =
            Logger.getLogger(TwitterServlet.class.getSimpleName());

    /**
     * A Map region representing the entire world,
     * Ensures that we only receive geotagged tweets from Earth.
     *
     */
    //TODO
    private static final double[][] entireWorld = {{0, 0},{0, 0}};

    /**
     * The List of Online Devices
     *
     */
    private List<DeviceInfo> onlineDevices;

    private ConfigurationBuilder configurationBuilder;
    private TwitterStream twitterStream;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException {
        handleTwitterTask(req, resp);
    }

/*    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        handleTwitterTask(req, resp);
    }
*/

    /**
     * Initialize the Twitter4J twitter service and open the twitter stream
     */
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        enqueueNextTwitterTask();
        refreshOnlinceDeviceList();
        if (!onlineDevices.isEmpty()) {
            openTwitterStream();
        }
    }

    private void handleTwitterTask(HttpServletRequest req, HttpServletResponse resp) {
        try {
            while(true) {
                refreshOnlinceDeviceList();
                if(onlineDevices.isEmpty()) {
                    break;
                }
            }
        } catch (DeadlineExceededException e) {
            logger.log(Level.SEVERE, "Deadline Exceeded Exception" + e.getMessage());
        } finally {
            twitterStream.cleanUp();
            resp.setStatus(HttpServletResponse.SC_OK);
        }

    }

    /**
     * Opens the twitter stream
     */
    private void openTwitterStream() {
        FilterQuery filterQuery = new FilterQuery();
        filterQuery.locations(entireWorld);
        twitterStream.filter(filterQuery);
    }

    /**
     * Refreshes the list of online devices.
     * Failing refresh from memcache queries the datastore.
     */
    private void refreshOnlinceDeviceList() {
        //TODO
    }


    /**
     * Queues the next Twitter Service Task in the twitter-queue
     */
    private void enqueueNextTwitterTask() {
        //TODO
    }

    private void initTwitterService() {
        configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey("JmPCgGdftlNXuh21WQ7hFA")
                .setOAuthConsumerSecret("drMLhPvOWs2Crol2LwQuqdKVRTFCVbQlkJQOCrV8uI")
                .setOAuthAccessToken("72023528-NFWdbv2h4vDVdZC1ML2jNT0gXt9fqZLpMdvtGDjnH")
                .setOAuthAccessTokenSecret("JW7Y2e8D086oDsU1wpNKgtsPZAwF1TQl5KkMdbHdnQ");
        twitterStream = new TwitterStreamFactory(configurationBuilder.build()).getInstance();

        StatusListener statusListener = new StatusListener() {

            @Override
            public void onException(Exception arg0) {
               logger.log(Level.WARNING,
                       "onException: cause," + arg0.getCause() + " message," + arg0.getMessage());
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice arg0) {
                logger.log(Level.WARNING, "onDeletionNotice()");
            }

            @Override
            public void onScrubGeo(long arg0, long arg1) {
                logger.log(Level.WARNING, "onScrubGeo()");
            }

            @Override
            public void onStallWarning(StallWarning stallWarning) {
                logger.log(Level.WARNING, "onStallWarning()");
            }

            @Override
            public void onStatus(Status status) {
                logger.log(Level.ALL,
                        "Twitter Status Received: Geolocation?:" +
                                (status.getGeoLocation() != null) + " / " +
                                status.getUser().getScreenName() + ": " + status.getText());
                if (status.getGeoLocation() != null) {
                    addNewTwitterStatus(status);
                }
            }

            @Override
            public void onTrackLimitationNotice(int arg0) {
                logger.log(Level.WARNING, "onTrackLimitationNotice()");
            }
        };
        twitterStream.addListener(statusListener);
    }

    private void addNewTwitterStatus(Status status) {
        double latitude = status.getGeoLocation().getLatitude();
        double longitude = status.getGeoLocation().getLongitude();
        for (DeviceInfo device: onlineDevices) {
            if (device.isInMapRegion(latitude, longitude)) {
                device.addNewStatus(status);
            }
        }
    }

}
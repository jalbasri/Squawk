/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-08-21 15:27:30 UTC)
 * on 2013-08-23 at 03:22:18 UTC 
 * Modify at your own risk.
 */

package com.jalbasri.squawk.deviceinfoendpoint.model;

/**
 * Model definition for Status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Status extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer accessLevel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> contributors;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime createdAt;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long currentUserRetweetId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean favorited;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoLocation geoLocation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HashtagEntity> hashtagEntities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inReplyToScreenName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inReplyToStatusId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inReplyToUserId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MediaEntity> mediaEntities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Place place;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean possiblySensitive;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RateLimitStatus rateLimitStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean retweet;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long retweetCount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean retweetedByMe;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status retweetedStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean truncated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<URLEntity> urlentities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UserMentionEntity> userMentionEntities;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAccessLevel() {
    return accessLevel;
  }

  /**
   * @param accessLevel accessLevel or {@code null} for none
   */
  public Status setAccessLevel(java.lang.Integer accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getContributors() {
    return contributors;
  }

  /**
   * @param contributors contributors or {@code null} for none
   */
  public Status setContributors(java.util.List<java.lang.Long> contributors) {
    this.contributors = contributors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * @param createdAt createdAt or {@code null} for none
   */
  public Status setCreatedAt(com.google.api.client.util.DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCurrentUserRetweetId() {
    return currentUserRetweetId;
  }

  /**
   * @param currentUserRetweetId currentUserRetweetId or {@code null} for none
   */
  public Status setCurrentUserRetweetId(java.lang.Long currentUserRetweetId) {
    this.currentUserRetweetId = currentUserRetweetId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFavorited() {
    return favorited;
  }

  /**
   * @param favorited favorited or {@code null} for none
   */
  public Status setFavorited(java.lang.Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  /**
   * @param geoLocation geoLocation or {@code null} for none
   */
  public Status setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<HashtagEntity> getHashtagEntities() {
    return hashtagEntities;
  }

  /**
   * @param hashtagEntities hashtagEntities or {@code null} for none
   */
  public Status setHashtagEntities(java.util.List<HashtagEntity> hashtagEntities) {
    this.hashtagEntities = hashtagEntities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Status setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInReplyToScreenName() {
    return inReplyToScreenName;
  }

  /**
   * @param inReplyToScreenName inReplyToScreenName or {@code null} for none
   */
  public Status setInReplyToScreenName(java.lang.String inReplyToScreenName) {
    this.inReplyToScreenName = inReplyToScreenName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getInReplyToStatusId() {
    return inReplyToStatusId;
  }

  /**
   * @param inReplyToStatusId inReplyToStatusId or {@code null} for none
   */
  public Status setInReplyToStatusId(java.lang.Long inReplyToStatusId) {
    this.inReplyToStatusId = inReplyToStatusId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getInReplyToUserId() {
    return inReplyToUserId;
  }

  /**
   * @param inReplyToUserId inReplyToUserId or {@code null} for none
   */
  public Status setInReplyToUserId(java.lang.Long inReplyToUserId) {
    this.inReplyToUserId = inReplyToUserId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MediaEntity> getMediaEntities() {
    return mediaEntities;
  }

  /**
   * @param mediaEntities mediaEntities or {@code null} for none
   */
  public Status setMediaEntities(java.util.List<MediaEntity> mediaEntities) {
    this.mediaEntities = mediaEntities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Place getPlace() {
    return place;
  }

  /**
   * @param place place or {@code null} for none
   */
  public Status setPlace(Place place) {
    this.place = place;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPossiblySensitive() {
    return possiblySensitive;
  }

  /**
   * @param possiblySensitive possiblySensitive or {@code null} for none
   */
  public Status setPossiblySensitive(java.lang.Boolean possiblySensitive) {
    this.possiblySensitive = possiblySensitive;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public RateLimitStatus getRateLimitStatus() {
    return rateLimitStatus;
  }

  /**
   * @param rateLimitStatus rateLimitStatus or {@code null} for none
   */
  public Status setRateLimitStatus(RateLimitStatus rateLimitStatus) {
    this.rateLimitStatus = rateLimitStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRetweet() {
    return retweet;
  }

  /**
   * @param retweet retweet or {@code null} for none
   */
  public Status setRetweet(java.lang.Boolean retweet) {
    this.retweet = retweet;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getRetweetCount() {
    return retweetCount;
  }

  /**
   * @param retweetCount retweetCount or {@code null} for none
   */
  public Status setRetweetCount(java.lang.Long retweetCount) {
    this.retweetCount = retweetCount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRetweetedByMe() {
    return retweetedByMe;
  }

  /**
   * @param retweetedByMe retweetedByMe or {@code null} for none
   */
  public Status setRetweetedByMe(java.lang.Boolean retweetedByMe) {
    this.retweetedByMe = retweetedByMe;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Status getRetweetedStatus() {
    return retweetedStatus;
  }

  /**
   * @param retweetedStatus retweetedStatus or {@code null} for none
   */
  public Status setRetweetedStatus(Status retweetedStatus) {
    this.retweetedStatus = retweetedStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * @param source source or {@code null} for none
   */
  public Status setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * @param text text or {@code null} for none
   */
  public Status setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTruncated() {
    return truncated;
  }

  /**
   * @param truncated truncated or {@code null} for none
   */
  public Status setTruncated(java.lang.Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<URLEntity> getUrlentities() {
    return urlentities;
  }

  /**
   * @param urlentities urlentities or {@code null} for none
   */
  public Status setUrlentities(java.util.List<URLEntity> urlentities) {
    this.urlentities = urlentities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * @param user user or {@code null} for none
   */
  public Status setUser(User user) {
    this.user = user;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<UserMentionEntity> getUserMentionEntities() {
    return userMentionEntities;
  }

  /**
   * @param userMentionEntities userMentionEntities or {@code null} for none
   */
  public Status setUserMentionEntities(java.util.List<UserMentionEntity> userMentionEntities) {
    this.userMentionEntities = userMentionEntities;
    return this;
  }

  @Override
  public Status set(String fieldName, Object value) {
    return (Status) super.set(fieldName, value);
  }

  @Override
  public Status clone() {
    return (Status) super.clone();
  }

}

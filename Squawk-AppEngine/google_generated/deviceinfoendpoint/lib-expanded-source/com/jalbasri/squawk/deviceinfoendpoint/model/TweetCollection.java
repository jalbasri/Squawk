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
 * (build: 2013-08-01 15:32:38 UTC)
 * on 2013-08-07 at 05:54:45 UTC 
 * Modify at your own risk.
 */

package com.jalbasri.squawk.deviceinfoendpoint.model;

/**
 * Model definition for TweetCollection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TweetCollection extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Tweet> items;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Tweet> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public TweetCollection setItems(java.util.List<Tweet> items) {
    this.items = items;
    return this;
  }

  @Override
  public TweetCollection set(String fieldName, Object value) {
    return (TweetCollection) super.set(fieldName, value);
  }

  @Override
  public TweetCollection clone() {
    return (TweetCollection) super.clone();
  }

}

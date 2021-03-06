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
 * on 2013-08-26 at 10:23:59 UTC 
 * Modify at your own risk.
 */

package com.jalbasri.squawk.deviceinfoendpoint.model;

/**
 * Model definition for MediaEntity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MediaEntity extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayURL;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer end;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expandedURL;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaURL;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaURLHttps;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonMap sizes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer start;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayURL() {
    return displayURL;
  }

  /**
   * @param displayURL displayURL or {@code null} for none
   */
  public MediaEntity setDisplayURL(java.lang.String displayURL) {
    this.displayURL = displayURL;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEnd() {
    return end;
  }

  /**
   * @param end end or {@code null} for none
   */
  public MediaEntity setEnd(java.lang.Integer end) {
    this.end = end;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExpandedURL() {
    return expandedURL;
  }

  /**
   * @param expandedURL expandedURL or {@code null} for none
   */
  public MediaEntity setExpandedURL(java.lang.String expandedURL) {
    this.expandedURL = expandedURL;
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
  public MediaEntity setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaURL() {
    return mediaURL;
  }

  /**
   * @param mediaURL mediaURL or {@code null} for none
   */
  public MediaEntity setMediaURL(java.lang.String mediaURL) {
    this.mediaURL = mediaURL;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaURLHttps() {
    return mediaURLHttps;
  }

  /**
   * @param mediaURLHttps mediaURLHttps or {@code null} for none
   */
  public MediaEntity setMediaURLHttps(java.lang.String mediaURLHttps) {
    this.mediaURLHttps = mediaURLHttps;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JsonMap getSizes() {
    return sizes;
  }

  /**
   * @param sizes sizes or {@code null} for none
   */
  public MediaEntity setSizes(JsonMap sizes) {
    this.sizes = sizes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStart() {
    return start;
  }

  /**
   * @param start start or {@code null} for none
   */
  public MediaEntity setStart(java.lang.Integer start) {
    this.start = start;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public MediaEntity setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * @param url url or {@code null} for none
   */
  public MediaEntity setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public MediaEntity set(String fieldName, Object value) {
    return (MediaEntity) super.set(fieldName, value);
  }

  @Override
  public MediaEntity clone() {
    return (MediaEntity) super.clone();
  }

}

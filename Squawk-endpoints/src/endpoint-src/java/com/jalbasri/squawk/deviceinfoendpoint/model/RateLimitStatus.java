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
 * Model definition for RateLimitStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RateLimitStatus extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer limit;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer remaining;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer remainingHits;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer resetTimeInSeconds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer secondsUntilReset;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLimit() {
    return limit;
  }

  /**
   * @param limit limit or {@code null} for none
   */
  public RateLimitStatus setLimit(java.lang.Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRemaining() {
    return remaining;
  }

  /**
   * @param remaining remaining or {@code null} for none
   */
  public RateLimitStatus setRemaining(java.lang.Integer remaining) {
    this.remaining = remaining;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRemainingHits() {
    return remainingHits;
  }

  /**
   * @param remainingHits remainingHits or {@code null} for none
   */
  public RateLimitStatus setRemainingHits(java.lang.Integer remainingHits) {
    this.remainingHits = remainingHits;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResetTimeInSeconds() {
    return resetTimeInSeconds;
  }

  /**
   * @param resetTimeInSeconds resetTimeInSeconds or {@code null} for none
   */
  public RateLimitStatus setResetTimeInSeconds(java.lang.Integer resetTimeInSeconds) {
    this.resetTimeInSeconds = resetTimeInSeconds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSecondsUntilReset() {
    return secondsUntilReset;
  }

  /**
   * @param secondsUntilReset secondsUntilReset or {@code null} for none
   */
  public RateLimitStatus setSecondsUntilReset(java.lang.Integer secondsUntilReset) {
    this.secondsUntilReset = secondsUntilReset;
    return this;
  }

  @Override
  public RateLimitStatus set(String fieldName, Object value) {
    return (RateLimitStatus) super.set(fieldName, value);
  }

  @Override
  public RateLimitStatus clone() {
    return (RateLimitStatus) super.clone();
  }

}

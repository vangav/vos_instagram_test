/**
 * "First, solve the problem. Then, write the code. -John Johnson"
 * "Or use Vangav M"
 * www.vangav.com
 * */

/**
 * MIT License
 *
 * Copyright (c) 2016 Vangav
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 * */

/**
 * Community
 * Facebook Group: Vangav Open Source - Backend
 *   fb.com/groups/575834775932682/
 * Facebook Page: Vangav
 *   fb.com/vangav.f
 * 
 * Third party communities for Vangav Backend
 *   - play framework
 *   - cassandra
 *   - datastax
 *   
 * Tag your question online (e.g.: stack overflow, etc ...) with
 *   #vangav_backend
 *   to easier find questions/answers online
 * */

package com.vangav.vos_instagram_test.clients.vos_instagram.get_user_info;

import com.vangav.backend.networks.rest_client.RestRequestGetQuery;

/**
 * Generated using ClientsGeneratorInl
 */
/**
 * RequestGetUserInfo represents the request to
 *   be sent to GetUserInfo controller
 */
public class RequestGetUserInfo extends RestRequestGetQuery {

  /**
   * Constructor - RequestGetUserInfo
   * this is the constructor for mandatory request's params only
   * @param devicetoken
   * @param userid
   * @param accesstoken
   * @param getinfouserid
   * @return new RequestGetUserInfo Object
   * @throws Exception
   */
  public RequestGetUserInfo (
    String devicetoken,
    String userid,
    String accesstoken,
    String getinfouserid) throws Exception {

    this.addParam(
      "device_token",
      devicetoken);

    this.addParam(
      "user_id",
      userid);

    this.addParam(
      "access_token",
      accesstoken);

    this.addParam(
      "get_info_user_id",
      getinfouserid);

}

  /**
   * Constructor - RequestGetUserInfo
   * this is the constructor for all request's params (mandatory and optional)
   * @param devicetoken
   * @param userid
   * @param accesstoken
   * @param getinfouserid
   * @param requesttrackingid
   * @return new RequestGetUserInfo Object
   * @throws Exception
   */
  public RequestGetUserInfo (
    String devicetoken,
    String userid,
    String accesstoken,
    String getinfouserid,
    String requesttrackingid) throws Exception {

    this.addParam(
      "device_token",
      devicetoken);

    this.addParam(
      "user_id",
      userid);

    this.addParam(
      "access_token",
      accesstoken);

    this.addParam(
      "get_info_user_id",
      getinfouserid);

    this.addParam(
      "request_tracking_id",
      requesttrackingid);

}

  /*
   * Following are individual setters per-optional-param
   * */

  /**
   * setRequestTrackingId
   * @param requesttrackingid
   * @throws Exception
   */
  public void setRequestTrackingId (
    String requesttrackingid) throws Exception {

    this.addParam(
      "request_tracking_id",
      requesttrackingid);
  }
}

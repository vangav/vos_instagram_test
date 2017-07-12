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

package com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_hourly_requests_counters;

import com.vangav.backend.networks.rest_client.RestRequestGetQuery;

/**
 * Generated using ClientsGeneratorInl
 */
/**
 * RequestGetHourlyRequestsCounters represents the request to
 *   be sent to GetHourlyRequestsCounters controller
 */
public class RequestGetHourlyRequestsCounters extends RestRequestGetQuery {

  /**
   * Constructor - RequestGetHourlyRequestsCounters
   * this is the constructor for mandatory request's params only
   * @param fromdate
   * @param fromhour
   * @param controllers
   * @return new RequestGetHourlyRequestsCounters Object
   * @throws Exception
   */
  public RequestGetHourlyRequestsCounters (
    String fromdate,
    int fromhour,
    String[] controllers) throws Exception {

    this.addParam(
      "from_date",
      fromdate);

    this.addParam(
      "from_hour",
      fromhour);

    this.addParam(
      "controllers",
      controllers);

}

  /**
   * Constructor - RequestGetHourlyRequestsCounters
   * this is the constructor for all request's params (mandatory and optional)
   * @param fromdate
   * @param fromhour
   * @param controllers
   * @param todate
   * @param tohour
   * @return new RequestGetHourlyRequestsCounters Object
   * @throws Exception
   */
  public RequestGetHourlyRequestsCounters (
    String fromdate,
    int fromhour,
    String[] controllers,
    String todate,
    int tohour) throws Exception {

    this.addParam(
      "from_date",
      fromdate);

    this.addParam(
      "from_hour",
      fromhour);

    this.addParam(
      "controllers",
      controllers);

    this.addParam(
      "to_date",
      todate);

    this.addParam(
      "to_hour",
      tohour);

}

  /*
   * Following are individual setters per-optional-param
   * */

  /**
   * setToDate
   * @param todate
   * @throws Exception
   */
  public void setToDate (
    String todate) throws Exception {

    this.addParam(
      "to_date",
      todate);
  }

  /**
   * setToHour
   * @param tohour
   * @throws Exception
   */
  public void setToHour (
    int tohour) throws Exception {

    this.addParam(
      "to_hour",
      tohour);
  }
}

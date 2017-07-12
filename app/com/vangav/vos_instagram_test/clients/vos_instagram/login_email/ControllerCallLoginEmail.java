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

package com.vangav.vos_instagram_test.clients.vos_instagram.login_email;

import com.vangav.backend.backend_client_java.ControllerCall;
import com.vangav.vos_instagram_test.clients.Constants;

/**
 * Generated using ClientsGeneratorInl
 */
/**
 * ControllerCallLoginEmail is used to make one call
 *   per instance to LoginEmail controller
 */
public class ControllerCallLoginEmail extends ControllerCall {

  /**
   * Constructor - ControllerCallLoginEmail
   * @param requestLoginEmail
   * @return new ControllerCallLoginEmail Object
   * @throws Exception
   */
  public ControllerCallLoginEmail (
    RequestLoginEmail requestLoginEmail) throws Exception {

    super(requestLoginEmail);
  }

  @Override
  protected String getControllerName() {

    return "login_email";
  }

  @Override
  protected String getUrl() {

    return
      Constants.kVosInstagramUrl
      + this.getControllerName();
  }

  @Override
  protected ResponseLoginEmail getRestResponseJson() {

    return new ResponseLoginEmail();
  }
}

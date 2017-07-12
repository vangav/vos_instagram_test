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

package com.vangav.vos_instagram_test.common;

/**
 * @author mustapha
 * fb.com/mustapha.abdallah
 */
/**
 * User represents a vos_instagream test user
 */
public class User {

  private String userId;
  private String deviceToken;
  private String email;
  private String password;
  private String name;
  private String profilePicture;
  private String authCode;
  private String accessToken;
  private String refreshToken;

  /**
   * Constructor - User
   * @param deviceToken
   * @param email
   * @param password
   * @param name
   * @param profilePicture
   * @return new User Object
   * @throws Exception
   */
  public User (
    String deviceToken,
    String email,
    String password,
    String name,
    String profilePicture) throws Exception {

    this.userId = "";
    this.deviceToken = deviceToken;
    this.email = email;
    this.password = password;
    this.name = name;
    this.profilePicture = profilePicture;
    this.authCode = "";
    this.accessToken = "";
    this.refreshToken = "";
  }
  
  /**
   * setUserId
   * @param userId
   * @throws Exception
   */
  public void setUserId (String userId) throws Exception {
    
    this.userId = userId;
  }
  
  /**
   * getUserId
   * @return user's user id
   * @throws Exception
   */
  public String getUserId () throws Exception {
    
    return this.userId;
  }

  /**
   * getDeviceToken
   * @return this user's device token
   * @throws Exception
   */
  public String getDeviceToken () throws Exception {

    return this.deviceToken;
  }

  /**
   * getEmail
   * @return this user's email
   * @throws Exception
   */
  public String getEmail () throws Exception {

    return this.email;
  }

  /**
   * getPassword
   * @return this user's password
   * @throws Exception
   */
  public String getPassword () throws Exception {

    return this.password;
  }

  /**
   * getName
   * @return this user's name
   * @throws Exception
   */
  public String getName () throws Exception {

    return this.name;
  }

  /**
   * setProfilePicture
   * updates this user's profile picture
   * @param profilePicture
   * @throws Exception
   */
  public void setProfilePicture (String profilePicture) throws Exception {

    this.profilePicture = profilePicture;
  }

  /**
   * getProfilePicture
   * @return this user's profile picture
   * @throws Exception
   */
  public String getProfilePicture () throws Exception {

    return this.profilePicture;
  }

  /**
   * setAuthCode
   * sets this user's auth code
   * @param authCode
   * @throws Exception
   */
  public void setAuthCode (String authCode) throws Exception {

    this.authCode = authCode;
  }

  /**
   * getAuthCode
   * @return this user's auth code
   * @throws Exception
   */
  public String getAuthCode () throws Exception {

    return this.authCode;
  }

  /**
   * setAccessToken
   * sets this user's access token
   * @param accesstoken
   * @throws Exception
   */
  public void setAccessToken (String accesstoken) throws Exception {

    this.accessToken = accesstoken;
  }

  /**
   * getAccessToken
   * @return this user's access token
   * @throws Exception
   */
  public String getAccessToken () throws Exception {

    return this.accessToken;
  }

  /**
   * setRefreshToken
   * sets this user's refresh token
   * @param refreshToken
   * @throws Exception
   */
  public void setRefreshToken (String refreshToken) throws Exception {

    this.refreshToken = refreshToken;
  }

  /**
   * getRefreshToken
   * @return this user's refresh token
   * @throws Exception
   */
  public String getRefreshToken () throws Exception {

    return this.refreshToken;
  }
}

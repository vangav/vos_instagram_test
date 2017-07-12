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

package com.vangav.vos_instagram_test.controllers.test_all_controllers;

import java.net.HttpURLConnection;
import java.util.ArrayList;

import com.vangav.backend.backend_client_java.BackendClientSession;
import com.vangav.backend.backend_client_java.ControllerCallLog;
import com.vangav.backend.backend_client_java.BackendClientSession.RestCallsType;
import com.vangav.backend.play_framework.request.Request;
import com.vangav.backend.play_framework.request.RequestJsonBody;
import com.vangav.backend.play_framework.request.response.ResponseBody;
import com.vangav.vos_instagram_test.clients.vos_instagram.comment.ControllerCallComment;
import com.vangav.vos_instagram_test.clients.vos_instagram.comment.RequestComment;
import com.vangav.vos_instagram_test.clients.vos_instagram.delete_comment.ControllerCallDeleteComment;
import com.vangav.vos_instagram_test.clients.vos_instagram.delete_comment.RequestDeleteComment;
import com.vangav.vos_instagram_test.clients.vos_instagram.follow.ControllerCallFollow;
import com.vangav.vos_instagram_test.clients.vos_instagram.follow.RequestFollow;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_access_token.ControllerCallGetAccessToken;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_access_token.RequestGetAccessToken;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_access_token.ResponseGetAccessToken;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_feed_posts.ControllerCallGetFeedPosts;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_feed_posts.RequestGetFeedPosts;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_followers.ControllerCallGetFollowers;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_followers.RequestGetFollowers;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_following.ControllerCallGetFollowing;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_following.RequestGetFollowing;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_photo.ControllerCallGetPhoto;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_photo.RequestGetPhoto;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_photo_thumbnail.ControllerCallGetPhotoThumbnail;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_photo_thumbnail.RequestGetPhotoThumbnail;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_comments.ControllerCallGetPostComments;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_comments.RequestGetPostComments;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_info.ControllerCallGetPostInfo;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_info.RequestGetPostInfo;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_likes.ControllerCallGetPostLikes;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_likes.RequestGetPostLikes;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_photo_id.ControllerCallGetPostPhotoId;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_post_photo_id.RequestGetPostPhotoId;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_server_time.ControllerCallGetServerTime;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_server_time.RequestGetServerTime;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_user_info.ControllerCallGetUserInfo;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_user_info.RequestGetUserInfo;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_user_posts.ControllerCallGetUserPosts;
import com.vangav.vos_instagram_test.clients.vos_instagram.get_user_posts.RequestGetUserPosts;
import com.vangav.vos_instagram_test.clients.vos_instagram.like_post.ControllerCallLikePost;
import com.vangav.vos_instagram_test.clients.vos_instagram.like_post.RequestLikePost;
import com.vangav.vos_instagram_test.clients.vos_instagram.login_email.ControllerCallLoginEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.login_email.RequestLoginEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.login_email.ResponseLoginEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.logout.ControllerCallLogout;
import com.vangav.vos_instagram_test.clients.vos_instagram.logout.RequestLogout;
import com.vangav.vos_instagram_test.clients.vos_instagram.post_photo.ControllerCallPostPhoto;
import com.vangav.vos_instagram_test.clients.vos_instagram.post_photo.RequestPostPhoto;
import com.vangav.vos_instagram_test.clients.vos_instagram.post_photo.ResponsePostPhoto;
import com.vangav.vos_instagram_test.clients.vos_instagram.refresh_access_token.ControllerCallRefreshAccessToken;
import com.vangav.vos_instagram_test.clients.vos_instagram.refresh_access_token.RequestRefreshAccessToken;
import com.vangav.vos_instagram_test.clients.vos_instagram.refresh_access_token.ResponseRefreshAccessToken;
import com.vangav.vos_instagram_test.clients.vos_instagram.search_by_email.ControllerCallSearchByEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.search_by_email.RequestSearchByEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.signup_email.ControllerCallSignupEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.signup_email.RequestSignupEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.signup_email.ResponseSignupEmail;
import com.vangav.vos_instagram_test.clients.vos_instagram.unfollow.ControllerCallUnfollow;
import com.vangav.vos_instagram_test.clients.vos_instagram.unfollow.RequestUnfollow;
import com.vangav.vos_instagram_test.clients.vos_instagram.unlike_post.ControllerCallUnlikePost;
import com.vangav.vos_instagram_test.clients.vos_instagram.unlike_post.RequestUnlikePost;
import com.vangav.vos_instagram_test.clients.vos_instagram.update_last_active_time.ControllerCallUpdateLastActiveTime;
import com.vangav.vos_instagram_test.clients.vos_instagram.update_last_active_time.RequestUpdateLastActiveTime;
import com.vangav.vos_instagram_test.clients.vos_instagram.update_location.ControllerCallUpdateLocation;
import com.vangav.vos_instagram_test.clients.vos_instagram.update_location.RequestUpdateLocation;
import com.vangav.vos_instagram_test.clients.vos_instagram.update_profile_picture.ControllerCallUpdateProfilePicture;
import com.vangav.vos_instagram_test.clients.vos_instagram.update_profile_picture.RequestUpdateProfilePicture;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_annual_regional_counters.ControllerCallGetAnnualRegionalCounters;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_annual_regional_counters.RequestGetAnnualRegionalCounters;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_regional_counters.ControllerCallGetDailyRegionalCounters;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_regional_counters.RequestGetDailyRegionalCounters;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_requests_counters.ControllerCallGetDailyRequestsCounters;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_requests_counters.RequestGetDailyRequestsCounters;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_users_error_logs.ControllerCallGetDailyUsersErrorLogs;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_users_error_logs.RequestGetDailyUsersErrorLogs;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_users_logs.ControllerCallGetDailyUsersLogs;
import com.vangav.vos_instagram_test.clients.vos_instagram_dash_board.get_daily_users_logs.RequestGetDailyUsersLogs;
import com.vangav.vos_instagram_test.common.User;
import com.vangav.vos_instagram_test.controllers.CommonPlayHandler;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * HandlerTestAllControllers
 *   handles request-to-response processing
 *   also handles after response processing (if any)
 * */
public class HandlerTestAllControllers extends CommonPlayHandler {

  private static final String kName = "TestAllControllers";

  @Override
  protected String getName () {

    return kName;
  }

  @Override
  protected RequestJsonBody getRequestJson () {

    return new RequestTestAllControllers();
  }

  @Override
  protected ResponseBody getResponseBody () {

    return new ResponseTestAllControllers();
  }

  @Override
  protected void processRequest (final Request request) throws Exception {
    
    User userA = new User(
      "device-token-A",
      "email_A@vangav.com",
      "passwordA",
      "name-A",
      "aGVsbG8gd29ybGQ=");
    
    User userB = new User(
      "device-token-B",
      "email_B@vangav.com",
      "passwordB",
      "name-B",
      "aGVsbG8gd29ybGQ=");

    BackendClientSession backendClientSession =
      new BackendClientSession(
        "test_all_controllers",
        true);
    
    ArrayList<ControllerCallLog> currCallsLog;
    
    // 1- A: sign up email
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallSignupEmail(
          new RequestSignupEmail(
            userA.getDeviceToken(),
            userA.getEmail(),
            userA.getPassword(),
            userA.getName() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseSignupEmail responseSignupEmail =
        (ResponseSignupEmail)currCallsLog.get(0).getResponse();
      
      userA.setUserId(responseSignupEmail.user_id);
      userA.setAuthCode(responseSignupEmail.auth_code);
    } else {
      
      currCallsLog =
        backendClientSession.executeControllersCalls(
          RestCallsType.SYNC,
          new ControllerCallLoginEmail(
            new RequestLoginEmail(
              userA.getDeviceToken(),
              userA.getEmail(),
              userA.getPassword() ) ) );
      
      if (currCallsLog.get(0).getResponseHttpStatusCode() ==
          HttpURLConnection.HTTP_OK) {
      
        ResponseLoginEmail responseLoginEmail =
          (ResponseLoginEmail)currCallsLog.get(0).getResponse();
        
        userA.setUserId(responseLoginEmail.user_id);
        userA.setAuthCode(responseLoginEmail.auth_code);
      }
    }
    
    // 2- A: get access token
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallGetAccessToken(
          new RequestGetAccessToken(
            userA.getDeviceToken(),
            "iPhone",
            userA.getUserId(),
            userA.getAuthCode() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseGetAccessToken responseGetAccessToken =
        (ResponseGetAccessToken)currCallsLog.get(0).getResponse();
      
      userA.setAccessToken(responseGetAccessToken.access_token);
      userA.setRefreshToken(responseGetAccessToken.refresh_token);
    }
    
    // 3- A: logout
    backendClientSession.executeControllersCalls(
      RestCallsType.SYNC,
      new ControllerCallLogout(
        new RequestLogout(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken(),
          userA.getRefreshToken() ) ) );
    
    // 4- A: logout again (expecting a failure)
    backendClientSession.executeControllersCalls(
      RestCallsType.SYNC,
      new ControllerCallLogout(
        new RequestLogout(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken(),
          userA.getRefreshToken() ) ) );
    
    // 5- A: login email
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallLoginEmail(
          new RequestLoginEmail(
            userA.getDeviceToken(),
            userA.getEmail(),
            userA.getPassword() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseLoginEmail responseLoginEmail =
        (ResponseLoginEmail)currCallsLog.get(0).getResponse();
      
      userA.setAuthCode(responseLoginEmail.auth_code);
    }
    
    // 6- A: get access token
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallGetAccessToken(
          new RequestGetAccessToken(
            userA.getDeviceToken(),
            "iPhone",
            userA.getUserId(),
            userA.getAuthCode() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseGetAccessToken responseGetAccessToken =
        (ResponseGetAccessToken)currCallsLog.get(0).getResponse();
      
      userA.setAccessToken(responseGetAccessToken.access_token);
      userA.setRefreshToken(responseGetAccessToken.refresh_token);
    }
    
    // 7- A: refresh access token
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallRefreshAccessToken(
          new RequestRefreshAccessToken(
            userA.getDeviceToken(),
            userA.getUserId(),
            userA.getAccessToken(),
            userA.getRefreshToken() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseRefreshAccessToken responseRefreshAccessToken =
        (ResponseRefreshAccessToken)currCallsLog.get(0).getResponse();
      
      userA.setAuthCode(responseRefreshAccessToken.auth_code);
    }
    
    // 8- A: get access token
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallGetAccessToken(
          new RequestGetAccessToken(
            userA.getDeviceToken(),
            "iPhone",
            userA.getUserId(),
            userA.getAuthCode() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseGetAccessToken responseGetAccessToken =
        (ResponseGetAccessToken)currCallsLog.get(0).getResponse();
      
      userA.setAccessToken(responseGetAccessToken.access_token);
      userA.setRefreshToken(responseGetAccessToken.refresh_token);
    }
    
    // 9- A: get server time
    // 10- A: update last active time
    // 11- A: update location
    // 12- A: update profile picture
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetServerTime(
        new RequestGetServerTime(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken() ) ),
      new ControllerCallUpdateLastActiveTime(
        new RequestUpdateLastActiveTime(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken() ) ),
      new ControllerCallUpdateLocation(
        new RequestUpdateLocation(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken(),
          10.0,
          10.0) ),
      new ControllerCallUpdateProfilePicture(
        new RequestUpdateProfilePicture(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken(),
          userA.getProfilePicture() ) ) );
    
    // 13- B: sign up email
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallSignupEmail(
          new RequestSignupEmail(
            userB.getDeviceToken(),
            userB.getEmail(),
            userB.getPassword(),
            userB.getName() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseSignupEmail responseSignupEmail =
        (ResponseSignupEmail)currCallsLog.get(0).getResponse();
      
      userB.setUserId(responseSignupEmail.user_id);
      userB.setAuthCode(responseSignupEmail.auth_code);
    } else {
      
      currCallsLog =
        backendClientSession.executeControllersCalls(
          RestCallsType.SYNC,
          new ControllerCallLoginEmail(
            new RequestLoginEmail(
              userB.getDeviceToken(),
              userB.getEmail(),
              userB.getPassword() ) ) );
      
      if (currCallsLog.get(0).getResponseHttpStatusCode() ==
          HttpURLConnection.HTTP_OK) {
      
        ResponseLoginEmail responseLoginEmail =
          (ResponseLoginEmail)currCallsLog.get(0).getResponse();
        
        userB.setUserId(responseLoginEmail.user_id);
        userB.setAuthCode(responseLoginEmail.auth_code);
      }
    }
    
    // 14- B: get access token
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.SYNC,
        new ControllerCallGetAccessToken(
          new RequestGetAccessToken(
            userB.getDeviceToken(),
            "iPhone",
            userB.getUserId(),
            userB.getAuthCode() ) ) );
    
    if (currCallsLog.get(0).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponseGetAccessToken responseGetAccessToken =
        (ResponseGetAccessToken)currCallsLog.get(0).getResponse();
      
      userB.setAccessToken(responseGetAccessToken.access_token);
      userB.setRefreshToken(responseGetAccessToken.refresh_token);
    }
    
    // 15- A: get followers
    // 16- B: get following
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetFollowers(
        new RequestGetFollowers(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken(),
          userA.getUserId() ) ),
      new ControllerCallGetFollowing(
        new RequestGetFollowing(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          userB.getUserId() ) ) );
    
    // 17- B: follow A
    // 18- B: get following
    backendClientSession.executeControllersCalls(
      RestCallsType.SYNC,
      new ControllerCallFollow(
        new RequestFollow(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          userA.getUserId() ) ),
      new ControllerCallGetFollowing(
        new RequestGetFollowing(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          userB.getUserId() ) ) );
    
    // 19- A: get followers
    // 20- A: get user info for B
    // 21- A: search user B by email
    // 22- A: post photo
    currCallsLog =
      backendClientSession.executeControllersCalls(
        RestCallsType.ASYNC,
        new ControllerCallGetFollowers(
          new RequestGetFollowers(
            userA.getDeviceToken(),
            userA.getUserId(),
            userA.getAccessToken(),
            userA.getUserId() ) ),
        new ControllerCallGetUserInfo(
          new RequestGetUserInfo(
            userA.getDeviceToken(),
            userA.getUserId(),
            userA.getAccessToken(),
            userB.getUserId() ) ),
        new ControllerCallSearchByEmail(
          new RequestSearchByEmail(
            userA.getDeviceToken(),
            userA.getUserId(),
            userA.getAccessToken(),
            userB.getEmail() ) ),
        new ControllerCallPostPhoto(
          new RequestPostPhoto(
            userA.getDeviceToken(),
            userA.getUserId(),
            userA.getAccessToken(),
            "aGVsbG8gd29ybGQ=",
            "aGVsbG8gd29ybGQ=") ) );
    
    String postId = "";
    String photoId = "";
    
    if (currCallsLog.get(3).getResponseHttpStatusCode() ==
        HttpURLConnection.HTTP_OK) {
    
      ResponsePostPhoto responsePostPhoto =
        (ResponsePostPhoto)currCallsLog.get(3).getResponse();
      
      postId = responsePostPhoto.post_id;
      photoId = responsePostPhoto.photo_id;
    }
    
    // sleep a little, wait for dispences to finish posting
    Thread.sleep(500);
    
    // 23- A: get feed posts
    // 24- B: get user A posts
    // 25- B: get post info
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetFeedPosts(
        new RequestGetFeedPosts(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken() ) ),
      new ControllerCallGetUserPosts(
        new RequestGetUserPosts(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          userA.getUserId() ) ),
      new ControllerCallGetPostInfo(
        new RequestGetPostInfo(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ) );
    
    // 26- B: like post
    // 27- B: comment on post
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallLikePost(
        new RequestLikePost(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ),
      new ControllerCallComment(
        new RequestComment(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId,
          "comment_B_on_A") ) );
    
    // 28- B: get post info
    // 29- B: get post photo id
    // 30- B: get photo
    // 31- B: get photo thumbnail
    // 32- B: get post comments
    // 33- B: get post likes
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetPostInfo(
        new RequestGetPostInfo(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ),
      new ControllerCallGetPostPhotoId(
        new RequestGetPostPhotoId(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ),
      new ControllerCallGetPhoto(
        new RequestGetPhoto(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          photoId) ),
      new ControllerCallGetPhotoThumbnail(
        new RequestGetPhotoThumbnail(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          photoId) ),
      new ControllerCallGetPostComments(
        new RequestGetPostComments(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ),
      new ControllerCallGetPostLikes(
        new RequestGetPostLikes(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ) );
    
    // 34- B: delete comment
    // 35- B: unlike post
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallDeleteComment(
        new RequestDeleteComment(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ),
      new ControllerCallUnlikePost(
        new RequestUnlikePost(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ) );
    
    // 36- B: get post info
    // 37- B: unfollow A
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetPostInfo(
        new RequestGetPostInfo(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          postId) ),
      new ControllerCallUnfollow(
        new RequestUnfollow(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          userA.getUserId() ) ) );
    
    // 38- B: get following
    // 39- B: get feed posts
    // 40- A: get followers
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetFollowing(
        new RequestGetFollowing(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken(),
          userB.getUserId() ) ),
      new ControllerCallGetFeedPosts(
        new RequestGetFeedPosts(
          userB.getDeviceToken(),
          userB.getUserId(),
          userB.getAccessToken() ) ),
      new ControllerCallGetFollowers(
        new RequestGetFollowers(
          userA.getDeviceToken(),
          userA.getUserId(),
          userA.getAccessToken(),
          userA.getUserId() ) ) );
    
    // 41- get annual regional counters
    // 42- get daily regional counters
    // 43- get daily requests counters
    // 44- get daily users error logs
    // 45- get daily users logs
    backendClientSession.executeControllersCalls(
      RestCallsType.ASYNC,
      new ControllerCallGetAnnualRegionalCounters(
        new RequestGetAnnualRegionalCounters(
          2017,
          new String[] {
            "Lala_Land",
            "NA",
            "SA",
            "AN",
            "AF",
            "EU",
            "AS",
            "OC"
          } ) ),
      new ControllerCallGetDailyRegionalCounters(
        new RequestGetDailyRegionalCounters(
          "23/1/2017",
          new String[] {
            "Lala_Land",
            "NA",
            "SA",
            "AN",
            "AF",
            "EU",
            "AS",
            "OC"
          } ) ),
      new ControllerCallGetDailyRequestsCounters(
        new RequestGetDailyRequestsCounters(
          "23/1/2017",
          new String[] {
            "LoginEmail",
            "SignupEmail",
            "LoginFacebook",
            "GetAccessToken",
            "RefreshAccessToken",
            "Logout",
            "UpdateFacebookInfo",
            "GetServerTime",
            "GetUserInfo",
            "GetProfilePicture",
            "Follow",
            "Unfollow",
            "GetFollowing",
            "GetFollowers",
            "GetFeedPosts",
            "GetUserPosts",
            "GetPostInfo",
            "GetPostPhotoId",
            "GetPhoto",
            "GetPhotoThumbnail",
            "PostPhoto",
            "GetPostLikes",
            "GetPostComments",
            "LikePost",
            "UnlikePost",
            "Comment",
            "DeleteComment",
            "SearchByEmail",
            "GetTopUsers",
            "GetTopPosts",
            "UpdateLastActiveTime",
            "UpdateLocation",
            "UpdateProfilePicture"
          } ) ),
      new ControllerCallGetDailyUsersErrorLogs(
        new RequestGetDailyUsersErrorLogs(
          "23/1/2017",
          new String[] {
            "email_A@vangav.com",
            "email_B@vangav.com"
          } ) ),
      new ControllerCallGetDailyUsersLogs(
        new RequestGetDailyUsersLogs(
          "23/1/2017",
          new String[] {
            "email_A@vangav.com",
            "email_B@vangav.com"
          } ) ) );
    
    // set response
    ((ResponseTestAllControllers)request.getResponseBody() ).set(
      backendClientSession);
  }
}

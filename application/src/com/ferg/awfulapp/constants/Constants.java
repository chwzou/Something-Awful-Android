/********************************************************************************
 * Copyright (c) 2011, Scott Ferguson
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the software nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY SCOTT FERGUSON ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SCOTT FERGUSON BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

package com.ferg.awfulapp.constants;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;

public class Constants {
    public static final String BASE_URL = "http://forums.somethingawful.com";

    public static final String FUNCTION_LOGIN           = BASE_URL + "/account.php";
    public static final String FUNCTION_BOOKMARK        = BASE_URL + "/bookmarkthreads.php";
    public static final String FUNCTION_USERCP          = BASE_URL + "/usercp.php";
    public static final String FUNCTION_FORUM           = BASE_URL + "/forumdisplay.php";
    public static final String FUNCTION_THREAD          = BASE_URL + "/showthread.php";
    public static final String FUNCTION_POST_REPLY      = BASE_URL + "/newreply.php";
    public static final String FUNCTION_EDIT_POST       = BASE_URL + "/editpost.php";
    public static final String FUNCTION_MEMBER          = BASE_URL + "/member.php";
    public static final String FUNCTION_SEARCH          = BASE_URL + "/search.php";
    public static final String FUNCTION_PRIVATE_MESSAGE = BASE_URL + "/private.php";
    public static final String FUNCTION_BANLIST         = BASE_URL + "/banlist.php";
    public static final String FUNCTION_RATE_THREAD     = BASE_URL + "/threadrate.php";

    public static final String ACTION_PROFILE             = "getinfo";
    public static final String ACTION_SEARCH_POST_HISTORY = "do_search_posthistory";
    public static final String ACTION_NEW_MESSAGE         = "newmessage";
    
    public static final String PARAM_USER_ID   = "userid";
    public static final String PARAM_USERNAME  = "username";
    public static final String PARAM_PASSWORD  = "password";
    public static final String PARAM_ACTION    = "action";
    public static final String PARAM_THREAD_ID = "threadid";
    public static final String PARAM_PAGE      = "pagenumber";
    public static final String PARAM_FORUM_ID  = "forumid";
    public static final String PARAM_GOTO      = "goto";
    public static final String PARAM_PER_PAGE  = "perpage";
    public static final String PARAM_INDEX     = "index";
    public static final String PARAM_BOOKMARK  = "bookmark";
	public static final String PARAM_PRIVATE_MESSAGE_ID = "privatemessageid";
	public static final String PARAM_VOTE 	   = "vote";
	public static final String PARAM_POST_ID   = "postid";
	
	public static final String VALUE_POST 	   = "post";
    
    public static final String FRAGMENT_PTI    = "pti";

    // Intent parameters
    public static final String FORUM     = "forum";
    public static final String FORUM_ID  = "forum_id";
    public static final String THREAD    = "thread";
    public static final String THREAD_ID = "thread_id";
    public static final String POST_ID   = "post_id";
    public static final String QUOTE     = "quote";
    public static final String PAGE      = "page";
    public static final String EDITING   = "editing";
    public static final String MODAL     = "modal";
    public static final String SHORTCUT  = "shortcut";
	public static final String PRIVATE_MESSAGE = "private";    

    public static final String FORM_KEY = "form_key";

    public static final String PREFERENCES = "prefs";
    
	public static final String COOKIE_DOMAIN        = "forums.somethingawful.com";
	public static final String COOKIE_PATH          = "/";
	public static final String COOKIE_NAME_USERID   = "bbuserid";
	public static final String COOKIE_NAME_PASSWORD = "bbpassword";
	public static final String COOKIE_NAME_SESSIONID = "sessionid";
	public static final String COOKIE_NAME_SESSIONHASH = "sessionhash";
	
	public static final String COOKIE_PREFERENCE       = "awful_cookie_pref";
	public static final String COOKIE_PREF_USERID      = "bbuserid";
	public static final String COOKIE_PREF_PASSWORD    = "bbpassword";
	public static final String COOKIE_PREF_SESSIONID    = "sessionid";
	public static final String COOKIE_PREF_SESSIONHASH    = "sessionhash";
	public static final String COOKIE_PREF_EXPIRY_DATE = "expiration";

	// Content provider
    public static final String AUTHORITY = "com.ferg.awfulapp.provider";
    
    //broadcast intent
	public static final String UNREGISTERED_BROADCAST = "com.ferg.awfulapp.service.not_registered";
    public static final String DATA_UPDATE_BROADCAST = "com.ferg.awfulapp.service.dataupdated";
	public static final String DATA_UPDATE_ID_EXTRA = "updatedID";
	public static final String DATA_UPDATE_PAGE_EXTRA = "updatedPage";
	public static final String DATA_UPDATE_STATUS_EXTRA = "updateStatus";
    
    //default per-page, user configurable, 
    //or reduce to speed processing time once auto-load is in
    public static final int ITEMS_PER_PAGE = 40;

    public static final String ACRA_FORMKEY = "dGUycmYyNGV1SG5heXlaZlVkTl92T2c6MQ";
    
    //asynctasks are managed by ID number, but PM page has no id
	public static final int PRIVATE_MESSAGE_THREAD = 3;//can't use negative numbers anymore, but #3 does not exist on the forums anymore.
	public static final int USERCP_ID = 2;//can't use negative numbers anymore, but #2 does not exist on the forums anymore.
	public static final int FORUM_INDEX_ID = 0;
	/** To prevent loader ID collisions. */
	public static final int REPLY_LOADER_ID = 884;
	public static final int FORUM_LOADER_ID = 885;
	public static final int SUBFORUM_LOADER_ID = 886;
	public static final int EMOTE_LOADER_ID = 887;
	public static final int MISC_LOADER_ID = 888;

	public static final String ACTION_DOSEND = "dosend";
	public static final String DESTINATION_TOUSER = "touser";
	public static final String PARAM_TITLE = "title";
	public static final String PARAM_MESSAGE = "message";

	public static final String EXTRA_BUNDLE = "extras";

	public static final String PARAM_PARSEURL = "parseurl";

	public static final String YES = "yes";//heh

	public static final String EMOTE_URL = "http://forums.somethingawful.com/misc.php?action=showsmilies";
	
	//NOT FOR NETWORK USE
	public static final String FORUM_PAGE = "forum_page";
	//NOT FOR NETWORK USE
	public static final String THREAD_PAGE = "thread_page";


	/**
	 * I guess this should really be named "isFroyoOrAbove()" but I suck at function naming.
	 * @return
	 */
	public static boolean isFroyo() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
	}
	public static boolean isGingerbread(){
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
	}
	public static boolean isHoneycomb(){
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
	}
	public static boolean isICS(){
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
	}
	
	public static boolean isWidescreen(Context cont){
		if(cont != null){
			if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2){
				return cont.getResources().getConfiguration().screenWidthDp >= 750;
			}else{
				return (cont.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_XLARGE) > 0;
			}
		}else{
			return false;
		}
	}
	public static boolean isWidescreen(Configuration newConfig) {
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2){
			return newConfig.screenWidthDp >= 750;
		}else{
			return (newConfig.screenLayout & Configuration.SCREENLAYOUT_SIZE_XLARGE) > 0;
		}
	}

}

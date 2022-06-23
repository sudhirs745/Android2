package com.yourbusinessname.keyword1.keyword2;

public class Config {

    // *** Your Purchase Code of CodeCanyon ***
    // 1. Buy a WebViewGold license (https://www.webviewgold.com/download/android) for each app you publish. If your app is going to be free, a "Regular license" is required. If your app will be sold to your users, an "Extended license" is required. More info: https://codecanyon.net/licenses/standard?ref=onlineappcreator
    // 2. Grab your Purchase Code (this is how to find it quickly: https://help.market.envato.com/hc/en-us/articles/202822600-Where-Is-My-Purchase-Code-)
    // 3. Great! Just enter it here and restart your app:
    public static final String PURCHASECODE = "xxxxxx-xxxxxx-xxxxxx-xxxxxx-xxxxxx";
    // 4. Enjoy your app! :)

    /**
     * Main configuration of the WebView
     */

    // Domain host without http:// (e.g. "www.example.org")
    public static final String HOST = "https://netcubicles.netedgeonline.com/netcubicles/public/login";

    // Your URL including http:// and www.
    public static final String HOME_URL = "https://netcubicles.netedgeonline.com/netcubicles/public/login";

    // Customized UserAgent for WebView URL requests (leave it empty to use the default Android UserAgent)
    public static final String USER_AGENT = "";

    // Set to true to open external links in another browser
    public static final boolean OPEN_EXTERNAL_URLS_IN_ANOTHER_BROWSER = false;

    // Set to true to clear the WebView cache on each app startup and do not use cached versions of your web app/website
    public static final boolean CLEAR_CACHE_ON_STARTUP = true;

    //Set to "true" to use local "assets/index.html" file instead of URL
    public static final boolean USE_LOCAL_HTML_FOLDER = false;

    //Set to "true" to enable deeplinking
    public static final boolean IS_DEEP_LINKING_ENABLED = false;

    //Set the splash screen timeout in milliseconds
    public static final int SPLASH_TIMEOUT = 1800;


    /**
     * Dialogs
     */

    // The minimum number of days to be passed after the application is installed before the rating dialog is shown
    public static final int RATE_DAYS_UNTIL_PROMPT = 3;
    // The minimum number of application launches before the rating dialog is shown
    public static final int RATE_LAUNCHES_UNTIL_PROMPT = 3;

    // The minimum number of days to be passed after the application is installed before the Facebook dialog is shown
    public static final int FACEBOOK_DAYS_UNTIL_PROMPT = 200;
    // The minimum number of application launches before the Facebook dialog is shown
    public static final int FACEBOOK_LAUNCHES_UNTIL_PROMPT = 400;
    // URL of your Facebook page
    public static final String FACEBOOK_URL = "https://www.facebook.com/futureshaadi";

    //OneSignal options
    //set to true to activate OneSignal Push (set OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_ENABLED = false;

    //set to true if you want to extend URL request by ?onesignal_push_id=XYZ (set OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_ENHANCE_WEBVIEW_URL = false;

    //set to true if WebView should be reloaded when the app gets a UserID from OneSignal (set OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_RELOAD_ON_USERID = false;

    //AdMob options
    //set to true if you want to display AdMob banner ads (set AdMob IDs in the strings.xml file)
    public static final boolean SHOW_BANNER_AD = false;

    //set to true if you want to display AdMob fullscreen interstitial ads after X website clicks (set AdMob IDs in the strings.xml file)
    public static final boolean SHOW_FULL_SCREEN_AD = false;

    //X website clicks for AdMob interstitial ads (set AdMob IDs in the strings.xml file)
    public static final int SHOW_AD_AFTER_X = 5;

    //Set Google Play In-App Purchase Key (from Google Play Developer Console)
    public static final String PURCHASE_LICENSE_KEY = "123456789";
}
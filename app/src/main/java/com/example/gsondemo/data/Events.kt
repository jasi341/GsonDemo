package com.example.gsondemo.data

object Events {

    /*
     Video Player events
     */
    const val EVENT_PLAY_STARTED = "Play Started"
    const val EVENT_WATCHED = "Watched"
    const val EVENT_PLAYER_BITRATE_CHANGE = "Player BitRate changed"
    const val EVENT_MEDIA_ERROR = "Media Error"

    /*
     Download events
     */
    const val EVENT_DOWNLOAD_INITIATED = "Download initiated"
    const val EVENT_DOWNLOAD_COMPLETED = "Download completed"
    const val EVENT_DOWNLOAD_BITRATE_CHANGE = "Download BitRate changed"

    /*
     Share events
     */
    const val EVENT_SHARE = "Shared"

    /*
     Search event
     */
    const val EVENT_SEARCH = "Searched"

    /*
     Subscription events
     */
    const val EVENT_VIEW_PLANS = "View Plans"

    /*
     login Event
     */
    const val EVENT_SIGNED_UP = "Signed Up"
    const val EVENT_LOGIN = "Login"
    const val EVENT_LOGOUT = "Logout"

    /*
     Content events
     */
    const val EVENT_CAST = "Cast"
    const val EVENT_PAGE_VIEWED = "Page Viewed"
    const val EVENT_PAGE_VIEW = "Page View"
    const val EVENT_ADD_TO_WATCHLIST = "Added to Watchlist"
    const val EVENT_REMOVE_FROM_WATCHLIST = "Removed From Watchlist"


  /*
  Unidentified events
   */
    const val EVENT_UTM_VISITED = "UTM Visited"
    const val EVENT_NOTIFICATION_VIEWED = "Notification Viewed"
    const val EVENT_INVITE_EVENT = "Invite Event"

    /*
    subscription events
     */
    const val EVENT_SUBSCRIPATION_PURCHASED_NEW =
        "Subscription Purchased NEW"
    const val EVENT_SUBSCRIPTION_INITIATED = "Subscription Initiated"
    const val EVENT_SUBSCRIPATION_RENEWED_AUTOMATICALLY_NEW =
        "Subscription Renewed Automatically NEW"
    const val EVENT_SUBSCRIPATION_SUSPENDED_NEW = "Subscription Suspended NEW"
    const val EVENT_SUBSCRIPATION_CANCELLED_NEW =
        "Subscription Cancelled NEW"
    const val EVENT_SUBSCRIPATION_RENEWED_MANUALY_NEW =
        "Subscription Renewed Manualy NEW"
    const val EVENT_SUBSCRIPTION_COMPLETED = "Subscription Completed"
    const val EVENT_SUBSCRIPTION_FAILURE = "Subscription Failure"
    const val KEY_SUBSCRIPTION_START_DATE = "subscriptionStartDate"
    const val KEY_SUBSCRIPTION_END_DATE = "subscriptionEndDate"
    const val KEY_TRANSCATION = "transactionId"


    /*
    Events related to music
     */
    const val KEY_EDITORS_NAME = "editorsName"
    const val KEY_MUSIC_BY_NAME = "music by Name"
    const val KEY_ISTENED_TIME = "Listened Time"
    const val KEY_CAST_NAME = "castName"
    const val KEY_MUSIC_NAME = "musicName"
    const val KEY_PRODUCTION_COMPANY_NAME = "production company Name"
    const val KEY_PRODUCED_BY_NAME = "produced by Name"
    const val KEY_PRODUCERS_NAME = "producersName"
    const val KEY_STARRING_NAME = "starringName"
    const val KEY_CINEMA_TO_GRAPHY_NAME = "cinematographyName"
    const val KEY_WRITERS_NAME = "writersName"
    const val KEY_SCREEN_PLAY_BY_NAME = "screenplay by Name"
    const val KEY_LYRICS_NAME = "lyricsName"
    const val KEY_EDITED_BY_NAME = "edited byName"


    /*
    Plan type
     */
    const val KEY_PLAN_TYPE = "plan Type"

    /*
    auto debit enabled?
     */
    const val KEY_AUTO_DEBIT_ENABLED = "autoDebitEnabled"


    /*
    Subscription details and transaction details
     */
    const val KEY_PAGE_URL = "pageURL"
    const val KEY_TRANSCATION_AMOUNT = "transactionAmount"
    const val KEY_SUBSCRIPTION_PLAN = "subscriptionPlan"
    const val KEY_SUBSCRIPTION_VIA_PLATFORM = "subscribed_via_platform"
    const val KEY_PAYMENT_HANDLER = "paymentHandler"
    const val KEY_SUBSCRIPTION_FROM_COUNTRY = "subscribed_from_country"
    const val KEY_CURRENCY = "currency"
    const val KEY_USER_ID = "userId"
    const val KEY_FREE_TRIAL_ = "freeTrial"
    const val KEY_REDEMPTION_CODE = "redemptionCode"
    const val KEY_DISCOUNT_AMOUNT = "discountAmount"
    const val KEY_PAYMENT_MODE = "paymentMode"
    const val KEY_PLAN_ID = "planId"

  /*
    Device Specific Event
   */
  const val KEY_PLATFORM = "Platform"
  const val KEY_APP_VERSION = "App Version"
  const val KEY_REG_TYPE = "Registration Type"


    /*
    Details related to content
     */
    const val KEY_PAGE_NAME = "Page Name"
    const val KEY_PAGE_ID = "pageId"
    const val KEY_LAST_ACTIVITY_NAME = "Last Activity Name"
    const val KEY_LAST_PAGE_NAME = "last Page Name"
    const val KEY_CONTENT_ID = "Content ID"
    const val KEY_CONTENT_TITLE = "Content Title"
    const val KEY_CONTENT_TYPE = "Content Type"
    const val KEY_CONTENT_TYPE_DETAIL = "Content Type Detail"
    const val KEY_CONTENT_IS_FREE = "freeOrPaid"
    const val KEY_CONTENT_PARENTAL_RATING = "rating"
    const val KEY_PLAY_SOURCE = "Play Source"
    const val KEY_SOURCE = "Source"
    const val KEY_CONTENT_GENRE = "Content Genre"
    const val KEY_ERROR = "Error Message"
    const val KEY_CONTENT_DURATION = "Content Duration"
    const val KEY_EPISODE_NUMBER = "Episode Number"
    const val KEY_PLAYBACK_TYPE = "Playback Type"
    const val KEY_SEASON_NUMBER = "Season Number"
    const val KEY_NETWORK_TYPE = "Network Type"
    const val KEY_SHOW_NAME = "Show name"
    const val KEY_DIRECTOR_NAME = "Director Name"
    const val KEY_MUSIC_DIRECTOR_NAME = "Music Director Name"
    const val KEY_ACTOR_NAME = "Actor Name"
    const val KEY_SINGER_NAME = "Singer Name"
    const val KEY_WATCH_TIME = "Watched time"
    const val KEY_LISTENING_TIME = "Listening time"
    const val KEY_CHANNEL = "Channel"
    const val KEY_STREAM = "Stream"
    const val KEY_BUFFER_TIME = "buffer_time"
    const val KEY_BUFFER_COUNT = "buffer_count"
    const val KEY_SUBTITLES = "subtitles"
    const val KEY_BITRATE = "Bitrate"
    const val KEY_KEYWORD = "Keyword"
    const val KEY_MEDIUM = "Medium"
    const val KEY_QUALITY = "Quality"
    const val KEY_CAST_TYPE = "Cast Type"
    const val KEY_WZRK_ID = "wzrk_id"
    const val KEY_CAMPAIGN_ID = "Campaign id"
    const val KEY_INSTALL = "Install"
    const val KEY_WZRK_PIVOT = "wzrk_pivot"
    const val KEY_WZRK_CTS = "wzrk_cts"
    const val KEY_WZRK_ACCT_ID = "wzrk_acct_id"
    const val KEY_WZRK_PN = "wzrk_pn"
    const val KEY_WZRK_DL = "wzrk_dl"
    const val KEY_WZRK_PID = "wzrk_pid"
    const val KEY_WZRK_CID = "wzrk_cid"
    const val KEY_WZRK_CAMPAIGN_TYPE = "Campaign type"
    const val KEY_WZRK_BC = "wzrk_bc"
    const val KEY_WZRK_BI = "wzrk_bi"
    const val KEY_WZRK_BP = "wzrk_bp"
    const val KEY_WZRK_ANIMATED = "wzrk_animated"
    const val KEY_WZRK_C2A = "wzrk_c2a"
    const val KEY_WZRK_RNV = "wzrk_rnv"




    const val EVENT_SUBSCRIPTION_PLAN_ENDED = "Subscription End"
    const val KEY_PLAN_ENDED = "end Date"
    const val KEY_TYPE_OF_SHARE_KEY = "Type of share"
    const val KEY_COUNT_OF_REFERRALS_KEY = "Count of referrals"
    const val KEY_SUCCESSFUL_INSTALLS_KEY = "Successful installs"
    const val KEY_SUCCESSFUL_SUBSCRIPTIONS = "Successful_subscriptions"
    const val KEY_PAGE_TYPE = "pageType"

    const val KEY_DEVICE_ACTIVATED = "Device Activated"
    const val KEY_DEVICE_ID = "deviceId"
    const val KEY_SCREEN_ID = "screenId"
    const val KEY_OFFER_CODE = "offerCode"
    const val KEY_NUMBER_OF_REFERRALS = "numberOfReferrals"
    const val KEY_WATCH_PERCENTILE = "watchPercentile"


    const val PLATFORM_VALUE = "Android"
    const val KEY_PROFILE_NAME = "Name"
    const val KEY_PROFILE_EMAIL = "Email"
    const val KEY_PROFILE_IDENTITY = "User Id"
    const val KEY_PROFILE_PHONE = "Phone"
    const val KEY_PROFILE_USER_STATUS = "User Status"
    const val KEY_PROFILE_SUBSCRIPTION_PAYMENT_MODE = "Payment Mode"
    const val KEY_PROFILE_SUBSCRIPTION_START_DATE = "Subscription Start Date"
    const val KEY_PROFILE_SUBSCRIPTION_END_DATE = "Subscription End Date"
    const val KEY_PROFILE_SUBSCRIPTION_TRANSACTION_ID = "Transaction ID"
    const val KEY_PROFILE_SUBSCRIPTION_AMOUNT = "Amount"
    const val KEY_PROFILE_DISCOUNT_AMOUNT = "Discount Amount"
    const val KEY_PROFILE_PAYMENT_PLAN = "Payment Plan"
    const val KEY_PROFILE_SOURCE = "Source"
    const val KEY_PROFILE_PAYMENT_HANDLER = "Payment Handler"
    const val KEY_PROFILE_COUNTRY = "Country"
    const val KEY_PROFILE_CURRENCY = "Currency"
    const val KEY_PROFILE_REGISTRATION_METHOD = "Registration Method"
    const val KEY_FREE_TRIAL = "Free Trial"






    private val REGISTRATION_APP_EVENT_NAME = "CompleteRegistration"
    private val APP_OPEN_EVENT_NAME = "App Open"
    private val LOGIN_EVENT_NAME = "Login"
    private val LOGOUT_EVENT_NAME = "Logout"
    private val SUBSCRIPTION_EVENT_NAME = "Subscription"
    private val TVOD_PURCHASE = "Tvod_purchase"
    private val TVOD_PURCHASE_COMPLETE = "tvod_purchase_completion"

    private val FILM_VIEWING_EVENT_NAME = "Film Viewing"
    private val USER_ID_EVENT_VALUE = "UUID"
    private val DEVICE_ID_EVENT_VALUE = "Device ID"
    private val USER_ENTITLEMENT_STATE_EVENT_VALUE = "Entitled"
    private val USER_REGISTER_STATE_EVENT_VALUE = "Registered"
    private val PRODUCT_NAME_EVENT_VALUE = "Product Name"
    private val PRICE_EVENT_VALUE = "Price"
    private val CURRENCY_EVENT_VALUE = "Currency"

    private val EVENT_PARAM_USER_NAME = "name"
    private val EVENT_PARAM_USER_EMAIL = "email"
    private val EVENT_PARAM_USER_PHONE = "phone"
    private val EVENT_PARAM_USER_ID = "userId"

    private val EVENT_PARAM_REGISTRATION_TYPE = "registrationType"
    private val EVENT_PARAM_APP_VERSION = "appVersion"
    private val EVENT_PARAM_SOURCE = "Source"
    private val EVENT_PARAM_AMOUNT = "amount"
    private val EVENT_PARAM_PAYMENT_PLAN = "paymentPlan"
    private val EVENT_PARAM_COUNTRY = "country"
    private val EVENT_PARAM_DISCOUNT_AMOUNT = "discountAmount"
    private val EVENT_PARAM_PAYMENT_HANDLER = "paymentHandler"
    private val EVENT_PARAM_PAYMENT_MODE = "Payment Mode"
    private val EVENT_PARAM_CURRENCY = "currency"
    private val EVENT_PARAM_DISCOUNTED_AMOUNT = "discountedAmount"
    private val EVENT_PARAM_TRANSACTION_AMOUNT = "transactionAmount"
    private val EVENT_PARAM_OTP_VERIFIED = "otpVerified"
    private val EVENT_PARAM_PHONE_NO = "phoneNo"
    private val EVENT_PARAM_SUBSCRIPTION_TYPE =
        "Subscription Type" // (new/Auto-renewal/manual-renew)";

    private val EVENT_PARAM_COUPON_CODE = "Coupon Code"
    private val EVENT_PARAM_COUPON_VALUE = "Coupon Value"
    private val EVENT_PARAM_SUBSCRIPTION_START_DATE = "planStartDate"
    private val EVENT_PARAM_SUBSCRIPTION_END_DATE = "planEndDate"
    private val PURCHASE_TYPE = "PURCHASE_TYPE".toLowerCase()

    private val EVENT_PARAM_CONTENT_ID = "contentId"
    private val EVENT_PARAM_CONTENT_NAME = "contentName"
    private val EVENT_PARAM_CONTENT_DURATION = "contentDuration"
    private val EVENT_PARAM_SHOW_NAME = "showName"
    private val EVENT_PARAM_CONTENT_TYPE = "contentType"
    private val EVENT_PARAM_BIT_RATE = "bitRate"
    private val EVENT_PARAM_CONTENT_TITLE = "contentTitle"
    private val EVENT_PARAM_ACTOR_NAME = "actorName"
    private val EVENT_PARAM_NETWORK_TYPE = "networkType"
    private val EVENT_PARAM_DIRECTOR_NAME = "directorName"
    private val EVENT_PARAM_CONTENT_GENRE = "contentGenre"
    private val EVENT_PARAM_MUSIC_DIRECTOR_NAME = "musicDirectorName"
    private val EVENT_PARAM_SINGER_NAME = "singerName"
    private val EVENT_PARAM_PLAYBACK_TYPE = "playbackType"
    private val EVENT_PARAM_EPISODE_NUMBER = "Episode Number"
    private val EVENT_PARAM_SEASON_NUMBER = "Season Number"
    private val EVENT_PARAM_LOCATION = "Location"
    private val EVENT_PARAM_DEVICE = "device"
    private val EVENT_PARAM_OS_BROWSER = "OS/Browser"
    private val EVENT_PARAM_LAST_PAGE_NAME = "lastPageName"
    private val EVENT_PARAM_LAST_ACTIVITY_NAME = "Last Activity Name"
    private val EVENT_PARAM_PAGE_URL = "pageURL"
    private val EVENT_CONTENT_PARAM="contents"
    private val EVENT_PARAM_LAST_ACTIVITY = "lastActivity"
    private val EVENT_PARAM_KEYWORD = "keyword"
    private val EVENT_KEY_PLAN_IDENTIFIER="planIdentifier"

    private val FILM_CATEGORY_EVENT_VALUE = "Category"
    private val FILM_ID_EVENT_VALUE = "Film ID"
    private val EVENT_FIRST_APP_OPEN = "First App Open"
    private val EVENT_ENGAGED_INSTALLER = "Engaged Installer"

    private val EVENT_REGISTRATION_COMPLETE = "CompleteRegistration"
    private val EVENT_START_TRIAL = "StartTrial"

    private val EVENT_SUBSCRIPTION_FAILED = "SubscriptionFailed"
    private val EVENT_APP_DOWNLOAD = "App Download"
    private val EVENT_APP_UNINSTALLS = "App Uninstalls"
    private val EVENT_REMOVED_FROM_WATCHLIST = "RemovedFromWatchlist"
    private val EVENT_INITIATE_CHECKOUT = "InitiateCheckout"
    private val EVENT_SEARCHED = "Search"
    private val EVENT_ADD_TO_CART = "AddToCart"
    private val EVENT_VIEW_CONTENT = "ViewContent"
    private val KEY_CONTENT_NAME   = "content_name"



}
package yukams.app.background_callcard

class Keys {
    companion object {
        @JvmStatic
        val SHARED_PREFERENCES_KEY = "callcard.SHARED_PREFERENCES_KEY"

        @JvmStatic
        val CALLBACK_DISPATCHER_HANDLE_KEY = "callcard.CALLBACK_DISPATCHER_HANDLE_KEY"

        @JvmStatic
        val CALLBACK_HANDLE_KEY = "callcard.CALLBACK_HANDLE_KEY"

        @JvmStatic
        val NOTIFICATION_CALLBACK_HANDLE_KEY = "callcard.NOTIFICATION_CALLBACK_HANDLE_KEY"

        @JvmStatic
        val INIT_CALLBACK_HANDLE_KEY = "callcard.INIT_CALLBACK_HANDLE_KEY"

        @JvmStatic
        val INIT_DATA_CALLBACK_KEY = "callcard.INIT_DATA_CALLBACK_KEY"

        @JvmStatic
        val DISPOSE_CALLBACK_HANDLE_KEY = "callcard.DISPOSE_CALLBACK_HANDLE_KEY"

        @JvmStatic
        val CHANNEL_ID = "callcard.app.yukams/locator_plugin"

        @JvmStatic
        val BACKGROUND_CHANNEL_ID = "callcard.app.yukams/locator_plugin_background"

        @JvmStatic
        val METHOD_SERVICE_INITIALIZED = "callcard.LocatorService.initialized"

        @JvmStatic
        val METHOD_PLUGIN_INITIALIZE_SERVICE = "callcard.LocatorPlugin.initializeService"

        @JvmStatic
        val METHOD_PLUGIN_REGISTER_LOCATION_UPDATE = "callcard.LocatorPlugin.registerLocationUpdate"

        @JvmStatic
        val METHOD_PLUGIN_UN_REGISTER_LOCATION_UPDATE = "callcard.LocatorPlugin.unRegisterLocationUpdate"

        @JvmStatic
        val METHOD_PLUGIN_IS_REGISTER_LOCATION_UPDATE = "callcard.LocatorPlugin.isRegisterLocationUpdate"

        @JvmStatic
        val METHOD_PLUGIN_IS_SERVICE_RUNNING = "callcard.LocatorPlugin.isServiceRunning"

        @JvmStatic
        val METHOD_PLUGIN_UPDATE_NOTIFICATION = "callcard.LocatorPlugin.updateNotification"

        @JvmStatic
        val METHOD_PLUGIN_SHOW_OVERLAY_VIEW = "callcard.LocatorPlugin.showOverlayView"

        @JvmStatic
        val METHOD_PLUGIN_CLOSE_OVERLAY_VIEW = "callcard.LocatorPlugin.closeOverlayView"

        @JvmStatic
        val ARG_INIT_CALLBACK = "callcard.initCallback"

        @JvmStatic
        val ARG_INIT_DATA_CALLBACK = "callcard.initDataCallback"

        @JvmStatic
        val ARG_DISPOSE_CALLBACK = "callcard.disposeCallback"

        @JvmStatic
        val ARG_IS_MOCKED = "callcard.is_mocked"

        @JvmStatic
        val ARG_LATITUDE = "callcard.latitude"

        @JvmStatic
        val ARG_LONGITUDE = "callcard.longitude"

        @JvmStatic
        val ARG_ACCURACY = "callcard.accuracy"

        @JvmStatic
        val ARG_ALTITUDE = "callcard.altitude"

        @JvmStatic
        val ARG_SPEED = "callcard.speed"

        @JvmStatic
        val ARG_SPEED_ACCURACY = "callcard.speed_accuracy"

        @JvmStatic
        val ARG_HEADING = "callcard.heading"

        @JvmStatic
        val ARG_TIME = "callcard.time"

        @JvmStatic
        val ARG_PROVIDER = "callcard.provider"

        @JvmStatic
        val ARG_CALLBACK = "callcard.callback"

        @JvmStatic
        val ARG_NOTIFICATION_CALLBACK = "callcard.notificationCallback"

        @JvmStatic
        val ARG_LOCATION = "callcard.location"

        @JvmStatic
        val ARG_SETTINGS = "callcard.settings"

        @JvmStatic
        val ARG_CALLBACK_DISPATCHER = "callcard.callbackDispatcher"


        @JvmStatic
        val SETTINGS_ACCURACY = "callcard.settings_accuracy"

        @JvmStatic
        val SETTINGS_INTERVAL = "callcard.settings_interval"

        @JvmStatic
        val SETTINGS_DISTANCE_FILTER = "callcard.settings_distanceFilter"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_CHANNEL_NAME = "callcard.settings_android_notificationChannelName"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_TITLE = "callcard.settings_android_notificationTitle"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_MSG = "callcard.settings_android_notificationMsg"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_BIG_MSG = "callcard.settings_android_notificationBigMsg"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_ICON = "callcard.settings_android_notificationIcon"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_ICON_COLOR = "callcard.settings_android_notificationIconColor"

        @JvmStatic
        val SETTINGS_ANDROID_WAKE_LOCK_TIME = "callcard.settings_android_wakeLockTime"

        @JvmStatic
        val SETTINGS_ANDROID_LOCATION_CLIENT = "callcard.settings_android_location_client"

        @JvmStatic
        val SETTINGS_INIT_PLUGGABLE = "callcard.settings_init_pluggable"

        @JvmStatic
        val SETTINGS_DISPOSABLE_PLUGGABLE = "callcard.settings_disposable_pluggable"

        @JvmStatic
        val BCM_SEND_LOCATION = "callcard.BCM_SEND_LOCATION"

        @JvmStatic
        val BCM_NOTIFICATION_CLICK = "callcard.BCM_NOTIFICATION_CLICK"

        @JvmStatic
        val BCM_INIT = "callcard.BCM_INIT"

        @JvmStatic
        val BCM_DISPOSE = "callcard.BCM_DISPOSE"

        @JvmStatic
        val NOTIFICATION_ACTION = "callcard.com.yukams.callcard.notification"
    }
}
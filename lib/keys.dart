class Keys {
  static const String CHANNEL_ID = 'callcard.app.yukams/locator_plugin';
  static const String BACKGROUND_CHANNEL_ID =
      'callcard.app.yukams/locator_plugin_background';

  static const String METHOD_SERVICE_INITIALIZED = 'callcard.LocatorService.initialized';
  static const String METHOD_PLUGIN_INITIALIZE_SERVICE =
      'callcard.LocatorPlugin.initializeService';
  static const String METHOD_PLUGIN_REGISTER_LOCATION_UPDATE =
      'callcard.LocatorPlugin.registerLocationUpdate';
  static const String METHOD_PLUGIN_UN_REGISTER_LOCATION_UPDATE =
      'callcard.LocatorPlugin.unRegisterLocationUpdate';
  static const String METHOD_PLUGIN_IS_REGISTER_LOCATION_UPDATE =
      'callcard.LocatorPlugin.isRegisterLocationUpdate';
  static const String METHOD_PLUGIN_IS_SERVICE_RUNNING =
      'callcard.LocatorPlugin.isServiceRunning';
  static const String METHOD_PLUGIN_UPDATE_NOTIFICATION =
      'callcard.LocatorPlugin.updateNotification';
  static const String METHOD_PLUGIN_SHOW_OVERLAY_VIEW =
      'callcard.LocatorPlugin.showOverlayView';
  static const String METHOD_PLUGIN_CLOSE_OVERLAY_VIEW =
      'callcard.LocatorPlugin.closeOverlayView';

  static const String ARG_IS_MOCKED = 'callcard.is_mocked';
  static const String ARG_LATITUDE = 'callcard.latitude';
  static const String ARG_LONGITUDE = 'callcard.longitude';
  static const String ARG_ALTITUDE = 'callcard.altitude';
  static const String ARG_ACCURACY = 'callcard.accuracy';
  static const String ARG_SPEED = 'callcard.speed';
  static const String ARG_SPEED_ACCURACY = 'callcard.speed_accuracy';
  static const String ARG_HEADING = 'callcard.heading';
  static const String ARG_TIME = 'callcard.time';
  static const String ARG_PROVIDER = 'callcard.provider';
  static const String ARG_CALLBACK = 'callcard.callback';
  static const String ARG_NOTIFICATION_CALLBACK = 'callcard.notificationCallback';
  static const String ARG_INIT_CALLBACK = 'callcard.initCallback';
  static const String ARG_INIT_DATA_CALLBACK = 'callcard.initDataCallback';
  static const String ARG_DISPOSE_CALLBACK = 'callcard.disposeCallback';
  static const String ARG_LOCATION = 'callcard.location';
  static const String ARG_SETTINGS = 'callcard.settings';
  static const String ARG_CALLBACK_DISPATCHER = 'callcard.callbackDispatcher';

  static const String SETTINGS_ACCURACY = 'callcard.settings_accuracy';
  static const String SETTINGS_INTERVAL = 'callcard.settings_interval';
  static const String SETTINGS_DISTANCE_FILTER = 'callcard.settings_distanceFilter';
  static const String SETTINGS_AUTO_STOP = 'callcard.settings_autoStop';
  static const String SETTINGS_ANDROID_NOTIFICATION_CHANNEL_NAME =
      'callcard.settings_android_notificationChannelName';
  static const String SETTINGS_ANDROID_NOTIFICATION_TITLE =
      'callcard.settings_android_notificationTitle';
  static const String SETTINGS_ANDROID_NOTIFICATION_MSG =
      'callcard.settings_android_notificationMsg';
  static const String SETTINGS_ANDROID_NOTIFICATION_BIG_MSG =
      'callcard.settings_android_notificationBigMsg';
  static const String SETTINGS_ANDROID_NOTIFICATION_ICON =
      'callcard.settings_android_notificationIcon';
  static const String SETTINGS_ANDROID_NOTIFICATION_ICON_COLOR =
      'callcard.settings_android_notificationIconColor';
  static const String SETTINGS_ANDROID_WAKE_LOCK_TIME =
      'callcard.settings_android_wakeLockTime';
  static const String SETTINGS_ANDROID_LOCATION_CLIENT =
      'callcard.settings_android_location_client';

  static const String SETTINGS_IOS_SHOWS_BACKGROUND_LOCATION_INDICATOR =
      'callcard.settings_ios_showsBackgroundLocationIndicator';
  static const String SETTINGS_IOS_STOP_WITH_TERMINATE =
      'callcard.settings_ios_stopWithTerminate';

  static const String BCM_SEND_LOCATION = 'callcard.BCM_SEND_LOCATION';
  static const String BCM_NOTIFICATION_CLICK = 'callcard.BCM_NOTIFICATION_CLICK';
  static const String BCM_INIT = 'callcard.BCM_INIT';
  static const String BCM_DISPOSE = 'callcard.BCM_DISPOSE';
}

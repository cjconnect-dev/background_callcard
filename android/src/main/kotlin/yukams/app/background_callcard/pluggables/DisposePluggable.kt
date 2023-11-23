package yukams.app.background_callcard.pluggables

import android.content.Context
import android.os.Handler
import io.flutter.plugin.common.MethodChannel
import yukams.app.background_callcard.CallcardHolderService
import yukams.app.background_callcard.Keys
import yukams.app.background_callcard.PreferencesManager

class DisposePluggable : Pluggable {
    override fun setCallback(context: Context, callbackHandle: Long) {
        PreferencesManager.setCallbackHandle(context, Keys.DISPOSE_CALLBACK_HANDLE_KEY, callbackHandle)
    }

    override fun onServiceDispose(context: Context) {
        (PreferencesManager.getCallbackHandle(context, Keys.DISPOSE_CALLBACK_HANDLE_KEY))?.let { disposeCallback ->
            CallcardHolderService.getBinaryMessenger(context)?.let { binaryMessenger ->
                val backgroundChannel = MethodChannel(binaryMessenger, Keys.BACKGROUND_CHANNEL_ID)
                Handler(context.mainLooper)
                    .post {
                        backgroundChannel.invokeMethod(
                            Keys.BCM_DISPOSE,
                            hashMapOf(Keys.ARG_DISPOSE_CALLBACK to disposeCallback)
                        )
                    }
            }
        }
    }
}
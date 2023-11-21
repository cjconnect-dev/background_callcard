package yukams.app.background_callcard.callcard

import android.content.Context
import android.graphics.Color
import android.graphics.PixelFormat
import android.os.Build
import android.util.TypedValue
import android.view.Gravity
import android.view.WindowManager
import io.flutter.embedding.android.FlutterTextureView
import io.flutter.embedding.android.FlutterView
import io.flutter.embedding.engine.FlutterEngineCache
import yukams.app.background_callcard.IsolateHolderService

class OverlayCallCardView(private val context: Context) {
  private val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
  private var flutterView: FlutterView? = null
  private val resources = context.resources

  fun addOverlayViewAttach() {
    if (flutterView == null) {
      flutterView = FlutterView(context, FlutterTextureView(context))
      val engine = FlutterEngineCache.getInstance()[IsolateHolderService.CACHED_TAG]
      engine?.lifecycleChannel?.appIsResumed()
      engine?.let { flutterView?.attachToFlutterEngine(it) }
      flutterView?.fitsSystemWindows = true
      flutterView?.isFocusable = true
      flutterView?.isFocusableInTouchMode = true
      flutterView?.setBackgroundColor(Color.TRANSPARENT)

      val params = newWindowManagerLayoutParams()
      params.height = dpToPx(200)
      params.gravity = Gravity.BOTTOM
      windowManager.addView(flutterView, params)
    }
  }

  fun removeOverlayViewDetach() {
    if (flutterView != null) {
      windowManager.removeView(flutterView)
      flutterView?.detachFromFlutterEngine()
      flutterView = null
    }
  }

  private fun dpToPx(dp: Int): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, (dp.toString() + "").toFloat(), resources.displayMetrics).toInt()
  }

  companion object {
    private fun newWindowManagerLayoutParams(): WindowManager.LayoutParams {
      val flag = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
      } else {
        WindowManager.LayoutParams.TYPE_SYSTEM_ERROR
      }

      return WindowManager.LayoutParams(
        WindowManager.LayoutParams.MATCH_PARENT,
        WindowManager.LayoutParams.WRAP_CONTENT,
        flag,
        WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL or
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
        PixelFormat.TRANSLUCENT
      )
    }
  }
}

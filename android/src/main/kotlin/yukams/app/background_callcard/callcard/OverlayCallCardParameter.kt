package yukams.app.background_callcard.callcard

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
data class OverlayCallCardParameter(
        @SerializedName("title")
        val title: String,
) : Parcelable

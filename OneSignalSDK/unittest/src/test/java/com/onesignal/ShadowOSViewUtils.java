package com.onesignal;

import android.app.Activity;
import androidx.annotation.Nullable;

import org.robolectric.annotation.Implements;

@Implements(OSViewUtils.class)
public class ShadowOSViewUtils {

   public static boolean isActivityFullyReady(@NonNull Activity activity) {
      return true;
   }

}

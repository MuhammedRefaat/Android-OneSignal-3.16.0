package com.onesignal;

import androidx.annotation.Nullable; import androidx.annotation.NonNull;
import androidx.annotation.Nullable; import androidx.annotation.NonNull;

class OSLogWrapper implements OSLogger {


    public void verbose(@NonNull String message) {
        OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, message);
    }

    public void debug(@NonNull String message) {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, message);
    }

    public void warning(@NonNull String message) {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, message);
    }

    public void error(@NonNull String message, @Nullable Throwable throwable) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, message, throwable);
    }

}

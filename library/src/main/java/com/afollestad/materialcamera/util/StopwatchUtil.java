package com.afollestad.materialcamera.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by generalic on 08/02/17.
 */
public final class StopwatchUtil {

    public static final String START_TIME = "start_time";
    public static final String END_TIME = "end_time";

    private StopwatchUtil() {
    }

    public static void storeTime(Context context, String type, long nanos) {
        final SharedPreferences sharedPref = context.getSharedPreferences(
                PreferenceUtil.SHARED_PREFS,
                Context.MODE_PRIVATE
        );
        final SharedPreferences.Editor editor = sharedPref.edit();
        editor.putLong(type, nanos);
        editor.apply();
    }

    public static long getTime(Context context, String type) {
        final SharedPreferences sharedPref = context.getSharedPreferences(
                PreferenceUtil.SHARED_PREFS,
                Context.MODE_PRIVATE
        );
        return sharedPref.getLong(type, 1L);
    }

}

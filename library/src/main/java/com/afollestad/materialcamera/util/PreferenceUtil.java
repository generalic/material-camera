package com.afollestad.materialcamera.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by generalic on 08/02/17.
 */
public final class PreferenceUtil {

    public static String SHARED_PREFS = "com.vodafone.smartdoorbell.prefs.PREFERENCES";

    public static final String PREF_START_TIME = "com.vodafone.smartdoorbell.prefs.START_TIME";
    public static final String PREF_END_TIME = "com.vodafone.smartdoorbell.prefs.END_TIME";

    private PreferenceUtil() {
    }

    private static SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
    }

    public static void storeTime(Context context, String type, long nanos) {
        final SharedPreferences.Editor editor = getPrefs(context).edit();
        editor.putLong(type, nanos);
        editor.apply();
    }

    public static long getTime(Context context, String type) {
        return getPrefs(context).getLong(type, 1L);
    }

}

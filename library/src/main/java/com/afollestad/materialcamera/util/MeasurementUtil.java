package com.afollestad.materialcamera.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by generalic on 28/02/17.
 */

public final class MeasurementUtil {

    public static final String TAG = "Measurement";
    public static final String TAKE_PICTURE_START = "take.picture.START";
    public static final String TAKE_PICTURE_END = "take.picture.END";
    public static final String UPLOAD_PICTURE_START = "upload.picture.START";
    public static final String UPLOAD_PICTURE_END = "upload.picture.END";
    public static final String DOWNLOAD_PICTURE_START = "download.picture.START";
    public static final String DOWNLOAD_PICTURE_END = "download.picture.END";
    public static final String COMMAND_REQUEST_START = "command.request.START";
    public static final String COMMAND_REQUEST_END = "command.request.END";
    public static final String CALL_SETUP_START = "call.setup.START";
    public static final String CALL_SETUP_END = "call.setup.END";
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("HH:mm:ss.SSS");

    private MeasurementUtil() {
    }

    public static String getTime() {
        return FORMATTER.format(new Date());
    }
}

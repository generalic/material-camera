package com.afollestad.materialcamera.util;

/**
 * Created by generalic on 28/02/17.
 */

public final class DimensionConstants {

    private static final int WIDTH = 320;
    private static final int HEIGHT = 480;

    private static final Dimension DIMENSIONS = new Dimension(WIDTH, HEIGHT);
    private static final Dimension DIMENSIONS_INVERSE = new Dimension(HEIGHT, WIDTH);

    private DimensionConstants() {
    }

    public static Dimension getDimension(int width, int height) {
        if (height > width) {
            return DIMENSIONS;
        } else {
            return DIMENSIONS_INVERSE;
        }
    }
}

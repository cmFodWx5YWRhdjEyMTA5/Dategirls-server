package com.ideaout.dategirls.util;

import org.springframework.lang.Nullable;

import java.util.Random;
import java.util.UUID;

public class TextUtil {
    /**
     * Returns true if the string is null or 0-length.
     * @param str the string to be examined
     * @return true if str is null or zero length
     */
    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }


    public static String getStringID(){
        return UUID.randomUUID().toString();
    }

    public static Long getLongID(){
        return System.currentTimeMillis();
    }
}

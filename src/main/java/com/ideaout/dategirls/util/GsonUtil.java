package com.ideaout.dategirls.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

public class GsonUtil {
    private static Gson gson = new Gson();

    public static String toJson(Object src) {
        return gson.toJson(src);
    }

    public static <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
        try {
            return gson.fromJson(json, typeOfT);
        }catch (Exception e){
            return null;
        }
    }

}
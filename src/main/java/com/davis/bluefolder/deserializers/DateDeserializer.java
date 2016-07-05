package com.davis.bluefolder.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class DateDeserializer implements JsonDeserializer<Date> {
    private static final String[] DATE_FORMATS = new String[] {
            "MMM dd, yyyy HH:mm:ss",
            "MMM dd, yyyy",
            "MM-dd-yyyy hh:mma",
            "yyyy-MM-dd'T'HH:mm:ss:SSS",
            "yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
            "yyyy-MM-dd'T'HH:mm:ss:SSSXXX",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd'T'HH:mm:ss"
    };
    @Override
    public Date deserialize(JsonElement jsonElement, Type typeOF,
                            JsonDeserializationContext context) throws JsonParseException {
        for (String format : DATE_FORMATS) {
            try {
                return new SimpleDateFormat(format, Locale.US).parse(jsonElement.getAsString());
            } catch (ParseException e) {
            }
        }
        throw new JsonParseException("Unparseable date: \"" + jsonElement.getAsString()
                + "\". Supported formats: " + Arrays.toString(DATE_FORMATS));
    }
}


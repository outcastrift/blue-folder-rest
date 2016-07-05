package com.davis.bluefolder.deserializers;

import com.davis.bluefolder.service.LogEntry;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class LogEntryDeserializer implements JsonDeserializer<LogEntry[]> {
    private Gson gson ;
        public LogEntryDeserializer(Gson gson){
            this.gson  =gson;
        }
        @Override
        public LogEntry[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException
        {
            LogEntry[] logEntry = gson.fromJson(json, LogEntry[].class);




            return logEntry;
        }
    }


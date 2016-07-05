package com.davis.bluefolder.deserializers;

import com.davis.bluefolder.service.CustomField;
import com.davis.bluefolder.service.LaborItem;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class LaborItemDeserializer implements JsonDeserializer<LaborItem[]> {
    private Gson gson ;
        public LaborItemDeserializer(Gson gson){
            this.gson  =gson;
        }
        @Override
        public LaborItem[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException
        {
            LaborItem[] laborItem = gson.fromJson(json, LaborItem[].class);




            return laborItem;
        }
    }


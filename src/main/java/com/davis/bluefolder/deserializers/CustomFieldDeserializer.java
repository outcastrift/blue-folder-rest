package com.davis.bluefolder.deserializers;

import com.davis.bluefolder.service.CustomField;
import com.davis.bluefolder.service.ExpenseItem;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class CustomFieldDeserializer implements JsonDeserializer<CustomField[]> {
    private Gson gson ;
        public CustomFieldDeserializer(Gson gson){
            this.gson  =gson;
        }
        @Override
        public CustomField[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException
        {
            CustomField[] customField = gson.fromJson(json, CustomField[].class);




            return customField;
        }
    }


package com.davis.bluefolder.deserializers;

import com.davis.bluefolder.service.ExpenseItem;
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
public class ExpenseItemDeserializer implements JsonDeserializer<ExpenseItem[]> {
    private Gson gson ;
        public ExpenseItemDeserializer(Gson gson){
            this.gson  =gson;
        }
        @Override
        public ExpenseItem[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException
        {
            ExpenseItem[] expenseItem = gson.fromJson(json, ExpenseItem[].class);




            return expenseItem;
        }
    }


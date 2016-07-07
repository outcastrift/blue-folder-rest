package com.davis.bluefolder;

import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


/**
 * This software was created for the Open Architecture Distributed Common Ground System
 * Modernization All rights to this software belong to  appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 3/25/16.
 */

public class BlueRestService {
    private static final Logger logger = LoggerFactory.getLogger(BlueRestService.class);

    protected static boolean serverUp = false;
    private static OkHttpClient client = new OkHttpClient();
    public static OkHttpClient getOkHttpClient() {
        return client;
    }
    private final MediaType MEDIA_TYPE = MediaType.parse("application/x-www-form-urlencoded");
    public static boolean isServerUp() {
        return serverUp;
    }

    public BlueRestService(){

    }



    public String getResponseString(String urlToCall, String requestBody) throws Exception {


        Request request = new Request.Builder()
                .url(urlToCall)
                .post(RequestBody.create(MEDIA_TYPE, requestBody))
                .header("Authorization", "Basic NjI1MTUxYmItODA4Yi00NjVmLWE0YTctMTZjOThhNTQ3ZDY2Olg=")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()){
            throw new IOException("Unexpected code " + response);
        }
        return response.body().string();
    }

}

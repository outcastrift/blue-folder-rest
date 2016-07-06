package com.davis.bluefolder;

import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.config.RestAssuredConfig.newConfig;

/**
 * This software was created for the Open Architecture Distributed Common Ground System
 * Modernization All rights to this software belong to  appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 3/25/16.
 */

public class BlueRestService {
    private static final Logger logger = LoggerFactory.getLogger(BlueRestService.class);

    protected static boolean serverUp = false;
    protected static SSLConfig sslConfig;

    public static SSLConfig getSslConfig() {
        return sslConfig;
    }

    public static boolean isServerUp() {
        return serverUp;
    }

    public BlueRestService(){

    }





    public String getResponseString(String urlToCall, String requestBody){


        Response response = given()
                .config(newConfig().sslConfig(new SSLConfig()
                        .relaxedHTTPSValidation()
                        .allowAllHostnames()
                        .keystore("/localhost,jks","changeit")
                        .trustStore("/localhost,jks","changeit")))
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic NjI1MTUxYmItODA4Yi00NjVmLWE0YTctMTZjOThhNTQ3ZDY2Olg=")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .body(requestBody)
                .when()
                .post(urlToCall)
                ;

        return response.body().asString();
    }
}

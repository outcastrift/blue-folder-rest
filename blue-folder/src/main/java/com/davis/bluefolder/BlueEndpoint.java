package com.davis.bluefolder;

import com.davis.bluefolder.deserializers.DateDeserializer;
import com.davis.bluefolder.jsonapi.JsonApiResponse;
import com.davis.bluefolder.users.BFUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */

@Path("/")
@Consumes("application/json")
public class BlueEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(BlueEndpoint.class);

    public static Gson gson ;
    public BlueRestService blueRestService;

    public BlueEndpoint(){
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Date.class,new DateDeserializer())
                .create();
        blueRestService = new BlueRestService();

    }



    @GET
    @Path("/getAllUsers")
    public Response getAllUsers(@Context UriInfo requestUriInfo) throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/users/list.aspx";
        String result = blueRestService.getResponseString(url,
                "<request>" +
                        "<userList>" +
                        "<listType>full</listType>" +
                        "</userList>" +
                        "</request>"
        );
        String jsonString = BlueUtils.convertXmlToJson(result);
        JsonObject jsonObject = gson.fromJson(jsonString,JsonObject.class);
        JsonArray jsonArray = jsonObject.getAsJsonObject("response").getAsJsonArray("user");
        BFUser[] userList = gson.fromJson(jsonArray,BFUser[].class);


        try {
            JsonApiResponse response = new JsonApiResponse();
            Response.ResponseBuilder builder = null;
            String date = LocalDateTime.now().toString();
            response.setData(userList);
            builder = Response.ok(response.getSanitizedJson(), MediaType.APPLICATION_JSON);

            return builder.build();

        } catch (Exception e) {
            throw new EndpointException("There was a error handling the request.",
                    "There was a error handling the request.", Response.Status.INTERNAL_SERVER_ERROR);
        }
    }







}

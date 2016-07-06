package com.davis.bluefolder;

import com.davis.bluefolder.deserializers.DateDeserializer;
import com.davis.bluefolder.jsonapi.JsonApiResponse;
import com.davis.bluefolder.jsonapi.JsonApiResponseError;
import com.davis.bluefolder.users.BFUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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




    /**
     * If no query parameters are supplied it searches last 2 weeks.
     * **/
    @GET
    @Path("/getServiceRequestsDate")
    public Response getServiceRequestsWithinDate(@Context UriInfo requestUriInfo,
                                                 @QueryParam("start") String start,
                                                 @QueryParam("end") String end) throws Exception {

        String dateRange = null;

        if(start != null && !start.trim().equalsIgnoreCase("")){
            if(end != null && !end.trim().equalsIgnoreCase("")){
                BlueUtils.contructDatesForSearch(start,end);
            }else{
               dateRange= BlueUtils.contructDatesForSearch(null,null);
            }
        }else{
          dateRange=  BlueUtils.contructDatesForSearch(null,null);
        }

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";

        String serviceRequests = blueRestService.getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        dateRange +
                        "</serviceRequestList>" +
                        "</request>");


        String jsonString = BlueUtils.convertXmlToJson(serviceRequests);

        Response response =null;
        try {
            response = generateResponseFromObject(jsonString);
        } catch (EndpointException e) {
            return generateErrorResponse(500,"Server Error","There was a error handling the request.");

        }

        return  response;
    }
    @GET
    @Path("/getAllServiceRequests")
    public Response getAllServiceRequests(@Context UriInfo requestUriInfo) throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";
        String result = blueRestService.getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        "</serviceRequestList>" +
                        "</request>"
        );
        String jsonString = BlueUtils.convertXmlToJson(result);

        Response response =null;
        try {
            response = generateResponseFromObject(jsonString);
        } catch (EndpointException e) {
            return generateErrorResponse(500,"Server Error","There was a error handling the request.");

        }

        return  response;
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
        Response response =null;
        try {
            response = generateResponseFromObject(userList);
        } catch (EndpointException e) {
            return generateErrorResponse(500,"Server Error","There was a error handling the request.");

        }

        return  response;
    }



    //Example request
    //https://localhost:8993/services/blue/isUserValid?user=6fc5524d-87db-4ce1-a3e6-90918accc231
    @GET
    @Path("/isUserValid")
    public Response isUserValid(@Context UriInfo requestUriInfo,
                                @QueryParam("user") String userID){


        if(userID == null || userID.trim().equalsIgnoreCase("")){
            return generateErrorResponse(400,"No User Supplied","No user ID was supplied to the endpoint.");

        }

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
        JsonArray  jsonArray = jsonObject.getAsJsonObject("response").getAsJsonArray("user");
        BFUser[] userList = gson.fromJson(jsonArray,BFUser[].class);
        BFUser targetUser = null;
        for(BFUser bfUser : userList){
            if(bfUser.getUserName().equalsIgnoreCase(userID)){
                targetUser =bfUser;
            }
        }
        if(targetUser == null){
            return generateErrorResponse(204,"No User","The user is not within the Blue Folder database");

        }
        Response response =null;
        try {
            response = generateResponseFromObject(targetUser);
        } catch (EndpointException e) {
            return generateErrorResponse(500,"Server Error","There was a error handling the request.");


        }

        return  response;

    }


    private Response generateResponseFromObject(Object o) throws EndpointException{

            JsonApiResponse response = new JsonApiResponse();
            Response.ResponseBuilder builder = null;
            response.setData(o);
            builder = Response.ok(response.getSanitizedJson(), MediaType.APPLICATION_JSON);

            return builder.build();


    }
    private Response generateErrorResponse(int errorCode, String title, String explanation){
        JsonApiResponse response = new JsonApiResponse();
        Response.ResponseBuilder builder = null;
        JsonApiResponseError jsonApiResponseError = new JsonApiResponseError(errorCode,title,explanation);
        List<JsonApiResponseError> errors = new ArrayList<JsonApiResponseError>();
        errors.add(jsonApiResponseError);
        response.setErrors(errors);
        builder = Response.ok(response.getSanitizedJson(), MediaType.APPLICATION_JSON);

        return builder.build();
    }



}

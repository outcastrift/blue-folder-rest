package com.davis.serviceRequest;

import com.davis.BaseBlueFolderTest;
import com.davis.bluefolder.service.ServiceRequest;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class GetSingleServiceRequest extends BaseBlueFolderTest {

    @Test
    public void testGetSingleServiceRequest_XML() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/get.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");
        writeToFile("singleServiceRequest.xml", formatXML(result));
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGetSingleServiceRequest_JSON() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/get.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");
        writeToFile("singleServiceRequest.json", convertXmlToJson(result));
        assertTrue(result.length() > 0);
    }
    @Test
    public void testGetSingleServiceRequest_Object() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/get.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");

        writeToFile("testGetSingleServiceRequest_Object.json", convertXmlToJson(result));
        String jsonString = convertXmlToJson(result);
        JsonParser parser = new JsonParser();
        JsonElement jsonServiceRequest = parser.parse(jsonString).getAsJsonObject().get("response").getAsJsonObject().get("serviceRequest");
        ServiceRequest serviceRequest = gson.fromJson( jsonServiceRequest , ServiceRequest.class);

        String s = serviceRequest.getAssignedToUser();

        assertTrue(s.length() > 0);
    }
}

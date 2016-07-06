package com.davis.serviceRequest;

import com.davis.BaseBlueFolderTest;
import com.davis.bluefolder.service.ServiceRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class GetAllServiceRequest extends BaseBlueFolderTest {

    //this thing returns like 48 MB
    //@Test
    public void testGetAllServiceRequests_XML() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";
        String serviceRequests = getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        "</serviceRequestList>" +
                        "</request>");
        writeToFile("allServiceRequests.xml", formatXML(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }

    //41 MB in JSON
    @Test
    public void testGetAllServiceRequests_JSON() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";
        String serviceRequests = getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        "</serviceRequestList>" +
                        "</request>");
        writeToFile("allServiceRequests.json", convertXmlToJson(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }
    //NOT WORKING
    public void testGetAllServiceRequests_Object() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";
        String serviceRequests = getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        "</serviceRequestList>" +
                        "</request>");
       // writeToFile("allServiceRequestsObject.json", convertXmlToJson(serviceRequests));
        String jsonString = convertXmlToJson(serviceRequests);
        JsonParser parser = new JsonParser();
        JsonArray jsonServiceRequest = parser.parse(jsonString).getAsJsonObject().get("response").getAsJsonObject()
                .get("serviceRequestList").getAsJsonObject()
                .get("serviceRequest").getAsJsonArray();
        ServiceRequest[] serviceRequest = gson.fromJson( jsonServiceRequest , ServiceRequest[].class);
        assertTrue(serviceRequests.length() > 0);

    }
}

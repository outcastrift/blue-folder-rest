package com.davis;

import com.mashape.unirest.http.exceptions.UnirestException;
import junit.framework.TestCase;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import java.io.*;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Main.
 */
public class ServiceTests extends BaseBlueFolderTest {

    //this thing returns like 48 MB
    //@Test
    public void testGetAllServiceRequests() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
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

    @Test
    public void testGetServiceRequestsWithinDate() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";

        String serviceRequests = getResponseString(url,
                "<request>" +
                "<serviceRequestList>" +
                "<listType>basic</listType>" +
                contructDatesForSearch() +
                "</serviceRequestList>" +
                "</request>");
        writeToFile("serviceRequestLast2Weeks.xml", formatXML(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }

    @Test
    public void testGetServiceRequestsWithinDate_And_Open() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";

        String serviceRequests = getResponseString(url,
                "<request>" +
                "<serviceRequestList>" +
                "<listType>basic</listType>" +
                contructDatesForSearch() +
                "<status>open</status>"+
                "</serviceRequestList>" +
                "</request>");

        writeToFile("serviceRequestLast2Weeks_And_Open.xml", formatXML(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }

    @Test
    public void testGetSingleServiceRequest() throws Exception{
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/get.aspx";
        String result = getResponseString(url,
                "<request>" +
                "<serviceRequestID>30141</serviceRequestID>" +
                "</request>");
        writeToFile("singleServiceRequest.xml", formatXML(result));
        assertTrue(result.length() > 0);
    }

    @Test
    public void testHistoryForSingleServiceRequest() throws Exception{

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getHistory.aspx";

        String historyForRequest = getResponseString(url,
                "<request>" +
                "<serviceRequestID>30141</serviceRequestID>" +
                "</request>");

        writeToFile("historyForSingleRequest.xml", formatXML(historyForRequest));
        assertTrue(historyForRequest.length() > 0);
    }



    //Not testing this
    //@Test
    public void testUpdateServiceRequest() throws Exception{
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/edit.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestEdit>" +
                            "<serviceRequestID></serviceRequestID>" +
                            "<customerID></customerID>" +
                            "<customerContactID></customerContactID>" +
                            "<customerLocationID></customerLocationID>" +
                            "<description></description>" +
                            "<statusChange>" +
                                "<status></status>" +
                                "<commentPrivate></commentPrivate>" +
                                "<commentPublic></commentPublic>" +
                                "<notifyCustomer></notifyCustomer>" +
                            "</statusChange>" +
                            "<assignedTo>" +
                                "<userID></userID>" +
                                " ..." +
                            "</assignedTo>" +
                            "<billable></billable>" +
                            "<category></category>" +
                            "<customFields>" +
                                "<customField name=\"field name\"></customField>" +
                                "..." +
                            "</customFields>" +
                            "<dueDate></dueDate>" +
                            "<notes></notes>" +
                            "<priority></priority>" +
                            "<purchaseOrderNo></purchaseOrderNo>" +
                            "<referenceNo></referenceNo>" +
                            "<serviceManagerID></serviceManagerID>" +
                            "<externalID></externalID>" +
                        "</serviceRequestEdit>" +
                        "</request>"
                );

        writeToFile("updateServiceRequest.xml",formatXML(result));
    }

    @Test
    public void testGetServiceRequestForUser() {

    }


}

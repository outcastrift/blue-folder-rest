package com.davis.serviceRequest;

import com.davis.BaseBlueFolderTest;
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
public class GetServiceRequestWithinDate extends BaseBlueFolderTest {


    @Test
    public void testGetServiceRequestsWithinDate_XML() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
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
    public void testGetServiceRequestsWithinDate_JSON() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";

        String serviceRequests = getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        contructDatesForSearch() +
                        "</serviceRequestList>" +
                        "</request>");
        writeToFile("serviceRequestLast2Weeks.json", convertXmlToJson(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }
}

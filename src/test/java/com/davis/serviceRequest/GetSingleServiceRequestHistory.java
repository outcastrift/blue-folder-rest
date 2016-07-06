package com.davis.serviceRequest;

import com.davis.BaseBlueFolderTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class GetSingleServiceRequestHistory extends BaseBlueFolderTest {


    @Test
    public void testHistoryForSingleServiceRequest_XML() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getHistory.aspx";

        String historyForRequest = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");

        writeToFile("historyForSingleRequest.xml", formatXML(historyForRequest));
        assertTrue(historyForRequest.length() > 0);
    }

    @Test
    public void testHistoryForSingleServiceRequest_JSON() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getHistory.aspx";

        String historyForRequest = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");

        writeToFile("historyForSingleRequest.json", convertXmlToJson(historyForRequest));
        assertTrue(historyForRequest.length() > 0);
    }
}

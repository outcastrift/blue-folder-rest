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
public class GetServiceRequestWithinDateAndOpen extends BaseBlueFolderTest {


    @Test
    public void testGetServiceRequestsWithinDate_And_Open_XML() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";

        String serviceRequests = getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        contructDatesForSearch() +
                        "<status>open</status>" +
                        "</serviceRequestList>" +
                        "</request>");

        writeToFile("serviceRequestLast2Weeks_And_Open.xml", formatXML(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }

    @Test
    public void testGetServiceRequestsWithinDate_And_Open_JSON() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/list.aspx";

        String serviceRequests = getResponseString(url,
                "<request>" +
                        "<serviceRequestList>" +
                        "<listType>basic</listType>" +
                        contructDatesForSearch() +
                        "<status>open</status>" +
                        "</serviceRequestList>" +
                        "</request>");

        writeToFile("serviceRequestLast2Weeks_And_Open.json", convertXmlToJson(serviceRequests));

        assertTrue(serviceRequests.length() > 0);

    }
}

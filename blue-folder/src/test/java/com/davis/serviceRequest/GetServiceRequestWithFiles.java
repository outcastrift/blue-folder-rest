package com.davis.serviceRequest;

import com.davis.BaseBlueFolderTest;
import org.junit.Test;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class GetServiceRequestWithFiles extends BaseBlueFolderTest {

    @Test
    public void testGetServiceRequestWithFiles_XML() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getFiles.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>"
        );

        writeToFile("testGetServiceRequestWithFiles.xml", formatXML(result));
    }

    @Test
    public void testGetServiceRequestWithFiles_JSON() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getFiles.aspx";
        String result = getResponseString(url,
                "<request>"+
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request> "
        );

        writeToFile("testGetServiceRequestWithFiles.json", convertXmlToJson(result));
    }
}

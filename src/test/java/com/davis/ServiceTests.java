package com.davis;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Main.
 */
public class ServiceTests extends BaseBlueFolderTest {

    //this thing returns like 48 MB
    //@Test
    public void testGetAllServiceRequestsXML() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
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
    //@Test
    public void testGetAllServiceRequestsJSON() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
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

    @Test
    public void testGetServiceRequestsWithinDateXML() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
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
    public void testGetServiceRequestsWithinDateJSON() throws UnirestException, IOException, ParserConfigurationException, SAXException, TransformerException {
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

    @Test
    public void testGetSingleServiceRequestXML() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/get.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");
        writeToFile("singleServiceRequest.xml", formatXML(result));
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGetSingleServiceRequestJSON() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/get.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");
        writeToFile("singleServiceRequest.json", convertXmlToJson(result));
        assertTrue(result.length() > 0);
    }

    @Test
    public void testHistoryForSingleServiceRequestXML() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getHistory.aspx";

        String historyForRequest = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");

        writeToFile("historyForSingleRequest.xml", formatXML(historyForRequest));
        assertTrue(historyForRequest.length() > 0);
    }

    @Test
    public void testHistoryForSingleServiceRequestJSON() throws Exception {

        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getHistory.aspx";

        String historyForRequest = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                        "</request>");

        writeToFile("historyForSingleRequest.json", convertXmlToJson(historyForRequest));
        assertTrue(historyForRequest.length() > 0);
    }


    //Not testing this
    //@Test
    public void testUpdateServiceRequest() throws Exception {
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

        writeToFile("updateServiceRequest.xml", formatXML(result));
    }


    /**
     * serviceRequestFileID - integer, unique ID for the service request file or link(0 for all signature files)
     * serviceRequestSignedDocumentID - integer, unique ID for the signed document (0 for all service request files and links)
     * isexternal - boolean, true for external links, false for files and signatures
     * issigneddocument - boolen, true for all signed document entries (false for service request files and links)
     * fileDescription - string, description tag for the file, link, or signature
     * fileLastModified - string date, last modification date and time
     * fileName - string, name of the file (may be URL for the link, name of a physical file, or blank)
     * fileSize - integer, size of the file (0 for links and signature documents)
     * fileType - string, type of file (image/jpeg, external, signature, etc.)
     * private - boolen, true if the file or link will not appear on any customer portal
     * postedOn - string date, when the file, link, or signature file was posted to BlueFolder
     * fileURL - string, value of the link to a file or link (blank for signature documents)
     * documentName - string, name of the document (may be blank)
     * signatureFilePath_Customer - string, complete URL to the customer's signature capture image
     * signatureFilePath_Technician - string, complete URL to the technician's signature capture image
     * signatureName_Customer - string, printed name for the customer
     * signatureName_Technician - string, printed name for the technician
     **/
    @Test
    public void testGetServiceRequestWithFilesXML() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getFiles.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<serviceRequestID>30141</serviceRequestID>" +
                "</request>"
        );

        writeToFile("testGetServiceRequestWithFiles.xml", formatXML(result));
    }

    @Test
    public void testGetServiceRequestWithFilesJSON() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/serviceRequests/getFiles.aspx";
        String result = getResponseString(url,
                "<request>"+
                        "<serviceRequestID>30141</serviceRequestID>" +
                "</request> "
        );

        writeToFile("testGetServiceRequestWithFiles.json", convertXmlToJson(result));
    }


}

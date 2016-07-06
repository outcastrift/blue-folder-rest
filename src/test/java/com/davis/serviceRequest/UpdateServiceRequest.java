package com.davis.serviceRequest;

import com.davis.BaseBlueFolderTest;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class UpdateServiceRequest extends BaseBlueFolderTest {

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

}

package com.davis;

import com.davis.bluefolder.BFUser;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class UserTests extends BaseBlueFolderTest {

    @Test
    public void testGetAllUsersBasic() throws Exception {
    String url = "https://app.bluefolder.com/api/1.0/users/list.aspx";
      String result = getResponseString(url,
              "<request>" +
                      "<userList>" +
                      "<listType>basic</listType>" +
                      "</userList>" +
                      "</request>"
              );

        writeToFile("allUsersBasic.xml",result);
    }
    @Test
    public void testGetAllUsersFull() throws Exception {
        String url = "https://app.bluefolder.com/api/1.0/users/list.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<userList>" +
                        "<listType>full</listType>" +
                        "</userList>" +
                        "</request>"
        );
        String jsonString = convertXmlToJson(result);
        writeToFile("allUsersFull.json",convertXmlToJson(result));


        JsonObject jsonObject = gson.fromJson(jsonString,JsonObject.class);
        JsonArray  jsonArray = jsonObject.getAsJsonObject("response").getAsJsonArray("user");


        BFUser[] userList = gson.fromJson(jsonArray,BFUser[].class);

        


        assertTrue(userList.length > 0);

    }




}

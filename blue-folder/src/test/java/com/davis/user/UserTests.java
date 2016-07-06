package com.davis.user;

import com.davis.BaseBlueFolderTest;
import com.davis.bluefolder.users.BFUser;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.Test;

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
    public void testDoesUserExistFull() throws Exception{
        String userID = "6fc5524d-87db-4ce1-a3e6-90918accc231";
        String url = "https://app.bluefolder.com/api/1.0/users/list.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<userList>" +
                        "<listType>full</listType>" +
                        "</userList>" +
                        "</request>"
        );
        String jsonString = convertXmlToJson(result);
        JsonObject jsonObject = gson.fromJson(jsonString,JsonObject.class);
        JsonArray  jsonArray = jsonObject.getAsJsonObject("response").getAsJsonArray("user");
        BFUser[] userList = gson.fromJson(jsonArray,BFUser[].class);
        boolean doesUserExist =false;
        for(BFUser bfUser : userList){
            if(bfUser.getUserName().equalsIgnoreCase(userID)){
                doesUserExist =true;
                writeToFile("testDoesUserExistFull.json",gson.toJson(bfUser));
            }
        }
        assertTrue(doesUserExist);
    }
    @Test
    public void testDoesUserExistBasic() throws Exception{
        String userID = "6fc5524d-87db-4ce1-a3e6-90918accc231";
        String url = "https://app.bluefolder.com/api/1.0/users/list.aspx";
        String result = getResponseString(url,
                "<request>" +
                        "<userList>" +
                        "<listType>basic</listType>" +
                        "</userList>" +
                        "</request>"
        );
        String jsonString = convertXmlToJson(result);
        JsonObject jsonObject = gson.fromJson(jsonString,JsonObject.class);
        JsonArray  jsonArray = jsonObject.getAsJsonObject("response").getAsJsonArray("user");
        BFUser[] userList = gson.fromJson(jsonArray,BFUser[].class);
        boolean doesUserExist =false;
        for(BFUser bfUser : userList){
            if(bfUser.getUserName().equalsIgnoreCase(userID)){
                doesUserExist =true;
                writeToFile("testDoesUserExistBasic.json",gson.toJson(bfUser));
            }
        }
        assertTrue(doesUserExist);
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
        String jsonString = convertXmlToJson(result);
        writeToFile("allUsersBasic.json",convertXmlToJson(result));
        JsonObject jsonObject = gson.fromJson(jsonString,JsonObject.class);
        JsonArray  jsonArray = jsonObject.getAsJsonObject("response").getAsJsonArray("user");
        BFUser[] userList = gson.fromJson(jsonArray,BFUser[].class);
        assertTrue(userList.length > 0);

    }


}

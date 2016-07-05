package com.davis;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class UserTests extends BaseBlueFolderTest {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

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

        writeToFile("allUsersFull.json",convertXmlToJson(result));
    }


}

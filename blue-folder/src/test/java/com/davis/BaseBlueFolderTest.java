package com.davis;

import com.davis.bluefolder.deserializers.*;

import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Before;

import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import java.util.Date;


/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class BaseBlueFolderTest {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;


    public static Gson gson ;
    @Before
    public void setup(){
       gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Date.class,new DateDeserializer())
                .create();
    }


    public String formatXML(String input)
    {
        try
        {
            org.dom4j.Document doc = DocumentHelper.parseText(input);
            StringWriter sw = new StringWriter();
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setIndent(true);
            format.setIndentSize(3);
            XMLWriter xw = new XMLWriter(sw, format);
            xw.write(doc);

            return sw.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return input;
        }
    }

    public void writeToFile(String filename, String content) throws IOException, TransformerException {

        File file = new File("target/"+filename);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.flush();
    }

    public String contructDatesForSearch() {
        DateTimeZone timeZone = DateTimeZone.forID("America/New_York"); // Specify or else the JVM's default will apply.
        DateTime dateTime = new DateTime(new java.util.Date(), timeZone); // Today's Date
        DateTime pastDate = dateTime.minusDays(14); // 2 weeks ago
        DateTimeFormatter fmt = DateTimeFormat.forPattern("MM-dd-yyyy hh:mma");
        String endDate = fmt.print(dateTime);
        String startDate = fmt.print(pastDate);
        //dateTimeClosed
        String date = " <dateRange dateField=\"dateTimeCreated\">" +
                "<startDate>" + startDate + "</startDate>" +
                "<endDate>" + endDate + "</endDate>" +
                "</dateRange>";

        return date;

    }


    public String getResponseString(String url, String body) throws UnirestException {
        HttpResponse<String> result = Unirest.post(url)
                .header("Authorization", "Basic NjI1MTUxYmItODA4Yi00NjVmLWE0YTctMTZjOThhNTQ3ZDY2Olg=")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .body(body).asString();

        String responseString = result.getBody();

        return responseString;
    }
    public static String convertXmlToJson(String xml) {
        String jsonPrettyPrintString= null;
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xml);
            jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
        } catch (JSONException je) {
        }

        return jsonPrettyPrintString;
    }






}

package com.davis.bluefolder;

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

import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/6/16.
 * Class Description
 */
public class BlueUtils {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static String convertXmlToJson(String xml) {
        String jsonPrettyPrintString= null;
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xml);
            jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
        } catch (JSONException je) {
        }

        return jsonPrettyPrintString;
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

    public static String contructDatesForSearch(String start, String end) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("MM-dd-yyyy hh:mma");
        DateTimeZone timeZone = DateTimeZone.forID("America/New_York"); // Specify or else the JVM's default will apply.
        DateTime dateTime = new DateTime(new java.util.Date(), timeZone); // Today's Date
        DateTime pastDate = dateTime.minusDays(14); // 2 weeks ago

        String endDate = null;
        String startDate = null;
        if(start != null && !start.trim().equalsIgnoreCase("")){
            if(end != null && !end.trim().equalsIgnoreCase("")){
                    startDate = fmt.parseDateTime(start).toString();
                    endDate=fmt.parseDateTime(end).toString();
            }else{
                endDate = fmt.print(dateTime);
                startDate = fmt.print(pastDate);
            }
        }else{
            endDate = fmt.print(dateTime);
            startDate = fmt.print(pastDate);
        }


        //dateTimeClosed
        String date = " <dateRange dateField=\"dateTimeCreated\">" +
                "<startDate>" + startDate + "</startDate>" +
                "<endDate>" + endDate + "</endDate>" +
                "</dateRange>";

        return date;

    }
}

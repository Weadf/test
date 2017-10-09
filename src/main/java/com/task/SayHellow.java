package com.task;

import javax.xml.crypto.Data;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class SayHellow {
    public Date dataNewZone = new Date();
    public String tZone;
    public String city;

    public SayHellow(String city) {
        this.city = city;
        tZone=getZone(city);
        TimeZone.setDefault(TimeZone.getTimeZone(this.tZone));
    }

    public SayHellow(String city, String tZone){
        this.city=city;
        this.tZone = tZone;
        TimeZone.setDefault(TimeZone.getTimeZone(this.tZone));
    }

    public String getZone(String city) {
        String[] arrayZone = TimeZone.getAvailableIDs();
        String result = "GMT";
        for (int i = 0; i < arrayZone.length; i++) {
            String s = arrayZone[i];
            if ((s.substring(s.indexOf('/') + 1).replaceAll("_", " ")).equalsIgnoreCase(city.toUpperCase())) {
                result = arrayZone[i];
            }
        }
        return result;
    }

    public void printHello() throws UnsupportedEncodingException {
        String greeting = "";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataNewZone);
        int temp = calendar.get(Calendar.HOUR_OF_DAY);

        ResourceBundle mybundle = ResourceBundle.getBundle("Locales_");
        if (temp >=19& temp<23) {
            greeting = mybundle.getString("evening");

        } else if (temp >=6& temp<9) {
            greeting = mybundle.getString("morning");

        } else if (temp >=9& temp<19) {
            greeting = mybundle.getString("afternoon");


        } else {
            greeting = mybundle.getString("night");

        }
        System.out.print(greeting + ", " + city + "!");
    }
}
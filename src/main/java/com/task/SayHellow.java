package com.task;

import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class SayHellow {
    public  SayHellow(){

    }


    public  String getZone(String city){
        String[] arrayZone = TimeZone.getAvailableIDs();
        String result="GMT";
        for (int i=0; i<arrayZone.length; i++){
            String s = arrayZone[i];
            if ((s.substring(s.indexOf('/')+1).replaceAll("_"," ")).toUpperCase().equals(city.toUpperCase())){
                result = arrayZone[i];
            }
        }
        return result;
    }

    public  void  printHello(String city, String tZone) {
        String greeting="";
        Date dataCurrent=new Date();
        System.out.println(dataCurrent);
        TimeZone.setDefault(TimeZone.getTimeZone(tZone));
        Date dataNewZone=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataNewZone);
        int temp = calendar.get(Calendar.HOUR_OF_DAY);

        ResourceBundle mybundle = ResourceBundle.getBundle("Locales_"  );
        if (temp < 6) {
            greeting = mybundle.getString("night");
            // greeting= new String(greeting.getBytes("ISO-8859-1"), "UTF-8");
        }
        else if (temp < 9) {
            greeting = mybundle.getString("morning");
            //  greeting= new String(greeting.getBytes("ISO-8859-1"), "UTF-8");
        }
        else if (temp < 19){
            greeting = mybundle.getString("afternoon");
            ///  greeting= new String(greeting.getBytes("ISO-8859-1"), "UTF-8");

        }
        else {
            greeting = mybundle.getString("evening");
            //  greeting= new String(greeting.getBytes("ISO-8859-1"), "UTF-8");
        }
        System.out.println(greeting +", " + city + "!");
    }
}
package com.task;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        if (args.length==0){
            System.out.println("Нет аргуметов");
        }
        else if (args.length==1){
            main.getHello(args[0],getZone(args[0]));
        }
        else if (args.length==2){
            main.getHello(args[0],args[1] );
        }
        String os = System.getProperty("os.name").toLowerCase();


    }


    public static String getZone(String city){
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

    public  void  getHello(String city, String tZone) throws UnsupportedEncodingException {
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

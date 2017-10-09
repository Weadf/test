import com.task.SayHellow;

import org.junit.After;


import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import java.util.Calendar;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class PrintStreamsSayHellowTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();
    protected  int[] nightArray = new int[]{5, 4, 3, 2,1,0,23};
    protected int[] morningArray = new int[]{6,7,8};
    protected int[] eveningArray = new int[]{19,20,21,22};
    protected int[] dayArray= new int[]{9,10,11,12,13,14,15,16,17,18};


    @Before
    public void setUpStreams() {
        System.out.println("Started");
        System.setOut(new PrintStream(output));

    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
        System.out.println("Finished");
    }

    @Test
    public void testPrinDayDefault()  {
        String city ="New York";
        Locale.setDefault(Locale.GERMAN);
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < dayArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, dayArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Good day, New York!", output.toString());}
    }

    @Test
    public void testPrinDayRu()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < dayArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, dayArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Добрый день, New York!", output.toString());
        }
    }


    @Test
    public void testPrinDayUA()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < dayArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, dayArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Добрый день, New York!", output.toString());}
    }

    @Test
    public void testPrinMorningDefault()  {
        String city ="New York";
        Locale.setDefault(Locale.ITALIAN);
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < morningArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, morningArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Good morning, New York!", output.toString());}
    }

    @Test
    public void testPrinMorningRu() {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < morningArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, morningArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Доброе утро, New York!", output.toString());
        }
    }


    @Test
    public void testPrinMorningUA()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < morningArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, morningArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Доброе утро, New York!", output.toString());
        }
    }

    @Test
    public void testPrinEveningDefault() {
        String city ="New York";
        Locale.setDefault(Locale.JAPANESE);
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < eveningArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, eveningArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Good evening, New York!", output.toString());
        }
    }

    @Test
    public void testPrinEveningRu()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < eveningArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, eveningArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Добрый вечер, New York!", output.toString());
        }
    }


    @Test
    public void testPrinEveningUA()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < eveningArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, eveningArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
            assertEquals("Добрый вечер, New York!", output.toString());
        }
    }

    @Test
    public void testPrinNightDefault() {
        String city ="New York";
        Locale.setDefault(new Locale("en"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < nightArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, nightArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Good night, New York!", output.toString());}
    }

    @Test
    public void testPrinNightRu()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < nightArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, nightArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
        assertEquals("Доброй ночи, New York!", output.toString());
    }
    }


    @Test
    public void testPrinNightUA()  {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        for (int i = 0; i < nightArray.length; i++) {
            output.reset();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, nightArray[i]);
            instance.dataNewZone = cal.getTime();
            instance.printHello();
            assertEquals("Доброй ночи, New York!", output.toString());
        }

    }

}

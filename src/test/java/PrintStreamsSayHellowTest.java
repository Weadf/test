import com.task.SayHellow;

import org.junit.After;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Locale;

public class PrintStreamsSayHellowTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

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
    public void testPrinDayDefault() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(Locale.GERMAN);
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,18);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Good day, New York!", output.toString());
    }

    @Test
    public void testPrinDayRu() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Добрый день, New York!", output.toString());
    }


    @Test
    public void testPrinDayUA() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Добрый день, New York!", output.toString());
    }

    @Test
    public void testPrinMorningDefault() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(Locale.ITALIAN);
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,8);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Good morning, New York!", output.toString());
    }

    @Test
    public void testPrinMorningRu() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 8);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Доброе утро, New York!", output.toString());
    }


    @Test
    public void testPrinMorningUA() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 8);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Доброе утро, New York!", output.toString());
    }

    @Test
    public void testPrinEveningDefault() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(Locale.JAPANESE);
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Good evening, New York!", output.toString());
    }

    @Test
    public void testPrinEveningRu() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 19);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Добрый вечер, New York!", output.toString());
    }


    @Test
    public void testPrinEveningUA() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 19);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Добрый вечер, New York!", output.toString());
    }

    @Test
    public void testPrinNightDefault() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(new Locale("en"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Good night, New York!", output.toString());
    }

    @Test
    public void testPrinNightRu() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "RU"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Доброй ночи, New York!", output.toString());
    }


    @Test
    public void testPrinNightUA() throws UnsupportedEncodingException {
        String city = "New York";
        Locale.setDefault(new Locale("ru", "UA"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Доброй ночи, New York!", output.toString());
    }

}

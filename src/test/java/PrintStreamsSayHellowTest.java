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
    public void testPrinDayEn() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(new Locale("en"));
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
    public void testPrinMorningEn() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(new Locale("en"));
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

}

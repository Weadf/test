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
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void testPrinHellow() throws UnsupportedEncodingException {
        String city ="New York";
        Locale.setDefault(new Locale("en"));
        SayHellow instance = new SayHellow(city);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,18);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        instance.dataNewZone = cal.getTime();
        instance.printHello();
        Assert.assertEquals("Good day, New York!", output.toString().trim());
    }
}

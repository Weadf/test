import com.task.SayHellow;

import org.junit.Assert;

import org.junit.Test;
import java.io.ByteArrayOutputStream;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Locale;

public class PrintStreamsSayHellowTest extends OutputTest{


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

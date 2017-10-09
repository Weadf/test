import com.task.SayHellow;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;





public class SayHellowTest  {


    @BeforeClass
    public static void allTestsStarted() {
        System.out.println("All tests started");
    }

    @AfterClass
    public static void allTestsFinished() {
        System.out.println("All tests finished");
    }

    @Before
    public void testStarted() {
        System.out.println("Started");
    }

    @After
    public void testFinished() {
        System.out.println("Finished");
    }

    /**
     * Test of getZone method, of class SayHellow.
     */
    @Test
    public void testGetZone() {
        System.out.println("getZone");
        String city = "Isle of Man";
        SayHellow instance = new SayHellow(city);
        String expResult = "Europe/Isle_of_Man";
        String result = instance.getZone(city);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of printHello method, of class SayHellow.
     */
    @Test
    public void testGetZonenoCity() {
        System.out.println("getZone");
        String city = "sdafsadfasf";
        SayHellow instance = new SayHellow(city);
        String expResult = "GMT";
        String result = instance.getZone(city);
        Assert.assertEquals(expResult, result);
    }



}
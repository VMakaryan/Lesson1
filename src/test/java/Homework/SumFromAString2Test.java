package Homework;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vmakaryan on 12/18/2014.
 */
public class SumFromAString2Test {

    SumFromAString2 sumalgoritm;

    @Test
    public void SumFromAStringTest()throws Exception{

        sumalgoritm = new SumFromAString2();

        Assert.assertEquals("Must be equals", 41.0, sumalgoritm.getSumFromString("1ww2ee30ee4.5tt3.5tt"), 0.0);
    }

    @Test
    public void SumFromAStringNegativeTest()throws Exception{

        sumalgoritm = new SumFromAString2();

        Assert.assertNotEquals("Must be not equals", 40.0, sumalgoritm.getSumFromString("1ww2ee30ee4.5tt3.5tt"), 0.0);
    }
}

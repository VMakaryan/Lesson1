package Homework;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vmakaryan on 12/17/2014.
 */
public class LeapYearTest {

    LeapYear algoritm;

    @Test
    public void TestLeapYear() throws Exception{

        algoritm = new LeapYear();

        Assert.assertTrue("True", algoritm.isLeapYear(2000));
    }

    @Test
    public void TestIsNotLeapYear() throws Exception{

        algoritm = new LeapYear();

        Assert.assertFalse("False", algoritm.isLeapYear(1997));
    }
}

package Homework;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vmakaryan on 12/25/2014.
 */
public class SubSequenceTest {

    Subsequence subAlgoritm;


    @Test
    public void TestSubsequence() throws Exception{

        subAlgoritm = new Subsequence();

        List list1 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8");
        List list2 = Arrays.asList("3","6");

        Assert.assertFalse("True", subAlgoritm.isSubSequence(list1, list2 ));

    }

}

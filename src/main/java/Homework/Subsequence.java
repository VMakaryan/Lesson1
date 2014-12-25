package Homework;

import tasks.SubSequenceAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vmakaryan on 12/18/2014.
 */
public class Subsequence implements SubSequenceAlgorithm {

    public static void main(String[] args) {


    }


    @Override
    public boolean isSubSequence(List list1, List list2) {

        if (!list1.containsAll(list2)) {
            System.out.println(isSubSequence(list1,list2));
            return false;
        }
            return false;
    }
}

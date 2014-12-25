package Homework;

import tasks.StringSumAlgorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vmakaryan on 12/11/2014.
 */

public class SumFromAString2 implements StringSumAlgorithm {


    public static void main(String[] args) {
        SumFromAString2 sum = new SumFromAString2();
        String inputStr = "!@#$%^&FGHJLKL:hnbh2.34fgfgjksdfgkls;fg3lhtre4gf";

        System.out.println(sum.getSumFromString(inputStr));
    }

    @Override
    public double getSumFromString(String s) {
        double result = 0;
        Pattern patternDouble = Pattern.compile("\\d+[.]\\d+");
        Matcher matcherDouble = patternDouble.matcher(s);

        while(matcherDouble.find()){
            result+= Double.parseDouble(matcherDouble.group());
            s = s.replaceAll(matcherDouble.group(),"");
        }
        System.out.println(result);
        Pattern patterInt = Pattern.compile("\\d+");
        Matcher matcherInt = patterInt.matcher(s);
        while(matcherInt.find()){
            result+= Double.parseDouble(matcherInt.group());
        }

        return result;
    }

}



            


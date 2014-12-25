package Homework;

import tasks.LeapYearAlgorithm;

import java.util.Scanner;

/**
 * Created by vmakaryan on 12/11/2014.
 */

public class LeapYear implements LeapYearAlgorithm{

    public static void main(String[] args) {

        Scanner console = new Scanner( System.in );
        System.out.print( "Enter the year: " );

        int year= console.nextInt();

        LeapYear leapYear = new LeapYear();
        leapYear.isLeapYear(year);


    }
    @Override
    public boolean isLeapYear(int year) {
        boolean isLeap;
        if ((year % 4 != 0)) isLeap = false;

        else isLeap = true;

        System.out.println("Year " + Integer.toString(year) + " is " + isLeap + " leap");
        return isLeap;
    }
}
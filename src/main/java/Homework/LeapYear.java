package Homework;

import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args) {
        Scanner console = new Scanner( System.in );

        System.out.print( "Enter the year: " );

        int year= console.nextInt();

        if(year % 4 != 0)
            System.out.println("No");
            else
            System.out.println("Yes");

    }

}
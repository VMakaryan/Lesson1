package Homework;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args) {
        Scanner console = new Scanner( System.in );
        //System.out.println("Year = "+console);
        System.out.print( "Enter the year: " );
        int year= console.nextInt();
        System.out.println(year%4);
        if(year % 4 != 0)

            System.out.println("No");
            else
            System.out.println("Yes");


        //System.out.println("Year=" +year);


    }













/*
    public static void main(String[] args) {
        boolean loop=true;
        Scanner console = new Scanner( System.in );
        while (loop){
            System.out.print( "Enter the year: " );

            int year= console.nextInt();
            System.out.println( "The year is a leap year: "+ leapYear(year) );
            System.out.print( "again?: " );
            int again = console.nextInt();
            if (again == 1){
                loop=false;
            }//if
        }
    }
    public static boolean leapYear ( int year){
        boolean leaped = false;
        if (year%4==0){
            leaped = true;
            if(year>1582){
                if (year%100==0&&year%400!=0){
                    leaped=false;
                }
            }
        }//1st if
        return leaped;
    }
*/

}
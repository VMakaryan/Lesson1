package Homework;

import java.util.Scanner;

/**
 * Created by vmakaryan on 12/11/2014.
 */

public class SimpleGame {

    public static void main(String[] args) {

        boolean win = false;

        int answer = (int) (Math.random() * 1000);

        Scanner console = new Scanner(System.in);

        while (win != true) {

            System.out.print("Enter the number: ");

            int number = console.nextInt();

            if (answer == number) {
                System.out.println("Right! The answer is "+number);
                win = true;

            } else if (answer < number) {
                System.out.println("Answer is less than "+ number);

            } else if (answer > number) {
                System.out.println("Answer is more than " + number);
            }
        }
    }
}





/*
while (!guess){

            int input = scanner.nextInt();
            if (input==num){
                System.out.println("Win!");
                guess=true;
            } else if (input<num){
                System.out.println("Your number is smaller. Try again :");
            } else if (input>num){
                System.out.println("Your number is greater. Try again :");
            }
*/
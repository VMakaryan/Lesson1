package Homework;

import java.util.Scanner;

/**
 * Created by vmakaryan on 12/11/2014.
 */

public class SumFromAString2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");

        String string = scanner.next();

        String digits [] = string.split("\\D+");

        int sum = 0;

        for (String str : digits) {
            if (str.isEmpty()) {
                continue;
            }
            sum += Integer.parseInt(str);
        }

        System.out.println(sum);
    }
}
            


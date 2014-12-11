package Homework;

import java.util.Scanner;

/**
 * Created by vmakaryan on 12/10/2014.
 */

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter first operand");
        int operand1 = scanner.nextInt();

        System.out.println("Enter operator");

        String operator = scanner.next();

        System.out.println("Enter second operand");
        int operand2 = scanner.nextInt();

        if (operator.equals("+"))
            System.out.println(operand1 + operand2);

        if (operator.equals("-"))
            System.out.println(operand1 - operand2);

        if (operator.equals("*"))
            System.out.println(operand1 * operand2);

        if (operator.equals("/"))
            System.out.println(operand1 / operand2);
    }
}

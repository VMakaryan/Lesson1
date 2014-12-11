package Homework;

import java.util.Scanner;

/**
 * Created by vmakaryan on 12/10/2014.
 */

public class VerticalPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pyramid height: ");

        int pyramidHeight = scanner.nextInt();

        for (int i = 1; i <= pyramidHeight; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = pyramidHeight-1 ; i >0; i--) {
            for (int k = i; k >0 ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
   }
}






package java_programmes;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator
 */

public class Prog1_OddEven {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Use the ternary operator to check if the number is odd or even

            String result = (number % 2 == 0) ? "even" : "odd";

            System.out.println("The entered number is " + result  + ".");

            scanner.close(); // Close the scanner to prevent resource leak
        }
}


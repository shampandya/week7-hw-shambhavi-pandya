package java_programmes;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
 */

public class Prog2_LeapYear {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            boolean l = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (l) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            scanner.close(); // Close the scanner to prevent resource leak
        }
}


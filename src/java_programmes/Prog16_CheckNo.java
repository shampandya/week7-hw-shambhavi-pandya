package java_programmes;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

public class Prog16_CheckNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scan.nextInt();

        String result = number(a);

        System.out.println("The entered number is " + result);

        scan.close();
    }

    public static String number(int num) {
        if (num > 0) {
            return "POSITIVE";
        } else if (num < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
}

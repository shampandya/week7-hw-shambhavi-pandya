package java_programmes;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Prog12_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number, alphabet or symbol : ");
        char c = scan.next().charAt(0);

        if (alphabet(c)) {
            System.out.println("The input is an alphabet.");
        } else if (digit(c)) {
            System.out.println("The input is a number.");
        } else {
            System.out.println("The input is a symbol.");
        }

        scan.close();
    }

    public static boolean alphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean digit(char c) {
        return c >= '0' && c <= '9';

    }

}

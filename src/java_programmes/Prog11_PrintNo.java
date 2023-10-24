package java_programmes;

import java.util.Scanner;

/**
* Write a java program to print the numbers bet'n 1 to 100, which can be divided by 3  and 5 separately.
*/
public class Prog11_PrintNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numbers divisible by 3: ");
        printNumbersDivisibleBy3();

        System.out.println("Numbers divisible by 5:");
        printNumbersDivisibleBy5();

        scan.close();
    }

    public static void printNumbersDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printNumbersDivisibleBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

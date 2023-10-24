package java_programmes;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol
 * (+, -,  /, *) find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

public class Prog10_Symbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);

        scan.close();
    }
}
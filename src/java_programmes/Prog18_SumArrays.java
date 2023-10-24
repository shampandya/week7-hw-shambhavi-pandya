package java_programmes;

import java.util.Arrays;

/**
 *  Write a Java program to sum values of an array.
 */
public class Prog18_SumArrays {
    public static void main(String[] args) {
        // define array of number
        int[] numbers = {1, 2, 3, 4, 5};
        // sum array using streams
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of the array elements: " + sum);
    }
}

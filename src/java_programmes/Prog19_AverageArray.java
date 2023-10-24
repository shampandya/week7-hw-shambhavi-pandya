package java_programmes;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Prog19_AverageArray {

    public static void main(String[] args) {
        //define array of numbers
        double[] num = {1.5, 2.5, 3.5, 4.5, 5.5};
        // find the average using java streams
        double average = Arrays.stream(num).average().orElse(0.0);
        System.out.println("Average of the array elements: " + average);
    }
}

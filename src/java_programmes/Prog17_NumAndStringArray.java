package java_programmes;
/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Prog17_NumAndStringArray {
    public static void main(String[] args) {
        int[] n = {5, 2, 9, 1, 5, 6};
        Arrays.sort(n);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(n));

        // Sorting a string array
        String[] s = {"apple", "banana", "cherry", "date", "grape"};
        Arrays.sort(s);
        System.out.println("Sorted String Array: " + Arrays.toString(s));
    }

}

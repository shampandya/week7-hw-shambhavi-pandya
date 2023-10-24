package java_programmes;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Prog20_Array {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        int tv = 3;   // value to check for

        boolean containsValue = containsValue(numbers, tv);

        if (containsValue) {
            System.out.println("The array contains the value " + tv);
        } else {
            System.out.println("The array does not contain the value " + tv);
        }
    }

    public static boolean containsValue(int[] a, int target) {
        for (int number : a) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
}

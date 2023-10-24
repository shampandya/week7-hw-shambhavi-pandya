package java_programmes;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if  any other alphabet should be invalid entry
 */

public class Prog8_City {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter any alphabet from A to F: ");
        char alpha = scan.next().charAt(0);

        String city;
        if (alpha == 'A') {
            city = "Amsterdam";
        } else if (alpha == 'B') {
            city = "Barcelona";
        } else if (alpha == 'C') {
            city = "Chicago";
        } else if (alpha == 'D') {
            city = "Dallas";
        } else if (alpha == 'E') {
            city = "Edinburgh";
        } else if (alpha == 'F') {
            city = "Frankfurt";
        } else {
            city = "Invalid Entry";
        }

        System.out.println("City Name: " + city);

        scan.close();
    }
}

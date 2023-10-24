package java_programmes;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly.
 * if  any other alphabet should be invalid entry
 * 9. use switch statement.
 */

import java.util.Scanner;

public class Prog9_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F: ");
        char alpha = scan.next().charAt(0);
        String city;

        switch (alpha){
            case 'A':
                city = "Amsterdam";
                break;
            case  'B':
                city = "Barcelona";
                break;
            case 'C':
                city = "Copenhagen";
                break;
            case 'D':
                city = "Dublin";
                break;
            case 'E':
                city = "Edinburgh";
                break;
            case 'F':
                city = "Frankfurt";
                break;
            default:
                city = "Invalid Entry";
                break;
        }

        System.out.println("City Name: " + city);

        scan.close();
        }
}

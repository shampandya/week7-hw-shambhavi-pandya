package java_programmes;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
 */

public class Prog4_DaysInMonth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to know whether is leap year  or not(from 0 to 9999):  ");
        int year = scan.nextInt();
        isLeapYear(year);
        System.out.println("Enter a month");
        int month = scan.nextInt();
        getDaysInMonth(month,year);

        scan.close();
    }
    public static boolean isLeapYear(int year){
        if (year<= 0 || year >=9999){
            System.out.println("Invalid Input"); // not needed
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year <1 || year>9999){
            return -1;
        }
        int days;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1;
        }
        System.out.println("days in the choosen months are  " +days);
        return days;


    }
}

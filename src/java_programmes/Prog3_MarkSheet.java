package java_programmes;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks (marks is between,
 * 0 to 100, and if it is out of range print error message “Invalid  Input, Marks should between 0, to 100”) and find out total,
 * percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C
 */

public class Prog3_MarkSheet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name = scan.nextLine();
        System.out.println("Enter student Roll No. : ");
        int roll = scan.nextInt();
        System.out.println("Enter maths marks (0 to 100 marks are valid only): ");
        double math = scan.nextDouble();
        System.out.println("Enter Science Marks (0 to 100 marks are valid only): ");
        double sci = scan.nextDouble();
        System.out.println("Enter English marks (0 to 100 marks are valid only): ");
        double eng = scan.nextDouble();
        scan.close();


        // Check if marks are within the valid range
        if (math < 0 || math > 100 || sci < 0 || sci > 100 || eng < 0 || eng > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return; // Exit the program
        }

        double totalMarks = math + sci + eng;
        double percentage = (totalMarks / 300.0) * 100;

        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }
        System.out.println("|__________________________________________________|");
        System.out.println("|                                                  |");
        System.out.println("|    Mark sheet                                    |");
        System.out.println("|__________________________________________________|");
        System.out.println("|  Student Name: " + name+ "                       |");
        System.out.println("|  Roll Number: " + roll+"                         |");
        System.out.println("|__________________________________________________|");
        System.out.println("|  Subject :  Marks                                |");
        System.out.println("|__________________________________________________|");
        System.out.println("|  Math    :"   +math+"                            |");
        System.out.println("|  Science :"   +sci+"                             |");
        System.out.println("|  English :"   +eng+"                             |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Total Marks: " + totalMarks+"                    |");
        System.out.println("|__________________________________________________|");
        System.out.println("Percentage: " + percentage + "%                    |");
        System.out.println("Result: " + result+"                               |");
        System.out.println("Grade: " + grade+"                                 |");
        System.out.println("|__________________________________________________|");
    }
}

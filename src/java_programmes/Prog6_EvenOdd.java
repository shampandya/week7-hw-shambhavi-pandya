package java_programmes;

import java.util.Scanner;

public class Prog6_EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check odd or even: ");
        int no = scan.nextInt();
        Prog6_EvenOdd obj = new Prog6_EvenOdd();
        obj.check(no);
        scan.close();
    }

    public int check(int no) {

        if (no % 2 == 0) {
            System.out.println("Number is even number");

        } else {
            System.out.println("number is odd number");
        }

        return no;
    }

}


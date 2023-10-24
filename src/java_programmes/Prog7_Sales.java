package java_programmes;
/**
 *  Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
  */

import java.util.Scanner;

public class Prog7_Sales {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Seller's name: ");
        String name = scan.nextLine();
        System.out.println("Enter Sales Amount: ");
        double sales = scan.nextDouble();
        System.out.println("Enter Salary Basic: ");
        int base = scan.nextInt();

        if (sales >=50000){
            double a = 0.35 * sales;
            System.out.println("The sales amount will be discounted by 35%: " +a);
            double b = sales-a;
            System.out.println("The Sales amount to be paid on 50000 or above is : " +b);
        }else if(sales>=30000){
            double c = 0.20 * sales;
            System.out.println("The sales amount will be discounted by 20%: " +c);
            double d = sales-c;
            System.out.println("The Sales amount to be paid on 30000 or above is : " +d);
        }else if (sales>=20000){
            double a = 0.10 * sales;
            System.out.println("The sales amount will be discounted by 10%: " +a);
            double b = sales-a;
            System.out.println("The Sales amount to be paid on 20000 or above is : " +b);
        }else if (sales>=10000){
            double a = 0.05 * sales;
            System.out.println("The sales amount will be discounted by 5%: " +a);
            double b = sales-a;
            System.out.println("The Sales amount to be paid on 10000 or above is : " +b);
        }else{
            double a = 0.02 * sales;
            System.out.println("The sales amount will be discounted by 2%: " +a);
            double b = sales-a;
            System.out.println("The Sales amount to be paid under 10000  is : " +b);
        }
        scan.close();


    }
}

package java_programmes;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class Prog5_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee Id is : ");
        int id = scan.nextInt();
        System.out.println("Enter Employee name: ");
        String name = scan.next();
        System.out.println("Enter Employee Salary: ");
        double salary = scan.nextDouble();

        double hra =  salary * 0.10;
        double da = salary * 0.08;
        double ta = salary * 0.09;
        double pf = salary * 0.20;

        // calculate gross salary
        double gross = salary + hra + da + ta - pf;

        System.out.println(" |__________________________________________________|");
        System.out.println(" | Salary Slip                                      |");
        System.out.println(" |__________________________________________________|");
        System.out.println(" |Employee id :" +id+                              "|");
        System.out.println(" |Employee Name" +name+                            "|");
        System.out.println(" |__________________________________________________|");
        System.out.println(" |Basic Salary:" +salary+                          "|");
        System.out.println(" |HRA: " +hra+                                     "|");
        System.out.println(" |DA 9%:" +da+                                     "|");
        System.out.println(" |TA 8%:" +ta+                                     "|");
        System.out.println(" |PF -20% :" +pf+                                  "|");
        System.out.println(" |__________________________________________________|");
        System.out.println(" |Gross Salary : "+gross+                          "|");
        System.out.println(" |__________________________________________________|");

        scan.close();
    }
}

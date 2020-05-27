package chapter5;

import java.util.Scanner;

/*
to calculate cell phone bill and calculate the over minutes payment + tax and total bill
 */
public class CellPhoneBill {

    static  Scanner scanner =new Scanner(System.in);

    static double minuterate = 0.25;
    static double tax = 0.15;

    public static void main(String Ars[]){

        double planfee = getPlanFee();
        double overagemins = getOveragemins();
        double overagecost = calculateOveragemins(overagemins);
        double overagetax = calculateOveragetax(overagecost);
        double subtotal = calculateSubtotal(overagecost,overagetax);
        double totalbill=calculateTotalBill(planfee,subtotal);

        System.out.println("Your overage minutes subtotal  is : " + subtotal);
        System.out.println("Your total bill is : " + totalbill);
        scanner.close();
    }

    public static double getPlanFee(){
        System.out.println("Enter your plan fee: ");
        double planfee= scanner.nextDouble();
        return planfee;
    }

    public static double getOveragemins(){
        System.out.println("Enter your overage minutes: ");
        double overagemins= scanner.nextDouble();
        return overagemins;
    }

    public static double calculateOveragemins(double overmins){

        double overcost= overmins * minuterate;
        return overcost;
    }

    public static double calculateOveragetax(double overagecost){

        double overagetax= overagecost * tax;
        return overagetax;
    }

    public static double calculateSubtotal(double overagecost,double overagetax){

        double subtotal= overagecost + overagetax;
        return subtotal;
    }

    public static double calculateTotalBill(double planfee,double subtotal){

        double totalbill= planfee +  subtotal;
        return totalbill;
    }
}

package chapter5;

/*
doing credit check using mutiple methods
 */

import java.util.Scanner;

public class instantCreditCheck {

    static Scanner scanner = new Scanner(System.in);
    static int requiredsalary=25000;
    static int requiredcreditscore=750;

    public static void main(String Args[]){

        int  creditscore=getCreditScore();
        int  salary= getSalary();
        isEligibleForLoan(creditscore,salary);

        scanner.close();
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditvalue=scanner.nextInt();
        return  creditvalue;
    }

    public static int getSalary(){
        System.out.println("Enter your Salary: ");
        int salary=scanner.nextInt();
        return  salary;
    }

    public static Boolean isEligibleForLoan(int creditscore ,int salary){
        if(creditscore >= requiredcreditscore && salary >= requiredsalary){
            System.out.println("Congrats!You are eligible for loan: ");
            return true;
        }
        else{
            System.out.println("Sorry !You are not eligible  for loan: ");
            return false;
        }


    }
}

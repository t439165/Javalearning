package chapter2;

import java.awt.*;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

        // 1.Get the hours worked.
        System.out.println("Enter the hours worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2.Get the pay per hour
        System.out.println("Enter the pay rate:");
        Double rate = scanner.nextDouble();


        //3.Multiply the hours worked with pay
        Double grossPay= hours * rate;

        //4.Display result.
        System.out.println("The grossPay of Employee is $:" + grossPay);

//excercise

        //1.Ask for a season
        System.out.println("Enter the season:");
        String season = scanner.next();


        //2.Ask for a whole number
        System.out.println("Enter the whole number:");
        int wholenumber = scanner.nextInt();


        //3.Ask for an adjective
        System.out.println("Enter the adjective:");
        String adjective = scanner.next();
        scanner.close();

        //Display
        System.out.println("On a " + adjective + " " +  season + "  day,I drink a minimum of " +  wholenumber + " cups of coffee");

    }
}

package chapter3;

import java.util.Scanner;
import java.awt.*;

/* Hourly rate of employee is $15 and max hours allowed is 40 hours.
No overtime allowed
*/

public class GrossPayInputValidation {

        public static void main(String arg[]){

            //declare known values
            int rate = 15;
            int maxhours =40;
            int grosspay= 0;


            // 1.Get the hours worked.
            System.out.println("Enter the hours worked:");
            Scanner scanner = new Scanner(System.in);
            int hours = scanner.nextInt();

            //while loop to check the hours and then calculate gross pay

            while( hours > maxhours){
                System.out.println("No overtime allowed");
                hours = scanner.nextInt();

            }

            scanner.close();


            //4.Display result .
            grosspay = hours * rate;
            System.out.println("The grossPay of Employee is $:" + grosspay);




        }
    }



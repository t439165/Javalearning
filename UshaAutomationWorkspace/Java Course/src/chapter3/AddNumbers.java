package chapter3;

/* adding twoo numbers and
stop until dones is mentioned
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String Args[]){
        Scanner scanner = new Scanner(System.in);

        //declare variables

        double num1= 0;
        double num2 =0;
        double sum = 0;
        Boolean done = false;


        do {

            System.out.println("Enter number 1: ");
            num1 = scanner.nextDouble();
            System.out.println("Enter number 2: ");
            num2 = scanner.nextDouble();
            sum =num1 + num2;
            System.out.println("Sum is :" + sum);
            System.out.println("Do you need again??");

            done = scanner.nextBoolean();
        }while(done);
scanner.close();

    }

}

package chapter3;

/* Should have salary of $30000 and
should be in job current for atleast 2 years
used nested if
 */


import java.util.Scanner;

public class LogicalOperators {

    public static void main(String Args[]) {

        //declare known values
        int salaryneed = 30000;
        int yearofservice = 2;

        //get  2 unknown values

        //get salary

        System.out.println("What is your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        //get years of service in current job
        System.out.println("What is your service in current job");
        double service = scanner.nextDouble();

        scanner.close();

        //decision
        if (salary >= salaryneed && service >= yearofservice){
                System.out.println("Congrats !You qualified");
            }
        else {
            System.out.println("Sorry!You didnt qualify ");
        }

    }
}
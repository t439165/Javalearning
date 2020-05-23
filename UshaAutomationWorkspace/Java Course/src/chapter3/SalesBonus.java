package chapter3;

/* If a Salesperson wjose weekly salary is $1000 and
if he makes more than  10sales bonus is $250"
 */

import java.util.Scanner;

public class SalesBonus {

    public  static void main(String[] args) {
        //declare known values
        int salary = 1000;
        int bonus= 250;
        int salestarget = 10;

        //find unknown

        System.out.println("How manay sales did you make");
        Scanner scanner= new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //check for bonus condition

        if(sales>salestarget){
            salary =salary + bonus;
        }
        //display output

        System.out.println("Sales person salary is  " + salary);


    }

}

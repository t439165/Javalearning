package chapter3;
/* Scan the given number of items and tally the cost
*/

import java.util.Scanner;

public class Cashier {

    public static void main(String Args[]){
        Scanner scanner =new Scanner(System.in);

        ;
        double cost;



        System.out.println("Enter the total items ");
        int totalitems =scanner.nextInt();

        for ( int countitems=0;countitems < totalitems;countitems ++){

            System.out.println("Enter the cost of the item");
            cost =scanner.nextDouble();
            System.out.println("cost is  " + cost);
                    }

        scanner.close();
    }
}

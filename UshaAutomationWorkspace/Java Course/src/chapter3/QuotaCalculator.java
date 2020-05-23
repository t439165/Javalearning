package chapter3;

import java.util.Scanner;

/* SalesQuota is atleast 10.per week
who completed 10 gets congratulations message
 who  is shortage it shows ho many lagging using If Else*/
public class QuotaCalculator {

    public static  void main(String Args[]){

        //declare known

        int quota =10;

        //find unknown

        System.out.println("How many sales did you make? ");
        Scanner scanner=new Scanner(System.in);
        int sales=scanner.nextInt();
        scanner.close();


        //decision making

        if(sales >= quota) {
            System.out.println("congratulations");
        }
            else{
                int pendingsales=quota - sales;
                System.out.println("Your pending sales is " + pendingsales);
            }




    }
}

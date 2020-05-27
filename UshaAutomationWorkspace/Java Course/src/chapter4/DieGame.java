package chapter4;

import java.util.Scanner;

/*

USer should complete the 20 spaces in teh board witing 5 die rolls

 */
public class DieGame {

    public static void main(String Args[]){

        int requiredspaces = 20;
        int maxrolls = 5;
        int totalspace =0;
        int j=0;
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i< maxrolls;i++){
            System.out.println("Enter the number you got in your die roll:");
            int newno= scanner.nextInt();
            totalspace=totalspace + newno;
            int remspaces = requiredspaces -totalspace;


          //  System.out.println("you are in teh space " + totalspace + " Need" + remspaces + "to win");
            if(i  < maxrolls && totalspace == requiredspaces )
            {
                System.out.println("you are in teh space" +
                        " " + totalspace + "you win" + i);
                break;
            }
            if(i == (maxrolls-1) && totalspace != requiredspaces){
                System.out.println("you lose");
                break;
            }
            else if (i < maxrolls && totalspace != requiredspaces){
                System.out.println("you are in teh space " + totalspace + " Need" + remspaces + "to win" + "i is " + i);
               //i=i + 1;
            }



        }
        scanner.close();
    }

}

package chapter3;

/*If statement 1 true   path A,else if 2 true  path B,else if 3 true path C
using if else if
 */

import java.util.Scanner;

public class TestScore {

    public static void main (String Args[]){

        //declare paths

        int pathA = 90 ;
        int pathB =80;
        int pathC = 70;

        //get Test score

        System.out.println("What is your score ");
        Scanner scanner=new Scanner(System.in);
        Double score=scanner.nextDouble();
        scanner.close();

        //decision

        if(score >= pathA){
            System.out.println("Excellent you are A+");
        }
        else if (score >= pathB){
            System.out.println("V.Good you are B+");
        }
        else if (score >= pathC){
            System.out.println("Good you are C+");
        }
        else {
            System.out.println("Sorry you are D failed");
        }

    }
}

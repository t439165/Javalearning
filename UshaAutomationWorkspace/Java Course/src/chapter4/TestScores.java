package chapter4;

import java.util.Scanner;

/*
nested loop
For students of 24 find teh average test score for the 4 tests
 */
public class TestScores {

    public static void  main(String Args[]){
        Scanner scanner = new Scanner(System.in);


        int totalstudents =3;
        int totaltests= 4;


        for(int i = 0;i<totalstudents;i++){
            double total =0;
            double averagescore=0;
            for(int j =0;j < totaltests;j++){
                System.out.println( "Studen No" + (i +1 ) + " " +  "Enter your test score for the test No " + (j +1));
                double score = scanner.nextDouble();
                total = score + total;
                averagescore = total / totaltests;
            }
            System.out.println("Average test score for the student" +( i + 1) + " " +  averagescore );
        }
        scanner.close();
    }
}

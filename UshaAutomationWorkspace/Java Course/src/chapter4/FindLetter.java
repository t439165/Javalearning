package chapter4;

import java.util.Scanner;

/*
Finding a letter in the word enetred.
 */
public class FindLetter {

    public static void main(String Args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word:");
        String word = scanner.next();
        /*System.out.println("enter a letter to be found:");
        String lettertobefound = scanner.next();
        char letter1 = lettertobefound.;*/
        boolean letterfound=false;
        scanner.close();
        int length = word.length();
         for(int i=0;i <= length && !letterfound;i++) {
             char letter = word.charAt(i);

             if(letter == 'A' || letter == 'a') {
                 System.out.println("found letter " +  letter + "  in  your  word: " + word);
                 letterfound = true;

             }
         }

             }
         }




package chapter5;
/*
Greeting -greeting ur name.calling another method in main
 */
import java.util.Scanner;

public class Greetings {

    public  static void main(String Args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scanner.next();
        greetUser(name);
        scanner.close();

        }
        public static void greetUser(String name){
        System.out.println("Hello Welcome to java " + name);
        }
}

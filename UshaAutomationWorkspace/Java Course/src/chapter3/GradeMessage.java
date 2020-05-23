package chapter3;
/* switch to use different cases
switch validates not true or false but equal
 */
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class GradeMessage {

    public static void main(String Args[]){
        String grade;

        System.out.println("enter your grade:A/B/C/F");
        Scanner scanner=new Scanner(System.in);
        grade = scanner.next();
        scanner.close();
        String message;

        switch (grade) {
            case "A":
                message="A: Excellent ";
                break;
            case "B":
                message="B: V.Good ";
                break;
            case "C":
                message="C: Good ";
                break;
            case "F":
                message="F: Fail ";
                break;
            default:
                message ="Wrong grade";
        }
        System.out.println(message);

    }
}

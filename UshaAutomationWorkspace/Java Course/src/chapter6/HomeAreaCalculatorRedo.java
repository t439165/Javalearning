package chapter6;

/*
Objects of class can be used as parameters or return types
when object is used as return data type it can return multiple data unlike simpel methods.

 */
import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner =new Scanner(System.in);
    public static void main(String args[]){

        //class instantiated as need to use its non static methods
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        System.out.println("Kitchen:");
        Rectangle kitchen = calculator.getRoom();
        System.out.println("Foyer:");
        Rectangle foyer     = calculator.getRoom();
        double area1= calculator.CalculateArea(kitchen,foyer);

        System.out.println("Area is " + area1);

        calculator.scanner.close();
    }
//method not static and not set
    public Rectangle getRoom(){

        System.out.println("Enter Length");
        double length =scanner.nextDouble();
        System.out.println("Enter width");
        double width =scanner.nextDouble();

        return new Rectangle(length,width);


    }

    public double  CalculateArea(Rectangle rectangle1,Rectangle rectangle2){

        return rectangle1.calculateArea() + rectangle2.calculateArea();

    }
}

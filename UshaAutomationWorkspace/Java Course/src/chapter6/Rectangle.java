package chapter6;

import java.util.Scanner;

public class Rectangle {
    Scanner scanner=new Scanner(System.in);
    double length;
    double width;


    //constructors

    public Rectangle(){
        length=0;
        width=0;
    }


    public Rectangle(double length,double width) {
        this.length = length;
        this.setWidth(width);
    }

    //get & set length

    public double getLength(){
        System.out.println("Enter length of rectangle: ");
        double length=scanner.nextDouble();
        return length;
           }
    public double setLength(double length){
        this.length=length;
        return length;
    }

    //get & set width
    public double getWidth(){
        System.out.println("Enter length of rectangle: ");
        double width=scanner.nextDouble();
        return width;
    }
    public double setWidth(double width){
        this.width=width;
        return width;
    }

    //perimeter
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    //area
    public double calculateArea(){
        return length * width;
    }
}

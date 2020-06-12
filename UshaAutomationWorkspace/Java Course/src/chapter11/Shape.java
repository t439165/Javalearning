package chapter11;

/*
abstract class can have bothe abstract and non abstract method
 */
public abstract class Shape {

    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}

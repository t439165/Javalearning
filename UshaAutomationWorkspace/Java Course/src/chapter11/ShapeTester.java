package chapter11;

public class ShapeTester {
    public static void main(String[] args){


        //declare object of abstract class and instaniate the subclass
        Shape rectangle = new Rectangle(5, 7);

        //it will call teh subclass rectangels print function
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}

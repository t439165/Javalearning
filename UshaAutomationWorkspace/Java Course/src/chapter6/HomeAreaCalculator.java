package chapter6;


/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String Args[]){

        Rectangle room1 = new Rectangle();
        Rectangle room2 = new Rectangle();


        //Calculate rectangle 1 Area
        room1.setWidth(20);
        room1.setLength(30);
        double area1= room1.calculateArea();


        //Calculate rectangle 2 Area
        room2.setWidth(30);
        room2.setLength(40);
        double area2 = room2.calculateArea();

        //total area

        System.out.println("Total area is " + (area1 + area2));



        //Calculate rectangle 2 Area
    }





}

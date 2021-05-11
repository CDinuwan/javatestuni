package chapter6;

public class HomeAreaController {
    public static void main(String args[]){

        //Create Instance of the rectangle
        Rectangle room1=new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1=room1.calculateArea();

        Rectangle room2=new Rectangle(20,50);
        double perimeterOfRoom2=room2.calculatePerimeter();

        System.out.println(areaOfRoom1);
        System.out.println(perimeterOfRoom2);
    }
}

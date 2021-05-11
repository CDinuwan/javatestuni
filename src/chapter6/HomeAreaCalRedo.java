package chapter6;

import java.util.Scanner;

public class HomeAreaCalRedo {
    Scanner scanner=new Scanner(System.in);
    public static void main(){

//        HomeAreaCalRedo calculator=new HomeAreaCalRedo();
//        Rectangle kitchen=calculator.getRoom();
//        Rectangle bathroom=calculator.getRoom();
//
//        double area=calculator.calculateTotalArea(kitchen,bathroom);
//        calculator.scanner.close();
    }
    public Rectangle getRoom(){

        System.out.println("Enter the length of the room: ");
        double length=scanner.nextDouble();

        System.out.println("Enter the width of the room: ");
        double width=scanner.nextDouble();
        scanner.close();

        return new Rectangle(length, width);

    }
    public double calculateTotalArea(Rectangle rectangle1,Rectangle rectangle2){
        return rectangle1.calculateArea()+rectangle2.calculateArea();
    }
}

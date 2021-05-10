package chapter2;

import java.util.Scanner;

public class MadLib {
    public static void main(String arg[]){
        //1.Get input from user
        System.out.println("Enter season of the year :");
        Scanner scanner = new Scanner(System.in);
        String season=scanner.next();

        System.out.println("Enter adjective: ");
        String adjective=scanner.next();

        System.out.println("Enter amount cup of coffees: ");
        int cupOfCoffee=scanner.nextInt();

        System.out.println("on a "+adjective+" "+season+" day,I drink a minimum of "+cupOfCoffee+" cups of coffee.");
    }
}

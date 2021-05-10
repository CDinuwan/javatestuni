package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String args[]){
        System.out.println("Enter your name: ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();

        System.out.println(greetUser(name));
    }
    public static String greetUser(String name){
        return "Hello there, "+name;
    }
}


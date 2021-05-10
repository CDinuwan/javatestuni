package chapter4;

import java.util.Scanner;

/*
For loop:
write a cashier program that will scan a given number of items and tally the cost
 */
public class Cashier {
    public static void main(String args[]){
        //Get number of items to scan
        System.out.println("Enter the number of items would you like to scan :");
        Scanner scanner=new Scanner(System.in);
        int quantity=scanner.nextInt();

        double total=0;

        //Create loop to iterate through

        for(int i=0;i<quantity;i++){

            System.out.print("Enter price of the quantity: $");
            double price=scanner.nextDouble();

            total=price+total;
        }
        scanner.close();
        System.out.println("Your total is $"+total);
    }
}

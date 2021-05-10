package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]){

        double pennies=0.15;
        double nickels=0.25;
        double dimes=0.75;
        double quarters=0.10;

        System.out.println("How many pennies would you like: ");
        Scanner scanner=new Scanner(System.in);
        double penniesCount=scanner.nextDouble();

        System.out.println("How many nickels would you like: ");
        double nickelsCount=scanner.nextDouble();

        System.out.println("How many dimes would you like: ");
        double dimesCount=scanner.nextDouble();

        System.out.println("How many quarters would you like: ");
        double quartersCount=scanner.nextDouble();

        double result=(quartersCount*quarters)+(penniesCount*pennies)+(nickelsCount*nickels)+(dimesCount*dimes);

        if(result==1){
            System.out.println("Congratulations! You are win");
        }else if(result>1){
            double min=result-1.0;
            System.out.println("Sorry! You are loss");
            System.out.println("You are "+min+" went over.");
        }else{
            double max=1.0-result;
            System.out.println("Sorry! You are loss");
            System.out.println("You are "+max+" went under.");
        }
    }
}

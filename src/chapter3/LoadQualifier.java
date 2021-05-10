package chapter3;

import java.util.Scanner;

/*
Nested IFS:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoadQualifier {
    public static void main(String args[]){
        //initialize known information
        int requiredSalary=30000;
        int requireYearsEmployed=2;

        //Get what we don't
        System.out.println("Enter your salary: ");
        Scanner scanner=new Scanner(System.in);
        double salary=scanner.nextDouble();

        System.out.println("Enter the numbers of year with your current employer: ");
        double years=scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary>=requiredSalary){
            if(years>=requireYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }else{
                System.out.println("Sorry! You must have worked at your current job "+requireYearsEmployed+" years.");
            }
        }else{
            System.out.println("Sorry! you must earn at least $"+requiredSalary+" to qualify the loan.");
        }

    }
}

package chapter4;

import java.util.Scanner;

/*
Nested for loop:
Find the average of each student's test score
 */
public class AverageTestScoresCalculator {
    public static void main(String args[]){
        int numberOfTest=4;
        int numberOfStudent=5;

        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<numberOfStudent;i++){
            double total=0;
            for(int j=0;j<numberOfTest;j++){
                System.out.println("Enter score of "+(j+1));
                double score=scanner.nextDouble();
                total=total+score;
            }
            double average=total/numberOfTest;
            System.out.println("The test score of "+(i+1)+" student is :"+average);
        }
    }
}

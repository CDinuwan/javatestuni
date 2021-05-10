package chapter4;

/*
Loop break:
check the letter what we given included in given word
 */

import java.util.Scanner;

public class LetterSearcher {
    public static void main(String args[]){
        System.out.println("Enter word you want to check :");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        scanner.close();

        boolean letterFound=false;

        for(int i=0;i<word.length();i++){
            char currentLetter=word.charAt(i);
            if(currentLetter=='A' || currentLetter=='a'){
                letterFound=true;
                break;
            }
        }

        if(letterFound){
            System.out.println("A letter in in this word");
        }else{
            System.out.println("A letter didn't found in this word");
        }
    }
}

package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH=6;
    private static final int MAX_TICKET_NUMBER=69;

    public static void main(String[] args){
        int[] ticket=generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] ticket=new int[LENGTH];

        Random random=new Random();

        for(int i=0;i<LENGTH;i++){
            int randomNumber;
            //Generate method to avoid numbers duplication
            do{
                randomNumber=random.nextInt(MAX_TICKET_NUMBER);
            }while(search(ticket,randomNumber));

            ticket[i]=randomNumber;
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int i=0;i<LENGTH;i++){
            System.out.print(ticket[i]+" | ");
        }
    }

    /**
     * Does sequential search
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found,false if not
     */
    public static boolean search(int[] array,int numberToSearchFor){

        //This is enhance loop
        for(int value:array){
            if(value==numberToSearchFor){
                return true;
            }
        }
        //Entire array was search array is not found
        return false;
    }
    public static boolean binarySearch(int[] array,int numberToSearch){
        //Array sorted
        Arrays.sort(array);

        int index=Arrays.binarySearch(array,numberToSearch);
        if(index>=0){
            return true;
        }else{
            return false;
        }
    }
}

package chapter7;


import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    //declaring constants
    private static final int LENGTH = 6;
    private static final int MAX_NUMBER=69;

    public static void main(String Args[]){

        //method to generate random nos to store in the ticket array
            int[] ticket = generateNumbers();

        //method to print the nos in the ticket array
            printTicket(ticket);


    }

    //method to generate random numbers
    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        //creating obj for Random class to generate random numbers
        Random random = new Random();


        /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
             */
        for (int i = 0; i < LENGTH; i++) {
            int randomnumber;
            do {
                randomnumber = random.nextInt(MAX_NUMBER )+ 1;
            } while (search(ticket, randomnumber));
            ticket[i] = randomnumber;
        }
        return ticket;
    }
//thsi si javadoc..commest with 2 * gives detaisl of that method
    /*/**
     *
     * @param randomnumber
     * @param ticket
     * @return retyrns value
     */

    /*   This is called an enhanced  for loop.
          It iterates through 'array' and
          each time assigns the current element to 'value'
         */
        //public static boolean search(int randomnumber,int[] ticket)
        public static boolean search(int[] array, int numberToSearchFor){
            for(int value:array){
            if (value == numberToSearchFor)
            return true;
            }
        /*
          If we've reached this point, then the entire array was searched
          and the value was not found
         */
        return false;

        }

    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //Array must be sorted first
       Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }



    //method to printTicket
    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            //print each element with space
            System.out.print(ticket[i] + " | ");
            //System.out.print(ticket[i]);
        }
    }
    }


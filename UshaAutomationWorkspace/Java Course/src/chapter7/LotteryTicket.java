package chapter7;


import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_NUMBER=69;

    public void main(String Args[]){

            int[] ticket = generateNumbers();
            printTicket(ticket);


    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        //creating obj for Random class to generate random numbers
        Random random = new Random();
        for(int i=0;i<LENGTH;i++){
            ticket[i]= random.nextInt(MAX_NUMBER);
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
            System.out.print(ticket[i]);
        }
    }
    }


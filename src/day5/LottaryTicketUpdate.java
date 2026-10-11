package day5;

import java.util.Random;


public class LottaryTicketUpdate {

    private static final int LENGTH = 6;
    private static final int  MAX_LOTTARY_NUMBER= 69;
    public static void main(String[] args) {
        int [] ticket= generateTicketNumber();
        printTicketNumber(ticket);
    }
    public static int [] generateTicketNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            int randomNumber;
            do {
                randomNumber=random.nextInt(MAX_LOTTARY_NUMBER)+1;
            }while (search(ticket,randomNumber));

            ticket[i]=randomNumber;
        }
        return ticket;

    }
        //  System.out.println(i +" this just i" + " " );
        //  ticket[i]= random.nextInt(MAX_LOTTARY_NUMBER)+1;
        // System.out.println(ticket[i] + " this is number  of loop"); // مع كل لفه طلعلي رقم عشوائي
    public static void printTicketNumber( int [] ticket) {
//        for (int number : ticket) {
//            System.out.print(number + " | ");
//        }
        for (int i=0;i<ticket.length;i++){
            System.out.println(ticket[i]);
        }
        for(int number:ticket){
            System.out.print(number+" | ");
        }
    }
        /**
         * This method searches for an element in an array
         * @param array
         * @param numberToSearchFor
         * @return
         */
        public static boolean search ( int[] array, int numberToSearchFor){
            for (int value : array) {
                if (value == numberToSearchFor) {
                    return true;
                }
            }
            return false;

        }

    }


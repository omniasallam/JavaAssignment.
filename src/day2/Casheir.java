package day2;

import java.util.Scanner;

public class Casheir {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter Number Of Items : ");
        int numberOfItems= scanner.nextInt();
double total=0;
        for (int i=1; i<=numberOfItems; i++){
            System.out.println("Please Enter Number Of Items : ");
          double price= scanner.nextDouble();
          total+=price;


        }
        scanner.close();
        System.out.println("The total price is "+total);
    }
}

package day2;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        boolean response ;
        Scanner scanner= new Scanner(System.in);

        do {
            System.out.println("Enter First number");
            int num1= scanner.nextInt();
            System.out.println("Enter Second number");
            int num2= scanner.nextInt();
            int sum= num1 + num2 ;
            System.out.println("Sum" + sum);
            System.out.println("Do you want to continue ?  1-true 2-false");
             response= scanner.nextBoolean();

        }
        while (response);
        scanner.close();
    }
}

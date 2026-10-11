package day2;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int rate=15;
        int maxWeeklyHours =40;

        System.out.println("Enter working hours : ");
        double workingHours = scanner.nextDouble();

        //Validation
        while (workingHours>maxWeeklyHours){
            System.out.println("Please Enter Value between 1 and 40 ");
            workingHours = scanner.nextDouble();
        }
        scanner.close();
        //Calculations
        double grossSalary = workingHours*rate;
        System.out.println("The gross salary is "+grossSalary+" $");
    }
}

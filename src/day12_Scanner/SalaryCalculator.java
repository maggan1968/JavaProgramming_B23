package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your hourly rate");
        double hourlyRate = scan.nextDouble();

        System.out.println(" How many hours do you work in a week");
         int weeklyHours = scan.nextInt();

        System.out.println( "How many weeks do yoy work in a year");
        int week = scan.nextInt();

        double salary =hourlyRate*weeklyHours*week;

        System.out.println("You are making $" + hourlyRate+ "per hour");
        System.out.println( "You are making $" + hourlyRate+ "per week");
        System.out.println("Your salary is" + salary);


    }
}

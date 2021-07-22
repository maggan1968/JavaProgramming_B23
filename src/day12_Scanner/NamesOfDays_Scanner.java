package day12_Scanner;

import java.util.Scanner;

public class NamesOfDays_Scanner {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println(" Days of a week:");
        int week = input.nextInt();

       int number = 6;
       switch (number){
           case 1:
               System.out.println("Monday");
               break;

           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednsday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
       }

    }
}

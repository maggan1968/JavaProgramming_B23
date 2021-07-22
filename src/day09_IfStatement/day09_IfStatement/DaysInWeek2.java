package day09_IfStatement.day09_IfStatement;

public class DaysInWeek2 {
    public static void main(String[] args) {
        // 1. write a program that can print name of day based on the number
        // 1~ 7

        int number = 5;

        if (number == 1) {
            System.out.println("Monday ");
        } else if (number == 2) {
            System.out.println("Tuesday ");
        } else if (number == 3) {
            System.out.println("Wednsday ");
        } else if (number == 4) {
            System.out.println("Thursday ");
        } else if (number == 5) {
            System.out.println("Friday ");
        }else if (number==6){
            System.out.println("Saturday ");
        }else if (number==7) {
            System.out.println("Sunday");
        }else{
            System.out.println("wrong Number");
        }


        }
}



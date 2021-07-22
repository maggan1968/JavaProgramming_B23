package day13_ScannerPractice;

import java.util.Scanner;

public class NextMethod_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Enter

        System.out.println("Enter Your Age");
        int age = scan.nextInt();// 19

        scan.nextLine();//Enter


        System.out.println("Enter Your job title");
        String jobTitle= scan.nextLine();//Enter

        System.out.println("age = "+ age);
        System.out.println("jobTitle = "+ jobTitle);


    }
}

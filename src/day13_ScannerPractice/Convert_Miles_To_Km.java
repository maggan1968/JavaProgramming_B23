package day13_ScannerPractice;

import java.util.Scanner;

public class Convert_Miles_To_Km {
    public static void main(String[] args) {

        /*
        2. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles");

        double miles=input.nextDouble(); //10.0
        double km = miles * 1.609;

        System.out.println(miles+" miles equal to "+km+" kilometers");
    }
}

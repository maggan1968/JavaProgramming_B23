package day19_Loop;

import java.util.Scanner;

public class For_Loop_SumOf10Numbers_INTERVIE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 10 ; i++) {

            System.out.println("Enter a number:");
            result += scan.nextInt();

        }


        System.out.println("result = " + result);


        scan.close();


    }


}


/*
6. ask user to enter a number 10 times . find the sum of 10 numbers
 */
package day23_Arrays;

import sun.jvm.hotspot.jdi.SACoreAttachingConnector;

import java.util.Scanner;

public class MaximumAndMinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {10, 5, 4, 400, 50, 0, -1};
        int max = numbers[0];//400
        int min = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {

            int each = numbers[i];// each: 10,5, 4, 400, 50, 0, -1


            if (each > max) {//if any greater numbers is occurred
                max = each;
            }

            if (each < min) {
                min = each;
            }


            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }
    }
}
/*
2. a program that can find the maximum number from an array of integers

    ex:
            array = {10,5, 4, 400, 50, 0, -1};

            output: 400

 */


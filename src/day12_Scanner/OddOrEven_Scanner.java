package day12_Scanner;

import java.util.Scanner;

public class OddOrEven_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
          int number = scan.nextInt();
          // ternary practice

        System.out.println( ( number%2 !=0)? "Odd":"Even");

        System.out.println( ( number>0)? "Positive": (number<0)? "Negative": "Zero");

    }
}

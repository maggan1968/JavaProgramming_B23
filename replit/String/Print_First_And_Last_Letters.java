package String;

import java.util.Scanner;

public class Print_First_And_Last_Letters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char b = word.charAt(0);
        word = word.substring(word.length()-1);
        System.out.println(b+word);

    }
}


/*
Write a program that will print out first and last letters together.

Input: adobe
Input: adobe
Output: ae
 */
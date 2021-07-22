package day15_String;

import java.util.Scanner;

public class Longest_String {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Please, enter two strings");
        String s1= scan.nextLine();
        String s2= scan.nextLine();

        if(s1.length() > s2.length()) {
            System.out.println(s1);
        }else  if(s1.length() == s2.length()){
            System.out.println("Equal");
        }else {
            System.out.println(s2);
            scan.close();
        }
    }
}
/*
2. write a program that asks user
 to enter two strings, and print out the longest string
 */
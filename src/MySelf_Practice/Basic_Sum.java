package MySelf_Practice;

import java.util.Scanner;

public class Basic_Sum {
    public static void main(String[] args) {
        System.out.println(36+48);

        System.out.println("----------------------------------------");
        //Sample solution using input from the user:


        Scanner input=new Scanner(System.in);
        System.out.println("input the first number");
        int num1=input.nextInt();
        System.out.println("input the second number");
        int num2=input.nextInt();
        int sum= num1+num2;
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
/*
Write a Java program to print the sum of two numbers.
 */
package MySelf_Practice;

import java.util.Scanner;

public class Basic_Divide {
    public static void main(String[] args) {
        System.out.println(50/5);

        System.out.println("------------------------------");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a first number");
        int num1=input.nextInt();
        System.out.println("Enter a second number");
        int num2=input.nextInt();
        int divide= (num1/num2);
        System.out.println();
        System.out.println("The division of num1 and num2 is;" +divide);
    }
}
/*
Write a Java program to divide two numbers and print on the screen.
 */
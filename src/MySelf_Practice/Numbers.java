package MySelf_Practice;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));


        System.out.println("-----------------------------------------------");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int n2 = scanner.nextInt();
        int sum = n1 + n2;
        int minus = n1 - n2;
        int multiply = n1 * n2;
        int subtract = n1 + n2;
        int divide = n1 / n2;
        int rnums = n1 % n2;
        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
    }
}






/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

X+y, X*y,X-y,X/y,X%y
 */
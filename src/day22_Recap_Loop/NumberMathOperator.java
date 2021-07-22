package day22_Recap_Loop;

import java.util.Locale;
import java.util.Scanner;

public class NumberMathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        char operator;
        String answer ="";

        while( !answer.equals("no") ) {
            System.out.println("Enter two number:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            System.out.println("Enter math operator");
            operator = scan.next().charAt(0);

            if (operator == '-') {
                System.out.println("Subtraction: " + (num1 - num2));
            } else if (operator == '+') {
                System.out.println("Addition: " + (num1 + num2));
            } else if (operator == '*') {
                System.out.println("Multiplication: " + (num1 * num2));
            } else if (operator == '/') {
                System.out.println("Division: " + (num1 / num2));
            } else {
                System.out.println("Invalid Operator");
            }
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase(); //Maybe


                while (!(answer.equals("yes") || answer.equals("no"))) { // to make sure user will only enters yes or no
                    System.out.println("Invalid Entry, Please re-enter");
                    System.out.println("Do you want to continue?");
                    answer = scan.next().toLowerCase();
                }

            }
        }
    }


/*4. write a program to ask user to enter two number and math operator,
 and return the result.

if the operator is invalid operator, ask user to re-enter the operator
 until user provides a valid operator
        */

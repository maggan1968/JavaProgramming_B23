package Methods;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        plus();
    }


    public static void plus() {
        Scanner scan=new Scanner(System.in);


        int result =0;
        for (int i = 1; i <=1 ; i++) {
            System.out.println("enter first number:");
            int number1 = scan.nextInt();

            System.out.println("enter second number:");
            int number2 = scan.nextInt();
            result=number1+number2;
        }
        System.out.println("result: "+result);

    }

}

/*
    Implement the plus method. The return type is void and has no arguments.

        The method should ask the user to input two numbers,
        then it will add them and print the result.

        Hint: Create a scanner within plus method.

        Example:

        enter first number:
        1
        enter second number:
        2
        result: 3

 */
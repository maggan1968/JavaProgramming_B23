package day14_Recap;

import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = scan.nextLine();//iPhone 12

        System.out.println("Enter the price:");
        double Price = scan.nextDouble();//850

        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt();//5

        System.out.println("Enter your first name:");
        String firstName = scan.next();

        scan.close();//closes the scanner
        // we cannot use scanner object after tis line


       double totalPrice = Price * quantity;

        System.out.println(firstName+",your order for "+quantity+" "+productName
                +" has been placed. Yor total is $." + totalPrice+".");



    }
}
/*
1. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
package Statements;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        String item1, item2, item3, report;
        Double price1,price2 ,price3, totalPrice;

        System.out.println("Enter Item1 and its price:");
        price1 =scan.nextDouble();
        item1=scan.nextLine();


        System.out.println("Enter Item2 and its price:");
        price2 =scan.nextDouble();
        item2=scan.nextLine();


        System.out.println("Enter Item3 and its price:");
        price3 =scan.nextDouble();
        item3=scan.nextLine();


        totalPrice= price1+price2+price3;

        report="Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price:" +
                " "+price2+", Item3: "+item3+" Price: "+price3;

        System.out.println(report+"\n"+"Total price: "+totalPrice);

scan.close();

    }
}
/*
In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its
price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
 */
package Self_Packege;

import java.util.Scanner;

public class Leasing_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;


        if(numberOfBedrooms>0 && numberOfBedrooms<=3){
            if(numberOfBedrooms==1) {
                startingPrice = startingPrice + 1100;
                System.out.println("One Bedroom Selected"+"\n"+"Starting Price: " + startingPrice);

            }else  if(numberOfBedrooms==2){
                startingPrice = startingPrice+1850;
                System.out.println("Two Bedroom Selected"+"\n"+"Starting Price: " + startingPrice);

            }else {
                startingPrice = startingPrice + 2550;
                System.out.println("Three Bedrooms Selected"+"\n"+"Starting Price: " + startingPrice);
            }

            }else {
            System.out.println("No such Bedrooms available");

            }
        }
    }
/*
Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550

Example Flow:

Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Note: If an invalid bedroom number is given no price is displayed
 */

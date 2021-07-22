package day13_ScannerPractice;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your building number");
        int buildingNum= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the street address");
        String streetAddress= scan.nextLine();


        System.out.println("Enter your city name");
        String cityName =scan.nextLine();


        System.out.println("Enter your state name");
        String stateName =scan.next();

        System.out.println("Enter your zip code");
        String zipCode =scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName =scan.nextLine();


        String ShippingInfo= fullName+"\n"+buildingNum+""+streetAddress+"\n"
                +cityName+","+stateName+" "+zipCode ;






        /*
        ShippingInfo
    ask the followings:
        1. Builder Number (nextInt)
        2. Street Address (nextLine)
        3. City Name  (nextLine)
        4. State ( next )
        5. Zip Code (next)
        6. Full Name

    print the shipping info of the person

    Ex:
        Aysu Ahmadil
        7925 Jones Branch Drive
        Mclean, VA 22012


         */

    }
}

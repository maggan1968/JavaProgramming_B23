package day13_ScannerPractice;

import java.util.Scanner;
import java.util.SplittableRandom;

public class NextMethod {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your  first name");
        String firstName = scan.next(); //only takes the first word
        // next method is only for String
        System.out.println("first Name = " +firstName);


        System.out.println(" Enter your last name");
        String lastName = scan.next();
        System.out.println("last Name = " +lastName);

        String fullName = firstName + lastName;
        System.out.println(" Full Name = "  + fullName);


        System.out.println( "Enter yor address");
        String address = scan.next();

        System.out.println(" address = " + address);
        /*
        8432N. Linder Ave.
         */

        String gender=scan.next();
        String state=scan.next();
        String city=scan.next();



    }
}

package day17_String_Continiu_2;

import java.util.Scanner;

public class First_Last_Character_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();// Cybertek School

        String firstName= fullName.substring(0,fullName.indexOf(""));
        String  lastName= fullName.substring(fullName.indexOf("")+1);

        String initial = firstName.substring(0,1).toUpperCase() +"."+lastName.substring(0,1).toUpperCase();

        // create substrings for first characters of first name & last name, then called toUpperCase

        System.out.println("initial = " + initial);

scan.close();


    }

}

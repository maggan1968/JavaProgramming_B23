package day17_String_Continiu_2;

import java.util.Scanner;

public class First_And_Last_Character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName= scan.next();
        System.out.println("Enter your last name:");
        String lastName= scan.next();

        //first possibility to do; create substring for first characters of first name & last name,
        // then called toUpperCase

       // String initial= firstName.substring(0,1).toUpperCase() +"."
           //     +lastName.substring(0,1).toUpperCase();
        //                 D.J

        //String  initial= firstName.charAt(0)+"."+lastName.charAt(0);
        //initial= initial.toUpperCase);

        String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);



        System.out.println("initial = " + initial);
        scan.close();
    }
}
/*
2. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */
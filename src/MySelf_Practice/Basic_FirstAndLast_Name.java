package MySelf_Practice;

import java.util.Scanner;

public class Basic_FirstAndLast_Name {
    public static void main(String[] args) {

        System.out.println("Hello\nMalgorzata Altunsayar");



        System.out.println("-------------------------------------");

        //Sample solution using input from the user:

        Scanner input= new Scanner(System.in);
        System.out.print("Input your first name");
        String  fname= input.next();
        System.out.println("Input your last name");
        String  lname= input.next();
        System.out.println();
        System.out.println("Hello \n"+ fname+" "+lname);
    }
}
/*
Write a Java program to print 'Hello' on screen and then print your name on a separate line.
 */
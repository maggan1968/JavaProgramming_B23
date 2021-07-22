package Self_Packege;

import java.util.Scanner;

public class String_Practice_Frukost {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your word:");
        String input = scan.next();

        if(input.length()<=0){
            System.out.println("string is empty");
        }
        else if(input.length()>3){
            String last3 = ""+input.charAt(input.length()-3)+""+input.charAt(input.length()-2)+""+input.charAt(input.length()-1);
            System.out.println(last3);

        }
        else {
            System.out.println(input);
        }
        scan.close();
}
    }

/*
1. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
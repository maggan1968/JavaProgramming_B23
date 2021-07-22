package day16_String_Continiu;

import java.util.Scanner;

public class String_Practice_Brekfast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // write a method that asks user to enter a string.
        System.out.println("Enter a string:");
        String word = scan.next();//"Programming"

      //  if the string is empty, print: string is empty
        if(word.length()==0) {
            System.out.println("String is empty");

         //   if the string has more than 3 characters, print the last three characters
        }else if(word.length() >3){
            System.out.println(word.substring(word.length()-3));

         //   if the string has less than or equal 3 characters, print the string itself
        }else {
            System.out.println(word);
        }
        scan.close();
    }
}
/*
1.



 */
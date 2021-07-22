package day16_String_Continiu;

import java.util.Scanner;

public class String_Practice_Brekfest_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //  Ask user to enter two words.
        System.out.println("Enter two words:");

        //Print first word without its first character
        String word1= scan.next();// "Apple"

       // then print the second word without its first character.
        String word2 = scan.next();


        if(word1.length()>=2 && word2.length() >=2){

        String result = word1.substring(1)+ word2.substring(1);
        System.out.println(result);
    }else {
            System.out.println("Too short");
        }
        scan.close();
        }}

/*
2. Ask user to enter two words.
Print first word without its first character then print
the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
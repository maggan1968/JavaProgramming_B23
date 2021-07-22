package day16_String_Continiu;

import java.util.Scanner;

public class String_Practice_Brekfast_3_Nestad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //write a program that asks the user enter a three letter word.
        System.out.println("enter a three letter word:");
        String word = scan.next();

        //Check if the middle character of the given word is 'a'
        if (word.length() == 3) {// if the word has three characters only

            if (word.charAt(1) == 'a') {// if the middle characters is equal to 'a'
                System.out.println("Cool word");
            } else {
                //In the case it is print: "Cool word",
            }
            // but in the case the middle letter is not 'a' print: "Okay word".
            System.out.println("Okay word");

        }else {//if the word has more than three characters or less than three characters
            //If the word is less than 3 letters: "Word is too short"

            if(word.length()<3) {
                System.out.println("Word is too short");
            }else {//word has more than three characters
                System.out.println("Word is too long");

            }
        }

       scan.close();


    }
}
/*
3. write a program that asks the user enter a three letter word.
 Check if the middle character of the given word is 'a'.
 In the case it is print: "Cool word",
  but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */
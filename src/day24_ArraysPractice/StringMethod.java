package day24_ArraysPractice;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        //split
        //reverse the words in the sentence

        String sentence= "I love learning java programming language";

        String[]words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+" ");

        }
        System.out.println();

        //how to reverse words in email?

        String email= "James@gmail.com";
        String[] arrays = email.split("@");// {james. gmail.com}

        System.out.println(Arrays.toString(arrays) );
        String firstName=arrays[0];

        System.out.println("firstName = " + firstName);

        //to CharArray()

        String str="A BCD!";
        char[] characters= str.toCharArray();

        System.out.println(Arrays.toString(characters));

    }
}

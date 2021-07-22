package day18_String_Continiu_3;

import java.util.Scanner;

public class WithOutX_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        //if(word.charAt(0)=='x')
        if (word.startsWith("x")) {
            System.out.println(word.substring(1));
        }else {
            System.out.println( word);
        }
        scan.close();

        System.out.println("-------------------------------");

        String sentence= "I love Java programming  language";
        //java or Java==> has Java
        //otherwise==> does not have Java

        if(sentence.toLowerCase().contains("java")) {// ignore sen
           // if(sentence.toUpperCase().contains("Java")){
            System.out.println("Has Java");
        }else {
            System.out.println("Does not have Java");
        }

        System.out.println("------------------------------");
        String s1="I love cats and dogs";

        //boolean lovesCats= s1.equalsIgnoreCase("cats");//verifies if s1 IS "cats"
        boolean lovesCats= s1.toLowerCase().contains("cats");//verifies if s1 HAS "cats"

    }}
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
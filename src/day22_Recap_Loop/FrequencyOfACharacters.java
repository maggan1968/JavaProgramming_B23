package day22_Recap_Loop;

import java.util.Scanner;

public class FrequencyOfACharacters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String str="aabbccd";
        char ch='c';
        int frequency=0; //for the frequency of ch
        
        for (int i = 0; i < str.length()-1; i++) {
           char each=str.charAt(i);//every single characters that we have in str
            if(each==ch){// if each character in str is matching with ch
                frequency++;// then increase the frequency of ch by 1
            }
        }

        System.out.println("frequency = " + frequency);;



    }
}
/*
1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */
package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindFrequency {
    public static void main(String[] args) {



        String word = "AABBCCDDEE";
        String[] words = word.split("");
        String result = "";

        ArrayList<String> ch = new ArrayList<>(Arrays.asList(words));

        for (String s : ch) {
            if(!result.contains(s)) {
                result += s + Collections.frequency(ch, s);
            }
        }
        System.out.println("result = " + result);
        }
    }


/*
3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
 */


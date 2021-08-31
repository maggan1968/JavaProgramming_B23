package String;

import java.util.Scanner;
public class Has_A_Java {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean  appears;
        if(word.length()>=4 && (word.substring(0,4).equals("java") || word.substring(1,5).equals("java"))){
            appears= true;
        }else{
            appears=false;
        }
        System.out.println(appears);


    }
}




/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true
input: javapython

output: true
input: cjavac++

output: true
input: cjavac++

output: true
input: c#javaruby

output: false
 */
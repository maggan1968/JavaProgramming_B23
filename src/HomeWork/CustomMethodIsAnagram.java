package HomeWork;

import java.util.Arrays;

public class CustomMethodIsAnagram {

    //checks if two strings are anagram, returns boolean
    public static void main(String[] args) {
       String str1="silent";
       String str2="listen";
        System.out.println(isAnagram(str1,str2));
    }

    public static String isAnagram(String str1,String str2){

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)) {
            return " Anagram";
        }else {
            return " Not Anagram";
        }
    }

}


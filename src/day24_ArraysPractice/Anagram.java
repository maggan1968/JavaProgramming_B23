package day24_ArraysPractice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
     String s1="heart" ;  
     String s2= "earth";  
     
     char[]ch1 = s1.toCharArray();// we can use the sort method
     char[]ch2 = s2.toCharArray();//we can use the sort method

     Arrays.sort(ch1);//(if I dont have does output is false)ch1 will be in ascending order:a-z
     Arrays.sort(ch2);//(------\----------)ch2 will be in ascending order:a-z

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        
        boolean isAnagram= Arrays.equals(ch1,ch2);

        System.out.println("isAnagram = " + isAnagram);
    }
}
/*
heart && earth
race && care
listen && silent

output: true
 */
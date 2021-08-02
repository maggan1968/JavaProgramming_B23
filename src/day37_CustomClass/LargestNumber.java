package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {


        System.out.println("-----------4------largest num----------");

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 10));
        int r = Collections.max(num);
        System.out.println(r);
    }
}

/*
4. Write a program that can return the nth largest number from an ArrayList of integers
 */
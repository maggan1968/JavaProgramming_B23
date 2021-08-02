package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstUnique {
    public static void main(String[] args) {

        System.out.println("----------2-----first unique----------------");
        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('A', 'B', 'A', 'C', 'D', 'C', 'D'));
        ch.removeIf(p -> Collections.frequency(ch, p)!=1);
        System.out.println(ch.get(0));
    }
}
/*
2. write a program that can return the first unique elements of an ArrayList

 */
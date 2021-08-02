package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryList {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>();
        country.addAll(Arrays.asList("Uzbekistan", "USA", "Russia", "Germany", "Norway", "Kazakhstan", "Afghanistan", "Canada") );
        System.out.println(country);
        country.removeIf(each-> each.length()>=10);

        System.out.println(country);

    }
}
/*
task01:
            1. create an Array of string called country names

            2. write a program that can remove all the country names that have length of 10 or greater

 */
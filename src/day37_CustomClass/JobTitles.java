package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> jobTitles =new ArrayList<>(Arrays.asList("SDET", "QA", "DevOPS","Developer","Product Owner","Doctor","Artist"));
        jobTitles.retainAll(Arrays.asList("SDET","QA"));
        System.out.println(jobTitles);

    }
}
/*
        1. create an Array of String called jobTitles
        2. write a program that only keeps the jobTitles that are: SDET and QA
         */
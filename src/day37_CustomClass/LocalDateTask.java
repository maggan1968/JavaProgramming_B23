package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalDateTask {
    public static void main(String[] args) {

        java.time.LocalDate[] dates = {java.time.LocalDate.now(), java.time.LocalDate.now().minusDays(700), java.time.LocalDate.of(2018,9,23),
                java.time.LocalDate.now().minusYears(8), java.time.LocalDate.now().plusWeeks(6), java.time.LocalDate.now().minusYears(9),
                java.time.LocalDate.of(2016,5,26)};
        ArrayList<java.time.LocalDate> list = new ArrayList<>(Arrays.asList(dates));
        list.removeIf(p-> p.isBefore(java.time.LocalDate.of(2016,8,15)));

        System.out.println("list = " + list);

    }
}
/*
 task02:
            1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016
*/
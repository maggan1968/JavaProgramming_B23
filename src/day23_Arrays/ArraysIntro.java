package day23_Arrays;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group5={"Tugba", "Mucahid" , "Venera" ,"Boburbek" , "Memet" , "Margie"};
        //       index:     0        1            2         3          4           5

        //retrieve- "odzyskac" data  from array:
        System.out.println(group5[0]);
        System.out.println(group5[1]);
        System.out.println(group5[2]);// venera
        System.out.println(group5[3]);
        System.out.println(group5[4]);//Memet
        System.out.println(group5[5]);



        System.out.println("----------------------------");

        for (int i = 0; i <= 3; i++) {
            System.out.println(group5[i]);// Tugba,Mucahid,Venera, Boburbek

        }

    }
}

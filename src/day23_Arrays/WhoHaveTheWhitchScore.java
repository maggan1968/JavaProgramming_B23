package day23_Arrays;

public class WhoHaveTheWhitchScore {

    public static void main(String[] args) {

        int[]score={85,70,95,90,100};
        //          0   1  2   3   4
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};




        for (int i = 0; i <= names.length - 1; i++) {
            String  eachName=names[i];
            int eachScore=score[i];


            System.out.println(names[i] +":"+ score[i]);
    }
}}
/*
which score have which student
 */
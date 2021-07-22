package day07_ShortHand_Relational;

import java.sql.SQLOutput;

public class MarketGroups {
    public static void main(String[] args) {

        int score = 22;

        boolean earlyBirds= score>= 50 ;// false
        boolean group1= score>= 40 && score<=49;//false


        boolean group2= score>= 30 && score<=39;
        boolean angryBirds= score< 30 ;

        System.out.println("earlyBirds=" + earlyBirds);
        System.out.println("group1="+group1);
        System.out.println("group1="+group1);
        System.out.println("angryBirds=" +angryBirds);

    }
}
         /*
         earlyBirds: 50~60




        */
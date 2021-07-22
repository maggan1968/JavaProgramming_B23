package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class LocalDay_Intro {
    public static void main(String[] args) {


        LocalDate eid = LocalDate.of(2021, 2, 20);

        System.out.println(eid);
        LocalDate today = LocalDate.now();

        System.out.println(today);


        System.out.println("_______________________________----");

        //create array of string to store 5 classmates' names

        String[]names={"John","Daniel", "Josh","Jimmy"};

        LocalDate[]DoB={LocalDate.of(1990,5,25),
                LocalDate.of(1980,6,20),
                LocalDate.of(1985,4,3),
                LocalDate.of(1968,4,27)};

        for(int i=0;i< names.length; i++){
            System.out.println(names[i]+"' birthday is: "+ DoB[i]);
        }

        System.out.println("-----------------------------------");

        LocalDate person1=LocalDate.of(1980,12,11);
        LocalDate person2=LocalDate.of(1980,12,25);

        if(person1.isBefore(person2)){
            System.out.println("person1 is older");
        }else {
            System.out.println("person2 is older");
        }

        if( person1.isAfter(person2)){
            System.out.println("person1 is younger");
        }else {
        System.out.println("person2 is younger");
    }

        System.out.println("----------------------------------------------");


      boolean r1=person1.isLeapYear();
        System.out.println(r1);

        boolean r2=LocalDate.of(2023,1,1).isLeapYear();
        System.out.println(r2);


        System.out.println("------------------------------------");
        //unitAssessment3 will be on 14 days
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        LocalDate unitAssessment3 = currentDate.plusDays(14);

        System.out.println(unitAssessment3);

       // unitAssessment4 will be on 6 months
        LocalDate unitAssessment4 = currentDate.plusMonths(6);

        System.out.println(unitAssessment4);


        // exam date will be on 5 weeks
        LocalDate examDate= currentDate.plusWeeks(5);
        System.out.println(examDate);

    }
}

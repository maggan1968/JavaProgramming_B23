package day39_CustomClass_Static.testerTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester(),new Tester(), new Tester()};

        testers[0].setInfo("Ayse",15,"SDET",100000);
        testers[1].setInfo("Fatma",16,"SDET",110000);
        testers[2].setInfo("Hayriye",17,"SDET",120000);
        testers[3].setInfo("Haydi",18,"SDET",130000);
        testers[4].setInfo("Telliye",19,"SDET",140000);

        ArrayList<Tester> testerArrayList = new ArrayList<>(Arrays.asList(testers));


        Developer[] developers = {new Developer(), new Developer(),new Developer(),new Developer(),new Developer()};

        developers[0].setInfo("Ahmet","Developer",20,150000);
        developers[1].setInfo("Mehmet","Developer", 21,145000);
        developers[2].setInfo("Mahmut","Developer",22,120000);
        developers[3].setInfo("Kezban","Developer",23,100000);
        developers[4].setInfo("Nalan","Developer",24,160000);

        ArrayList<Developer> developerArrayList = new ArrayList<>(Arrays.asList(developers));

        ScrumTeam MyScrumTeam = new ScrumTeam();

        MyScrumTeam.setInfo("Seda Kartal", "Tamara Grcki","Ismail Ersu",testerArrayList,developerArrayList,5);

        System.out.println(MyScrumTeam.PO);
        System.out.println(MyScrumTeam.BA);
        System.out.println(MyScrumTeam.SM);
        System.out.println(MyScrumTeam.testerList);
        System.out.println( MyScrumTeam.devopsList);


    }
}
/*
create a class called MyScrumTeam:
    1. create an array of Testers and add the testers from your group
    2. create an array of developers add the developers from your group
    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */





package day42CustomClass_Constructor.capitalOneTask;


import day41_CustomeClass_Constructor.scrumTask.Developer;
import day41_CustomeClass_Constructor.scrumTask.ScrumTeam;
import day41_CustomeClass_Constructor.scrumTask.Tester;

public class CapitalOne {
    public static void main(String[] args) {


        ScrumTeam scrumTeam1 = new ScrumTeam("Zengin", "Engin", "Cengiz");
        scrumTeam1.hireTester(HumanResource.testersTeam1);
        scrumTeam1.hireDeveloper(HumanResource.devopsTeam1);

        ScrumTeam scrumTeam2 = new ScrumTeam("Selda", "Mucahit", "Dilem");
        scrumTeam2.hireTester(HumanResource.testersTeam2);
        scrumTeam2.hireDeveloper(HumanResource.devopsTeam2);

        ScrumTeam scrumTeam3 =new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
        scrumTeam3.hireTester(HumanResource.testersTeam3);
        scrumTeam3.hireDeveloper(HumanResource.devopsTeam3);

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);
        System.out.println(scrumTeam3);

        System.out.println("----------------------------------------");

        ScrumTeam[] scrums = {scrumTeam1, scrumTeam2, scrumTeam3};

        // Task1: total budget

        double budget = 0;
        for(ScrumTeam eachScrumTeam : scrums){ // Iterating each scrum team

            for(Tester eachTester  : eachScrumTeam.testers){ // iterates each tester from each scrum team
                budget += eachTester.salary;
            }

            for(Developer eachDeveloper  : eachScrumTeam.developers ){ // iterates each developer from each scrum team
                budget += eachDeveloper.salary;
            }

        }

        System.out.println("budget = " + budget);

        System.out.println("--------------------------------------------------");
        int totalNumberOfTesters =0,
                totalNumberOfDevelopers = 0;

        for(ScrumTeam eachScrumTeam: scrums ){
            totalNumberOfTesters += eachScrumTeam.testers.size();
            totalNumberOfDevelopers += eachScrumTeam.developers.size();
        }

        System.out.println("totalNumberOfTesters = " + totalNumberOfTesters);
        System.out.println("totalNumberOfDevelopers = " + totalNumberOfDevelopers);

        System.out.println("-------------------------------------------------------");
        double maxSalaryOfTester = 0 ;//scrums[0].testers.get(0).salary;
        double minSalaryOfTester = Double.MAX_VALUE;
        double maxSalaryOfDeveloper = 0;
        double minSalaryOfDeveloper = Double.MAX_VALUE;
        String t1 ="", t2 = "", d1 ="", d2 ="";

        for (ScrumTeam eachScrumTeam : scrums) {
            for (Tester eachTester : eachScrumTeam.testers) { // iterates each tester
                if(eachTester.salary > maxSalaryOfTester){
                    maxSalaryOfTester = eachTester.salary;
                    t1 = eachTester.name;
                }

                if(eachTester.salary < minSalaryOfTester){
                    minSalaryOfTester = eachTester.salary;
                    t2 = eachTester.name;
                }
            }

            for(Developer eachDeveloper : eachScrumTeam.developers) { //iterates each developer
                if(eachDeveloper.salary > maxSalaryOfDeveloper){
                    maxSalaryOfDeveloper = eachDeveloper.salary;
                    d1 = eachDeveloper.name;
                }

                if(eachDeveloper.salary < minSalaryOfDeveloper){
                    minSalaryOfDeveloper = eachDeveloper.salary;
                    d2 = eachDeveloper.name;
                }

            }

        }


        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester +" ====> "+t1);
        System.out.println("minSalaryOfTester = " + minSalaryOfTester +" ====> " +t2);

        System.out.println("maxSalaryOfDeveloper = " + maxSalaryOfDeveloper +" ====> "+d1);
        System.out.println("minSalaryOfDeveloper = " + minSalaryOfDeveloper +" ====> "+d2);







    }

}

/*
        1. total budget
        2. total Number of testers in CapitalOne
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the testers
        5. what's the max & min salaries of the developers
 */




package day41_CustomeClass_Constructor.scrumTask;

import java.util.Scanner;

public class BankAmerika2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Tester tester1 = new Tester("Margie", 'F', "QA", 2, 125000);
        Tester tester2 = new Tester("Nader", 'M', "QA", 3, 135000);
        Tester tester3 = new Tester("Natta", 'F', "QA", 4, 120000);
        Tester tester4 = new Tester("Wojtek", 'M', "QA", 5, 125700);
        Tester tester5 = new Tester("Dominic", 'M', "QA", 6, 125000);

        Tester[] testers = {tester2, tester3, tester4, tester5};

        Developer developer1 = new Developer("Monica", 'F', "Software Developer", 7, 125000);
        Developer developer2 = new Developer("Noel", 'M', "Java Developer", 8, 128000);
        Developer developer3 = new Developer("Joelle", 'F', "Software Developer", 9, 115000);
        Developer developer4 = new Developer("Aga", 'F', "JAva Developer", 10, 1328000);
        Developer developer5 = new Developer("Iga", 'F', "JAva Developer", 11, 148000);
        Developer developer6 = new Developer("Stephanie", 'F', "JAva Developer", 12, 135000);


        Developer[] developers = {developer2, developer3, developer4, developer5, developer6};

        ScrumTeam scrum2 = new ScrumTeam("Ola", "Ann", "Jack");

        scrum2.hireTester(tester1);
        scrum2.hireDeveloper(developer1);
        scrum2.hireTester(testers);
        scrum2.hireDeveloper(developers);


        System.out.println(scrum2);

        double budget = 0;

        for (Tester eachTester : scrum2.testers) {
            budget += eachTester.salary;
        }

        for (Developer eachDeveloper : scrum2.developers) {
            budget += eachDeveloper.salary;
        }

        System.out.println("budget = " + budget);
    }






}







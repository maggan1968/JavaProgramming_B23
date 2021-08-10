package day41_CustomeClass_Constructor.scrumTask;

public class BankOfAmerica {

    public static void main(String[] args) {


        Tester tester1 = new Tester("Yuliang", 'M', "QA", 10, 110000);
        Tester tester2 = new Tester("Abbos", 'M', "SM", 11, 115000);
        Tester tester3 = new Tester("Selda", 'F', "QE", 12, 120000);

        Tester[] testers = {tester2, tester3};


        Developer developer1 = new Developer("Zorana", 'F', "Software Developer",13, 125000);
        Developer developer2 = new Developer("Mehmet", 'M', "Java Developer", 14, 130000);
        Developer developer3 = new Developer("Yuliia", 'F', "Software Developer", 15, 125005);
        Developer developer4 = new Developer("Yasin", 'M', "Java Developer", 16, 122000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam("Shazia", "Fhilipp", "Aysu");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);

        scrum1.hireTester(  new Tester("Tugba", 'F', "SDET", 9, 118000)  );

        System.out.println(scrum1);

        double budget = 0;

        for(Tester eachTester  : scrum1.testers){
            budget += eachTester.salary;
        }

        for (Developer eachDeveloper : scrum1.developers) {
            budget +=  eachDeveloper.salary ;
        }

        System.out.println("budget = " + budget);

       // ScrumTeam scrum2 =new ScrumTeam("", "", ""); // add 5 testers & 6 developers
        //ScrumTeam scrum3 =new ScrumTeam("", "", ""); // add 2 testers & 4 developers

        System.out.println("---------------------------------------------------------------------");

        ScrumTeam scrum2 =new ScrumTeam("", "", ""); // add 5 testers & 6 developers

        scrum2.hireTester(  new Tester("Bob", 'M', "SDET", 17, 110000)  );
        scrum2.hireTester(new Tester("Nancy",'M',"QA",17,105000) ) ;
        scrum2.hireTester(new Tester ("Kelly",'M',"QA",18,125000));
        scrum2.hireTester(new Tester("John",'M',"SDET",20,120000));
        scrum2.hireTester(new Tester("Julia",'F',"SDET",21,121000));

        scrum2.hireDeveloper(new Developer("Robert",'M',"Phython Programmer",22,120000));
        scrum2.hireDeveloper(new Developer("Gabriel",'F',"Software Developer",23,125000));
        scrum2.hireDeveloper( new Developer("Leo",'M',"Java Programmer",24,125500));
        scrum2.hireDeveloper( new Developer("Ezra",'F',"Software Developer",25,110000));
        scrum2.hireDeveloper(new Developer("Luke",'M',"Java Programmer",24,124000));

        ScrumTeam scrum3 =new ScrumTeam("", "", ""); // add 2 testers & 4 developers

        scrum3.hireTester( new Tester ( "David",'M',"SDET",25,110000));
        scrum3.hireTester( new Tester ( "Angel",'F',"SDET",26,120000));

        scrum3.hireDeveloper(new Developer("Phoenix",'F',"Software Developer",25,125000));
        scrum3.hireDeveloper( new Developer("Olive",'F',"Java Programmer",26,135500));
        scrum3.hireDeveloper( new Developer("River",'F',"Software Developer",27,110000));
        scrum3.hireDeveloper(new Developer("Adam",'M',"Java Programmer",28,124000));



        ScrumTeam[] scrumTeams ={scrum1, scrum2, scrum3};

        double totalBudget = 0;
        int sumOfTesters = 0;
        int sumOfDevelopers =0;
        double maxSalaryTester = Double.MIN_VALUE;
        double minSalaryTester =Double.MAX_VALUE;
        double maxSalaryDeveloper = Double.MIN_VALUE;
        double minSalaryDeveloper = Double.MAX_VALUE;

        for (ScrumTeam eachScrum : scrumTeams) {
            sumOfTesters += eachScrum.testers.size();
            sumOfDevelopers += eachScrum.developers.size();

            for (Tester tester : eachScrum.testers) {
                totalBudget += tester.salary;
                if (maxSalaryTester < tester.salary){
                    maxSalaryTester = tester.salary;
                }
                if (minSalaryTester > tester.salary){
                    minSalaryTester = tester.salary;
                }
            }
            for (Developer developer : eachScrum.developers) {
                totalBudget += developer.salary;
                if (maxSalaryDeveloper < developer.salary){
                    maxSalaryDeveloper = developer.salary;
                }
                if (minSalaryDeveloper > developer.salary){
                    minSalaryDeveloper = developer.salary;
                }
            }
        }
        System.out.println("Total Budget = $" + totalBudget);
        System.out.println("Total Number Of Developers = " + sumOfDevelopers);
        System.out.println("Total Number Of Testers = " + sumOfTesters);
        System.out.println("Minimum Salary of Developer = $" + minSalaryDeveloper);
        System.out.println("Maximum Salary of Developer = $" + maxSalaryDeveloper);
        System.out.println("Minimum Salary of Tester = $" + minSalaryTester);
        System.out.println("Maximum Salary ofTester = $" + maxSalaryTester);






        /*
        for (ScrumTeam eachScrum : scrumTeams) {
            for (Tester tester : eachScrum.testers) {
            }
            for (Developer developer : eachScrum.developers) {
            }
        }
        1. total budget
        2. total Number of testers in Bank of America
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the tester
        5. what's the max & min salaries of the developers
    */


    }

}
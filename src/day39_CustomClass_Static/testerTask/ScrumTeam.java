package day39_CustomClass_Static.testerTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    ArrayList<Tester>testerList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public void setInfo(String PO, String BA, String SM, ArrayList<Tester> testerList, ArrayList<Developer> devopsList, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testerList = testerList;
        this.devopsList = devopsList;
        this.daysOfSprint = daysOfSprint;
    }

//addTester(Tester tester): adds the given tester to the testers ArrayList
    public void addTester(Tester tester){
        testerList.add(tester);

    }

    //addTesters(Tester[] testers): adds the given testers to the testers ArrayList
    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

    //addDeveloper(Developer developer): adds the given developer to the developers ArrayList
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    //addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }


    //removeTester(long employeeID): removes the given tester from the testers ArrayList
    public void  removeDeveloper(long employeeID){
        devopsList.removeIf(each ->each.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testerList=" + testerList +
                ", devopsList=" + devopsList +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
create a class called ScrumTeam
           Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = new ArrayList<>();
                ArrayList<Developer> devopsList = new ArrayList<>();
               int daysOfSprint;

             Actions:
                  setInfo(): sets the names of PO, BA, SM
                  addTester(Tester tester): adds the given tester to the testers ArrayList

                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
                 removeTester(long employeeID): removes the given tester from the testers ArrayList

                 removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                  toString(): prints number of tester,& developers,  PO name, SM name, BA name

create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */



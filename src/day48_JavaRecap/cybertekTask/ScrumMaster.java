package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public  final class ScrumMaster extends Employee {

    public ScrumMaster(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary) {
        super(name, gender, dOB, employeeID, jobTitle, salary);
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is resolving the issues");
        super.attendMeeting();
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is planning ");

    }
}
/*
 create the following sub classes:
    ScrumMaster
    ProductOwner
    ProjectManager
    BusinessAnalyst
    Mentor
 */
package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public final class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary) {
        super(name, gender, dOB, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attend instructors meetings");

    }



}


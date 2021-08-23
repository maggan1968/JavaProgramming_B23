package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public final class Developer  extends Employee{


    public Developer(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary) {
        super(name, gender, dOB, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending grooming meeting");
    }
}

/*
 2. Developer
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()
 */

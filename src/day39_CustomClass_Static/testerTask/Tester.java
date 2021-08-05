package day39_CustomClass_Static.testerTask;

public class Tester {


    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void smokeTesting(){
        System.out.println(name +"performs smoke testing as a daily activity");
    }

    public void creatingTicket(){
        System.out.println(name + "creates ticket when there is any default in application");
    }

    public void dailyStandUp(){
        System.out.println(name + "joins to daily stand-up meeting everyday");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
create a class called Tester
        Attributes:
            name, employeeID, JobTitle, Salary
        Actions:
           setInfo(), smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */
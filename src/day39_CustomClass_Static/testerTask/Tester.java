package day39_CustomClass_Static.testerTask;

public class Tester {


    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name+ " makes smoke testing every day");
    }
    public void creatingTicket(){

        System.out.println(name + " create ticket for questions");
    }

    public void dailyStandUp(){

        System.out.println(name+ " has daily stand up meeting between 8:00-8:30 every day.");
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

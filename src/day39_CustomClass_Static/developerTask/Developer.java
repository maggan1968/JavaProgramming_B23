package day39_CustomClass_Static.developerTask;

public class Developer {

    public  String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + "writes codes to develop the application");
    }
    public void unitTesting(){
        System.out.println(name + "one of the responsibility is to perform unit testing");
    }
    public void fixingBug() {
        System.out.println(name + " fixes bugs when tester find them");

    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary
          Actions:
            setInfo(), coding(), unitTesting(), fixingBug(), toString()

 */
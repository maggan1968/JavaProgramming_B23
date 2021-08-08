package day39_CustomClass_Static.testerTask;

public class Developer {
    public String name, jobTitle;
    public int employeeID;
    public double Salary;

    public void setInfo(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        Salary = salary;
    }
    public void coding(){
        System.out.println(name+" writing code about games");
    }
    public void unitTesting(){
        System.out.println(name+" does united test");
    }
    public void fixingBug(){
        System.out.println("Developers fix it if there is a bug");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", Salary=" + Salary +
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



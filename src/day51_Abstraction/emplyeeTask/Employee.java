package day51_Abstraction.emplyeeTask;

public abstract class Employee {


    private final String name;
    private final char gender;
    private String jobTitle;
    private double salary;
    private final int id;
    public static boolean hasEyes;

    static {
        hasEyes = true;
    }
//Employee.hasEyes

    public Employee(String name, char gender, String jobTitle, double salary, int id) {
        this.name = name;
        this.gender = gender;
        setJobTitle(jobTitle);
        setSalary(salary);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new RuntimeException("I am not gonna work this place anymore");
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public abstract void work();//abstract method don't have body

    public void sleep() {
        System.out.println("Employee love to sleep");
    }//regular method have body


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", id=" + id +
                '}';
    }
}


/*
Employee: Encapsulation, Inheritance, Abstraction, overriding, class & object, constructors

	Employee:
		name, gender, jobTitle, salary, id
		work();

	Tester extends Employee


	Developer extends Employee


	SM extends Employee

	Teacher extends Employee

	PO extends Employee
 */
package day51_Abstraction.emplyeeTask;

public final class Tester extends Employee {


    public Tester(String name, char gender, String jobTitle, double salary, int id) {
        super(name, gender, jobTitle, salary, id);
    }

    @Override
    public void work() {// abstract method
        System.out.println(getJobTitle() +"is responsible for testing software");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(getJobTitle()+ "never sleep");
    }
}

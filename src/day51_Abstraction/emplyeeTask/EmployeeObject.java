package day51_Abstraction.emplyeeTask;

import day48_JavaRecap.cybertekTask.Developer;

public class EmployeeObject {

    public static void main(String[] args) {
        Tester tester= new Tester( "MArgie",'F', "QA", 120000, 23);
      tester.work();
      tester.sleep();
        System.out.println(tester);
        System.out.println(Employee.hasEyes);
    }
}

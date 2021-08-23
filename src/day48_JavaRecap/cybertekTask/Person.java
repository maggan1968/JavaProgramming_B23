package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public class Person {


    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dOB;

    public Person(String name, char gender, LocalDate dOB) {
        setName(name);
        this.gender = gender;
        this.dOB = dOB;
        age = LocalDate.now().getYear() - this.dOB.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getdOB() {
        return dOB;
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dOB=" + dOB +
                '}';
    }
}
/*

Multilevel inheritance
1. create a class named Person
        variables: name, gender, age, dateOfBirth // instance to have
        methods: eat(), sleep(), drink()

2. create the following sub classes of Person:
            1. Student
                    variables: name, gender, age, dateOfBirth, schoolName, studentId

                    methods: study(), attendClass()

            2. Employee
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()

3. create the following sub classes of Employee
            1. Tester
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()


            2. Developer
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()
 */
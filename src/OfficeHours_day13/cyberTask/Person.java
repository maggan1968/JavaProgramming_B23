package OfficeHours_day13.cyberTask;

import java.time.LocalDate;

public class Person {
    /*
    1. create a class named Person
		        variables: name, gender, age, dateOfBirth
		        methods: eat(), sleep(), drink()

     */


    private String name;
    private final char gender;
    private  final int age;
    private final LocalDate DoB;

    public Person(String name, char gender,  LocalDate doB) {
       setName(name);
        this.gender = gender;
        DoB = doB;
        age=LocalDate.now().getYear()- doB.getYear();

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

    public LocalDate getDoB() {
        return DoB;
    }


}

package day39_CustomClass_Static.studentsTask;

import java.time.LocalDate;

public class Student {

    public String name;
    public  char gender;
    public LocalDate DoB;
    public int age;
    public int studentID;
    public char grade;


    //setInfo(): sets all the attributes of the student object ( use short cut 'Generade')
    public void setInfo(String name, char gender, LocalDate doB, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        DoB = doB;
        this.studentID = studentID;
        this.grade = grade;
        age=LocalDate.now().getYear() - DoB.getYear();
    }

    //toString(): returns the full info of student Object( use short cut 'Generade')
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DoB=" + DoB +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
/*
 1. create a class named Student that has the followings features:
                Attributes:
                    name, gender, dateOfBirth, age, studentID, grade

            Methods:
                setInfo(): sets all the attributes of the student object
                toString(): returns the full info of student Object

        2. Create a classNamed CybertekSchool
                1. create an Array of students that contains 10 Student objects
                2. print the name of the students who have a grade of B or A
                3. create two ArrayLists: femaleStudents, maleStudents
 */
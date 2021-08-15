package day43_OOP_Encapsulation;

import java.time.LocalDate;

public class FinalVariable {

    private  final String gender ;
    private final LocalDate DOB;
    private double salary;

    public FinalVariable(String gender, LocalDate DOB, double salary) {
        this.gender = gender;
        this.DOB = DOB;
        this.salary = salary;
    }



    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        final int a = 100;
        //     a = 200;
        System.out.println(a);





    }

}


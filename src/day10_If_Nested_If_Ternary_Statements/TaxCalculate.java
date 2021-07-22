package day10_If_Nested_If_Ternary_Statements;

public class TaxCalculate {
    public static void main(String[] args) {

       //2. Write a program that can calculate the salary after
        // tax based on the following requirements.
        //                the tax rates are:
        //                        35% for salary of 130K or more
        //                        30% for salary of 100K to 129k
        //                        25% for salary of 80K to 99K
        //                        20% for salary of 79K or less
        //
        //in addition, if the person is married, he/she will pay 5% less tax,
        //


        double salary = 100_000;
        double taxRate = 0;

        if (salary>=130000){  //false: salary <130000
            taxRate=0.35;
        }else if (salary>=100000 && salary<13000) {// false: salary <100000
            taxRate = 0.30;
        }else if (salary>= 80000 && salary<100000) { //false: salary< 80000
            taxRate = 0.25;
        }else { //salary<80000
            taxRate=0.20;
        }
        boolean isMarried = true;// everything is the pandas of if boolean is married or not

        if (isMarried){  //if person is married
            taxRate -= 0.05;// tax rate will be substracted by 5
        }
        double salaryAfterTax=salary-(salary*taxRate);
        System.out.println("salary After Tax = " + salaryAfterTax);
    }
}

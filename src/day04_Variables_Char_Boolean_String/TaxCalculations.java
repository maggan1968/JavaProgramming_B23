package day04_Variables_Char_Boolean_String;

public class TaxCalculations {
    public static void main(String[] args) {


        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;


        double totalStateTax = salary *stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary -totalStateTax -totalFederalTax;




        System.out.println("Your salary is $"+salary);

        //you nee to pay totalStateTax to state tax
        System.out.println("you need to pay $"+ totalStateTax + " to state tax");



        //you nee to pay totalFederalTax to state tax
        System.out.println("you need to pay $"+ totalFederalTax + " to Federal tax");

        // your take home salary is salaryAfterTax
        System.out.println("your take home salary is $" + salaryAfterTax);





        //you need to pay amount to stateTax

    }
}

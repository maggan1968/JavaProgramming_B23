package day03_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 60;
        int weeklyHours = 40;
        int numberofWeeksInYear = 52;


        int salary = hourlyRate * weeklyHours * numberofWeeksInYear;

        System.out.println(salary);


        double taxRate = 0.32;
        double totalTax = salary + taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);





    }
}

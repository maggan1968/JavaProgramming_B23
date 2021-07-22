package day11_Switch;

public class TernaryPractice {
    public static void main(String[] args) {
        /*
        1. Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY

         */
        double salary= 90_000;
        int creditScore= 720;
        String result =(salary >= 60000 && creditScore >= 650)? "LoanApproved": "Loan Denied";


            System.out.println("result=" + result);
        }
    }


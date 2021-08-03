package day38_CustomClass.BankAccountTask;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        account1.setInfo("Christian", 123456789);

        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(999);
        account1.checkBalance();
        account1.withdraw(25);
        account1.checkBalance();
        account1.withdraw(10);
        account1.deposit(100000);
        account1.checkBalance();


        System.out.println("-----------------------------------------------");

        BankAccount account2= new BankAccount();
        account2.setInfo("Ahmad", 789759000);

        account2.deposit(100000);
        account1.checkBalance();
        account2.checkBalance();
    }



}
/*
BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

        requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
 */

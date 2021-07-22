package day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        // income has to be at least 60k
        //at least have 2 years of work history
        // at least have 700 of credit score
        //  at least 18 years old

        // name , age, workHistory, creditScore, income

        String name = "Margie";
        int age = 49;
        int workHistory = 7;
        int creditScore = 760;
        double income = 45000;

        boolean IsEligible = age >= 18 && workHistory >= 2 && creditScore >= 700 && income >= 60000;

        //                    49>= 18   && 7 >= 2          && 760>= 700 &&      45000>= 60000

        //                       true   &&   true         &&   true      &&        false

        //                         false
        /*
        boolean r1= income >= 60000 && workHistory >=2;
        boolean r2 = age >= 18 && creditScore>=700;
        boolean isEligible = r1 && r2;
        /*
         */


        // in order to be eligible for loan age must be at least 18 year old  AND work history at be 2 years
        System.out.println(name +"is eligible for loan:" +IsEligible );






    }
}

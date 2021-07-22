package day07_ShortHand_Relational;

public class FreeShipping {
    public static void main(String[] args) {
        double price = 15; //>25
        boolean isPrimeMember = true;
//or logic task
        boolean isEligibleForFreeShipping = price >= 25 || isPrimeMember == true;
        //                                  15> 25     ||     rue==true
        //                                   false   ||             true
        //                                      true
        System.out.println( "isEligibleForFreeShipping:" + isEligibleForFreeShipping);


    }
}

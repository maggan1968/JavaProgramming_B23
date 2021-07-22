package day07_ShortHand_Relational;

import javax.sound.midi.Soundbank;

public class EligibleToVote {
    public static void main(String[] args) {

        String  name = "Aaron King";

        int age  =34;
         String citizen = "UK";

         boolean eligibleToVote = age>= 18 && citizen =="USA";
         //                        34>=18  &&  "UK" == "USA"
        //                           true  &&     false
        //                            false

        System.out.println(name+" is eligible to vote for Biden:"+ eligibleToVote);


        System.out.println("__----------------------------------");



    }
}
/* to Vote:
1 MUST be US citizen
2. at least 18 years old

 */
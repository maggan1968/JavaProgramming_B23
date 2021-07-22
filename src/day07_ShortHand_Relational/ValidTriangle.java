package day07_ShortHand_Relational;

public class ValidTriangle {
    public static void main(String[] args) {
          /* valid triangle:sum of three angle MUST be 180
        a1, a2, a3,
        (a1 +a2 +a3)  == 180// first get the sum of three angles,
        then compare it with1800

        */
        int angle1 =60;
         int    angle2 = 90;
        int angle3 = 75;

        boolean isValid =(angle1+angle2+angle3) == 180;
        System.out.println( "isValid" + isValid);

    }
}

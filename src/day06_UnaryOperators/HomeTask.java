package day06_UnaryOperators;

public class HomeTask {
    public static void main(String[] args) {
        int a = 50;//49/  49/   49/   49
               a = --a  + a++ + a-- + a++;
                // 49 +    50 + 50    +50= 197
        //a=197

        System.out.println(a);

        System.out.println("--------------------------------------");

        int x = 4;//5
        int y = x * 4 - x++;
        // 4*4-4= 12
        System.out.println(x);

        System.out.println("--------------------------------");
        int b = 25; //25+1=26-1=25-1=24+1=25
                   b = ++b    +    b--     +    --b +  ++b;
                    //26    +      26      +     24  +  25
        //          52+24+25
        //          76+25
        //          101
        System.out.println(b);
    }
}

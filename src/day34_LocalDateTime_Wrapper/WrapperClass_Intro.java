package day34_LocalDateTime_Wrapper;

public class WrapperClass_Intro {

    public static void main(String[] args) {
        short s=10;
        int num = s;

        Integer num2 = (int)s; //Autoboxing: converting primitive value to wrapper class value

        char ch ='@';
        Character ch2 = (Character) ch; //Autoboxing: converting primitive value to wrapper class value


        Byte b1 = 10;
        byte b2 =b1;// Unboxing
        short b3 = b1;// Unboxing
        int b4 = b1;// Unboxing
        long b5 = b1;// Unboxing
        float b6 = b1;// Unboxing
        double b7 =b1;// Unboxing


        System.out.println("------------------------------------");

        byte c1 = 10;
        Byte c2= c1;// Autoboxing,
       // Short c3 = c1;// Short wrapper class only accepts it's own primitive (short)
       // Integer c4 =c1;//Integer wrapper class only accepts it's own primitive (int)

    }
}

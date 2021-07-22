package day15_String;



public class String_Intro {
    public static void main(String[] args) {


        String str1 = "Cybertek";// Literal
        String str2 = new String("Cybertek");//new keyword


        System.out.println("------------------------------");


        String s1= "cat";
        String s2= "Cat";
        String s3= "cat";// "cat", "Cat"

        System.out.println(s1==s2);// false
        System.out.println(s1==s3);//true

        System.out.println("------------------------------");


        String s4= new String("Dog");
        String s5= new String("Dog");
        String s6 =new String("Dog");
        String  s7 = s4;

        System.out.println(s4==s5);// false
        System.out.println(s5==s6);// false
        System.out.println(s7==s4);// true

        System.out.println();
    }
}

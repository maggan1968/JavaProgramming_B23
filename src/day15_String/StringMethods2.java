package day15_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence= "Java Programming Language";
        //index:          0123
        String name = sentence.substring(0, 3+1);

        System.out.println(name);


        System.out.println("________________________________-");

        String s2 = "Cybertek School";
        //              01234567
        String name2= s2.substring(0, 7+1);//0,8

        System.out.println(name2);


        String name3 = s2.substring(9,14+1);//9,15
        System.out.println(name3);

        System.out.println("________________________");

        String sentence2 = "Java is a programming language";
        //index:                      10        20
        String name4 =sentence2.substring(10);
        System.out.println(name4);
        String  name5 = sentence2.substring(10,20+1);
        System.out.println(name5);


        System.out.println("-------------------------------");

        String sentence3 = "Python is an easy Language";
        sentence3 = sentence3.replace("Python", "Java");//"Java is an easy language"

        System.out.println(sentence3);


        String sentence4 = "C# is a programming language, I like learning C#, C#  the best";
        sentence4 = sentence4.replace("C#","Java");

        System.out.println(sentence4);


        String sentence5 = "Dog is friendly, Dog is Loyal, I love Dogs";
        sentence5 = sentence5. replace("Dog", "Cat");

        System.out.println(sentence5);


        String str = "Batch 23";

        //index:      01234567
     //   char ch1 = str.charAt(200); //its also cant be negative -1
       // System.out.println("ch1= " + ch1);

        System.out.println(str.length());

        str = str.toUpperCase();

        System.out.println(str);

        str = str.toLowerCase();

        System.out.println(str);

        String str2 = "Cyrbotek is a great school";
        //                0=
        String s4 = str2.substring(1400,1900);
        System.out.println(s4);





    }

}

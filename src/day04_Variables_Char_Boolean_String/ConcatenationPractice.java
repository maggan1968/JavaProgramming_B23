package day04_Variables_Char_Boolean_String;

public class ConcatenationPractice {
    public static void main(String[] args) {

        /*
        +: addition: when we have two number
        10 + 10 = 20
         concatenation:
         "10" + " 10 " = "1010"
         1 ++ "10" = "110"
         "2"+ 3 = 23
         */
        String word = "Java";

        System.out.println("My favorite language is " + word +" programming language");

        System.out.println("-----------------------------");
        int dollar = 10000;
        double lira = dollar * 8.41;
        double euro = dollar * 0.88;

        System.out.println(dollar +" US dollars equal to " + lira + "Turkish liras");
        System.out.println(dollar +" US dollars equal to " + euro + "euros");

        System.out.println("-----------------------");

        int a = 10;
        int b = 20;
        int addition = a + b;
        int substraction = a-b;
        int multiplication =a*b;


         // 10 + 20= 30
        System.out.println( a + " + " + b + " = " + addition);


        //10 - 20 = -10
        System.out.println(a + " - " + b +" = " + substraction);

       // 10*20 =200
        System.out.println(a + " * " + b +" = " + multiplication);

        System.out.println("---------------------");
        String name =  "Margie";
        String favoriteMusic = "rock Music";
        String favoriteBook = "How to win friends";
        String favoriteSeries = "The walking dead";

        System.out.println("\tHello my name is " + name + ", my favorite music is \"" + favoriteMusic +"\", my favorite book title is \"" + favoriteBook + "\",my favorite TV series is \"" +favoriteSeries +"\"" );

        System.out.println("---------------------");
        String today = "Monday";
        String  todayClass= "Java";
        String tomorrow = " Tuesday";
        String tomorrowClass = "Selenium";

        System.out.println( "Today is " + today + ", today we have " + todayClass + " class.");
        System.out.println( " Tomorrow is " +  tomorrow + ", tomorrow we will have" + tomorrowClass + " class.");



    }
}

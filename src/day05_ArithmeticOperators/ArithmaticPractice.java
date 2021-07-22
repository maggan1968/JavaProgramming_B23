package day05_ArithmeticOperators;

public class ArithmaticPractice {
    public static void main(String[] args) {
        int number = 7;

        boolean isEvenlyDivisibly3 = number%3 == 0; // ==:equal operator
                                                    //1 ==0 ==> false
        boolean isEvenlyDivisibly5 = number%5 == 0; // if the remainder of number /5 is zero, then its even
        System.out.println(number+ " is evenly divisble by 3:"+isEvenlyDivisibly3);
        System.out.println(number+ " is evenly divisble by 5:"+isEvenlyDivisibly3);
        System.out.println("-----------------------------");


    }
}

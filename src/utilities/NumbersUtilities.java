package utilities;

public class NumbersUtilities {


    // check if number is prime Number or not
    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }


    //isOdd
    //method that can print ODD numbers between two numbers
    public static String isOdd(int num1, int num2) {
        String result = "";
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                result += i + " ";
            }
        }
        return result;


        //isEven

        //addition

        //subtraction

        //max

        // min

        //cube...

    }


    // isEven
    //method that can print all EVEN numbers between two numbers
    public static String isEven(int num1, int num2) {
        String result = "";
        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0) {
                result += i + " ";
            }
        }

        return result;
    }




}




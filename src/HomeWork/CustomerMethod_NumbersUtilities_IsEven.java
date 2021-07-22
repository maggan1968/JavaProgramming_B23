package HomeWork;

public class CustomerMethod_NumbersUtilities_IsEven {
    public static void main(String[] args) {
        String result2 = isEven(20, 100);
        //user should provide two numbers and it will print all EVEN numbers between those two numbers
        //including these two numbers also
        System.out.println(result2);//even numbers
    }

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

package Self_Packege;

public class ReplitTest_OddOrEven {
    public static void main(String[] args) {

        //Using conditional statements, check if number is odd or even.
        // Please follow the below examples and print message accordingly:

        //Enter a number:10 //10 is even


        //Enter a number:33 //33 is odd

        //Enter a number: 0 //0 is even

        int number=10;
        boolean even = number% 2 == 0;
        boolean odd = !even;
        if(even){
            System.out.println(number+" is even");
        }
        if(odd){
            System.out.println(number+" is odd");
        }










    }
}



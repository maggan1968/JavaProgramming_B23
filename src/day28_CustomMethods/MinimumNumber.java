package day28_CustomMethods;

public class MinimumNumber {
    public static void main(String[] args) {

    }
    public static void minNumber(int[]numbers){
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
    }


}
/*
12. write a method that can print out the minimum number from any array of integers
 */


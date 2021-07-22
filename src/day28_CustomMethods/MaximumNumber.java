package day28_CustomMethods;

public class MaximumNumber {
    public static void main(String[] args) {
    }
        public static void maxNumber(int[]numbers){
            int max=0;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            System.out.println(max);
        }
    }

/*
11. write a method that can print out the maximum number from any array of integers
 */
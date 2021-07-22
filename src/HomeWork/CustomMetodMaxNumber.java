package HomeWork;

public class CustomMetodMaxNumber {
    public static void main(String[] args) {

        int [] number={10,20,30,50,80};
        System.out.println(maxNumber(number));

    }

   // 1.create a function that can return the maximum number from an array of integer
   //max(new int[{10,20,30})==>30
   public static int maxNumber(int [] numbers){
       //int[] numbers = {10,5,4,400,5,0,-1};

       int max = numbers[0];

       for (int i = 0; i <=numbers.length-1 ; i++) {
           if (numbers[i]>max){
               max=numbers[i];
           }
       }
       return max;

   }
}


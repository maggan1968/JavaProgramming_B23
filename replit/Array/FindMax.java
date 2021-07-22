package Array;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
       int[]numbers={6,4,3,2};
      int max =numbers[0];// 6
        for (int i = 0; i <=numbers.length-4 ; i++) {

            System.out.println("max = " + max);


        }
    }
}

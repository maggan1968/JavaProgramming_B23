package Practice_For_Interview;

import java.util.Scanner;

public class SixSprings_SavedIntoAnArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for(int i =0; i < arr.length-2;i++){
            System.out.println(arr[i]+ ", "+arr[i+1]+", "+arr[i+2]);
        }

    }
}










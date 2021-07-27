package ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TimesTwo {

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        int[]array= new int[nums.size()];
        for(int i=0; i< nums.size();i++){
            array[i]=nums.get(i).intValue()*2;

        }
        ArrayList<Integer> list = new ArrayList<Integer>(array.length);
        for(int i= 0; i<array.length; i++)
            list.add(Integer.valueOf(array[i]));
        return list;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));



    }

}
/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */


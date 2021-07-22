package OfficeHours_7_Array_Quiz_MethodsIntro;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {


        int[] myArray = new int[3];
        myArray[0]=4;
        // System.out.println("Arrays.toString(myArray) = " + Arrays.toString(myArray));

        int[] anotherOne=myArray;
        anotherOne[0]=9;
        System.out.println("Arrays.toString(anotherOne) = " + Arrays.toString(anotherOne));
        System.out.println("Arrays.toString(myArray) = " + Arrays.toString(myArray));

        System.out.println("Arrays.toString(my Array) = " + Arrays.toString(myArray));


    }
}

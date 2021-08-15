package OfficeHours_day6.HomeWork;

import java.util.Arrays;

public class CustomMethod_Merge {
    /*
    4. create a return method named merge that can merger two arrays of integers
     */
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 40};
        int[] b = {7, 8};
        System.out.println(Arrays.toString(mergeToArrays(a, b)));
    }




    public static int [] mergeToArrays(int [] a , int []b){
        int [] newArray =new int[a.length+b.length];
        int count = 0;

        for (int i = 0; i <=a.length-1 ; i++) {
            newArray[count++]=a[i];
        }

        for (int i = 0; i <=b.length-1 ; i++) {
            newArray[count++]=b[i];
        }
        return newArray;
    }
}
/*
 public static void mergeTwoArrays(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        System.out.println(Arrays.toString(arr3));

    }
 */

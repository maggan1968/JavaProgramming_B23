package HomeWork;

import java.util.Arrays;

public class CustomMethod_AddElements {
    public static void main(String[] args) {
       // array = {1,2,3,4,5}
       // element = 6;

        //addElements(array, element) ==> {1,2,3,4,5,6}

        int[]a={1,2,3,40};

        System.out.println(Arrays.toString(addIntegerToArray(a,2)));
    }

    public static int [] addIntegerToArray(int [] a, int b){
        int [] newArray =new int [a.length+1];

        for (int i = 0; i <newArray.length-1; i++) {
            newArray[i]= a[i];
        }
        newArray[newArray.length-1]=b;
        return newArray;

    }
    public static boolean  contain(int [] a, int b){

        for (int i = 0; i <=a.length-1 ; i++) {
            if (a[i]==b){
                return true;
            }
        }

        return false;
    }

}
/*3.  write a return method named addElement that can add an Inteeger
 after the  last index of an integer array
        array = {1,2,3,4,5}
        element = 6;

        addElements(array, element) ==> {1,2,3,4,5,6}
        */

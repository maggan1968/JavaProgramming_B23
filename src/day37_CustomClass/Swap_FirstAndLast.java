package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap_FirstAndLast {
    public static void main(String[] args) {

            ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

            System.out.println(swapFirstAndLast(list));


        }

        public static ArrayList<Integer>swapFirstAndLast(ArrayList<Integer>array){
            Collections.swap(array,0,array.size()-1);
            Collections.swap(array,0,5);
            return array;


        }
    }



package OfficeHours_day6.HomeWork;

import java.util.Arrays;

public class CustomMethod_Overloading {

    /*
1. create  a method named remove that accepts oen int array and one int (index).

		array = {10, 20, 30, 40}
		index = 2;

		remove(array, index) ==> {10,20,40}

2. create  a method named remove that accepts oen double array and one int (index).

2. create  a method named remove that accepts oen String array and one int (index).

2. create  a method named remove that accepts oen char array and one int (index).



 */

        public static void main(String[] args) {
            int[]array={1,2,3,4,5};
            int index=4;
            System.out.println(Arrays.toString(removeElement(array,index)));

            double[]array2={1.0,2.0,3.0,4.0,5.0};
            int indexNum=2;
            System.out.println(Arrays.toString(removeElement(array2,indexNum)));

            String[]array3={"Meltem","Tugba","Ayan"};
            int indexNum2=2;

            System.out.println(Arrays.toString(removeElement(array3,indexNum2)));

            char[]array4={'T','A','M','D','A'};
            int indexNum3=1;

            System.out.println(Arrays.toString(removeElement(array4,indexNum3)));

        }

        public static int[] removeElement(int[]array,int indexNum){
            int[] array2= new int[array.length-1];
            for(int i=0, k=0 ;i< array.length;i++){
                if(i==indexNum){
                    continue;
                }
                array2[k++]=array[i];
            }
            return array2;
        }

        public static double[] removeElement(double[]array,int indexNum){
            double[] array2= new double[array.length-1];
            for(int i=0, k=0 ;i< array.length;i++){
                if(i==indexNum){
                    continue;
                }
                array2[k++]=array[i];
            }
            return array2;
        }

        public static char[] removeElement(char[]array,int indexNum){
            char[] array2= new char[array.length-1];
            for(int i=0, k=0 ;i< array.length;i++){
                if(i==indexNum){
                    continue;
                }
                array2[k++]=array[i];
            }
            return array2;
        }

        public static String[] removeElement(String[]array,int indexNum){
            String[] array2= new String[array.length-1];
            for(int i=0, k=0 ;i< array.length;i++){
                if(i==indexNum){
                    continue;
                }
                array2[k++]=array[i];
            }
            return array2;
        }

    }


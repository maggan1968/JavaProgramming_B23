package day35_ArrayList;



import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Intro {
    public static void main(String[] args) {

// .add method

        int[] nums = new int[10];// array can  have 10 items, size is fixed, not more
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[2]);
        System.out.println("--------------------------------");


       // .get method
        ArrayList<Integer> numbers = new ArrayList<>(); // size is 0
        numbers.add(10);//autoboxing, index 0
        numbers.add(20);//autoboxing, index 1
        numbers.add(30);//autoboxing, index 2
        numbers.add(40);//autoboxing, index 3
        numbers.add(3,15);

        System.out.println(numbers);
        System.out.println(numbers.get(2));

        //.size method

        System.out.println(numbers.size());//5 elements

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }

        for (int each  :numbers  ) {
            System.out.println(each);

        }

        }
    }


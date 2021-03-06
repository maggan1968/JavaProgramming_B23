package ArrayList_Methods;

import java.util.ArrayList;
import java.util.Scanner;


public class RepeatAll {

        public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){
            ArrayList<Boolean> list2 = new ArrayList<>();
            list2.addAll(list);
            list2.addAll(list);

            return list2;

        }
        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Boolean> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextBoolean());
            }

            System.out.println(repeatAll(list));

        }
}
/*
Create a static method that:

is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its
 ArrayList values.

For example, if the parameter is

(true, false, false)
(true, false, false)
The modified ArrayList should be

(true, false, false, true, false, false)
 */
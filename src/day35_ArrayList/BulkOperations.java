package day35_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        // add.All method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        list.addAll(Arrays.asList(10, 11, 12, 13, 14, 15));

        System.out.println(list);


        System.out.println("-----------------------------------");


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Margie", " Muhtar", "Ali", "Nader"));

        System.out.println(students);


        System.out.println("-------------------------------------");


//remove method ( three names)
        ArrayList<String> students2 = new ArrayList<>();

        students2.addAll(Arrays.asList("Dilem", "Margie", " Muhtar", "Ali", "Nader"));
        students2.removeAll(Arrays.asList("Dilem", "Margie", " Muhtar"));
        System.out.println(students2);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 1, 1));
        System.out.println(nums);

        nums.removeAll(Arrays.asList(1));
        System.out.println(nums);

        System.out.println("--------------------------");

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 1, 1));
        System.out.println(nums);

        nums.retainAll(Arrays.asList(1,2));   // removes all the elements the are not matching with 1 or 2
       System.out.println(nums);

        System.out.println("----------------------------");

        ArrayList<String>employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Dilem", "Margie", " Muhtar", "Ali", "Nader","Wojtek"));

        System.out.println(employees);
        //employees.removeAll(Arrays.asList("Dilem", "Margie"));
        employees.retainAll(Arrays.asList("Margie", " Muhtar")) ;
        System.out.println(employees);

        System.out.println("-----------------------");

        // contain () method

        ArrayList<String>groceryList= new ArrayList<>() ;
        groceryList.addAll(Arrays.asList("Soda","Milk","Wine", "Beer","Bread", "Water"));
        // check is soda, wine beer all of the are contained in groceryList
        boolean r = groceryList.containsAll(Arrays.asList("Soda","Milk","Wine","Coffe"));
        System.out.println(r);

        // coffe in the list give us  false result
    }
}

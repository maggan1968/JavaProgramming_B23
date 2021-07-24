package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        //set() method -replaces the item from list, index nr has to be apply

        ArrayList<String>groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Viniger");
        groceryList.add("Bread");

        System.out.println(groceryList);

        groceryList.set(0, "Toilet Paper");
        groceryList.set(4, "Sada");
        System.out.println(groceryList);

        boolean hasToiletPaper = groceryList.contains("Toilet Paper");




        System.out.println("------------------------------------");

        //remove(index): will remove object at the given index 1, accepts int

        groceryList.remove(1);

        // remove(object):
        boolean r1= groceryList.remove("Water");

        System.out.println(groceryList);
        System.out.println("r1 = " + r1);

        boolean r2= groceryList.remove("Face Masks");

        System.out.println(groceryList);
        System.out.println("r2 = " + r2);


        System.out.println("--------------------------------");

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

      //  Integer a=30;
       // list1.remove(a);

        list1.remove((Integer)30);//casting

        System.out.println(list1);


        groceryList.clear();
        System.out.println("groceryList = " + groceryList);
      list1.clear();
        System.out.println("list1 = " + list1);


        System.out.println("------------------------------------------");

        ArrayList<Character>list= new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);
        
        list.indexOf('B');//index 3
        list.lastIndexOf('B'); //index3
        
        ArrayList<Character>uniqueChar = new ArrayList<>();
        
        for( Character each : list){
            if(list.indexOf(each)==list.lastIndexOf(each)){
                uniqueChar.add(each);
            }
        }
        System.out.println("uniqueChar = " + uniqueChar);

        System.out.println("----------------------------------");

        ArrayList<Character>characters= new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);
        ArrayList<Character>result = new ArrayList<>(); //[A,B,C]

        for (Character each: characters) {
            if(!result.contains(each)){
                result.add(each);
            }
        }
       System.out.println("result = " + result);


        System.out.println("-------------------------------");
        
        ArrayList<Integer>nums= new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        ArrayList<Integer>result2 = new ArrayList<>();
        
        for (int i = nums.size()-1; i >=0 ; i--) {
           result2.add( nums.get(i)); //400,300,200,100
            
        }
        System.out.println("result2 = " + result2);


        System.out.println("-----------------------------");


        // equals() method
        ArrayList<Integer>n1= new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer>n2= new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));

    }
}


    


package OfficeHours_day6.HomeWork;

public class CustomMethodMinNumber {
    public static void main(String[] args) {
        int [] number ={45,98,2145,45};
        System.out.println(minNumber(number));
    }


    public static int minNumber(int [] number){
        int min = number[0];

        for (int i = 0; i <=number.length-1 ; i++) {
            if (number[i]<min){
                min=number[i];
            }
        }
        return min;


    }

}
//// 2.create a function that can return the minimum number from an array of integer
//    //min(new int[{10,20,30,50,80})==>10
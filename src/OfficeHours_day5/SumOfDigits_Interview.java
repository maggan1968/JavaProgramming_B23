package OfficeHours_day5;

public class SumOfDigits_Interview {
    public static void main(String[] args) {


       int num=1234; //1+2+3+4+5=15


        /*
1234 % 10 = 4   1234 / 10 = 123
123% 10 = 3    123/10 = 12
12 % 10 = 2    12/10 = 1
1 % 10 = 1      1/10 = 0

 */
       int sum=0;

       while(num>0){

           //sum=sum+(num%10);
           sum+=(num%10);

           //num=num/10;
           num/=10;
           System.out.println(sum);
       }
    }
}
/*
 Write a program that can return the sum of digits of an integer
				          (Do not use any string manipulations	)

input 123 result 6
 */
/*
1234 % 10 = 4   1234 / 10 = 123
123% 10 = 3    123/10 = 12
12 % 10 = 2    12/10 = 1
1 % 10 = 1      1/10 = 0

 */
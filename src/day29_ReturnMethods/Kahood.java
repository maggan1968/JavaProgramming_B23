package day29_ReturnMethods;

public class Kahood {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C'};
// if condision will  place  here it will be AC
        for (char each : chars) {//A,B,C
            System.out.println(each);//A

            if (each == 'B') {
                continue;
            }
        }
    }}


package Self_Packege;

public class Task3_day8_logicalOperators {
    public static void main(String[] args) {
        //1.Create a double variable with the value20.
        // 2.Create a second variable of type double with the value80.
        // 3.Add both numbers up and multiply by25.
        // 4.Use the remainder operator to figure out the remainder from the sum of #3 divided  by40.
        // 5.Print remaining total (#4) is equal to 20 or less :true/false

        double a = 20;
        double b =80;
        double c = (a+b)*25%40;
        boolean d = c <=20;
        System.out.println(d); //true


        }

    }


package day09_IfStatement.day09_IfStatement;

public class DaysInMonth {
    public static void main(String[] args) {


        //3. write a program that can find the number of days in a month (Assume that Feb has 28 days)
        //            Ex:
        //                month = 2
        //
        //            output:
        //                    28 days
        //
        //        Hints: you will need single if statements for:
        //              28 days: 2
        //              30 days: 4, 6, 9, 11
        //              31 days: 1, 3, 5, 7,8,10, 12


        int month = 2;
        boolean has28Days = month==2;// februari
        boolean has30Days = month==4 || month==6 || month==9 || month==11;
        //  april, june, september, november
        boolean has31Days = !has28Days && has30Days;
        //boolean has31Days = month==1 || month==3 || month==5
        // || month==7 || month ==8 || month==10 || month==12 ;

        if(has28Days){
            System.out.println("28 Days");
        }
        if(has30Days){
            System.out.println("30 Days");
        }
        if(has31Days){
            System.out.println("31 Days");
        }




        }



    }


package day10_If_Nested_If_Ternary_Statements;

public class DaysInWeek_Ternary {
    public static void main(String[] args) {

        int number = 1;//1~7
        String name = "";

        if (number>=1  &&  number<=7){  // precondition statement

            name= (number==1)? "Monday" :(number==2)?"Tusday ":(number==3)? "wendsday":(number==4)?
                    "Thursday":(number==5)? "Friday" : (number==6)? "saturday": "Sunday";
            
            System.out.println("name=" +name);
        }
}}

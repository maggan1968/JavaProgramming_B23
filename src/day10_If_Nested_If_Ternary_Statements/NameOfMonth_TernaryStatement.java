package day10_If_Nested_If_Ternary_Statements;

public class NameOfMonth_TernaryStatement {
    public static void main(String[] args) {

        int number = 4;//1~12
        String name = "";

        if (number >= 1 && number <= 12) { //precondition statement

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" :
                    (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "Jun" :
                            (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep":
                                    (number==10)?"Oct": (number==11)?"Nov":"Dec";
            System.out.println(" name =" + name);


        }
    }}

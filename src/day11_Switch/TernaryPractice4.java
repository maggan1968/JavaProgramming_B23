package day11_Switch;

public class TernaryPractice4 {
    public static void main(String[] args) {


        int number = 12;
        String name = "";

        if (number >= 1 && number <= 12) {//precondition

            name = (number == 1) ? "Jan" : (number == 2) ? " Feb" : (number == 3) ? "Mar" :
                    (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" :
                            (number == 7) ? "Jul": (number == 8) ? "Aug" : (number == 9) ? "Sep" :
                                    (number == 10) ? "Oct" : (number == 11) ? "Nov":"Dec";// ternary
            //11? and 11:

        } else {
            name = "Invalid";

            System.out.println("number="+ number);
        }
    }
}

package day10_If_Nested_If_Ternary_Statements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85; //0~100
        String grade = "";//  A,B,C,D,F
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "C";

            } else if (score >= 70) {
                grade = "D";
            } else if (score >= 60) {
            } else {
                grade = "F";
            }
        } else {// opposite of pre condition: if the score is invalid
            grade = "invalid";
        }
        System.out.println("grade="+grade);
    }
}


/*
*
A; 90-100
B: 80-89
C; 70-79
D: 60-69
F: <60
 */

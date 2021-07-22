package day08_ifStatements_LogicalOperators_SingleIfStatement;

public class SingleIfStatementIntro1 {
    public static void main(String[] args) {

        int score =95;
        boolean passed = score>= 60;

        if (passed) { // if student passed the exam
            System.out.println(" congrats you passed the exam");
        }
        if (!passed){  //if student failed the exam
            System.out.println(" You faild the exam");
        }
    }
}

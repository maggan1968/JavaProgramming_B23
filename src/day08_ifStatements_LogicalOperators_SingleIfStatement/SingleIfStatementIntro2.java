package day08_ifStatements_LogicalOperators_SingleIfStatement;

public class SingleIfStatementIntro2 {
    public static void main(String[] args) {

        String name ="muhtar";
        int score =60;
        boolean passed = score>= 60;

        if (passed) { // if student passed the exam
            System.out.println(" congrats " +name+ " you passed the exam");
        }
        if (!passed){  //if student failed the exam
            System.out.println(" You faild the exam");
        }
    }
}

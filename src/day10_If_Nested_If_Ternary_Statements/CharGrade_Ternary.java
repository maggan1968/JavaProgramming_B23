package day10_If_Nested_If_Ternary_Statements;

public class CharGrade_Ternary {
    public static void main(String[] args) {
int score=75;
        char grade= (score>=90)? 'A':(score>=80)?'B':(score>70)?'C':(score>60)?'D':'F';
        System.out.println(grade);
    }
}

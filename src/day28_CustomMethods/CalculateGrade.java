package day28_CustomMethods;

public class CalculateGrade {
    public static void main(String[] args) {
        calculateGrades(70);
    }

    public static void calculateGrades(int score) {
    /*
    6. calculate the grade of the student based on the score
     */
        String grade;

        if(score> 100 || score< 0){//if the score i invalid
            System.out.println("Invalid");
            return;// exit the method

        }



        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            grade = "Invalid";
            System.out.println("This grade is invalid");
        }
        System.out.println("Your grade is: " + grade);
    }
}




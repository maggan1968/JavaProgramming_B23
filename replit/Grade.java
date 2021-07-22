public class Grade {
    public static void main(String[] args) {
        int score = 93;
        String grade = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "excellent";
            } else if (score >= 70) {
                grade = "good";
            } else if (score >= 60) {
                grade = "pass";
            } else {
                grade = "fail";
            }
        } else {
            grade = "invalid score";
        }
        System.out.println(grade);
    }
}



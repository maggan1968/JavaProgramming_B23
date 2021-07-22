package day12_Scanner;

public class CharGradePractice {
    public static void main(String[] args) {

        /*
        3. a char variable named grade is given. use switch statement to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid
         */
        char grade = 'A';
        String result = "";

        switch (grade){

        case 'A':
        result = grade + ": excellent";
        break;  //if we don't putting break Output will be invalid

        case 'B':
        result = grade + ": great job";
        break;

        case 'C':
        result = grade + ": good";
        break;

        case 'D':
        result = grade + ": passed";
        break;
        case 'F':
        result = grade + ": failed";
        break;

        default:
        result = "Invalid";
        break;
    }
        System.out.println("result=" + result);
}}







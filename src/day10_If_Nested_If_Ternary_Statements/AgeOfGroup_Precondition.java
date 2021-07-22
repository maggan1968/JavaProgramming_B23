package day10_If_Nested_If_Ternary_Statements;

public class AgeOfGroup_Precondition {
    public static void main(String[] args) {
        int age = 0;
        String nameOfGroup = "";

        if (age > 0 && age < 135) {
            if (age >= 85) {
                nameOfGroup = "Old Senior Citizen";
            } else if (age >= 75) {
                nameOfGroup = "Senior Citizen";
            } else if (age >= 65) {
                nameOfGroup = "Young Senior Citizen";
            } else if (age >= 55) {
                nameOfGroup = "Very Young Senior Citizen";
            } else if (age >= 50) {
                nameOfGroup = "Middle=aged Adult";
            } else if (age >= 40) {
                nameOfGroup = "Young Middle-Aged Adult";
            } else if (age >= 21) {
                nameOfGroup = "Adult";
            } else if (age >= 18) {
                nameOfGroup = "Young Adult";
            } else if (age >= 13) {
                nameOfGroup = "Teenager";
            } else if (age >= 10) {
                nameOfGroup = "Pre-Teen";
            } else if (age >= 6) {
                nameOfGroup = "Kid";
            } else if (age >= 3) {
                nameOfGroup = "Toddler";
            } else {
                nameOfGroup = "infant";
            }
        } else {
            nameOfGroup = "Sorry, no such an age";
        }
        System.out.println(nameOfGroup);
    }
}




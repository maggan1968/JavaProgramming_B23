package day11_Switch;

public class AgeGroups_Nested_Practice {
    public static void main(String[] args) {

/*
5. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

                  NOTE: MUST APPLY NESTED IF

 */
        int age = 34;
        String result = "";

        if (age >= 0 && age < 150) {
            if (age < 21) {
                result = "teenager";
            } else if (age >= 21 && age < 55) {
                result = "adult";
            } else {
                result = "senior";
            }
        } else {
            result = "invalid";
        }
        System.out.println(result);

    }
}




package day10_If_Nested_If_Ternary_Statements;

public class FieldTrip_PreCondition {

    public static void main(String[] args) {

        int grade = 6;
        String location= " "; //unknown/no data
        String numberOfGroups = " ";
        String teacherInCharge = " "; // unknown/no data

        if (grade>=1 && grade <=6) {   // if grade number is valid

            if (grade == 1) {
                grade = 1;
                location = "Apple orchard";
                numberOfGroups = "3";
                teacherInCharge = "Mr.Smith";
            } else if (grade == 2) {
                grade = grade;
                location = "Zoo";
                numberOfGroups = "7";
                teacherInCharge = "Mr. Lee";
            } else if (grade == 3) {
                grade = grade;
                location = "Aquarium";
                numberOfGroups = "5";
                teacherInCharge = "Ms. Wilson";
            } else if (grade == 4) {
                grade = grade;
                location = "Movie Theater";
                numberOfGroups = "5";
                teacherInCharge = "Ms.Reyes";
            } else if (grade == 5) {
                grade = grade;
                location = "Museum";
                numberOfGroups = "5";
                teacherInCharge = "Mr.Lela";
            } else { // grade == 6
                grade = grade;
                location = "Six Flags";
                numberOfGroups = "8";
                teacherInCharge = "Mr.Watt";

            }
        }else { grade=grade;//if grade number is invalid
            location="No Data";
            numberOfGroups= "No Data";
            teacherInCharge= "No Data";

            System.out.println("grade= "+grade);
            System.out.println("numberOfGroups=" +numberOfGroups);
            System.out.println("teacherInCharge= "+teacherInCharge);
            System.out.println("location= "+location);
             }
        System.out.println("grade = " + grade + "\nlocation = " + location+
                "\nnumberOfGroups = " + numberOfGroups+ "\nteacherInCharge = " + teacherInCharge);
    }
}
/*
Your school goes on a Field trip each year. The place you go will be based on your grade.
Given some grade number (1-6) figure out the details of your field trip.
Print the information at the end.

                Data based on grade:

                    grade - 1
                    location -  Apple orchard
                    number of groups - 3
                    teacher in charge - Ms. Smith

                    grade - 2
                    location - Zoo
                    number of groups - 7
                    teacher in charge - Mr. Lee

                    grade - 3
                    location - Aquarium
                    number of groups - 5
                    teacher in charge - Ms. Wilson

                    grade - 4
                    location - Movie theater
                    number of groups - 2
                    teacher in charge - Ms. Reyes

                    grade - 5
                    location - Museum
                    number of groups - 5
                    teacher in charge - Ms. Lela

                    grade - 6
                    location - Six Flags
                    number of groups - 8
                    teacher in charge - Mr. Watt
 */
public class FildTrip_IfStatement {
    public static void main(String[] args) {
        int age=5;
        String category="";
        if (age >= 2 && age <= 18) {

            if (age == 2) {
                category = "toddler";
            } else if (age <= 5) {
                category = "early childhood";
            } else if (age <= 7) {
                category = "young reader";
            } else if (age <= 10) {
                category = "elementary";
            } else if (age <= 12) {
                category = "middle";
            } else if (age <= 13) {
                category = "impossible";
            } else if (age <= 16) {
                category = "high school";
            } else {
                category = "scholar";
            }
        } else {
            category = "ineligible";
        }
        System.out.println(category);
    }
}



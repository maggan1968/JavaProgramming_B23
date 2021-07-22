package day10_If_Nested_If_Ternary_Statements;

public class CampusTime_PreCondition {
    public static void main(String[] args) {

        int campusTime = 11;
        String Time = "";

        if (campusTime >= 1 && campusTime <= 24){
            if(campusTime >= 8 && campusTime <=23 ){
                Time = "open";
            }else{
                Time = "clos";
            }
        }else{
            Time = "Invalid Time";
        }
        System.out.println("Time = " + Time);
    }
}
    /*
     Campus time: User enters a time(hour in 24 hour format) and will be able
      to find out if the campus is open or not
            Campus is open from 8 am(8) to 11 pm (23)
            If user enters a time within the open time they
      should see message : “open” but if the time entered is outside of
      operating hours they should see: “ closed”
            If the user enters an invalid hour (negative number
      or more than 24 hours) they should see an error message: “invalid time”
     */


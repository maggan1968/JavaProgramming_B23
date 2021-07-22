package day10_If_Nested_If_Ternary_Statements;

public class NameOfMonth_PreCondition2 {
    public static void main(String[] args) {
        //ConvertNumberToWord: 0~9
        int number = 13;
        String month = "";

        if(number >= 1 && number <= 12){

            if(number == 1){
                month = "jan";
            }else if(number == 2){
                month = "feb";
            }else if(number == 3){
                month = "mar";
            }else if(number == 4){
                month = "apr";
            }else if(number == 5) {
                month = "may";
            }else if(number == 6){
                month = "june";
            }else if(number == 7){
                month = "july";
            }else if(number == 8) {
                month = "aug";
            }else if(number == 9) {
                month = "sep";
            }else if(number == 10){
                month = "oct";
            }else if(number == 11){
                month = "nov";
            }else if(number == 12) {
                month = "dec";
            }

        }else{
            month = "No such a month";
        }

        System.out.println("month = " + month);
    }
}



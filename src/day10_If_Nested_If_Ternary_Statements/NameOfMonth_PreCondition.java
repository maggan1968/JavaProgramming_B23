package day10_If_Nested_If_Ternary_Statements;

public class NameOfMonth_PreCondition {
    public static void main(String[] args) {

        int number = 1;//1~12
        String name="";

      if (number >=1  && number <= 12){

        if (number==1) {
          //  System.out.println("Jan");
            name="Jan";
        }else  if (number==2){
           // System.out.println("Feb");
            name="Frb";
        }else  if (number==3){
           // System.out.println("Mar");
            name="Mar";
        }else  if (number==4){
            //System.out.println("Apr");
            name="Apr";
        }else  if (number==5){
            //System.out.println("May");
            name="May";
        }else  if (number==6){
            //System.out.println("Jun");
            name="Jun";
        }else  if (number==7){
            //System.out.println("Jul");
            name="Jul";
        }else  if (number==8){
            //System.out.println("Aug");
            name="Aug";
        }else  if (number==9){
            //System.out.println("Sep");
            name="Sep";
        }else  if (number==10){
            //System.out.println("Oct");
            name="Oct";
        }else  if (number==11){
            //System.out.println("Nov");
            name="Nov";
        }else  if (number==12){
           // System.out.println("Dec");
            name="Dec";
        }
        System.out.println("name = " + name);

    }
}}

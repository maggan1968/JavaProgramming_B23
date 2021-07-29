package OfficeHours_day9_WrapperClass_Intro;

import java.util.ArrayList;
public class HidePassword {
    public static void main(String[] args) {
        /*
        Task 2 : Hide Passwords
			        Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
					Ex:
					Input:
					{"one", "hi", "hold}
					Output:
					[ ***, **, **** ]
         */


        String[] password={"one", "hi", "hold"};

        ArrayList<String> hiddenPassword=new ArrayList<>();


        for (String each : password) {

            hiddenPassword.add(convertToStar(each));

        }
        System.out.println(hiddenPassword);
    }

    public static String convertToStar(String str){

        String star="";
        for (int i = 0; i <str.length() ; i++) {
            star+="*";
        }

        return star;

    }
}




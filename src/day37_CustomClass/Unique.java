package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
        System.out.println("--------3-----frequency ----------");
        String str = "AABBCCDDEE";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for(int i = 0; i< list.size(); i++){
            int num = Collections.frequency(list, list.get(i));
            if(!result.contains(list.get(i))){
                result+=list.get(i)+num;
            }

        }
        System.out.println(result);
    }
}

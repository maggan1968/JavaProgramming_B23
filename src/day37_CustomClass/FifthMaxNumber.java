package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FifthMaxNumber {

        public static int findNthMax(ArrayList<Integer>list){
            //5th maximum number
            int n=5;
            for(int i=1; i<n ;i++){
                list.removeIf(p->p==Collections.max(list));
            }
            int fifthMAxNumber=Collections.max(list);
            return fifthMAxNumber;

        }
    }


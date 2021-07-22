package day28_CustomMethods;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public static void removeDuplicates(String word) {  //"abababa"
        String result = "";  //"ab"
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);
            }
        }

        System.out.println(result);
    }
}
/*
10. write a method that can remove the duplicates from the string
            "abababa"
            "ab"
 */
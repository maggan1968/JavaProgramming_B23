package OfficeHours_day9_WrapperClass_Intro;

public class Quiz1 {
    public static void main(String[] args) {
        String str= "The whole time it was raining.";
do {
    System.out.println(str.charAt(0));
    str = str.substring(3);
}
while (!str.isEmpty());
    }
}

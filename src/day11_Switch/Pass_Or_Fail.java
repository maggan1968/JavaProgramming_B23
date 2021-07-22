package day11_Switch;

public class Pass_Or_Fail {
    public static void main(String[] args) {

       char grade= 'R';

      /*
       pass: A, B, C, D
       fail : F
       */
        switch (grade){
            case'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Grade");

        }

    }
}

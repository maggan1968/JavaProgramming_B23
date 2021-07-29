package Sort;

public class AppearsTwice {
    public static void main(String[] args) {

            System.out.println("Hello world!");
        System.out.println(appearsTwice("Java","Java is cool I love Java"));
    }


        /**
         *target - string that you need to check.
         * sentence - string where you need to lookup for target.
         *
         */
        public static boolean appearsTwice(String target, String sentence) {
            //write your codes here:
            int frequency = 0;
            String [] splitBySpace = sentence.split(" ");
            for (int i = 0; i < splitBySpace.length; i++){
                if (splitBySpace[i].contains(target)){
                    frequency++;
                }
            }
            if (frequency == 2){
                return true;
            }
            return false;
        }
}
/*
variable target appears only twice in the string sentence, otherwise return false.
`Examples:`
`Examples:`
`Main.appearsTwice("java", "java is fun!")`
`Main.appearsTwice("java", "java is fun!")`
      `- returns false, because java appears only once.`
      `- returns false, because java appears only once.`
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
      `- returns true, because laptop appears twice.`
 */




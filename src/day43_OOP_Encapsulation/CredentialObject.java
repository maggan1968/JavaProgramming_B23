package day43_OOP_Encapsulation;

public class CredentialObject {
    public static void main(String[] args) {

        Credentials facebook= new Credentials("qw","12");
//facebook.setUsername("123456"); //will never set a username, requirement is not valid
        facebook.setUsername("Cybertek");

        // facebook.setPassword("123456789");// password will be not set, is not strong password- its not vaid
        facebook.setPassword("Cybertek123!");



        System.out.println(facebook.getUsername());
        System.out.println(facebook.getPassword());


        System.out.println("---------------------------------------------");

        System.out.println("username: "+ facebook.getUsername());
        System.out.println("password: "+facebook.getPassword());

        System.out.println("-------------------------------------------");

        Credentials gmail =  new Credentials(null, null);

        gmail.setUsername("gmail.com");
        gmail.setPassword("gmail123456!");


        System.out.println(gmail.getUsername());
        System.out.println(gmail.getPassword());




    }


}
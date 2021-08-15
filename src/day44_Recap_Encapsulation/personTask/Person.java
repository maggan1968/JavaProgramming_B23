package day44_Recap_Encapsulation.personTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private char gender;
    private final int age ;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;

    public final static boolean isHuman; //this is not depended of object
    public final static String planet;//this is not depended of object

    static {
        isHuman = true;
        planet = "Earth";

    }


    public Person(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {
        setName(name);
        setGender(gender);
        if(dateOfBirth.isBefore(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        }else{
            this.dateOfBirth = null;
        } // age cannot be negative

        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F' ) ){ // if gender is not male or female
            return; // exits the method
        }
        this.gender = gender;
    }

   public void eat(String food){
        System.out.println(name+ "is eating"+food);
}
    public void drink(String drinks){
        System.out.println(name+ "is drinking"+drinks);

}
    public void sleep(String food){
        System.out.println(name+ "is sleeping");
    }

    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        return "Person{" +
                "name= '" + name + '\'' +
                ", gender= " + gender +
                ", age= " + age +
                ", dateOfBirth= " + dateOfBirth.format(df) + //Aug
                ", countryOfBirth= '" + countryOfBirth + '\'' +
                ", language= '" + language + '\'' +
                '}';
    }
}


/*
PersonTask:
    private variables:
        name (String)
        gender (char)
        age (int & constant)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)
    public variables:
        isHuman (static boolean & constant)
        planet (static boolean & constant)
    Encapsulate all the fields (instances)
        (age cannot be set to negative)
    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)
     Extra methods:
         eat(), sleep(), drink(), toString()
 */
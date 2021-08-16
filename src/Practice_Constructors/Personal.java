package Practice_Constructors;

import java.time.LocalDate;
import java.time.LocalTime;


public class Personal {

    private String name;
    private final char gender;
    private int age;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;
    private static boolean isHuman=true;
    private static boolean planet=false;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
            return;
        }
        this.age = age;
    }

    public String getName() {
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

    public static boolean isIsHuman() {
        return isHuman;
    }

    public static boolean isPlanet() {
        return planet;
    }

    public Personal(char gender, int age, LocalDate dateOfBirth, String countryOfBirth, String language) {
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.language = language;
    }


    public void eat(String name,String food){
        System.out.println(name + " eating "+food);
    }
    public void drink(String name,String drink){
        System.out.println(name + " drinking " + drink);
    }
    public void sleep(String name, LocalTime SleepingTime){
        System.out.println(name + " is sleep at " + SleepingTime);
    }

    public String toString() {
        return "PersonTask{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}



/*
PersonTask:
    private variables:
        name (String)
        gender (char and constant)
        age (int)
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
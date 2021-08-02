package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog2 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Hunana", "Femal", "Kangal", "yellowish brown", "large", 5);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby", "Shepard", "Female", "Brown", "large", 3);

        Dog dog3 = new Dog();
        dog3.setInfo("ninja", "Husky", "Male", "Blue", "Medium", 6);

        Dog dog4 = new Dog();
        dog4.setInfo("Kicia", "Labrador", "Female", "Black", "large", 3);

        Dog dog5 = new Dog();
        dog5.setInfo("King", "Yorkshire Terrier", "Male", "Silver", "Small", 6);

        Dog dog6 = new Dog();
        dog6.setInfo("Snoopy", "Poodle", "Female", "Brown", "large", 3);

        Dog dog7 = new Dog();
        dog7.setInfo("Lucky", "Rottweiler", "Male", "Mix", "Large", 6);

        Dog dog8 = new Dog();
        dog8.setInfo("Bobby", "Shepard", "Female", "Brown", "large", 7);

        Dog dog9 = new Dog();
        dog9.setInfo("Charlie", "Chihuahua", "Male", "Brown", "Small", 4);

        Dog dog10 = new Dog();
        dog10.setInfo("Rexia", "Afghan", "Female", "Gold", "large", 3);


        Dog [] dogsInPark = {dog1, dog2, dog3, dog4, dog5, dog6, dog7, dog8, dog9,dog10};
        ArrayList<Dog> dogsInList = new ArrayList<>(Arrays.asList(dogsInPark));
        dogsInList.removeIf(each -> !each.breed.equals("Husky"));
        for (Dog eachDog : dogsInList) {
            eachDog.getInfo();
        }



    }




}





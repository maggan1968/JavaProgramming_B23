package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatPark {
    public static void main(String[] args) {

        Cat cat1 =new Cat();
        cat1.name="Igor";
        cat1.breed="Persian";
        cat1.age=3;
        cat1.size="medium";
        cat1.color="white";
        cat1.gender="male";

        System.out.println(cat1.name);
        System.out.println(cat1.breed);
        System.out.println(cat1.age);
        System.out.println(cat1.size);
        System.out.println(cat1.color);
        System.out.println(cat1.gender);

        Cat cat2=new Cat();
        cat2.setInfo("Koshka","Mix","Female",2,"Bengal");

        Cat cat3= new Cat();
        cat3. setInfo("Mrusia"," Grey", "Female",5, "Norvegian");

        cat3.getInfo();

        System.out.println("------------------");

cat2.eat("Fish");
cat3.drink("Milk");
cat1.play();
        System.out.println("----------------------------------");
        cat2.getInfo();

        System.out.println("-------------------------------------");
        cat3.getInfo();

        System.out.println("--------------------------------------------");

       Cat[] cats = {cat1, cat2, cat3};

        ArrayList<Cat>catList = new ArrayList<>();
       catList.addAll(Arrays.asList(cat1,cat2,cat3));
    }
}

package Self_Packege;

public class FruitBasket {
    public static void main(String[] args) {

        int ApplesCount=20;
        int OrangesCount=30;
        int PearsCount=30;

        boolean comp = ApplesCount < OrangesCount || OrangesCount>= PearsCount;

        System.out.println(comp);// true
    }
}

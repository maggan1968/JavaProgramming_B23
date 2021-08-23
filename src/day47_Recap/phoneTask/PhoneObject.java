package day47_Recap.phoneTask;

public class PhoneObject {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone("12","large","Black",1100);
        iPhone.call(911);
        iPhone.call(123456,911,6789032);
        iPhone.text(123456789);
        iPhone.faceTime(123456789);

        System.out.println("-------------------------------------");

        Samsung samsung= new Samsung("galaxy s6","extra large","white",1000);
        samsung.call(123456789);
        samsung.text(1234567);
        samsung.text(123456,12345678);
        samsung.text(3567890,65778788,376567);
        samsung.freeze();
       // samsung.faceTime(34356788);

        System.out.println("---------------------------------------------");

        Nokia nokia = new Nokia("Brick", "small","Grey",50);
        nokia.call(3566778);
        nokia.text(567890);
        nokia.selfDefense();
        nokia.breakTheFloor();
       // nokia.freeze();
        //nokia.faceTime();

        System.out.println(nokia);

        nokia.setPrice(75);
        nokia.setColor("Blue");
        System.out.println(nokia.getPrice());

        System.out.println(nokia);
    }
}

package day47_Recap.browsersTAsk;

public final class Chrome extends Browser {
    /*
    public final String name; //"John"
                             // "David"
    public Chrome(String name){
        this.name = name;
    }
*/

    @Override
    public void open() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }
}
package day47_Recap.browsersTAsk;

public final class FireFox extends Browser {//FireFox is A Browser


    @Override
    public void open() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox browser");
    }

}

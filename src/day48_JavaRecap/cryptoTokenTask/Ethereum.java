package day48_JavaRecap.cryptoTokenTask;

public final class Ethereum extends CryptoToken {
    public Ethereum(String name, double price, double quantity, double volume24H, double circulatingSupply, boolean isMineable) {
        super(name, price, quantity, volume24H, circulatingSupply, isMineable);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}




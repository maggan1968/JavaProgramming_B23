package day48_JavaRecap.cryptoTokenTask;

public  class Cardano extends CryptoToken {
    private final  String nameOfCEO;

    public Cardano(String name, double price, double quantity, double volume24H, double circulatingSupply, boolean isMineable, String nameOfCEO) {
        super(name, price, quantity, volume24H, circulatingSupply, isMineable);
        this.nameOfCEO=nameOfCEO;
    }

    @Override
    public String toString() {
        return  super.toString()+
                " name of Cardano CEO='" + nameOfCEO + '\'';

    }
}
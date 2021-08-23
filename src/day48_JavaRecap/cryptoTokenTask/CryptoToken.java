package day48_JavaRecap.cryptoTokenTask;

import java.text.DecimalFormat;
public class CryptoToken {

private final String name;

private double price, quantity, marketCap, volume24H, circulatingSupply;

private boolean isMineable;

public CryptoToken(String name,double price, double quantity, double volume24H, double circulatingSupply, boolean isMineable) {
        this.name=name;
        setPrice(price);
        setQuantity(quantity);
        this.volume24H = volume24H;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
        marketCap=price*circulatingSupply;
        }

public String getName() {
        return name;
        }

public double getPrice() {
        return price;
        }

public void setPrice(double price) {
        this.price = price;
        }

public double getQuantity() {
        return quantity;
        }

public void setQuantity(double quantity) {
        this.quantity = quantity;
        }

public double getMarketCap() {
        return marketCap;
        }

public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;

        }

public double getVolume24H() {
        return volume24H;
        }

public void setVolume24H(double volume24H) {
        this.volume24H = volume24H;
        }

public double getCirculatingSupply() {
        return circulatingSupply;
        }

public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
        }

public boolean isMineable() {
        return isMineable;
        }

public void setMineable(boolean mineable) {
        isMineable = mineable;
        }

public double totalAssetValue(){
        return price*quantity;
        }


@Override
public String toString() {
        DecimalFormat df= new DecimalFormat("0.00");
        return  name+" Token ==> "+
        " price=$" + price +
        ", quantity=" + quantity +
        ", marketCap=$" + marketCap +
        ", volume24H=$" + volume24H +
        ", circulatingSupply=$" + circulatingSupply +
        ", isMineable=" + isMineable +
        ", asset value= $" + df.format(totalAssetValue()) ;

        }
        }
/*
CryptoToken Task
	1. create a class called CryptoToken
			private variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

				Encapsulate all the fileds

				Add a constructor that can set all the fileds

			methods:toString()
				    totalPrice(): returns the total price of the crypto token ( price * quantity)

	2. create 5 sub classes of CryptoToken

		Note: you can ask from Abbos or Robinson

	3. create a class named MyWallet

		create oen object of each CryptoToken

		calculate the total Asset
 */
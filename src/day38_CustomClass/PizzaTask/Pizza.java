package day38_CustomClass.PizzaTask;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;


    //customOrder(): sets all attributes of Pizza
    public void customOrder(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    //calcCost(): returns the totalCost of the pizza
    public double calcCost(){
        double startingPrice=(size=='S')?10:(size=='M')?12:14;
        double PriceOfTopping=2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        return (startingPrice + PriceOfTopping)*1.08;//tax



    }
//toString():returns a String containing the pizza size, quantity of each topping,
//			and the pizza cost as calculated by calcCost()
    public String toString() {
        return "Pizza{" +
                "size= " + size +
                ", numberOfCheeseTopping= " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping= " + numberOfPepperoniTopping +
                ", total Price= $"+calcCost() +
                '}';
    }
}
/*
 Pizza:
    	Attributes:
    		size, numberOfCheeseTopping, numberOfPepperoniTopping

		Actions:
			customOrder(): sets all attributes of Pizza
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping,
			and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
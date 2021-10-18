package model.Accessories;

public class Feeder extends Accessories {
	
	public Feeder(String brand, int cost, int amount) {
		super(brand, cost, amount);
	}
	
	@Override
	public String toString() {
		return "Feeder: brand: " + getBrand() + " cost: " + getCost() + " amount: " + getAmount();
	}
	
}

package model.Accessories;

public class Corals extends Accessories {
	
	public Corals(String brand, int cost, int amount) {
		super(brand, cost, amount);
	}
	
	@Override
	public String toString() {
		return "Corals: brand: " + getBrand() + " cost: " + getCost() + " amount: " + getAmount();
	}
}

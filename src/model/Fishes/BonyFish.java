package model.Fishes;

public class BonyFish extends Fish {
	
	public BonyFish(String type, String colour, int cost){
		super(type, colour, cost);
	}
	
	@Override
	public String toString() {
		return "Bony fish: type: " + getType() + " colour: " + getColour() + " cost: " + getCost();
	}
}

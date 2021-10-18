package model.Amphibians;

public class TailedAmphibian extends Amphibian {
	
	public TailedAmphibian(String type, String colour, int cost) {
		super(type, colour, cost);
	}
		
	@Override
	public String toString() {
		return "Tailed Amphibian: type: " + getType() + " colour: " + getColour() + " cost: " + getCost();
	}
}

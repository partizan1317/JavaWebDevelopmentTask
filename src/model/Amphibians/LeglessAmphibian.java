package model.Amphibians;

public class LeglessAmphibian extends Amphibian {
	
	public LeglessAmphibian(String type, String colour, int cost) {
		super(type, colour, cost);
	}
	
	@Override
	public String toString() {
		return "Legless amphibian: type: " + getType() + " colour: " + getColour() + " cost: " + getCost();
	}
}

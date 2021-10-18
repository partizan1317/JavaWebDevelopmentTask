package model.Amphibians;

public class TaillessAmphibian extends Amphibian {
	
	public TaillessAmphibian(String type, String colour, int cost) {
		super(type, colour, cost);
	}
	
	@Override
	public String toString() {
		return "Tailless amphibian: type: " + getType() + " colour: " + getColour() + " cost: " + getCost();
	}
}

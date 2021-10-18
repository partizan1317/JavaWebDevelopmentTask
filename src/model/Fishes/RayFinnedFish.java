package model.Fishes;

public class RayFinnedFish extends BonyFish{
	
	public RayFinnedFish(String type, String colour, int cost){
		super(type, colour, cost);
	}
	
	@Override
	public String toString() {
		return "Ray-finned fish: type: " + getType() + " colour: " + getColour() + " cost: " + getCost();
	}
}
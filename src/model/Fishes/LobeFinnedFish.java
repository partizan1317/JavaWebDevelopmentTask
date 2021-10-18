package model.Fishes;

public class LobeFinnedFish extends BonyFish {
	
	public LobeFinnedFish(String type, String colour, int cost){
		super(type, colour, cost);
	}
	
	@Override
	public String toString() {
		return "Lobe-finned fish: type: " + getType() + " colour: " + getColour() + " cost: " + getCost();
	}
	
}

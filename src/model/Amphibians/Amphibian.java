package model.Amphibians;

public abstract class Amphibian {
	private String type;
	private String colour;
	private int cost;
	
	public Amphibian(String type, String colour, int cost){
		this.type = type;
		this.colour = colour;
		this.cost = cost;
	}
	
	public String getType() {
		return type;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setAge(int cost) {
		this.cost = cost;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract String toString();
	
}

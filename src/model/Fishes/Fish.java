package model.Fishes;
/**
 * 
 * @author E.I.Sobol
 * @version 2.1
 *
 */
public abstract class Fish {
	private String type;
	private String colour;
	private int cost;
	
	
	public Fish(){
		this.type  = null;
		this.colour = null;
		this.cost = 0;
	}
	
	public Fish(String type, String colour, int cost){
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
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public abstract String toString();
}

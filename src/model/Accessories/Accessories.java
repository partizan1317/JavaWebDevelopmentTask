package model.Accessories;

public abstract class Accessories {
	private String brand;
	private int cost;
	private int amount;
	
	public Accessories(String brand, int cost, int amount) {
		this.brand = brand;
		this.cost = cost;
		this.amount = amount;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public abstract String toString();
	
}

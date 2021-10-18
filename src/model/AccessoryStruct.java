package model;

public class AccessoryStruct {
	
	private String type;
	private String brand;
	
	public AccessoryStruct(String type, String brand) {
		this.type = type;
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getType() {
		return type;
	}
}

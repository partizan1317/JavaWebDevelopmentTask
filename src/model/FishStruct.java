package model;

public class FishStruct {
	
	private String genus;
	private String type;
	
	public FishStruct(String genus, String type) {
		this.genus = genus;
		this.type = type;
	}
	
	public String getGenus() {
		return genus;
	}
	
	public String getType() {
		return type;
	}
}

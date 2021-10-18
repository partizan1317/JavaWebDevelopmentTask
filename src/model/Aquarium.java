package model;

import java.util.ArrayList;
import java.util.List;

import model.Accessories.Corals;
import model.Accessories.Feeder;
import model.Amphibians.LeglessAmphibian;
import model.Amphibians.TailedAmphibian;
import model.Amphibians.TaillessAmphibian;
import model.Fishes.LobeFinnedFish;
import model.Fishes.RayFinnedFish;

public class Aquarium {
	
	private List<RayFinnedFish> rfList;
	private List<LobeFinnedFish> lfList;
	private List<TailedAmphibian> tailedList;
	private List<TaillessAmphibian> taillessList;
	private List<LeglessAmphibian> leglessList;
	private List<Corals> coralsList;
	private List<Feeder> feedersList;
	private int totalPrice;
	
	public Aquarium(List<RayFinnedFish> rfList, List<LobeFinnedFish> lfList, List<TailedAmphibian> tailedList,
			List<TaillessAmphibian> taillessList, List<LeglessAmphibian> leglessList, List<Corals> coralsList,
			List<Feeder> feedersList) {
		this.rfList = rfList;
		this.lfList = lfList;
		this.tailedList = tailedList;
		this.taillessList = taillessList;
		this.leglessList = leglessList;
		this.coralsList = coralsList;
		this.feedersList = feedersList;
	}
	
	public int calculatePrice() {
		totalPrice = 0;
		
		for(RayFinnedFish fish : this.rfList) {
			totalPrice += fish.getCost();
		}
		
		for(LobeFinnedFish fish: this.lfList) {
			totalPrice += fish.getCost();
		}
		
		for(TailedAmphibian amph : this.tailedList) {
			totalPrice += amph.getCost();
		}
		
		for(TaillessAmphibian amph : this.taillessList) {
			totalPrice += amph.getCost();
		}
		
		for(LeglessAmphibian amph : this.leglessList) {
			totalPrice += amph.getCost();
		}
		
		for(Corals accry : this.coralsList) {
			totalPrice += accry.getCost();
		}
		
		for(Feeder accry : this.feedersList) {
			totalPrice += accry.getCost();
		}
		return totalPrice;
	}
	
	public List<FishStruct> getFishStruct(){
		List<FishStruct> fishStruct = new ArrayList<>();
		for(RayFinnedFish fish : rfList) {
			fishStruct.add(new FishStruct("rayFinned",fish.getType()));
		}
		for(LobeFinnedFish fish : lfList) {
			fishStruct.add(new FishStruct("lobeFinned",fish.getType()));
		}
		return fishStruct;
	}
	
	public List<AmphibianStruct> getAmphibianStruct(){
		List<AmphibianStruct> amphStruct = new ArrayList<>();
		for(TailedAmphibian amph : tailedList) {
			amphStruct.add(new AmphibianStruct("tailed",amph.getType()));
		}
		for(TaillessAmphibian amph : taillessList) {
			amphStruct.add(new AmphibianStruct("tailless", amph.getType()));
		}
		for(LeglessAmphibian amph : leglessList) {
			amphStruct.add(new AmphibianStruct("legless", amph.getType()));
		}
		return amphStruct;
	}
	
	public List<AccessoryStruct> getAccessoryStruct(){
		List<AccessoryStruct> accryStruct = new ArrayList<>();
		for(Corals accry : coralsList) {
			accryStruct.add(new AccessoryStruct("corals", accry.getBrand()));
		}
		for(Feeder accry : feedersList) {
			accryStruct.add(new AccessoryStruct("feeder", accry.getBrand()));
		}
		return accryStruct;
	}
}

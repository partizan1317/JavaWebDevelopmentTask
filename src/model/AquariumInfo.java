package model;

import java.util.List;

import model.Accessories.Corals;
import model.Accessories.Feeder;
import model.Amphibians.LeglessAmphibian;
import model.Amphibians.TailedAmphibian;
import model.Amphibians.TaillessAmphibian;
import model.Fishes.LobeFinnedFish;
import model.Fishes.RayFinnedFish;

import java.util.ArrayList;

public class AquariumInfo {
	private String name;
	private List<RayFinnedFish> rfList = new ArrayList<>();
	private List<LobeFinnedFish> lfList = new ArrayList<>();
	private List<LeglessAmphibian> leglessList = new ArrayList<>();
	private List<TailedAmphibian> tailedList = new ArrayList<>();
	private List<TaillessAmphibian> taillessList = new ArrayList<>();
	private List<Corals> coralsList = new ArrayList<>();
	private List<Feeder> feedersList = new ArrayList<>();
	
	public AquariumInfo(List<RayFinnedFish> rfList, List<LobeFinnedFish> lfList, List<LeglessAmphibian> leglessList,
			List<TailedAmphibian> tailedList, List<TaillessAmphibian> taillessList, List<Corals> coralsList,
			List<Feeder> feedersList) {
		this.rfList = rfList;
		this.lfList = lfList;
		this.leglessList = leglessList;
		this.tailedList = tailedList;
		this.taillessList = taillessList;
		this.coralsList = coralsList;
		this.feedersList = feedersList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRfList(List<RayFinnedFish> rfList) {
		this.rfList = rfList;
	}
	
	public void setLbList(List<LobeFinnedFish> lfList) {
		this.lfList = lfList;
		
	}
	
	public void setLeglessList(List<LeglessAmphibian> leglessList) {
		this.leglessList = leglessList;
	}
	
	public void setTailedList(List<TailedAmphibian> tailedList) {
		this.tailedList = tailedList;
	}
	
	public void setTaillessList(List<TaillessAmphibian> taillessList) {
		this.taillessList = taillessList;
	}
	
	public void setCoralsList(List<Corals> coralsList) {
		this.coralsList = coralsList;
	}
	
	public void setFeedersList(List<Feeder> feedersList) {
		this.feedersList = feedersList;
	}
	
	public List<RayFinnedFish> getRfList(){
		return rfList;
	}
	
	public List<LobeFinnedFish> getLfList(){
		return lfList;
	}
	
	public List<LeglessAmphibian> getLeglessList(){
		return leglessList;
	}
	
	public List<TailedAmphibian> getTailedList(){
		return tailedList;
	}
	
	public List<TaillessAmphibian> getTaillessList(){
		return taillessList;
	}
	
	public List<Corals> getCoralsList(){
		return coralsList;
	}
	
	public List<Feeder> getFeedersList(){
		return feedersList;
	}
	
	public String toString() {
		return "AquariumInfo: {" +
				"name: '" + name + '\'' +
				", RayFinnedList: " + rfList + 
				", LobeFinnedList: " + lfList +
				", LeglessList: " + leglessList +
				", TailedList: " + tailedList +
				", TaillessList: " + taillessList +
				", CoralsList: " + coralsList +
				", FeedersList: " + feedersList +
				'}';
	}
}

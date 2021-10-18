package model.DomParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Accessories.Corals;
import model.Accessories.Feeder;
import model.Amphibians.LeglessAmphibian;
import model.Amphibians.TailedAmphibian;
import model.Amphibians.TaillessAmphibian;
import model.Fishes.LobeFinnedFish;
import model.Fishes.RayFinnedFish;

public class DomParserHandler {
	private static final String TAG_BRAND = "brand";
	private static final String TAG_COLOUR = "colour";
	private static final String TAG_COST = "cost";
	private static final String TAG_TYPE = "type";
	private static final String TAG_AMOUNT = "amount";
	private static final String TAG_BONY_FISH = "bonyFishes";
	private static final String TAG_FISH = "fish";
	private static final String TAG_ACCRY = "accessory";
	private static final String TAG_AMPH = "amphibian";
	
	protected static Document buildDocument() throws Exception {
		File file = new File("aquariumInfoInput.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		return dbf.newDocumentBuilder().parse(file);
	}	
	
	protected static List<Feeder> parsFeeders(Node feeders){
		List<Feeder> feedersList = new ArrayList<>();
		NodeList accry = feeders.getChildNodes();
		for(int i = 0; i < accry.getLength(); i++) {
			if(accry.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!accry.item(i).getNodeName().equals(TAG_ACCRY)) {
				continue;
			}
			
			Feeder feeder1 = parsFeedersElement(accry.item(i));
			feedersList.add(feeder1);
		}
		return feedersList;
	}
	
	protected static Feeder parsFeedersElement(Node accry) {
		String brand = "";
		int cost = 0;
		int amount = 0;
		NodeList accryElement = accry.getChildNodes();
		for(int i = 0; i < accryElement.getLength(); i ++) {
			if(accryElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(accryElement.item(i).getNodeName()) {
			case TAG_BRAND:{
				brand = accryElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(accryElement.item(i).getTextContent());
				break;
			}
			case TAG_AMOUNT: {
				amount = Integer.valueOf(accryElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		Feeder feeder1 = new Feeder(brand, cost, amount);
		return feeder1;
	}
	
	protected static List<Corals> parsCorals(Node corals){
		List<Corals> coralsList = new ArrayList<>();
		NodeList accry = corals.getChildNodes();
		for(int i = 0; i < accry.getLength(); i++) {
			if(accry.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!accry.item(i).getNodeName().equals(TAG_ACCRY)) {
				continue;
			}
			
			Corals coral1 = parsCoralsElement(accry.item(i));
			coralsList.add(coral1);
		}
		return coralsList;
	}
	
	protected static Corals parsCoralsElement(Node accry){
		String brand = "";
		int cost = 0;
		int amount = 0;
		NodeList accryElement = accry.getChildNodes();
		for(int i = 0; i < accryElement.getLength(); i ++) {
			if(accryElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(accryElement.item(i).getNodeName()) {
			case TAG_BRAND:{
				brand = accryElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(accryElement.item(i).getTextContent());
				break;
			}
			case TAG_AMOUNT: {
				amount = Integer.valueOf(accryElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		Corals coral1 = new Corals(brand, cost, amount);
		return coral1;
	}
	
	protected static List<LeglessAmphibian> parsLegless(Node amphLegless){
		List<LeglessAmphibian> leglessList = new ArrayList<>();
		NodeList amph = amphLegless.getChildNodes();
		for(int i = 0; i < amph.getLength(); i++) {
			if(amph.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!amph.item(i).getNodeName().equals(TAG_AMPH)) {
				continue;
			}
			
			LeglessAmphibian amph1 = parsLeglessElement(amph.item(i));
			leglessList.add(amph1);
		}
		return leglessList;
	}
	
	protected static LeglessAmphibian parsLeglessElement(Node amph) {
		String type = "";
		String colour = "";
		int cost = 0;
		NodeList amphElement = amph.getChildNodes();
		for(int i = 0; i < amphElement.getLength(); i ++) {
			if(amphElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(amphElement.item(i).getNodeName()) {
			case TAG_TYPE:{
				type = amphElement.item(i).getTextContent();
				break;
			}
			case TAG_COLOUR: {
				colour = amphElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(amphElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		LeglessAmphibian amph1 = new LeglessAmphibian(type, colour, cost);
		return amph1;
	}
	
	protected static List<TaillessAmphibian> parsTailless(Node amphTailless){
		List<TaillessAmphibian> taillessList = new ArrayList<>();
		NodeList amph = amphTailless.getChildNodes();
		for(int i = 0; i < amph.getLength(); i++) {
			if(amph.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!amph.item(i).getNodeName().equals(TAG_AMPH)) {
				continue;
			}
			
			TaillessAmphibian amph1 = parsTaillessElement(amph.item(i));
			taillessList.add(amph1);
		}
		return taillessList;
	}
	
	protected static TaillessAmphibian parsTaillessElement(Node amph) {
		String type = "";
		String colour = "";
		int cost = 0;
		NodeList amphElement = amph.getChildNodes();
		for(int i = 0; i < amphElement.getLength(); i ++) {
			if(amphElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(amphElement.item(i).getNodeName()) {
			case TAG_TYPE:{
				type = amphElement.item(i).getTextContent();
				break;
			}
			case TAG_COLOUR: {
				colour = amphElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(amphElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		TaillessAmphibian amph1 = new TaillessAmphibian(type, colour, cost);
		return amph1;
	}
	
	protected static List<TailedAmphibian> parsTailed(Node amphTailed){
		List<TailedAmphibian> tailedList = new ArrayList<>();
		NodeList amph = amphTailed.getChildNodes();
		for(int i = 0; i < amph.getLength(); i++) {
			if(amph.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!amph.item(i).getNodeName().equals(TAG_AMPH)) {
				continue;
			}
			
			TailedAmphibian amph1 = parsTailedElement(amph.item(i));
			tailedList.add(amph1);
		}
		return tailedList;
	}
	
	protected static TailedAmphibian parsTailedElement(Node amph) {
		String type = "";
		String colour = "";
		int cost = 0;
		NodeList amphElement = amph.getChildNodes();
		for(int i = 0; i < amphElement.getLength(); i ++) {
			if(amphElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(amphElement.item(i).getNodeName()) {
			case TAG_TYPE:{
				type = amphElement.item(i).getTextContent();
				break;
			}
			case TAG_COLOUR: {
				colour = amphElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(amphElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		TailedAmphibian amph1 = new TailedAmphibian(type, colour, cost);
		return amph1;
	}
	
	protected static List<LobeFinnedFish> parsLfFish(Node lfElement){
		List<LobeFinnedFish> lfList = new ArrayList<>();
		NodeList fish = lfElement.getChildNodes();
		for(int i = 0; i < fish.getLength(); i++) {
			
			if(fish.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!fish.item(i).getNodeName().equals(TAG_FISH)) {
				continue;
			}
			
			LobeFinnedFish fish1 = parsLfElement(fish.item(i));
			lfList.add(fish1);
		}
		return lfList;
	}
	
	protected static LobeFinnedFish parsLfElement(Node fish) {
		String type = "";
		String colour = "";
		int cost = 0;
		NodeList fishElement = fish.getChildNodes();
		for(int i = 0; i < fishElement.getLength(); i ++) {
			if(fishElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(fishElement.item(i).getNodeName()) {
			case TAG_TYPE:{
				type = fishElement.item(i).getTextContent();
				break;
			}
			case TAG_COLOUR: {
				colour = fishElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(fishElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		LobeFinnedFish fish1 = new LobeFinnedFish(type, colour, cost);
		return fish1;
	}
	
	
	protected static List<RayFinnedFish> parsRfFish(Node rfElement){
		List<RayFinnedFish> rfList = new ArrayList<>();
		NodeList fish = rfElement.getChildNodes();
		for(int i = 0; i < fish.getLength(); i++) {
			
			if(fish.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!fish.item(i).getNodeName().equals(TAG_FISH)) {
				continue;
			}
			
			RayFinnedFish fish1 = parsRfElement(fish.item(i));
			rfList.add(fish1);
			
		}
		return rfList;
	}
	
	protected static RayFinnedFish parsRfElement(Node fish) {
		
		String type = "";
		String colour = "";
		int cost = 0;
		NodeList fishElement = fish.getChildNodes();
		for(int i = 0; i < fishElement.getLength(); i ++) {
			if(fishElement.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			switch(fishElement.item(i).getNodeName()) {
			case TAG_TYPE:{
				type = fishElement.item(i).getTextContent();
				break;
			}
			case TAG_COLOUR: {
				colour = fishElement.item(i).getTextContent();
				break;
			}
			case TAG_COST: {
				cost = Integer.valueOf(fishElement.item(i).getTextContent());
				break;
				}
			}
		
		}
		
		RayFinnedFish fish1 = new RayFinnedFish(type, colour, cost);
		return fish1;
		
	}
	
	protected static Node parsFishes(Node fishes) {
		NodeList fishesChilds = fishes.getChildNodes();
		Node bonyFishes = null;
		
		for(int i = 0; i < fishesChilds.getLength();i++) {
			if(fishesChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			switch(fishesChilds.item(i).getNodeName()) {
				case TAG_BONY_FISH:{
					bonyFishes = fishesChilds.item(i);
					break;
				}
			
			}
			
		}
		return bonyFishes;
	}
}

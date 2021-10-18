package model.DomParser;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.AquariumInfo;
import model.Accessories.Corals;
import model.Accessories.Feeder;
import model.Amphibians.LeglessAmphibian;
import model.Amphibians.TailedAmphibian;
import model.Amphibians.TaillessAmphibian;
import model.Fishes.LobeFinnedFish;
import model.Fishes.RayFinnedFish;

public class DomParser extends DomParserHandler {
	
	private static final String TAG_INFO = "dataName";
	private static final String TAG_FISHES = "fishes";
	private static final String TAG_RF_FISH = "rfFishes";
	private static final String TAG_LF_FISH = "lfFishes";
	private static final String TAG_AMPHS = "amphibians";
	private static final String TAG_TAILED = "tailed";
	private static final String TAG_TAILLESS = "tailless";
	private static final String TAG_LEGLESS = "legless";
	private static final String TAG_ACCIES = "accessories";
	private static final String TAG_CORALS = "corals";
	private static final String TAG_FEEDER = "feeder";

	
	public static AquariumInfo parse() {
		
		List<RayFinnedFish> rfList = new ArrayList<>();
		List<LobeFinnedFish> lfList = new ArrayList<>();
		List<LeglessAmphibian> leglessList = new ArrayList<>();
		List<TailedAmphibian> tailedList = new ArrayList<>();
		List<TaillessAmphibian> taillessList = new ArrayList<>();
		List<Corals> coralsList = new ArrayList<>();
		List<Feeder> feedersList = new ArrayList<>();
		
		String info = null;
		Node fishesNode = null;
		Node amphibiansNode = null;
		Node accessoriesNode = null;
		Node rfFish = null;
		Node lfFish = null;
		Node amphTailed = null;
		Node amphTailless = null;
		Node amphLegless = null;
		Node corals = null;
		Node feeders = null;
		
		Document doc;
		try {
			doc = buildDocument();
		} catch (Exception e) {
			System.out.println("Open parsing error " + e.toString());
			return null;
		}
		
		Node aquaroot = doc.getFirstChild();
		
		NodeList aquaroots = aquaroot.getChildNodes();
		
		for(int i = 0; i < aquaroots.getLength(); i++) {
			
			if(aquaroots.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			switch(aquaroots.item(i).getNodeName()) {
				case TAG_INFO:{
					info = aquaroots.item(i).getTextContent();
					break;
				}
				case TAG_FISHES:{
					fishesNode = aquaroots.item(i);
					break;
				}
				case TAG_AMPHS:{
					amphibiansNode = aquaroots.item(i);
					break;
				}
				case TAG_ACCIES:{
					accessoriesNode = aquaroots.item(i);
					break;
				}
			}
		}
		
		if(fishesNode == null && amphibiansNode == null && accessoriesNode == null) {
			return null;
		}
		
		Node bonyFishes = parsFishes(fishesNode);
		
		NodeList bonyChilds = bonyFishes.getChildNodes();
		
		for(int i = 0; i < bonyChilds.getLength(); i++) {
			if(bonyChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			switch(bonyChilds.item(i).getNodeName()) {
				case TAG_RF_FISH:{
					rfFish = bonyChilds.item(i);
					break;
				}
				case TAG_LF_FISH: {
					lfFish = bonyChilds.item(i);
					break;
				}
			}
		}
		
		NodeList amphibiansChild = amphibiansNode.getChildNodes();

		for(int i = 0; i < amphibiansChild.getLength(); i++) {
			if(amphibiansChild.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			switch(amphibiansChild.item(i).getNodeName()) {
				case TAG_TAILED:{
					amphTailed = amphibiansChild.item(i);
					break;
				}
				case TAG_TAILLESS:{
					amphTailless = amphibiansChild.item(i);
					break;
				}
				case TAG_LEGLESS: {
					amphLegless = amphibiansChild.item(i);
					break;
				}
			}
		}
		
		NodeList accessoriesChild = accessoriesNode.getChildNodes();
		for(int i = 0; i < accessoriesChild.getLength(); i++) {
			if(accessoriesChild.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			switch(accessoriesChild.item(i).getNodeName()) {
				case TAG_CORALS:{
					corals = accessoriesChild.item(i);
					break;
				}
				
				case TAG_FEEDER: {
					feeders = accessoriesChild.item(i);
					break;
				}
			}
		}
		
		rfList = parsRfFish(rfFish);
		lfList = parsLfFish(lfFish);
		tailedList = parsTailed(amphTailed);
		taillessList = parsTailless(amphTailless);
		leglessList = parsLegless(amphLegless);
		coralsList = parsCorals(corals);
		feedersList = parsFeeders(feeders);
		
		AquariumInfo test = new AquariumInfo(rfList, lfList, leglessList,
			tailedList, taillessList, coralsList, feedersList);
		test.setName(info);
		return test;
	}
	
}


package controller;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

import model.Aquarium;
import model.AquariumInfo;
import model.XMLOutput;
import model.DomParser.DomParser;

public class Main {
	

	

	public static void main(String[] args) {
		
		AquariumInfo aquariumInfo = DomParser.parse();
		Aquarium aquarium = new Aquarium(aquariumInfo.getRfList(), aquariumInfo.getLfList(), aquariumInfo.getTailedList(),
				aquariumInfo.getTaillessList(), aquariumInfo.getLeglessList(), aquariumInfo.getCoralsList(), aquariumInfo.getFeedersList());
		
		try {
			XMLOutput.output(aquarium.getFishStruct(), aquarium.getAmphibianStruct(), aquarium.getAccessoryStruct(), aquarium.calculatePrice());
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}



















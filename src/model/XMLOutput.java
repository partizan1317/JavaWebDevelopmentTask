package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLOutput {
	
	public static void output(List<FishStruct> fishStruct, List<AmphibianStruct> amphStruct,
			List<AccessoryStruct> accryStruct, int totalPrice) throws XMLStreamException, FileNotFoundException {
		
		XMLOutputFactory factory = XMLOutputFactory.newFactory();
		XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("aquariumInfo.xml"));
		writer.writeStartDocument();
		writer.writeCharacters("\n");
		writer.writeStartElement("aquariumInfo");
		writer.writeCharacters("\n\t");
		writer.writeStartElement("aquarium");
		writer.writeCharacters("\n\t\t\t");
		writer.writeStartElement("fishes");
		for(FishStruct fish : fishStruct) {
			writer.writeCharacters("\n\t\t\t\t");
			writer.writeStartElement(fish.getGenus());
			writer.writeCharacters(fish.getType());
			writer.writeEndElement();
		}
		writer.writeCharacters("\n\t\t\t");
		writer.writeEndElement();
		writer.writeCharacters("\n\t\t\t");
		writer.writeStartElement("amphibians");
		for(AmphibianStruct amph : amphStruct) {
			writer.writeCharacters("\n\t\t\t\t");
			writer.writeStartElement(amph.getGenus());
			writer.writeCharacters(amph.getType());
			writer.writeEndElement();
		}
		writer.writeCharacters("\n\t\t\t");
		writer.writeEndElement();
		writer.writeCharacters("\n\t\t\t");
		writer.writeStartElement("accessories");
		for(AccessoryStruct accry : accryStruct) {
			writer.writeCharacters("\n\t\t\t\t");
			writer.writeStartElement(accry.getType());
			writer.writeCharacters(accry.getBrand());
			writer.writeEndElement();
		}
		
		writer.writeCharacters("\n\t\t\t");
		writer.writeEndElement();
		writer.writeCharacters("\n\t\t\t");
		writer.writeStartElement("totalPrice");
		writer.writeCharacters(Integer.toString(totalPrice));
		writer.writeEndElement();
		writer.writeCharacters("\n\t");
		writer.writeEndElement();
		writer.writeCharacters("\n");
		writer.writeEndElement();
		writer.writeEndDocument();
		writer.flush();
		writer.close();
	}
}
package threading;
import java.util.*;
import java.io.*;
import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;
public class xml_parser {

	public static void main(String[] args) {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		try {
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("input.txt"));
		 while(eventReader.hasNext())
		 {
			 XMLEvent event = eventReader.nextEvent();
		 }
		}
		catch(FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}

}

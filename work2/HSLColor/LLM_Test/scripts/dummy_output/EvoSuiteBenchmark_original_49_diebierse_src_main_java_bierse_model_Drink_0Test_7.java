// Drink_0Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {
		
	/**
	 * It's a unit test for {@link Drink#recalculate()}
	 */
	@Test
	void recalculate() {
	
		document = null;
		
		// Build the drink file
		String drink = "The quick brown fox";
		String tmpfile = Drink.DRINKS_FOLDER + drink + ".xml";
		
		MyKeyMap<Element> keyMap = MyKeyMap.create();
		MyKeyMap<File> file_keyMap = MyKeyMap.create(keyMap);
		FileWriter file = null;
		
		try {
			document = new Document(new SAXBuilder().build(tmpfile)).getRootElement();
			
			// Process the file
			document = null;
			
			document = getDataElement(document);
			
			// Write data into file
			file = new FileWriter(tmpfile);
					
			XMLOutputter xml = new XMLOutputter();
			xml.output(document, file);
			
			file.close();
			
			assertNotNull(document);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (WriterException e) {
			e.printStackTrace();
		}
				
		// check values of KeyMap, file_keyMap, document
	}

	private Document getDataElement(Document document) {
				
		Element data = new Element ("data");
		Element root = new Element ("root");
		Element list = new Element ("list");
		Element child = new Element ("element");
		Element child2 = new Element ("child");
		Element child3 = new Element ("child");
				
		root.addContent (data);
		
		list.addContent (child);
		list.addContent (child2);
		list.addContent (child3);
		
		child2.setAttributeValue ("value", ""+new Object() {
		});
		itemData = list;
		nodeData = new Element(itemData);
		nodeData.setAttributeValue("key", ""+System.currentTimeMillis());
		itemText = System.currentTimeMillis();
				
		data.addContent(nodeData);
		child2.setAttributeValue("key3", ""+System.currentTimeMillis());
		child3.setAttributeValue("key4", ""+System.currentTimeMillis());
}
}
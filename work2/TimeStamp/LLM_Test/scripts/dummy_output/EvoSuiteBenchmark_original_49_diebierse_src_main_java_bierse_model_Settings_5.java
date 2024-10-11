// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains one unit test case for the {@link Settings#save()} method.
*/
class SettingsTest {
		
	/**
	 * Tests for {@link Settings#save()}
	*/
	@Test
	public void testSave() {
		
		int nbPriceSteps;
		
		Settings settings = Settings.instance();
		
		Document doc = new SAXBuilder().build(new File(SETTINGS_FOLDER + "settings.xml"));
		Element root = doc.getRootElement();
		
		nbPriceSteps = Integer.valueOf(root.getAttributeValue(DOM_PRICE_STEPS + "nbPriceSteps"));
		
		settings.setPriceSteps(nbPriceSteps);
		
	}
	
	/**
	 * Tests for {@link Settings#load()}
	*/
	@Test
	public void testLoad() {
		
		Settings settings = Settings.instance();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		Document doc = new SAXBuilder().build(new File(SETTINGS_FOLDER + "settings.xml"));
		Element root = doc.getRootElement();
		
		boolean checkElements = false;
		
		checkElements = false;
		
		for(String child : root.getChildTexts()) {
			checkElements = checkElements &&!child.equals(DOM_NO);
		}

		System.out.println("The elements have to return the same, because it is the same.");
		
		checkElements = checkElements && (root.getAttributeValue(DOM_MESSAGE + "label")).equals("Das ist eine Standard-Nachrichtf�r das Laufband!");
		
		checkElements = checkElements && (root.getAttributeValue(DOM_MESSAGE + "msg")).equals("Das ist eine Standard-Nachrichtf�r das Laufband!");
		
		checkElements = checkElements && (root.getAttributeValue(DOM_YES + "label")).equals("während");
		
		checkElements = checkElements && (root.getAttributeValue(DOM_YES + "msg")).equals("während");
		
		checkElements = checkElements && (root.getAttributeValue(DOM_MESSAGE_SPEED + "label")).equals("5");
		
		checkElements = checkElements && (root.getAttributeValue(DOM_MESSAGE_SPEED + "msg")).equals("5");
		
        checkElements = checkElements && (root.getAttributeValue(DOM_YES + "label")).equals("true");
        
		checkElements = checkElements && (root.getAttributeValue(DOM_YES + "msg")).equals("true");
		
		// Save the settings
		settings.save();
		
		// Load the settings back
		Settings.instance();
		
	}
}
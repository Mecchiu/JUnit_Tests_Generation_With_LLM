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
		@Test
		public void testRecalculate() {
			//Setup, test
			File file = new File(DRINKS_FOLDER);
			file.mkdirs();
			String data = "{ \"name\": \"My Drink\",  \"min_price\": 100, \"max_price\": 50 }";
			File dataFile = new File(file, "data.xml");
			FileWriter fw = new FileWriter(dataFile);
			XMLOutputter outputter = new XMLOutputter();
			Document doc = new SAXBuilder().build(new File(file.getAbsolutePath() + ".xml"));
			OutputFormat format = (OutputFormat)outputter.getWrapper();
			format.setIndenting(true);
			try {
				outputter.output(doc);
				assertFalse(true);
			} catch (Exception ex) {
				ex.printStackTrace();
				assertFalse(false);
			}
			//Setup, test
	}
}

// drinkTestHelper.java
class DrinkTestHelper {
	public static Document read(File f) throws Exception {
		Document doc = DocumentFactory.createDocument();
		SAXBuilder builder = new SAXBuilder(false);
		fileToSAXDocument(f, doc);
		builder.setFeature("uri", "file: " + f.getAbsolutePath());
		return doc;
	}
	public static void fileToSAXDocument(File f, Document doc) throws Exception {

		String dataXML =  new String(FileLoaders.streamFileToString(f));
		Element rootElement = new Element("drinkExample1", "https://localhost/openbiz/rest/v1/drink");

	  	Element priceElement = new Element("drinkExample1", "https://localhost/openbiz/rest/v1/drink");
	  	priceElement.addContent(new Element("price", Integer.toString(maxPrice)));
	  	priceElement.addContent(new Element("min_price", Integer.toString(minPrice)));
	 	priceElement.addContent(new Element("max_price", Integer.toString(maxPrice)));
	  	priceElement.addContent(new Element("current_price", Integer.toString(currentPrice)));
	 	priceElement.addContent(new Element("last_sold", Integer.toString(lastSold)));
}
}
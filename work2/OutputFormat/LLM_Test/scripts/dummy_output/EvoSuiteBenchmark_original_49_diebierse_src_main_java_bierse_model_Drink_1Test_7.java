// Drink_1Test.java
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
* It contains one unit test case for the {@link Drink#save()} method.
*/
class Drink_1Test {
		/**
		* This single object contains the test case for {@link Drink#save()}.
		* This single object should contain all the code contained in {@link Drink_1Test}
		*
		* @throws Exception
		*/
	@Test
	public void save() throws Exception {
		Document document;
		Element container;
		element = new Element( "container" );
		container = new Element( "container" );
		element.addContent( container );
		document = new SAXBuilder().build( container );
		XMLOutputter outputter = new XMLOutputter();
		File file = new File("src/resources/drink_1_test_outputs/drink_1_test_output.xml");
		FileWriter writer = new FileWriter(file.getAbsolutePath());
		try {
			outputter.output( document, writer );
		} catch (Exception ex) {
			System.err.println("Exception not permitted");
			ex.printStackTrace();
		}
	}

/**
* Test class for {@link Drink#sell(int)}
* It contains one unit test case for the {@link Drink#sell(int)} method.
*/
@Test
public void sell() {
		int amount;
		Document document;
		Element container;
		element = new Element( "container" );
		container = new Element( "container" );
		element.addContent( container );
		document = new SAXBuilder().build( container );
		XMLOutputter outputter = new XMLOutputter();
		File file = new File("src/resources/drink_1_test_outputs/drink_1_test_output.xml");
		FileWriter writer = new FileWriter(file.getAbsoluteFile().getAbsoluteFile());
		try {
			outputter.output( document, writer);
		} catch (Exception ex) {
			System.err.println("Exception not permitted");
			ex.printStackTrace();
		}
	}
}
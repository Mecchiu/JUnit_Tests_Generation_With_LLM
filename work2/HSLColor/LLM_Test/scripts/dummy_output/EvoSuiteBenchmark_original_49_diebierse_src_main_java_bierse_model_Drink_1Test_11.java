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
		* @tests {@link Drink#save()} for a null model
		*/
	@Test
	public void test_NullModel() {
		assertThrows(IllegalArgumentException.class, () -> new Drink(null, new DrinkModel()));
	}
	
	/**
	* @tests {@link Drink#save()} for a model that does not have a drink
	*/
	@Test
	public void test_NotDrink() {
		File tempFile = null;
}
}
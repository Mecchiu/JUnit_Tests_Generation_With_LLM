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
		 * Test case run to the unit tests
		 */
		@Test
		public void test_recalculate() {
		    final Drink instance = new Drink(NEW_DRINK_NAME, Model.INSTANCE, 100);
			
		    // assert recalculate()
		    assertNotEquals(instance.recalculate(), instance);
		}
}
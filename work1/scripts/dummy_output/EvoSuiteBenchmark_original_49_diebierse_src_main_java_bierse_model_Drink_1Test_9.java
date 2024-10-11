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
		private Drink myTestObj;

		/**
		 * Sets up the test.
		 */
		MyKeyMap.setTestClass(new Drink_1Test());

		/**
		 * Gets rid of the {@link Drink} instance object.
		 */
		@Test
		public void instancetest() {
				assertNotNull(myTestObj);
		}
}
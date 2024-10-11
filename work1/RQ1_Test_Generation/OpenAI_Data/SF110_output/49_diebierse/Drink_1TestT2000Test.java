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
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_1Test {

		/**
		 * Test case for {@link Drink#save()}
		 * 
		 * @throws Exception
		 */
		@Test
		public void testSave() throws Exception {
				// Create a new drink
				Drink drink = new Drink("Test", null);
				// Set the values
				drink.setMinPrice(10);
				drink.setMaxPrice(20);
				drink.setStartPrice(15);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				// Save the drink
				File file = drink.save();
				// Check that the file exists
				assertTrue(file.exists());
				// Load the drink
				Drink drink2 = new Drink("Test", null);
				drink2.load();
				// Check that the values are the same
				assertEquals(drink.getMinPrice(), drink2.getMinPrice());
				assertEquals(drink.getMaxPrice(), drink2.getMaxPrice());
				assertEquals(drink.getStartPrice(), drink2.getStartPrice());
				assertEquals(drink.getTargetAmount(), drink2.getTargetAmount());
				assertEquals(drink.getDeltaAmount(), drink2.getDeltaAmount());
				assertEquals(drink.getMaxStep(), drink2.getMaxStep());
				assertEquals(drink.isUsed(), drink2.isUsed());
				assertEquals(drink.getKey(), drink2.getKey());
		}
}

// Drink_2Test.java
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
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_2Test {
		
		/**
		 * Test case for {@link Drink#save()}
		 * 
		 * @throws Exception
		 */
		@Test
		public void testSave() throws Exception {
				// Create a new drink
				Drink drink = new Drink("Test", null);
				// Set the values
				drink.setMinPrice(10);
				drink.setMaxPrice(20);
				drink.setStartPrice(15);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				// Save the drink
				File file = drink.save();
				// Check that the file exists
				assertTrue(file.exists());
				// Load the drink
				Drink drink2 = new Drink("Test", null);
				drink2.load();
				// Check that the values are the same
				assertEquals(drink.getMinPrice(), drink2.getMinPrice());
				assertEquals(drink.getMaxPrice(), drink2.getMaxPrice());
				assertEquals(drink.getStartPrice(), drink2.getStartPrice());
				assertEquals(drink.getTargetAmount(), drink2.getTargetAmount());
				assertEquals(drink.getDeltaAmount(), drink2.getDeltaAmount());
				assertEquals(drink.getMaxStep(), drink2.getMaxStep());
				assertEquals(drink.isUsed(), drink2.isUsed());
				assertEquals(drink.getKey(), drink2.getKey());
		}
}

// Drink_3Test.java
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
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_3Test {
		
		/**
		 * Test case for {@link Drink#save()}
		 * 
		 * @throws Exception
		 */
		@Test
		public void testSave() throws Exception {
				// Create a new drink
				Drink drink = new Drink("Test", null);
				// Set the values
				drink.setMinPrice(10);
				drink.setMaxPrice(20);
				drink.setStartPrice(15);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				// Save the drink
				File file = drink.save();
				// Check that the file exists
				assertTrue(file.exists());
				// Load the drink
				Drink drink2 = new Drink("Test", null);
				drink2.load();
				// Check that the values are the same
				assertEquals(drink.getMinPrice(), drink2.getMinPrice());
				assertEquals(drink.getMaxPrice(), drink2.getMaxPrice());
				assertEquals(drink.getStartPrice(), drink2.getStartPrice());
				assertEquals(drink.getTargetAmount(), drink2.getTargetAmount());
				assertEquals(drink.getDeltaAmount(), drink2.getDeltaAmount());
				assertEquals(drink.getMaxStep(), drink2.getMaxStep());
				assertEquals(drink.isUsed(), drink2.isUsed());
				assertEquals(drink.getKey(), drink2.getKey());
		}
}

// Drink_4Test.java
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
* It contains ten unit test
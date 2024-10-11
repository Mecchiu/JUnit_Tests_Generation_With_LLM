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
	 * @result The drink is saved to a XML file.
	 */
	@Test
	void testSave() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(10);
		drink.setMaxPrice(20);
		drink.setCurrentPrice(15);
		drink.setLastSold(5);
		drink.setTotalSold(10);
		drink.setAverageAmount(1.5f);
		drink.setAveragePrice(12.5f);
		drink.setAverageSoldPrice(15.0f);
		drink.setMaxStep(5);
		drink.setTargetAmount(10);
		drink.setDeltaAmount(5);
		drink.setStartPrice(15);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(1);
		drink.setKeepPrice(true);
		drink.setDirectPrice(10);
		File file = drink.save();
		assertNotNull(file);
		assertTrue(file.exists());
		assertTrue(file.isFile());
		assertTrue(file.canRead());
		assertTrue(file.canWrite());
		assertTrue(file.length() > 0);
		assertEquals(Drink.DRINKS_FOLDER + "Test.xml", file.getPath());
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(file);
			Element root = doc.getRootElement();
			assertEquals("Test", root.getChildText("name"));
			assertEquals("10", root.getChildText("minPrice"));
			assertEquals("20", root.getChildText("maxPrice"));
			assertEquals("15", root.getChildText("currentPrice"));
			assertEquals("5", root.getChildText("lastSold"));
			assertEquals("10", root.getChildText("totalSold"));
			assertEquals("1.5", root.getChildText("averageAmount"));
			assertEquals("12.5", root.getChildText("averagePrice"));
			assertEquals("15.0", root.getChildText("averageSoldPrice"));
			assertEquals("5", root.getChildText("maxStep"));
			assertEquals("10", root.getChildText("targetAmount"));
			assertEquals("5", root.getChildText("deltaAmount"));
			assertEquals("15", root.getChildText("startPrice"));
			assertEquals("true", root.getChildText("used"));
			assertEquals("112", root.getChildText("key"));
			assertEquals("1", root.getChildText("trend"));
			assertEquals("true", root.getChildText("keepPrice"));
			assertEquals("10", root.getChildText("directPrice"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
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
	 * @result The drink is saved to a XML file.
	 */
	@Test
	void testSave() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(10);
		drink.setMaxPrice(20);
		drink.setCurrentPrice(15);
		drink.setLastSold(5);
		drink.setTotalSold(10);
		drink.setAverageAmount(1.5f);
		drink.setAveragePrice(12.5f);
		drink.setAverageSoldPrice(15.0f);
		drink.setMaxStep(5);
		drink.setTargetAmount(10);
		drink.setDeltaAmount(5);
		drink.setStartPrice(15);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(1);
		drink.setKeepPrice(true);
		drink.setDirectPrice(10);
		File file = drink.save();
		assertNotNull(file);
		assertTrue(file.exists());
		assertTrue(file.isFile());
		assertTrue(file.canRead());
		assertTrue(file.canWrite());
		assertTrue(file.length() > 0);
		assertEquals(Drink.DRINKS_FOLDER + "Test.xml", file.getPath());
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(file);
			Element root = doc.getRootElement();
			assertEquals("Test", root.getChildText("name"));
			assertEquals("10", root.getChildText("minPrice"));
			assertEquals("20", root.getChildText("maxPrice"));
			assertEquals("15", root.getChildText("currentPrice"));
			assertEquals("5", root.getChildText("lastSold"));
			assertEquals("10", root.getChildText("totalSold"));
			assertEquals("1.5", root.getChildText("averageAmount"));
			assertEquals("12.5", root.getChildText("averagePrice"));
			assertEquals("15.0", root.getChildText("averageSoldPrice"));
			assertEquals("5", root.getChildText("maxStep"));
			assertEquals("10", root.getChildText("targetAmount"));
			assertEquals("5", root.getChildText("deltaAmount"));
			assertEquals("15", root.getChildText("startPrice"));
			assertEquals("true", root.getChildText("used"));
			assertEquals("112", root.getChildText("key"));
			assertEquals("1", root.getChildText("trend"));
			assertEquals("true", root.getChildText("keepPrice"));
			assertEquals("10", root.getChildText("directPrice"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
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
	 * @result The drink is saved to a XML file.
	 */
	@Test
	void testSave() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(10);
		drink.setMaxPrice(20);
		drink.setCurrentPrice(15);
		drink.setLastSold(5);
		drink.setTotalSold(10);
		drink.setAverageAmount(1.5f);
		drink.setAveragePrice(12.5f);
		drink.setAverageSoldPrice(15.0f);
		drink.setMaxStep(5);
		drink.setTargetAmount(10);
		drink.setDeltaAmount(5);
		drink.setStartPrice(15);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(1);
		drink.setKeepPrice(true);
		drink.setDirectPrice(10);
		File file = drink.save();
		assertNotNull(file);
		assertTrue(file.exists());
		assertTrue(file.isFile());
		assertTrue(file.canRead());
		assertTrue(file.canWrite());
		assertTrue(file.length() > 0);
		assertEquals(Drink.DRINKS_FOLDER + "Test.xml", file.getPath());
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(file);
			Element root = doc.getRootElement();
			assertEquals("Test", root.getChildText("name"));
			assertEquals("10", root.getChildText("minPrice"));
			assertEquals("20", root.getChildText("maxPrice"));
			assertEquals("15", root.getChildText("currentPrice"));
			assertEquals("5", root.getChildText("lastSold"));
			assertEquals("10", root.getChildText("totalSold"));
			assertEquals("1.5", root.getChildText("averageAmount"));
			assertEquals("12.5", root.getChildText("averagePrice"));
			assertEquals("15.0", root.getChildText("averageSoldPrice"));
			assertEquals("5", root.getChildText("maxStep"));
			assertEquals("10", root.getChildText("targetAmount"));
			assertEquals("5", root.getChildText("deltaAmount"));
			assertEquals("15", root.getChildText("startPrice"));
			assertEquals("true", root.getChildText("used"));
			assertEquals("112", root.getChildText("key"));
			assertEquals("1", root.getChildText("trend"));
			assertEquals("true", root.getChildText("keepPrice"));
			assertEquals("10", root.getChildText("directPrice"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
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
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_4Test {
		
	/**
	 * Test case for {@link Drink#save()}
	 *
	 * @result The drink is saved to a XML file.
	 */
	@Test
	void testSave() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(10);
		drink.setMaxPrice(20);
		drink.setCurrentPrice(15);
		drink.setLastSold(5);
		drink.setTotalSold(10);
		drink.setAverageAmount(1.5f);
		drink.setAveragePrice(12.5f);
		drink.setAverageSoldPrice(15.0f);
		drink.setMaxStep(5);
		drink.setTargetAmount(10);
		drink.setDeltaAmount(5);
		drink.setStartPrice(15);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(1);
		drink.setKeepPrice(true);
		drink.setDirectPrice(10);
		File file = drink.save();
		assertNotNull(file);
		assertTrue(file.exists());
		assertTrue(file.isFile());
		assertTrue(file.canRead());
		assertTrue(file.canWrite());
		assertTrue(file.length() > 0);
		assertEquals(Drink.DRINKS_FOLDER + "Test.xml", file.getPath());
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(file);
			Element root = doc.getRootElement();
			assertEquals("Test", root.getChildText("name"));
			assertEquals("10", root.getChildText("minPrice"));
			assertEquals("20", root.getChildText("maxPrice"));
			assertEquals("15", root.getChildText("currentPrice"));
			assertEquals("5", root.getChildText("lastSold"));
			assertEquals("10", root.getChildText("totalSold"));
			assertEquals("1.5", root.getChildText("averageAmount"));
			assertEquals("12.5", root.getChildText("averagePrice"));
			assertEquals("15.0", root.getChildText("averageSoldPrice"));
			assertEquals("5", root.getChildText("maxStep"));
			assertEquals("10", root.getChildText("targetAmount"));
			assertEquals("5", root.getChildText("deltaAmount"));
			assertEquals("15", root.getChildText("startPrice"));
			assertEquals("true", root.getChildText("used"));
			assertEquals("112", root.getChildText("key"));
			assertEquals("1", root.getChildText("trend"));
			assertEquals("true", root.getChildText("keepPrice"));
			assertEquals("10", root.getChildText("directPrice"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}

// Drink_5Test.java
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
import static org.junit
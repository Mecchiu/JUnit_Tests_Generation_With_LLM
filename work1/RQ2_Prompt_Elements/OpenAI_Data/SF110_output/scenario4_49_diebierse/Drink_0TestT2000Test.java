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
* It contains ten unit test cases for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {

	/**
	 * Test case for {@link Drink#recalculate()}
	 *
	 * @see Drink#recalculate()
	 */
	@Test
	void testRecalculate_0() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(70);
		drink.setMaxPrice(130);
		drink.setCurrentPrice(100);
		drink.setLastSold(0);
		drink.setTotalSold(0);
		drink.setAverageAmount(0);
		drink.setAveragePrice(0);
		drink.setAverageSoldPrice(0);
		drink.setMaxStep(20);
		drink.setTargetAmount(20);
		drink.setDeltaAmount(15);
		drink.setName("Test");
		drink.setStartPrice(100);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(0);
		drink.setKeepPrice(false);
		drink.setDirectPrice(0);
		drink.recalculate();
		assertEquals(70, drink.getMinPrice());
		assertEquals(130, drink.getMaxPrice());
		assertEquals(100, drink.getCurrentPrice());
		assertEquals(0, drink.getLastSold());
		assertEquals(0, drink.getTotalSold());
		assertEquals(0, drink.getAverageAmount());
		assertEquals(0, drink.getAveragePrice());
		assertEquals(0, drink.getAverageSoldPrice());
		assertEquals(20, drink.getMaxStep());
		assertEquals(20, drink.getTargetAmount());
		assertEquals(15, drink.getDeltaAmount());
		assertEquals("Test", drink.getName());
		assertEquals(100, drink.getStartPrice());
		assertEquals(true, drink.isUsed());
		assertEquals(KeyEvent.VK_F1, drink.getKey());
		assertEquals(0, drink.getTrend());
		assertEquals(false, drink.isKeepPrice());
		assertEquals(0, drink.getDirectPrice());
	}

	/**
	 * Test case for {@link Drink#recalculate()}
	 *
	 * @see Drink#recalculate()
	 */
	@Test
	void testRecalculate_1() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(70);
		drink.setMaxPrice(130);
		drink.setCurrentPrice(100);
		drink.setLastSold(0);
		drink.setTotalSold(0);
		drink.setAverageAmount(0);
		drink.setAveragePrice(0);
		drink.setAverageSoldPrice(0);
		drink.setMaxStep(20);
		drink.setTargetAmount(20);
		drink.setDeltaAmount(15);
		drink.setName("Test");
		drink.setStartPrice(100);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(0);
		drink.setKeepPrice(false);
		drink.setDirectPrice(0);
		drink.recalculate();
		assertEquals(70, drink.getMinPrice());
		assertEquals(130, drink.getMaxPrice());
		assertEquals(100, drink.getCurrentPrice());
		assertEquals(0, drink.getLastSold());
		assertEquals(0, drink.getTotalSold());
		assertEquals(0, drink.getAverageAmount());
		assertEquals(0, drink.getAveragePrice());
		assertEquals(0, drink.getAverageSoldPrice());
		assertEquals(20, drink.getMaxStep());
		assertEquals(20, drink.getTargetAmount());
		assertEquals(15, drink.getDeltaAmount());
		assertEquals("Test", drink.getName());
		assertEquals(100, drink.getStartPrice());
		assertEquals(true, drink.isUsed());
		assertEquals(KeyEvent.VK_F1, drink.getKey());
		assertEquals(0, drink.getTrend());
		assertEquals(false, drink.isKeepPrice());
		assertEquals(0, drink.getDirectPrice());
	}

	/**
	 * Test case for {@link Drink#recalculate()}
	 *
	 * @see Drink#recalculate()
	 */
	@Test
	void testRecalculate_2() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(70);
		drink.setMaxPrice(130);
		drink.setCurrentPrice(100);
		drink.setLastSold(0);
		drink.setTotalSold(0);
		drink.setAverageAmount(0);
		drink.setAveragePrice(0);
		drink.setAverageSoldPrice(0);
		drink.setMaxStep(20);
		drink.setTargetAmount(20);
		drink.setDeltaAmount(15);
		drink.setName("Test");
		drink.setStartPrice(100);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(0);
		drink.setKeepPrice(false);
		drink.setDirectPrice(0);
		drink.recalculate();
		assertEquals(70, drink.getMinPrice());
		assertEquals(130, drink.getMaxPrice());
		assertEquals(100, drink.getCurrentPrice());
		assertEquals(0, drink.getLastSold());
		assertEquals(0, drink.getTotalSold());
		assertEquals(0, drink.getAverageAmount());
		assertEquals(0, drink.getAveragePrice());
		assertEquals(0, drink.getAverageSoldPrice());
		assertEquals(20, drink.getMaxStep());
		assertEquals(20, drink.getTargetAmount());
		assertEquals(15, drink.getDeltaAmount());
		assertEquals("Test", drink.getName());
		assertEquals(100, drink.getStartPrice());
		assertEquals(true, drink.isUsed());
		assertEquals(KeyEvent.VK_F1, drink.getKey());
		assertEquals(0, drink.getTrend());
		assertEquals(false, drink.isKeepPrice());
		assertEquals(0, drink.getDirectPrice());
	}

	/**
	 * Test case for {@link Drink#recalculate()}
	 *
	 * @see Drink#recalculate()
	 */
	@Test
	void testRecalculate_3() {
		Drink drink = new Drink("Test", null);
		drink.setMinPrice(70);
		drink.setMaxPrice(130);
		drink.setCurrentPrice(100);
		drink.setLastSold(0);
		drink.setTotalSold(0);
		drink.setAverageAmount(0);
		drink.setAveragePrice(0);
		drink.setAverageSoldPrice(0);
		drink.setMaxStep(20);
		drink.setTargetAmount(20);
		drink.setDeltaAmount(15);
		drink.setName("Test");
		drink.setStartPrice(100);
		drink.setUsed(true);
		drink.setKey(KeyEvent.VK_F1);
		drink.setTrend(0);
		drink.setKeepPrice(false);
		
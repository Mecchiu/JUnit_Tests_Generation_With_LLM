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
		 * Test case for {@link Drink#recalculate()} method.
		 * Test if the price is increased if the amount of sold drinks is higher than the target amount.
		 */
		@Test
		void testRecalculate_1() {
				Drink drink = new Drink("Test", null);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setCurrentPrice(100);
				drink.setLastSold(15);
				drink.setTotalSold(0);
				drink.setAverageAmount(0);
				drink.setAveragePrice(0);
				drink.setAverageSoldPrice(0);
				drink.setMaxPrice(200);
				drink.setMinPrice(0);
				drink.setStartPrice(100);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				drink.setTrend(0);
				drink.setKeepPrice(false);
				drink.setDirectPrice(0);
				drink.recalculate();
				assertEquals(110, drink.getCurrentPrice());
		}
		
		/**
		 * Test case for {@link Drink#recalculate()} method.
		 * Test if the price is decreased if the amount of sold drinks is lower than the target amount.
		 */
		@Test
		void testRecalculate_2() {
				Drink drink = new Drink("Test", null);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setCurrentPrice(100);
				drink.setLastSold(5);
				drink.setTotalSold(0);
				drink.setAverageAmount(0);
				drink.setAveragePrice(0);
				drink.setAverageSoldPrice(0);
				drink.setMaxPrice(200);
				drink.setMinPrice(0);
				drink.setStartPrice(100);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				drink.setTrend(0);
				drink.setKeepPrice(false);
				drink.setDirectPrice(0);
				drink.recalculate();
				assertEquals(90, drink.getCurrentPrice());
		}
		
		/**
		 * Test case for {@link Drink#recalculate()} method.
		 * Test if the price is increased if the amount of sold drinks is higher than the target amount.
		 * The amount of sold drinks is higher than the target amount + delta amount.
		 */
		@Test
		void testRecalculate_3() {
				Drink drink = new Drink("Test", null);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setCurrentPrice(100);
				drink.setLastSold(20);
				drink.setTotalSold(0);
				drink.setAverageAmount(0);
				drink.setAveragePrice(0);
				drink.setAverageSoldPrice(0);
				drink.setMaxPrice(200);
				drink.setMinPrice(0);
				drink.setStartPrice(100);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				drink.setTrend(0);
				drink.setKeepPrice(false);
				drink.setDirectPrice(0);
				drink.recalculate();
				assertEquals(110, drink.getCurrentPrice());
		}
		
		/**
		 * Test case for {@link Drink#recalculate()} method.
		 * Test if the price is decreased if the amount of sold drinks is lower than the target amount.
		 * The amount of sold drinks is lower than the target amount - delta amount.
		 */
		@Test
		void testRecalculate_4() {
				Drink drink = new Drink("Test", null);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setCurrentPrice(100);
				drink.setLastSold(0);
				drink.setTotalSold(0);
				drink.setAverageAmount(0);
				drink.setAveragePrice(0);
				drink.setAverageSoldPrice(0);
				drink.setMaxPrice(200);
				drink.setMinPrice(0);
				drink.setStartPrice(100);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				drink.setTrend(0);
				drink.setKeepPrice(false);
				drink.setDirectPrice(0);
				drink.recalculate();
				assertEquals(90, drink.getCurrentPrice());
		}
		
		/**
		 * Test case for {@link Drink#recalculate()} method.
		 * Test if the price is increased if the amount of sold drinks is higher than the target amount.
		 * The amount of sold drinks is higher than the target amount + delta amount.
		 * The price is increased by the maximum step.
		 */
		@Test
		void testRecalculate_5() {
				Drink drink = new Drink("Test", null);
				drink.setTargetAmount(10);
				drink.setDeltaAmount(5);
				drink.setMaxStep(10);
				drink.setCurrentPrice(100);
				drink.setLastSold(25);
				drink.setTotalSold(0);
				drink.setAverageAmount(0);
				drink.setAveragePrice(0);
				drink.setAverageSoldPrice(0);
				drink.setMaxPrice(200);
				drink.setMinPrice(0);
				drink.setStartPrice(100);
				drink.setUsed(true);
				drink.setKey(KeyEvent.VK_F1);
				drink.setTrend(0);
				drink.setKeepPrice(false);
				drink.setDirectPrice(0);
				drink.recalculate();
				assertEquals(110, drink.getCurrentPrice());
		}
		
		/**
		 * Test case for {@link Drink#recalculate()} method.
		 * Test if the price is decreased if the amount of sold drinks is lower than the target amount.
		 * The amount of sold drinks is lower than the target amount - delta amount.
		 * The price is decreased by the maximum step.
		 */
		@Test
		void testRecalculate_6() {
				Drink drink =
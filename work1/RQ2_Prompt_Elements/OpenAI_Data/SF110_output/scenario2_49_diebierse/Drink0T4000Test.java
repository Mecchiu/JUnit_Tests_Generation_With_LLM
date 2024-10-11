// DrinkTest.java
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
class DrinkTest {

	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is set to the direct price if a direct price is set.
	 */
	@Test
	void testRecalculateDirectPrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 100;
		// Set the current price
		drink.currentPrice = 50;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is set to the direct price
		assertEquals(100, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is kept if the keep price flag is set.
	 */
	@Test
	void testRecalculateKeepPrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the keep price flag
		drink.keepPrice = true;
		// Set the current price
		drink.currentPrice = 50;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is kept
		assertEquals(50, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is increased if the last sold amount is above the target amount.
	 */
	@Test
	void testRecalculateIncreasePrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 10;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is increased
		assertEquals(60, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is decreased if the last sold amount is below the target amount.
	 */
	@Test
	void testRecalculateDecreasePrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is decreased
		assertEquals(40, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is increased if the last sold amount is above the target amount and the standard logic is disabled.
	 */
	@Test
	void testRecalculateIncreasePriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 10;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is increased
		assertEquals(40, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is decreased if the last sold amount is below the target amount and the standard logic is disabled.
	 */
	@Test
	void testRecalculateDecreasePriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is decreased
		assertEquals(60, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount.
	 */
	@Test
	void testRecalculateNoChange() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(50, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the standard logic is disabled.
	 */
	@Test
	void testRecalculateNoChangeInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(50, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the keep price flag is set.
	 */
	@Test
	void testRecalculateNoChangeKeepPrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the keep price flag
		drink.keepPrice = true;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(50, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the keep price flag is set and the standard logic is disabled.
	 */
	@Test
	void testRecalculateNoChangeKeepPriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the keep price flag
		drink.keepPrice = true;
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(50, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the direct price is set.
	 */
	@Test
	void testRecalculateNoChangeDirectPrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the direct price
		drink.directPrice = 100;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(100, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the direct price is set and the standard logic is disabled.
	 */
	@Test
	void testRecalculateNoChangeDirectPriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the direct price
		drink.directPrice = 100;
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(100, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the direct price is set and the keep price flag is set.
	 */
	@Test
	void testRecalculateNoChangeDirectPriceKeepPrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the direct price
		drink.directPrice = 100;
		// Set the keep price flag
		drink.keepPrice = true;
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(100, drink.currentPrice);
	}
	
	/**
	 * Test case for the {@link Drink#recalculate()} method.
	 * The test case checks if the price is not changed if the last sold amount is equal to the target amount and the direct price is set and the keep price flag is set and the standard logic is disabled.
	 */
	@Test
	void testRecalculateNoChangeDirectPriceKeepPriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the target amount
		drink.targetAmount = 5;
		// Set the delta amount
		drink.deltaAmount = 5;
		// Set the max step
		drink.maxStep = 10;
		// Set the current price
		drink.currentPrice = 50;
		// Set the direct price
		drink.directPrice = 100;
		// Set the keep price flag
		drink.keepPrice = true;
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Call the recalculate method
		drink.recalculate();
		// Check that the current price is not changed
		assertEquals(100, drink.currentPrice);
	}
}

// Drink.java
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

/**
 * @author Rainer Friesen
 */
public class Drink {

    /**
     * Recalculate the current price for this drink
     */
    public int recalculate() {
        //Calculate new average values
        totalSold += lastSold;
        averageAmount = (float) totalSold / model.getIteration();
        averagePrice = ((averagePrice * (model.getIteration() - 1)) + currentPrice) / model.getIteration();
        if (totalSold > 0) {
            averageSoldPrice = ((averageSoldPrice * (totalSold - lastSold)) + (currentPrice * lastSold)) / totalSold;
        }
        int newPrice;
        if (directPrice != 0) {
            // If a direct price was set, use it
            newPrice = directPrice;
            directPrice = 0;
        } else if (keepPrice) {
            // Keep the price
            newPrice = currentPrice;
        } else {
            // Calculate the new price
            double diffSold = lastSold - targetAmount;
            double factor = diffSold / deltaAmount;
            double change = factor * maxStep;
            int priceSteps = model.getSettings().getPriceSteps();
            double rest = Math.floor(Math.abs(change %
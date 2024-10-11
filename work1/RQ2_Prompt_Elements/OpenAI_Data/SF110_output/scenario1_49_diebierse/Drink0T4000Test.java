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
		// Set the last sold amount
		drink.lastSold = 10;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = false;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(10);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(true);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is the direct price
		assertEquals(100, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is kept if the keep price flag is set.
	*/
	@Test
	void testRecalculateKeepPrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 10;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = true;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(10);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(true);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is the current price
		assertEquals(50, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is increased if the last sold amount is above the target amount.
	*/
	@Test
	void testRecalculateIncreasePrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 20;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = false;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(10);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(true);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is increased
		assertEquals(60, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is decreased if the last sold amount is below the target amount.
	*/
	@Test
	void testRecalculateDecreasePrice() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = false;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(10);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(true);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is decreased
		assertEquals(40, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is increased if the last sold amount is above the target amount and the standard logic flag is set to false.
	*/
	@Test
	void testRecalculateIncreasePriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 20;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = false;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(10);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is increased
		assertEquals(40, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is decreased if the last sold amount is below the target amount and the standard logic flag is set to false.
	*/
	@Test
	void testRecalculateDecreasePriceInverseLogic() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = false;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(10);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(false);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is decreased
		assertEquals(60, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is increased if the last sold amount is above the target amount and the price steps are set to 5.
	*/
	@Test
	void testRecalculateIncreasePricePriceSteps5() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 20;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice = 100;
		// Set the trend
		drink.trend = 0;
		// Set the keep price flag
		drink.keepPrice = false;
		// Set the model
		drink.model = new Model();
		// Set the iteration
		drink.model.setIteration(1);
		// Set the settings
		drink.model.setSettings(new Settings());
		// Set the price steps
		drink.model.getSettings().setPriceSteps(5);
		// Set the standard logic flag
		drink.model.getSettings().setStandardLogic(true);
		// Recalculate the drink
		int newPrice = drink.recalculate();
		// Check that the new price is increased
		assertEquals(55, newPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is decreased if the last sold amount is below the target amount and the price steps are set to 5.
	*/
	@Test
	void testRecalculateDecreasePricePriceSteps5() {
		// Create a new drink
		Drink drink = new Drink();
		// Set the direct price
		drink.directPrice = 0;
		// Set the current price
		drink.currentPrice = 50;
		// Set the last sold amount
		drink.lastSold = 5;
		// Set the total sold amount
		drink.totalSold = 100;
		// Set the average amount
		drink.averageAmount = 10;
		// Set the average price
		drink.averagePrice = 50;
		// Set the average sold price
		drink.averageSoldPrice = 50;
		// Set the target amount
		drink.targetAmount = 10;
		// Set the delta amount
		drink.deltaAmount = 10;
		// Set the max step
		drink.maxStep = 10;
		// Set the min price
		drink.minPrice = 10;
		// Set the max price
		drink.maxPrice
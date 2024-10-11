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
		Drink drink = new Drink();
		drink.directPrice = 10;
		drink.currentPrice = 5;
		drink.recalculate();
		assertEquals(10, drink.currentPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateKeepPrice() {
		Drink drink = new Drink();
		drink.keepPrice = true;
		drink.currentPrice = 5;
		drink.recalculate();
		assertEquals(5, drink.currentPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateStandardLogic() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(true);
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.recalculate();
		assertEquals(15, drink.currentPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateInverseLogic() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(false);
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.recalculate();
		assertEquals(-5, drink.currentPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateMaxPrice() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(true);
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.maxPrice = 15;
		drink.recalculate();
		assertEquals(15, drink.currentPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateMinPrice() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(false);
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.minPrice = -15;
		drink.recalculate();
		assertEquals(-15, drink.currentPrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateTrend() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(true);
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.recalculate();
		assertEquals(1, drink.trend);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateAverageAmount() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(true);
		drink.model.iteration = 2;
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.totalSold = 10;
		drink.recalculate();
		assertEquals(7.5, drink.averageAmount);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateAveragePrice() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(true);
		drink.model.iteration = 2;
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.totalSold = 10;
		drink.averagePrice = 5;
		drink.recalculate();
		assertEquals(10, drink.averagePrice);
	}
	
	/**
	* Test case for the {@link Drink#recalculate()} method.
	* The test case checks if the price is set to the direct price if a direct price is set.
	*/
	@Test
	void testRecalculateAverageSoldPrice() {
		Drink drink = new Drink();
		drink.model = new Model();
		drink.model.settings = new Settings();
		drink.model.settings.setStandardLogic(true);
		drink.model.iteration = 2;
		drink.currentPrice = 5;
		drink.lastSold = 10;
		drink.targetAmount = 5;
		drink.deltaAmount = 5;
		drink.maxStep = 10;
		drink.totalSold = 10;
		drink.averagePrice = 5;
		drink.averageSoldPrice = 5;
		drink.recalculate();
		assertEquals(7.5, drink.averageSold
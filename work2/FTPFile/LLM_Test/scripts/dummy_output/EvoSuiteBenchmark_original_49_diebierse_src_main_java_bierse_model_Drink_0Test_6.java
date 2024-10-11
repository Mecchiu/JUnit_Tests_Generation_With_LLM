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
	 * Constructor
	 */
	public Drink_0Test() {
	}
	
	/**
	 * @return Returns the current price(Cent).
	 */
	public int getCurrentPrice() {
		return Integer.valueOf(currentPrice);
	}
	
	/**
	 * @param price The current price(cent) to set
	 */
	public void setCurrentPrice(int price) {
		currentPrice = price;
	}
	
	/**
	 * @return Returns the max price.
	 */
	public int getMaxPrice() {
		return Integer.valueOf(maxPrice);
	}
	
	/**
	 * @param price The max price to set
	 */
	public void setMaxPrice(int price) {
		maxPrice = price;
	}
	/**
	 * @return Returns the trend amount.
	 */
	public int getTrend() {
		return Integer.valueOf(trend);
	}
	
	/**
	 * @param trend The trend amount to set
	 */
	public void setTrend(int trend) {
		trend = trend;
	}
	/**
	 * @return Returns the min price.
	 */
	public int getMinPrice() {
		return Integer.valueOf(minPrice);
	}
	
	/**
	 * @param minPrice The min price to set
	 */
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	
	/**
	 * @return Returns the max steps amount.
	 */
	public int getMaxStep() {
		return Integer.valueOf(maxStep);
	}
	
	/**
	 * @param maxStep The max steps amount to set
	 */
	public void setMaxStep(int maxStep) {
		this.maxStep = maxStep;
	}
	
	/**
	 * Sets whether the price is calculated and if so
	 * the the price will be set to the maximum price for it.
	 */
	public void setKeepPrice(boolean keepPrice) {
		this.keepPrice = keepPrice;
	}
	
	/**
	 * This method is executed whenever the amount of currently sold drinks has changed.
	 * It stores an amount of currently sold and calculates the new price.
	 */
	public void calculateNewPrice() {
		currentPrice += deltaAmount;
}
}
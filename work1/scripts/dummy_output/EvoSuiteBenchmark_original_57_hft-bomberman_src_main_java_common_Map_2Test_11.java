// Map_2Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {
		/**
		* setters for map_properties
		*
		* @param name
		*            -
		*/
	public Map_2Test(String name) {
		this.name = name;
	}

	/**
	* Test for "getStartPoint" method getter and method setter of Map
	*
	*/
	@Test
	public void Map_2Test_1_getStartPoint() {
		// set up arguments
		Map map = new Map();
		Vector<PowerUp> powerups = new Vector<PowerUp>();

		// set up start-point
		Point startPoint = new Point(1, 1);

		// set up powerup
		PowerUp wc = new PowerUp(new Tile(1, 1), 4);

		// set up start-point
}
}
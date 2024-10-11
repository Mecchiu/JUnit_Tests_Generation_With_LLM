// Map_0Test.java
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
* It contains one unit test case for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {
		
	// test method for getTileByIndex
	// verify that it return a MapTile object
		@Test
		public void getTileByIndex() {
			Map<Point, String> aMap = new Map<Point, String>();
			int field = 0;

			Vector<Point> fieldVector = new Vector<Point>();
			// add a tile on the first field
				fieldVector.add(((Point) aMap.getTile(((Point) aMap.getStartPoints().get(0)).x,
						((Point) aMap.getStartPoints().get(0)).y)));

			aMap = new Map<Point, String>(fieldVector);

			assertNotNull(aMap);

			field = 1;
			Iterator<Point> it = aMap.iterator();

			// add
}
}
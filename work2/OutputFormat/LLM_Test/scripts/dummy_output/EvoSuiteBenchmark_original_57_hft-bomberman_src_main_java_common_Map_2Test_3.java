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
		static final String mapFilePath = "/home/chris/testmaps/2.xml";

		@Test
		public void test1() {
			//load map-object from path:
			Map mapfile = new Map(mapFilePath);
			Point startPoint = mapfile.getStartPoints()[0];
			Vector<Point> coordinates = mapfile.getCoordinates(startPoint.x, startPoint.y);
			System.out.println("Start: " + startPoint + " -> " + coordinates);
		}
}
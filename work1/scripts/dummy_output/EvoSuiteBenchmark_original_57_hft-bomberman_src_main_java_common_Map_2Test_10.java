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
		static final String xmlFile = "test/map/map-2test.xml";
        
        Point startPoint;
		
        Vector<Tile> startTiles = new Vector<Tile>();
        
		// Map's own startPoint to test
		Point temp = null;
		
		public Map() {
			// use default start point for getStartPoint
			startPoint = new Point(new Point(0, 0));
		}
		
		// Setter for the start point
		public void setStartPoint(Point start) {
			startPoint = new Point(start);
		}

        void setStartTiles(Vector<Tile> start) {
            startTiles = new Vector<Tile>(start);
        }

        void setTests() {
}
}
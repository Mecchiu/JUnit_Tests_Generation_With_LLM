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
		private int start;
		private int end;
		private int height;
		private int width;
		private int tileWidth;
		private int total;
		private int numStartTiles;
		private int tileNum;
		private int tileIndex;
    
    
    	public Map_0Test(int start, int end, int height, int width,
					   int tileWidth, int total,
					   int tileNum, int tileIndex, 
					   Point start1, Point start2) {
			this.start = start;
			this.end = end;
			this.height = height;
			this.width = width;
			this.tileWidth = tileWidth;
			this.total = total;
			this.numStartTiles = tileNum;
}
}
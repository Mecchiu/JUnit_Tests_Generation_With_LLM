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
Vector<Tile> tileList;
    @Test
    void test_01_01() {
        assertNotNull(new Map(MapGrid[0][0]/* tile */, 30));
    }
}

// MapGrid.java
class MapGrid {
    public double[] width;
    public double[] height;
    public Iterator<Tile> iterator;
    
    public MapGrid() {
    	width = new double[6];
    	height = new double[6];
    }

    public void setTileList(Vector<Tile> tileList) {
    	this.tileList = tileList;
    }
}

// Map
class Map {
    
    private final MapGrid grid;
	
    public Map(MapGrid grid) {
    	this.grid = grid;
	}
	
	public Map() {
		this.grid = new MapGrid();
		grid.setTileList(null);
	}
	
	/**
	 * 
	 * @param tile
	 * @return tile
	 */
	public Tile tileAtIndex(int x, inty) {
		return (Tile) grid.iterator.next();
	}
    //@Override
	public Iterator<Tile> iterator() {
		return grid.iterator;
	}
}
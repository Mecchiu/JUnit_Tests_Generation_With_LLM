// MapReaderTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapReader}.
* It contains ten unit test cases for the {@link MapReader#getXMLValue(Node, String)} method.
*/
class MapReaderTest {

	/**
	* Test case for {@link MapReader#getXMLValue(Node, String)} method.
	* It tests if the method returns the correct value for a given node and XPath expression.
	*/
	@Test
	void testGetXMLValue() {
		// TODO
	}
}

// MapWriter.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Writes a map-object to a XML-file
 *
 * @author christian
 */
public class MapWriter {

    /**
     * Writes a map-object to a XML-file
     *
     * @param map -
     *            map-object to be written
     * @param fileName -
     *            name of the file to be written
     */
    public void writeMap(Map map, String fileName);
}

// MapWriterTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapWriter}.
* It contains ten unit test cases for the {@link MapWriter#writeMap(Map, String)} method.
*/
class MapWriterTest {
		
	/**
	* Test case for {@link MapWriter#writeMap(Map, String)} method.
	* It tests if the method writes the correct values to a given file.
	*/
	@Test
	void testWriteMap() {
		// TODO
	}
}

// Map.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Class for a map
 *
 * @author christian
 */
public class Map {

    /**
     * Returns the width of the map
     *
     * @return int - width of the map
     */
    public int getWidth();

    /**
     * Returns the height of the map
     *
     * @return int - height of the map
     */
    public int getHeight();

    /**
     * Returns the tile at a specific position
     *
     * @param x -
     *            x-coordinate of the tile
     * @param y -
     *            y-coordinate of the tile
     * @return Tile - tile at the given position
     */
    public Tile getTile(int x, int y);

    /**
     * Returns the start point of a player
     *
     * @param player -
     *            player whose start point should be returned
     * @return Point - start point of the player
     */
    public Point getStartPoint(Player player);
}

// MapTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#getWidth()}, {@link Map#getHeight()}, {@link Map#getTile(int, int)} and {@link Map#getStartPoint(Player)} methods.
*/
class MapTest {
		
	/**
	* Test case for {@link Map#getWidth()} method.
	* It tests if the method returns the correct width of the map.
	*/
	@Test
	void testGetWidth() {
		// TODO
	}
	
	/**
	* Test case for {@link Map#getHeight()} method.
	* It tests if the method returns the correct height of the map.
	*/
	@Test
	void testGetHeight() {
		// TODO
	}
	
	/**
	* Test case for {@link Map#getTile(int, int)} method.
	* It tests if the method returns the correct tile at a given position.
	*/
	@Test
	void testGetTile() {
		// TODO
	}
	
	/**
	* Test case for {@link Map#getStartPoint(Player)} method.
	* It tests if the method returns the correct start point of a given player.
	*/
	@Test
	void testGetStartPoint() {
		// TODO
	}
}

// Tile.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Class for a tile
 *
 * @author christian
 */
public class Tile {

    /**
     * Returns the type of the tile
     *
     * @return TileType - type of the tile
     */
    public TileType getType();
}

// TileTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tile}.
* It contains ten unit test cases for the {@link Tile#getType()} method.
*/
class TileTest {
		
	/**
	* Test case for {@link Tile#getType()} method.
	* It tests if the method returns the correct type of the tile.
	*/
	@Test
	void testGetType() {
		// TODO
	}
}

// TileType.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Enumeration for the different types of tiles
 *
 * @author christian
 */
public enum TileType {

    /**
     * Tile is a normal tile
     */
    NORMAL,

    /**
     * Tile is a start tile
     */
    START,

    /**
     * Tile is a finish tile
     */
    FINISH,

    /**
     * Tile is a wall
     */
    WALL,

    /**
     * Tile is a water tile
     */
    WATER,

    /**
     * Tile is a mud tile
     */
    MUD,

    /**
     * Tile is a ice tile
     */
    ICE,

    /**
     * Tile is a teleport tile
     */
    TELEPORT,

    /**
     * Tile is a boost tile
     */
    BOOST
}

// TileTypeTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions
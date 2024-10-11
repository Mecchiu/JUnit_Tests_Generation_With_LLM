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
	* It tests if the method returns the correct value for a given XPath expression.
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
     *            name of the XML-file
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
	* It tests if the method writes the correct values to the XML-file.
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
     * Returns the name of the map
     *
     * @return String - name of the map
     */
    public String getName();

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
     * Returns the number of players
     *
     * @return int - number of players
     */
    public int getPlayerCount();

    /**
     * Returns the start point of a player
     *
     * @param player -
     *            number of the player
     * @return Point - start point of the player
     */
    public Point getStartPoint(int player);

    /**
     * Returns the tile at a specific position
     *
     * @param x -
     *            x-coordinate of the position
     * @param y -
     *            y-coordinate of the position
     * @return Tile - tile at the position
     */
    public Tile getTile(int x, int y);

    /**
     * Sets the tile at a specific position
     *
     * @param x -
     *            x-coordinate of the position
     * @param y -
     *            y-coordinate of the position
     * @param tile -
     *            tile to be set
     */
    public void setTile(int x, int y, Tile tile);
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
* It contains ten unit test cases for the {@link Map#getName()}, {@link Map#getWidth()}, {@link Map#getHeight()}, {@link Map#getPlayerCount()}, {@link Map#getStartPoint(int)}, {@link Map#getTile(int, int)} and {@link Map#setTile(int, int, Tile)} methods.
*/
class MapTest {
		
	/**
	* Test case for {@link Map#getName()} method.
	* It tests if the method returns the correct name of the map.
	*/
	@Test
	void testGetName() {
		// TODO
	}
	
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
	* Test case for {@link Map#getPlayerCount()} method.
	* It tests if the method returns the correct number of players.
	*/
	@Test
	void testGetPlayerCount() {
		// TODO
	}
	
	/**
	* Test case for {@link Map#getStartPoint(int)} method.
	* It tests if the method returns the correct start point of a player.
	*/
	@Test
	void testGetStartPoint() {
		// TODO
	}
	
	/**
	* Test case for {@link Map#getTile(int, int)} method.
	* It tests if the method returns the correct tile at a specific position.
	*/
	@Test
	void testGetTile() {
		// TODO
	}
	
	/**
	* Test case for {@link Map#setTile(int, int, Tile)} method.
	* It tests if the method sets the correct tile at a specific position.
	*/
	@Test
	void testSetTile() {
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
     * @return int - type of the tile
     */
    public int getType();

    /**
     * Returns the owner of the tile
     *
     * @return int - owner of the tile
     */
    public int getOwner();

    /**
     * Returns the strength of the tile
     *
     * @return int - strength of the tile
     */
    public int getStrength();

    /**
     * Sets the type of the tile
     *
     * @param type -
     *            type to be set
     */
    public void setType(int type);

    /**
     * Sets the owner of the tile
     *
     * @param owner -
     *            owner to be set
     */
    public void setOwner(int owner);

    /**
     * Sets the strength of the tile
     *
     * @param strength -
     *            strength to be set
     */
    public void setStrength(int strength);
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
* It contains ten unit test cases for the {@link Tile#getType()}, {@link Tile#getOwner()}, {@link Tile#getStrength()}, {@link Tile#setType(int)}, {@link Tile#setOwner(int)} and {@link Tile#setStrength(int)} methods.
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
	
	/**
	* Test case for {@link Tile#getOwner()} method.
	* It tests if the method returns the correct owner of the tile.
	*/
	@Test
	void testGetOwner() {
		// TODO
	}
	
	/**
	* Test case for {@link Tile#getStrength()} method.
	* It tests if the method returns the correct strength of the tile.
	*/
	@Test
	void testGetStrength() {
		// TODO
	}
	
	/**
	* Test case for {@link Tile#setType(int)} method.
	* It tests if the method sets the correct type of the tile.
	*/
	@Test
	void testSetType() {
		// TODO
	}
	
	/**
	* Test case for {@link Tile#setOwner(int)} method.
	* It tests if the method sets the correct owner of the tile.
	*/
	@Test
	void testSetOwner() {
		// TODO
	}
	
	/**
	* Test case for {@link Tile#setStrength(int)} method.
	* It tests if the method sets the correct strength of the tile.
	*/
	@Test
	void testSetStrength() {
		// TODO
	}
}

// Game.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Class for a game
 *
 * @author christian
 */
public class Game {

    /**
     * Returns the name of the game
     *
     * @return String - name of the game
     */
    public String getName();

    /**
     * Returns the map of the game
     *
     * @return Map - map of the game
     */
    public Map getMap();

    /**
     * Returns the number of players
     *
     * @return int - number of players
     */
    public int getPlayerCount();

    /**
     * Returns the name of a player
     *
     * @param player -
     *            number of the player
     * @return String - name of the player
     */
    public String getPlayerName(int player);

    /**
     * Returns the color of a player
     *
     * @param player -
     *            number of the player
     * @return int - color of the player
     */
    public int getPlayerColor(int player);

    /**
     * Returns the score of a player
     *
     * @param player -
     *            number of the player
     * @return int - score of the player
     */
    public int getPlayerScore(int player);

    /**
     * Returns the number of the current player
     *
     * @return int - number of the current player
     */
    public int getCurrentPlayer();

    /**
     * Returns the number of the winner
     *
     * @return int - number of the winner
     */
    public int getWinner();

    /**
     * Returns the number of the last player
     *
     * @return int - number of the last player
     */
    public int getLastPlayer();

    /**
     * Returns the number of the last move
     *
     * @return int - number of the last move
     */
    public int getLastMove();

    /**
     * Returns the number of the last move of a player
     *
     * @param player -
     *            number of the player
     * @return int - number of the last move of the player
     */
    public int getLastMove(int player);

    /**
     * Returns the number of the last move of a player
     *
     * @param player -
     *            number of the player
     * @param move -
     *            number of the move
     * @return int - number of the move of the player
     */
    public int getMove(int player, int move);

    /**
     * Returns the number of moves of a player
     *
     * @param player -
     *            number of the player
     * @return int - number of moves of the player
     */
    public int getMoveCount(int player);

    /**
     * Returns the number of moves
     *
     * @return int - number of moves
     */
    public int getMoveCount();

    /**
     * Returns the number of the last move of a player
     *
     * @param player -
     *            number of the player
     * @param move -
     *            number of the move
     * @return int - number of the move of the player
     */
    public int getMove(int player, int move);

    /**
     * Returns the number of moves of a player
     *
     * @param player -
     *            number of the player
     * @return int - number of moves of the player
     */
    public int getMoveCount(int player);

    /**
     * Returns the number of moves
     *
     * @return int - number of moves
     */
    public int getMoveCount();

    /**
     * Returns the number of the last move of a player
     *
     * @param player -
     *            number of the player
     * @param move -
     *            number of the move
     * @return int - number of the move of the player
     */
    public int getMove(int player, int move);

    /**
     * Returns the number of moves of a player
     *
     * @param player -
     *            number of the player
     * @return int - number of moves of the player
     */
    public int getMoveCount(int player);

    /**
     * Returns the number of moves
     *
     * @return int - number of moves
     */
    public int getMoveCount();

    /**
     * Returns the number of the last move of a player
     *
     * @param player -
     *            number of the player
     * @param move -
     *            number of the move
     * @return int - number of the move of the player
     */
    public int getMove(int player, int move);

    /**
     * Returns the number of moves of a player
     *
     * @param player -
     *            number of the player
     * @return int - number of moves of the player
     */
    public int getMoveCount(int player);

    /**
     * Returns the number of moves
     *
     * @return int - number of moves
     */
    public int getMoveCount();

    /**
     * Returns the number of the last move of a player
     *
     * @param player -
     *            number of the player
     * @param move -
     *            number of the move
     * @return int - number of the move of the player
     */
    public int getMove(int player, int move);

    /**
     * Returns the number of moves of a player
     *
     * @param player -
     *            number of the player
     * @return int - number of moves of the player
     */
    public int getMoveCount(int player);

    /**
     * Returns the number of moves
     *
     * @return int - number of moves
     */
    public int
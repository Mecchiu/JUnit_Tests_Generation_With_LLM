// Map_1Test.java
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
* It contains one unit test case for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {
@Test
	    public void testGetTileEmptyRectangle() {
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		Vector<Point> v = new Vector<>();
		MapTile mtt;
		Iterator<Point> it;
		
		// Initialize to empty map.
		for(x1 = Constants.TILE_BORDER;
				x1 < Constants.TILE_SIZE;
				x2 = x1

							+ Constants.TILE_SIZE
								) ;
		for(x1 = Constants.TILE_SIZE-Constants.TILE_BORDER;
				x1 < Constants.TILE_SIZE;
				x2 = x1 + 2 * Constants.TILE_BORDER) ;
		for(y1 = Constants.TILE_ID;
				y1 < Constants.TILE_SIZE; 
				y2 += Constants.TILE_SIZE) ;
		for(y1 = y1 + Constants.TILE_SIZE * 2 - Constants.TILE_SIZE;
				y1 < Constants.TILE_SIZE; 
				y2 += (Constants.TILE_SIZE * 2)) ;
		
		// Iterate through the map.
		it = v.iterator();
		while(it.hasNext()) {
			mtt = (MapTile) it.next().get(0);
			assertTrue("The mtt is null.", mtt!= null);
			assertEquals("The mtt.z is not x1 + y1", x1 + y1,	mtt.z);
			assertEquals("The mtt.y is not y2", y2, mtt.y);
			assertEquals("The mtt.z is not x1 - y1", x1 - y1,	mtt.z);
			assertEquals("The mtt.x is not x2", x2, mtt.x);
			assertEquals("The mtt.z is not y1 + y2", y1 + y2, mtt.z);
			assertEquals("The mtt.y is not y2 + y1", y2 + y1, mtt.y);
		}
	}
	
} /* class Map_1Test */


// Map_2Test.java
package common;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Ignore;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.ExtendWith;
import org.junit.jupiter.api.Test;

import common.MapTile;


/**
* Test class of {@link Map}.
* It contains one unit test for Map.getTile(int, int) and for iterator in a
* map of power-up.
*/
@ExtendWith(org.junit.ExtendWith.class)
@Ignore
public class Map_2Test extends Map_1Test {

    @BeforeAll
    public static void setUpB() throws Exception {
    	  MapGrid = new MapTile[Constants.TILE_SIZE][Constants.TILE_SIZE];

    	  for(int x = 0; x < Constants.TILE_SIZE; x++)
    	  	for(int y = 0; y < Constants.TILE_SIZE; y++) {
    	  		MapGrid[x][y] = new MapTile((byte) y,(byte) x);
    	  	}

    	  for(int t = 0; t < Constants.TILE_SIZE; t++)
    	  	if (t < 14) MapGrid[t][t] = new MapTile(0,t);
    	  else
    	  	MapGrid[t][5] = 8;

	  
		  // Initialize with null grid.
    	  MapTile nullTile = new MapTile((byte) 10,(byte) 10);
    	  MapTile mapTile = nullTile;
    	  MapTile mtt;
    	  MapTileIterator iter;
    	  {
    	  	Vector<Point> v = new Vector<Point>();
    	  	for(int x = 0; x < Constants.TILE_SIZE; x++)
				for(int y = 0; y < Constants.TILE_SIZE; y++)
					if(MapGrid[x][y] == null) v.add(new Point(x,y));
    	  	iter = v.iterator();
    	  	while(iter.hasNext()) { mapTile = MapGrid[iter.next().getX()][iter.next().getY()];}
    	  }
    	  assertNotNull("Null-tile is null.", mapTile);


    	  MapTile emptyTile = new MapTile((byte) 15,(byte) 15);
    	  MapTileIterator emptyIter = new EmptyTileIterator();
    	  MapTile powerUp = MapGrid[0][0];
    	  Iterator<Point> emptyIT = emptyTile.powerupIterator();
    	  Iterator<Point> nullIT = nullTile.powerupIterator();
    	  Iterator<Point> iter1 = nullIter.powerupIterator();
    	  Iterator<Point> iter2 = iter1.powerupIterator();
    	  Iterator<Point> iter3 = mapTile.powerupIterator();
    	  do {powerUp = iteratorToPowerUp(powerUp);
    	  }
    	  while(powerUp.type == PowerUp.COUMA_POWERUP);
    	  assertEquals("Type is PowerUp.COUMA_POWERUP", powerUp, powerUp);
    	  assertFalse("NullTIle is null", mapTile.powerupIterator().hasNext());
    	  assertFalse("NullTIle is null", mapTile.powerupIterator().hasNext());
    	  assertTrue("NullTIle is null", iter1.hasNext());
    	  assertFalse("NullTIle is null", iter2.hasNext());
    	  assertFalse("EmptyTIle is not null", iter3.hasNext());
    	  // Create and power up.
    	  powerUp = powerUpIteratorToPowerUp(powerUp);
    	  assertEquals("Type is PowerUpIterator.COUMA_POWERUP", powerUp, powerUp);
    	  // Empty tile.
    	  mapTile.powerupIterator().next();
    	  assertFalse("NullTIle is null", mapTile.powerupIterator().hasNext());
    	  assertTrue("EmptyTIle is not null", emptyTIle.powerupIterator().hasNext());
    	  // Power up is not in the empty tile.
    	  powerUp = powerUpToPower
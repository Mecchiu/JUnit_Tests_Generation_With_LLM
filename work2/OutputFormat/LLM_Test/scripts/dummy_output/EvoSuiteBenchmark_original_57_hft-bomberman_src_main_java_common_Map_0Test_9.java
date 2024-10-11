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
		private Tile tile;
        
        private PowerUp start;
        
        private PowerUp powerup;
         
        private Tile newTileStart;
        
        private Tile newTilePowerup;
        
        private Point newLocation;
        
        private String filename;
        
        @Test
        void getTileByIndex_newTilePowerup() {
            //create a tile on the map with powerup "Tile0"
            tile = new PowerUp(newPowerup = new Tile(0, 0), true);
            newTilePowerup = tile.getTile(1, 1);
            assertNotNull(newTilePowerup);
        }
        
        @Test
        void getTileByIndex_noTileTile() {
		    tile = new PowerUp(null, true);
			//
}
}
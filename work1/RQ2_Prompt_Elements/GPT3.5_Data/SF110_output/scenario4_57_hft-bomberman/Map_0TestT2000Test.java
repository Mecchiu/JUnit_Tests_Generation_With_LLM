// This is a test class for the Map class
// It contains ten unit test cases for the getTileByIndex method

package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Map_0Test {

    // Test case 1: Test if getTileByIndex returns the correct tile
    @Test
    void testGetTileByIndexReturnsCorrectTile() {
        Map map = new Map("test.xml");
        Tile expectedTile = new Tile(TileType.EMPTY);
        map.setTileByIndex(0, 0, expectedTile);
        Tile actualTile = map.getTileByIndex(0, 0);
        assertEquals(expectedTile, actualTile);
    }

    // Test case 2: Test if getTileByIndex returns null for out of bounds index
    @Test
    void testGetTileByIndexReturnsNullForOutOfBoundsIndex() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTileByIndex(100, 100);
        assertNull(actualTile);
    }

    // Test case 3: Test if getTileByIndex returns null for negative index
    @Test
    void testGetTileByIndexReturnsNullForNegativeIndex() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTileByIndex(-1, -1);
        assertNull(actualTile);
    }

    // Test case 4: Test if getTileByIndex returns null for non-integer index
    @Test
    void testGetTileByIndexReturnsNullForNonIntegerIndex() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTileByIndex(0, 0.5);
        assertNull(actualTile);
    }

    // Test case 5: Test if getTileByIndex returns null for non-existent map
    @Test
    void testGetTileByIndexReturnsNullForNonExistentMap() {
        Map map = new Map("nonexistent.xml");
        Tile actualTile = map.getTileByIndex(0, 0);
        assertNull(actualTile);
    }

    // Test case 6: Test if getTileByIndex returns null for null map
    @Test
    void testGetTileByIndexReturnsNullForNullMap() {
        Map map = null;
        Tile actualTile = map.getTileByIndex(0, 0);
        assertNull(actualTile);
    }

    // Test case 7: Test if getTileByIndex returns null for uninitialized map
    @Test
    void testGetTileByIndexReturnsNullForUninitializedMap() {
        Map map = new Map("test.xml", false, false, false);
        Tile actualTile = map.getTileByIndex(0, 0);
        assertNull(actualTile);
    }

    // Test case 8: Test if getTileByIndex returns null for uninitialized tile
    @Test
    void testGetTileByIndexReturnsNullForUninitializedTile() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTileByIndex(0, 0);
        assertNull(actualTile);
    }

    // Test case 9: Test if getTileByIndex returns null for uninitialized index
    @Test
    void testGetTileByIndexReturnsNullForUninitializedIndex() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTileByIndex(0, -1);
        assertNull(actualTile);
    }

    // Test case 10: Test if getTileByIndex returns null for uninitialized coordinates
    @Test
    void testGetTileByIndexReturnsNullForUninitializedCoordinates() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTileByIndex(-1, 0);
        assertNull(actualTile);
    }
}
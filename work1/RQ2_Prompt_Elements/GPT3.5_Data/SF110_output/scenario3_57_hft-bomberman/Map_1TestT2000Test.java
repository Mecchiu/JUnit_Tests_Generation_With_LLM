// Map_1Test.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Map}.
 * It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
 */
class Map_1Test {

    @Test
    void testGetTile() {
        Map map = new Map();
        Tile tile = map.getTile(0, 0);
        assertNotNull(tile);
    }

    @Test
    void testGetTileOutOfBounds() {
        Map map = new Map();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            map.getTile(-1, -1);
        });
    }

    @Test
    void testGetTileNull() {
        Map map = new Map();
        Tile tile = map.getTile(1, 1);
        assertNull(tile);
    }

    @Test
    void testGetTileTopLeftCorner() {
        Map map = new Map();
        Tile tile = map.getTile(0, 0);
        assertNotNull(tile);
        assertEquals(new Point(0, 0), tile.getPosition());
    }

    @Test
    void testGetTileTopRightCorner() {
        Map map = new Map();
        Tile tile = map.getTile(9, 0);
        assertNotNull(tile);
        assertEquals(new Point(9, 0), tile.getPosition());
    }

    @Test
    void testGetTileBottomLeftCorner() {
        Map map = new Map();
        Tile tile = map.getTile(0, 9);
        assertNotNull(tile);
        assertEquals(new Point(0, 9), tile.getPosition());
    }

    @Test
    void testGetTileBottomRightCorner() {
        Map map = new Map();
        Tile tile = map.getTile(9, 9);
        assertNotNull(tile);
        assertEquals(new Point(9, 9), tile.getPosition());
    }

    @Test
    void testGetTileMiddle() {
        Map map = new Map();
        Tile tile = map.getTile(5, 5);
        assertNotNull(tile);
        assertEquals(new Point(5, 5), tile.getPosition());
    }

    @Test
    void testGetTileEdge() {
        Map map = new Map();
        Tile tile = map.getTile(0, 5);
        assertNotNull(tile);
        assertEquals(new Point(0, 5), tile.getPosition());
    }

    @Test
    void testGetTileNegative() {
        Map map = new Map();
        Tile tile = map.getTile(-5, -5);
        assertNull(tile);
    }
}
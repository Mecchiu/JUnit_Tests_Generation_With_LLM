// Here's an example implementation of the Map_0Test class with ten unit test cases for the getTileByIndex method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Map_0Test {

    @Test
    void testGetTileByIndex() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(0, 0);
        assertNotNull(tile);
    }

    @Test
    void testGetTileByIndexOutOfBounds() {
        Map map = new Map();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            map.getTileByIndex(-1, -1);
        });
    }

    @Test
    void testGetTileByIndexNull() {
        Map map = new Map();
        assertNull(map.getTileByIndex(1, 1));
    }

    @Test
    void testGetTileByIndexTopLeft() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(0, 0);
        assertEquals(new Point(0, 0), tile.getPosition());
    }

    @Test
    void testGetTileByIndexTopRight() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(9, 0);
        assertEquals(new Point(9, 0), tile.getPosition());
    }

    @Test
    void testGetTileByIndexBottomLeft() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(0, 9);
        assertEquals(new Point(0, 9), tile.getPosition());
    }

    @Test
    void testGetTileByIndexBottomRight() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(9, 9);
        assertEquals(new Point(9, 9), tile.getPosition());
    }

    @Test
    void testGetTileByIndexMiddle() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(5, 5);
        assertEquals(new Point(5, 5), tile.getPosition());
    }

    @Test
    void testGetTileByIndexRandom() {
        Map map = new Map();
        Tile tile = map.getTileByIndex(3, 7);
        assertEquals(new Point(3, 7), tile.getPosition());
    }

    @Test
    void testGetTileByIndexPerformance() {
        Map map = new Map();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Tile tile = map.getTileByIndex(5, 5);
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 1000);
    }
}
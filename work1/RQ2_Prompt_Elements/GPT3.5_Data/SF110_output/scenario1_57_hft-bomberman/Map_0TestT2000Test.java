// Map_0Test.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Map}.
 * It contains ten unit test cases for the {@link Map#getTileByIndex(int, int)} method.
 */
class Map_0Test {

    @Test
    void testGetTileByIndex() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(0, 0));
        map.MapGrid[0][0] = tile;
        assertEquals(tile, map.getTileByIndex(0, 0));
    }

    @Test
    void testGetTileByIndexOutOfBounds() {
        Map map = new Map();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> map.getTileByIndex(10, 10));
    }

    @Test
    void testGetTileByIndexNull() {
        Map map = new Map();
        assertNull(map.getTileByIndex(0, 0));
    }

    @Test
    void testGetTileByIndexDifferentTile() {
        Map map = new Map();
        Tile tile1 = new Tile(TileType.EMPTY, new Point(0, 0));
        Tile tile2 = new Tile(TileType.WALL, new Point(0, 0));
        map.MapGrid[0][0] = tile1;
        assertNotEquals(tile2, map.getTileByIndex(0, 0));
    }

    @Test
    void testGetTileByIndexNegativeIndex() {
        Map map = new Map();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> map.getTileByIndex(-1, -1));
    }

    @Test
    void testGetTileByIndexLargeIndex() {
        Map map = new Map();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> map.getTileByIndex(1000, 1000));
    }

    @Test
    void testGetTileByIndexMiddleIndex() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(5, 5));
        map.MapGrid[5][5] = tile;
        assertEquals(tile, map.getTileByIndex(5, 5));
    }

    @Test
    void testGetTileByIndexTopLeftCorner() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(0, 0));
        map.MapGrid[0][0] = tile;
        assertEquals(tile, map.getTileByIndex(0, 0));
    }

    @Test
    void testGetTileByIndexBottomRightCorner() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(9, 9));
        map.MapGrid[9][9] = tile;
        assertEquals(tile, map.getTileByIndex(9, 9));
    }

    @Test
    void testGetTileByIndexTopRightCorner() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(9, 0));
        map.MapGrid[9][0] = tile;
        assertEquals(tile, map.getTileByIndex(9, 0));
    }
}
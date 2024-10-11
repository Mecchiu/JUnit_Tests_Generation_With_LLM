// Test cases for Map.getTileByIndex() method
class Map_0Test {

    // Test case 1: Test if getTileByIndex() returns the correct tile
    @Test
    void testGetTileByIndex1() {
        Map map = new Map();
        Tile expectedTile = new Tile(new Point(0, 0), TileType.EMPTY);
        map.MapGrid[0][0] = expectedTile;
        Tile actualTile = map.getTileByIndex(0, 0);
        assertEquals(expectedTile, actualTile);
    }

    // Test case 2: Test if getTileByIndex() returns null for invalid index
    @Test
    void testGetTileByIndex2() {
        Map map = new Map();
        Tile actualTile = map.getTileByIndex(10, 10);
        assertNull(actualTile);
    }

    // Test case 3: Test if getTileByIndex() returns null for negative index
    @Test
    void testGetTileByIndex3() {
        Map map = new Map();
        Tile actualTile = map.getTileByIndex(-1, -1);
        assertNull(actualTile);
    }

    // Test case 4: Test if getTileByIndex() returns null for out of bounds index
    @Test
    void testGetTileByIndex4() {
        Map map = new Map();
        Tile actualTile = map.getTileByIndex(100, 100);
        assertNull(actualTile);
    }

    // Test case 5: Test if getTileByIndex() returns null for empty map
    @Test
    void testGetTileByIndex5() {
        Map map = new Map();
        Tile actualTile = map.getTileByIndex(0, 0);
        assertNull(actualTile);
    }

    // Test case 6: Test if getTileByIndex() returns null for null tile
    @Test
    void testGetTileByIndex6() {
        Map map = new Map();
        map.MapGrid[0][0] = null;
        Tile actualTile = map.getTileByIndex(0, 0);
        assertNull(actualTile);
    }

    // Test case 7: Test if getTileByIndex() returns the correct tile for non-zero index
    @Test
    void testGetTileByIndex7() {
        Map map = new Map();
        Tile expectedTile = new Tile(new Point(1, 2), TileType.WALL);
        map.MapGrid[1][2] = expectedTile;
        Tile actualTile = map.getTileByIndex(1, 2);
        assertEquals(expectedTile, actualTile);
    }

    // Test case 8: Test if getTileByIndex() returns the correct tile for negative index
    @Test
    void testGetTileByIndex8() {
        Map map = new Map();
        Tile expectedTile = new Tile(new Point(-1, -2), TileType.WALL);
        map.MapGrid[-1][-2] = expectedTile;
        Tile actualTile = map.getTileByIndex(-1, -2);
        assertEquals(expectedTile, actualTile);
    }

    // Test case 9: Test if getTileByIndex() returns the correct tile for out of bounds index
    @Test
    void testGetTileByIndex9() {
        Map map = new Map();
        Tile expectedTile = new Tile(new Point(100, 100), TileType.WALL);
        map.MapGrid[100][100] = expectedTile;
        Tile actualTile = map.getTileByIndex(100, 100);
        assertEquals(expectedTile, actualTile);
    }

    // Test case 10: Test if getTileByIndex() returns the correct tile for large index
    @Test
    void testGetTileByIndex10() {
        Map map = new Map();
        Tile expectedTile = new Tile(new Point(10000, 10000), TileType.WALL);
        map.MapGrid[10000][10000] = expectedTile;
        Tile actualTile = map.getTileByIndex(10000, 10000);
        assertEquals(expectedTile, actualTile);
    }
}
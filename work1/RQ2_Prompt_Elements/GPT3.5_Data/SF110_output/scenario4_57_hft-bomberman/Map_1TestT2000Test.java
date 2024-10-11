// Test case for Map.getTile(int, int)
class Map_1Test {

    // Test case 1: Test if getTile returns the correct tile object
    @Test
    void testGetTileReturnsCorrectTile() {
        Map map = new Map("test.xml");
        Tile expectedTile = new Tile(TileType.EMPTY);
        map.setTile(0, 0, expectedTile);
        Tile actualTile = map.getTile(0, 0);
        assertEquals(expectedTile, actualTile);
    }

    // Test case 2: Test if getTile returns null for out of bounds coordinates
    @Test
    void testGetTileReturnsNullForOutOfBounds() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTile(-1, -1);
        assertNull(actualTile);
    }

    // Test case 3: Test if getTile returns null for uninitialized map
    @Test
    void testGetTileReturnsNullForUninitializedMap() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTile(0, 0);
        assertNull(actualTile);
    }

    // Test case 4: Test if getTile returns null for uninitialized tile
    @Test
    void testGetTileReturnsNullForUninitializedTile() {
        Map map = new Map("test.xml");
        map.setArea(1, 1);
        Tile actualTile = map.getTile(0, 0);
        assertNull(actualTile);
    }

    // Test case 5: Test if getTile returns null for uninitialized row
    @Test
    void testGetTileReturnsNullForUninitializedRow() {
        Map map = new Map("test.xml");
        map.setArea(1, 1);
        Tile actualTile = map.getTile(0, 1);
        assertNull(actualTile);
    }

    // Test case 6: Test if getTile returns null for uninitialized column
    @Test
    void testGetTileReturnsNullForUninitializedColumn() {
        Map map = new Map("test.xml");
        map.setArea(1, 1);
        Tile actualTile = map.getTile(1, 0);
        assertNull(actualTile);
    }

    // Test case 7: Test if getTile returns null for uninitialized map with negative coordinates
    @Test
    void testGetTileReturnsNullForUninitializedMapWithNegativeCoordinates() {
        Map map = new Map("test.xml");
        Tile actualTile = map.getTile(-1, -1);
        assertNull(actualTile);
    }

    // Test case 8: Test if getTile returns null for uninitialized tile with negative coordinates
    @Test
    void testGetTileReturnsNullForUninitializedTileWithNegativeCoordinates() {
        Map map = new Map("test.xml");
        map.setArea(1, 1);
        Tile actualTile = map.getTile(-1, -1);
        assertNull(actualTile);
    }

    // Test case 9: Test if getTile returns null for uninitialized row with negative coordinates
    @Test
    void testGetTileReturnsNullForUninitializedRowWithNegativeCoordinates() {
        Map map = new Map("test.xml");
        map.setArea(1, 1);
        Tile actualTile = map.getTile(-1, 0);
        assertNull(actualTile);
    }

    // Test case 10: Test if getTile returns null for uninitialized column with negative coordinates
    @Test
    void testGetTileReturnsNullForUninitializedColumnWithNegativeCoordinates() {
        Map map = new Map("test.xml");
        map.setArea(1, 1);
        Tile actualTile = map.getTile(0, -1);
        assertNull(actualTile);
    }
}
package common;
java
class Map_0Test {

    @Test
    void testGetTileByIndex() {
        Map map = new Map("test.xml");
        Tile tile = new Tile(new Point(0, 0));
        map.setTileByIndex(0, 0, tile);
        assertEquals(tile, map.getTileByIndex(0, 0));
    }

    @Test
    void testGetTileByIndexOutOfBounds() {
        Map map = new Map("test.xml");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> map.getTileByIndex(100, 100));
    }

    @Test
    void testGetTileByIndexNull() {
        Map map = new Map("test.xml");
        assertNull(map.getTileByIndex(1, 1));
    }

    @Test
    void testGetTileByIndexNegativeIndex() {
        Map map = new Map("test.xml");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> map.getTileByIndex(-1, -1));
    }

    @Test
    void testGetTileByIndexLargeIndex() {
        Map map = new Map("test.xml");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> map.getTileByIndex(1000, 1000));
    }

    @Test
    void testGetTileByIndexMiddleIndex() {
        Map map = new Map("test.xml");
        Tile tile = new Tile(new Point(5, 5));
        map.setTileByIndex(5, 5, tile);
        assertEquals(tile, map.getTileByIndex(5, 5));
    }

    @Test
    void testGetTileByIndexZeroIndex() {
        Map map = new Map("test.xml");
        Tile tile = new Tile(new Point(0, 0));
        map.setTileByIndex(0, 0, tile);
        assertEquals(tile, map.getTileByIndex(0, 0));
    }

    @Test
    void testGetTileByIndexMaxIndex() {
        Map map = new Map("test.xml");
        Tile tile = new Tile(new Point(Integer.MAX_VALUE, Integer.MAX_VALUE));
        map.setTileByIndex(Integer.MAX_VALUE, Integer.MAX_VALUE, tile);
        assertEquals(tile, map.getTileByIndex(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testGetTileByIndexMinIndex() {
        Map map = new Map("test.xml");
        Tile tile = new Tile(new Point(Integer.MIN_VALUE, Integer.MIN_VALUE));
        map.setTileByIndex(Integer.MIN_VALUE, Integer.MIN_VALUE, tile);
        assertEquals(tile, map.getTileByIndex(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}

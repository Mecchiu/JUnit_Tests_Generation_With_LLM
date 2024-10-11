// MapPreviewTest.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MapPreview}.
 * It contains ten unit test cases for the {@link MapPreview#getMapPreview(int)} method.
 */
class MapPreviewTest {
    
    /**
     * Test case for preview width less than 1.
     * Expected result: IllegalArgumentException thrown.
     */
    @Test
    void testPreviewWidthLessThanOne() {
        MapPreview mp = new MapPreview(new Map());
        assertThrows(IllegalArgumentException.class, () -> mp.getMapPreview(0));
    }
    
    /**
     * Test case for preview width greater than maximum allowed.
     * Expected result: preview image width is set to maximum allowed.
     */
    @Test
    void testPreviewWidthGreaterThanMax() {
        MapPreview mp = new MapPreview(new Map());
        ImageIcon preview = mp.getMapPreview(MapPreview.MAX_PREVIEW_WIDTH + 1);
        assertEquals(MapPreview.MAX_PREVIEW_WIDTH, preview.getIconWidth());
    }
    
    /**
     * Test case for map with no territories.
     * Expected result: preview image is null.
     */
    @Test
    void testMapWithNoTerritories() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        assertNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with one territory.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithOneTerritory() {
        Map map = new Map();
        Territory t = new Territory("Territory 1");
        map.addTerritory(t);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with multiple territories.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithMultipleTerritories() {
        Map map = new Map();
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        map.addTerritory(t1);
        map.addTerritory(t2);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with one continent.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithOneContinent() {
        Map map = new Map();
        Continent c = new Continent("Continent 1", 5);
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        c.addTerritory(t1);
        c.addTerritory(t2);
        map.addContinent(c);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with multiple continents.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithMultipleContinents() {
        Map map = new Map();
        Continent c1 = new Continent("Continent 1", 5);
        Continent c2 = new Continent("Continent 2", 10);
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        Territory t3 = new Territory("Territory 3");
        c1.addTerritory(t1);
        c1.addTerritory(t2);
        c2.addTerritory(t3);
        map.addContinent(c1);
        map.addContinent(c2);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with one connection.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithOneConnection() {
        Map map = new Map();
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        t1.addConnection(t2);
        map.addTerritory(t1);
        map.addTerritory(t2);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with multiple connections.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithMultipleConnections() {
        Map map = new Map();
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        Territory t3 = new Territory("Territory 3");
        t1.addConnection(t2);
        t1.addConnection(t3);
        map.addTerritory(t1);
        map.addTerritory(t2);
        map.addTerritory(t3);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with one continent and one connection.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithOneContinentAndOneConnection() {
        Map map = new Map();
        Continent c = new Continent("Continent 1", 5);
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        c.addTerritory(t1);
        c.addTerritory(t2);
        t1.addConnection(t2);
        map.addContinent(c);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
    
    /**
     * Test case for map with multiple continents and multiple connections.
     * Expected result: preview image is not null.
     */
    @Test
    void testMapWithMultipleContinentsAndMultipleConnections() {
        Map map = new Map();
        Continent c1 = new Continent("Continent 1", 5);
        Continent c2 = new Continent("Continent 2", 10);
        Territory t1 = new Territory("Territory 1");
        Territory t2 = new Territory("Territory 2");
        Territory t3 = new Territory("Territory 3");
        Territory t4 = new Territory("Territory 4");
        c1.addTerritory(t1);
        c1.addTerritory(t2);
        c2.addTerritory(t3);
        c2.addTerritory(t4);
        t1.addConnection(t2);
        t2.addConnection(t3);
        t3.addConnection(t4);
        map.addContinent(c1);
        map.addContinent(c2);
        MapPreview mp = new MapPreview(map);
        assertNotNull(mp.getMapPreview(100));
    }
}
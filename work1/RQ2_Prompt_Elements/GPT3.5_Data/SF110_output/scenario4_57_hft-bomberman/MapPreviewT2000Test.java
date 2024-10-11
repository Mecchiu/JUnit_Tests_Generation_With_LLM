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
     * Test case for creating a map preview with a valid width.
     */
    @Test
    void testGetMapPreviewValidWidth() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        mp.setImageSet("desert");
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }
    
    /**
     * Test case for creating a map preview with an invalid width (0).
     */
    @Test
    void testGetMapPreviewInvalidWidthZero() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        mp.setImageSet("desert");
        assertThrows(IllegalArgumentException.class, () -> {
            mp.getMapPreview(0);
        });
    }
    
    /**
     * Test case for creating a map preview with an invalid width (-1).
     */
    @Test
    void testGetMapPreviewInvalidWidthNegative() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        mp.setImageSet("desert");
        assertThrows(IllegalArgumentException.class, () -> {
            mp.getMapPreview(-1);
        });
    }
    
    /**
     * Test case for creating a map preview with a width larger than the map area.
     */
    @Test
    void testGetMapPreviewWidthLargerThanMapArea() {
        Map map = new Map();
        map.setMapArea(new Point(100, 100));
        MapPreview mp = new MapPreview(map);
        mp.setImageSet("desert");
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }
    
    /**
     * Test case for creating a map preview with a null map object.
     */
    @Test
    void testGetMapPreviewNullMap() {
        MapPreview mp = new MapPreview(null);
        mp.setImageSet("desert");
        assertThrows(NullPointerException.class, () -> {
            mp.getMapPreview(150);
        });
    }
    
    /**
     * Test case for creating a map preview with a null image set.
     */
    @Test
    void testGetMapPreviewNullImageSet() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        assertThrows(NullPointerException.class, () -> {
            mp.getMapPreview(150);
        });
    }
    
    /**
     * Test case for creating a map preview with an invalid image set.
     */
    @Test
    void testGetMapPreviewInvalidImageSet() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        mp.setImageSet("invalid");
        assertThrows(IllegalArgumentException.class, () -> {
            mp.getMapPreview(150);
        });
    }
    
    /**
     * Test case for creating a map preview with a null map object and null image set.
     */
    @Test
    void testGetMapPreviewNullMapAndImageSet() {
        MapPreview mp = new MapPreview(null);
        assertThrows(NullPointerException.class, () -> {
            mp.getMapPreview(150);
        });
    }
    
    /**
     * Test case for creating a map preview with a null map object and valid image set.
     */
    @Test
    void testGetMapPreviewNullMapValidImageSet() {
        MapPreview mp = new MapPreview(null);
        mp.setImageSet("desert");
        assertThrows(NullPointerException.class, () -> {
            mp.getMapPreview(150);
        });
    }
    
    /**
     * Test case for creating a map preview with a valid map object and null image set.
     */
    @Test
    void testGetMapPreviewValidMapNullImageSet() {
        Map map = new Map();
        MapPreview mp = new MapPreview(map);
        assertThrows(NullPointerException.class, () -> {
            mp.getMapPreview(150);
        });
    }
}
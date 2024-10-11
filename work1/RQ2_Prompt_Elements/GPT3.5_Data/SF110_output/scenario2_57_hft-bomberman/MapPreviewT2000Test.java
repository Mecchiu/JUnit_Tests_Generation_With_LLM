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
     * Test case for when the map preview file already exists.
     * The method should load the existing file and return an ImageIcon.
     */
    @Test
    void testGetMapPreviewFileExists() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(150);
        assertNotNull(result);
    }
    
    /**
     * Test case for when the map preview file does not exist.
     * The method should create a new file and return an ImageIcon.
     */
    @Test
    void testGetMapPreviewFileDoesNotExist() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(150);
        assertNotNull(result);
    }
    
    /**
     * Test case for when the preview width is equal to the map width.
     * The method should return an ImageIcon with the same dimensions as the map.
     */
    @Test
    void testGetMapPreviewWidthEqualsMapWidth() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(400);
        assertEquals(400, result.getIconWidth());
        assertEquals(300, result.getIconHeight());
    }
    
    /**
     * Test case for when the preview width is greater than the map width.
     * The method should return an ImageIcon with the same height as the map and a scaled width.
     */
    @Test
    void testGetMapPreviewWidthGreaterThanMapWidth() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(500);
        assertEquals(500, result.getIconWidth());
        assertEquals(375, result.getIconHeight());
    }
    
    /**
     * Test case for when the preview width is less than the map width.
     * The method should return an ImageIcon with the same height as the map and a scaled width.
     */
    @Test
    void testGetMapPreviewWidthLessThanMapWidth() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(300);
        assertEquals(300, result.getIconWidth());
        assertEquals(225, result.getIconHeight());
    }
    
    /**
     * Test case for when the map has no tiles.
     * The method should return null.
     */
    @Test
    void testGetMapPreviewNoTiles() {
        MapPreview mp = new MapPreview("testMapNoTiles.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(150);
        assertNull(result);
    }
    
    /**
     * Test case for when the map file does not exist.
     * The method should return null.
     */
    @Test
    void testGetMapPreviewFileNotFound() {
        MapPreview mp = new MapPreview("nonexistentMap.xml");
        mp.setImageSet("desert");
        ImageIcon result = mp.getMapPreview(150);
        assertNull(result);
    }
    
    /**
     * Test case for when the image set is not found.
     * The method should return null.
     */
    @Test
    void testGetMapPreviewImageSetNotFound() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("nonexistentImageSet");
        ImageIcon result = mp.getMapPreview(150);
        assertNull(result);
    }
    
    /**
     * Test case for when an IOException is thrown while reading the map preview file.
     * The method should return null.
     */
    @Test
    void testGetMapPreviewIOException() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        mp.setMapFile("invalidPath/testMap");
        ImageIcon result = mp.getMapPreview(150);
        assertNull(result);
    }
    
    /**
     * Test case for when an Exception is thrown while writing the map preview file.
     * The method should return null.
     */
    @Test
    void testGetMapPreviewException() {
        MapPreview mp = new MapPreview("testMap.xml");
        mp.setImageSet("desert");
        mp.setMapFile("invalidPath/testMap");
        ImageIcon result = mp.getMapPreview(150);
        assertNull(result);
    }
}
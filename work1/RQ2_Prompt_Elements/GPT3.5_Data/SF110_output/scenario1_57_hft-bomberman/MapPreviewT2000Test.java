// MapPreviewTest.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MapPreview}.
 * It contains ten unit test cases for the {@link MapPreview#getMapPreview(int)} method.
 */
class MapPreviewTest {
    
    @Test
    void testGetMapPreview() {
        // Test case 1: previewWidth is equal to mapArea.x * Constants.TILE_BORDER
        MapPreview mp1 = new MapPreview(new Map());
        mp1.setImageSet("desert");
        ImageIcon ii1 = mp1.getMapPreview(100);
        assertEquals(mp1.mapArea.x * Constants.TILE_BORDER, ii1.getIconWidth());
        
        // Test case 2: previewWidth is greater than mapArea.x * Constants.TILE_BORDER
        MapPreview mp2 = new MapPreview(new Map());
        mp2.setImageSet("desert");
        ImageIcon ii2 = mp2.getMapPreview(500);
        assertTrue(ii2.getIconWidth() > mp2.mapArea.x * Constants.TILE_BORDER);
        
        // Test case 3: previewWidth is less than mapArea.x * Constants.TILE_BORDER
        MapPreview mp3 = new MapPreview(new Map());
        mp3.setImageSet("desert");
        ImageIcon ii3 = mp3.getMapPreview(50);
        assertTrue(ii3.getIconWidth() < mp3.mapArea.x * Constants.TILE_BORDER);
        
        // Test case 4: image file exists
        MapPreview mp4 = new MapPreview(new Map());
        mp4.setImageSet("desert");
        ImageIcon ii4 = mp4.getMapPreview(100);
        assertNotNull(ii4.getImage());
        
        // Test case 5: image file does not exist
        MapPreview mp5 = new MapPreview(new Map());
        mp5.setImageSet("nonexistent");
        ImageIcon ii5 = mp5.getMapPreview(100);
        assertNull(ii5.getImage());
        
        // Test case 6: mapArea.x is 0
        MapPreview mp6 = new MapPreview(new Map());
        mp6.setImageSet("desert");
        mp6.mapArea.x = 0;
        ImageIcon ii6 = mp6.getMapPreview(100);
        assertNull(ii6.getImage());
        
        // Test case 7: mapArea.y is 0
        MapPreview mp7 = new MapPreview(new Map());
        mp7.setImageSet("desert");
        mp7.mapArea.y = 0;
        ImageIcon ii7 = mp7.getMapPreview(100);
        assertNull(ii7.getImage());
        
        // Test case 8: IOException caught
        MapPreview mp8 = new MapPreview(new Map());
        mp8.setImageSet("desert");
        mp8.mapFile = "nonexistent.xml";
        ImageIcon ii8 = mp8.getMapPreview(100);
        assertNull(ii8.getImage());
        
        // Test case 9: NullPointerException caught
        MapPreview mp9 = new MapPreview(null);
        mp9.setImageSet("desert");
        ImageIcon ii9 = mp9.getMapPreview(100);
        assertNull(ii9.getImage());
        
        // Test case 10: previewWidth is negative
        MapPreview mp10 = new MapPreview(new Map());
        mp10.setImageSet("desert");
        ImageIcon ii10 = mp10.getMapPreview(-100);
        assertNull(ii10.getImage());
    }
}
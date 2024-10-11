// Map_1Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {
		
    private final String xmlFile = "1Test.xml";
    
	@Test
    public void testGetTile() {
        Map map = new Map(xmlFile);
        
        Point pos = map.getTile(1, 1);
        assertNotNull(pos);
        assertEquals(new Point(0, 0), pos);
    }
    
    @Test
    public void testGetTileByIndex() {
        Map map = new Map(xmlFile);
        
        Point pos = map.getTile(1, 1);
        assertNotNull(pos);
        assertEquals(new Point(0, 0), pos);
    }

    @Test
    public void testGetTileByY() {
        Map map = new Map(xmlFile);
        
}
}
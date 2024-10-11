// Drink_0Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {

    /**
     * Test of recalculate method, of class Drink.
     */
    @Test
    public void testRecalculate() {
        MyKeyMap map = new MyKeyMap(new Drink().recalculate());
        System.out.println(map);
    }
    
    /**
     * Test of recalculate method, of class Drink.
     */
    @Test
    public void testRecalculateBiff() throws Exception {
        MyKeyMap map = new MyKeyMap(new Drink().recalculateBiff());
        System.out.println(map);
    }
    
    /**
     * Tests the creation of a drink.
     */
    @Test
    public void testCtor() {
        MyKeyMap map = new MyKeyMap(new Drink());
		assertTrue(map.contains("BRIE"));
		assertFalse(map.contains("BRIE1"));
		assertFalse(map.contains("BRIE2"));
		assertEquals("BRIE", map.get("BRIE"));
		
		assertTrue(map.contains("BRIE0"));
		assertFalse(map.contains("BRIE3"));
		assertFalse(map.contains("BRIE4"));
		assertEquals("BRIE0", map.get("BRIE0"));
    }
    
    /**
     * Tests XML serialization of drinks.
     */
    @Test
    public void testSerialization() throws Exception {
        File file = File.createTempFile("maint_", ".xml");
        XMLOutputter out = 
            new XMLOutputter("UTF-8");
        String xml = out.toString(new SAXBuilder().build(new Drink()).getRootElement());
        FileReader fr = new FileReader(file.getAbsolutePath());    
        FileWriter fw = new FileWriter(file);
        IOUtils.copyChar(fr, fw);
        fw.flush();
        fw.close();
    }
}

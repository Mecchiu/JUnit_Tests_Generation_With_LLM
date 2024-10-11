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
		
    private static final String DRINKS_PATH = "/bierse-webo/datacheck/"+MyKeyMap.getInstance().get("bierseConfig").get("drinks")+"/drinks";
    private static final Document DATASET_DOC = new SAXBuilder().build(new File(DRINKS_PATH));
    
    //private static final String DATASET_PATH = "/datacheck/drinks/";
    
    /**
     * Test the constructor of constructor of {@link Drink}.
     * 
     * @throws Exception
     */
    @Test
    public void testRecalculate() throws Exception {
		
        DRINK drink = new Drink(NEW_DRINK_NAME, DATASET_DOC, 200, 500);
        assertNotNull(drink);
        assertEquals("New drink has incorrect name", NEW_DRINK_NAME, drink.getName());
        assertTrue(drink.isUsed());
        assertEquals(200, drink.recalculate().getCurrentPrice(), 0);
        assertEquals(200, drink.recalculate().getMinPrice(), 0);
        assertEquals(500, drink.recalculate().getMaxPrice(), 0);
    }     
    
    /**
     * Test the constructor of constructor of {@link Drink}.
     * 
     * @throws Exception
     */
    @Test
    public void testSelling() throws Exception {
		
        DRINK drink = new Drink(NEW_DRINK_NAME, DATASET_DOC, 200, 500);
        assertTrue(drink.isUsed());
        drink.sell(10);
        assertEquals("New drink should have 10 more then used", 10, drink.recalculate().getCurrentPrice(), 0);
        assertEquals("New drink should be selling", 10, drink.recalculate().getSold(), 0);
    }
    
    @Test
    public void testReSelling() throws Exception {
        //new Drink_1Test.NewDrink("./bierse-webo/temp/bierse-webo-temp/"+MyKeyMap.getInstance().get("bierseConfig").get("drinks")+"/drinks")
}
}
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
		MyKeyMap map = new MyKeyMap("Tests");

@Test
    public void testRecalculate() {
        model = new Drink();
        assertEquals("F1", map.getKey());
        assertFalse(((MyDrink)model).isUsed());

        model.setName("drink 1");

        model.recalculate();

        assertEquals("Drink 1", ((MyDrink)model).getName());
    }
        Document doc = new SAXBuilder().build(new File(DRINKS_FOLDER + NEW_DRINK_NAME + ".xml"));

        Element root = doc.getRootElement();
        
        // check if the drink is not sold yet and is not used
}
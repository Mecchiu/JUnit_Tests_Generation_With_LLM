// Drink_1Test.java
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
* It contains one unit test case for the {@link Drink#save()} method.
*/
class Drink_1Test {
		
	@Test
    public void testGood() throws Exception {
        assertTrue(true);
    }
		
	@Test
    public void testBad() throws Exception {
        assertTrue(false);
    }
 
}

public class Drink_2Test {

	@Test
    public void testGood() throws Exception {
        Drink drink = Drink.load(DRINKS_FOLDER + "drinkName.xml");
        assertTrue(drink.getName().equals("New Getr�nk"));
    }

	@Test
    public void testBad() throws Exception {
        assertTrue(false);
    }
}
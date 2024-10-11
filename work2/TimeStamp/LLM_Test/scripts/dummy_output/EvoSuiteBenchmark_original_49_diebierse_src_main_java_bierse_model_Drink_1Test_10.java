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
    public void test() throws Exception {
    		String xmlString = "<FooBAR />";
    		Element root = new Element("root");
    		Document doc = new SAXBuilder().build(new File("src/test/resources/FooBAR.xml"));
    		Element root2 = doc.getRootElement();

    		// Create a brand new drink...
    		Model brandNew = new Drink("New Drink", null);
    		brandNew.setMinPrice(0);
    		brandNew.setMaxPrice(20);
    		brandNew.setStartPrice(0);
    		brandNew.setLastSold(0);
    		brandNew.setTotalSold(0);

									
    		// Create the second brand
    		Model brand = new Drink("New Drink", null);		
    		brand.setMinPrice(30);
    		brand.setMaxPrice(40);
    		brand.setStartPrice(30);
    		brand.setLastSold(50);
    		brand.setTotalSold(100);
    		brand.setMaxStep(20);
    		brand.setMaxPrice(50);

    		// Create a brand new drink
    		brandNew.setMaxPrice(70);
    		brandNew.setMaxStep(25);
    		brandNew.setMinPrice(0);
    		brandNew.setName(NEW_DRINK);
    		brandNew.setStartPrice(0);
    		brandNew.setTargetAmount(5);
    		brandNew.setUsed(false);
    		brandNew.setKeepPrice(false);
    		brandNew.setDirectPrice(-10);
    		brand.setMaxPrice(10);
    		brand.setMaxStep(10);
    		brand.setStartPrice(0);
    		brand.setTargetAmount(5);
    		brandNew.setName(NEW_DRINK);
    		brandNew.setDirectPrice(0);
    		brandNew.setMaxStep(30);
    		brandNew.setDirectPrice(0);
    		brandNew.setKeepPrice(false);
    		brandNew.setMaxPrice(50);
    		brand.setDirectPrice(0);
    		brand.setKeepPrice(false);
    		brand.setMaxStep(25);
    		brand.setStartPrice(0);
    		brand.setPrice(50);
}
}
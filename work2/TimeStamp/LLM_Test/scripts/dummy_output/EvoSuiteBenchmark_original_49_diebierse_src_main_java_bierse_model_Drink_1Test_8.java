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
		
	@Test public void testSave() {
		test1();
	}
	
	@Test
	void test1() {
		Drink drink = new Drink("Wink", Model.class, 10);
		assertFalse("Incorrect name", drink.getName().isEmpty());
		assertNotNull("Drink has not been created", drink.model);
		assertEquals("Drink's name incorrect", drink.getName(),"Wink");
	}

	private void test1() {
		Drink drink = new Drink("Wink", Model.class, 10);
		assertFalse("Incorrect name", drink.getName().isEmpty());
		assertNotNull("Drink has not been created", drink.model);
		assertEquals("Drink's name incorrect", drink.getName(),"Wink");
	}
	
	@Test
	void test2() {
		Drink drink = new Drink("Wink!", Model.class, -1);
		assertFalse("Incorrect name", drink.getName().isEmpty());
		assertNotNull("Drink has not been created", drink.model);
		assertEquals("Drink's name incorrect", drink.getName(),"Wink!");
	}

	@Test public void testFromXML() {
		new Drink_.FromXML(Drink_1Test.class.getResource("Drink_fromXML" + File.separator + "Drink_fromTest.xml"));
	}
}
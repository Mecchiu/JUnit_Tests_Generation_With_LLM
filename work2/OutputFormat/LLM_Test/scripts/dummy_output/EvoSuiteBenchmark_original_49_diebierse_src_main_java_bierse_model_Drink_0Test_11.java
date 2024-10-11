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
		
	@Test
	public void test() {
		MyKeyMap keyMap = new MyKeyMap();
		myKeyMap.setKey(keyMap, KeyEvent.VK_F1, 30);
		myKeyMap.setKey(keyMap, KeyEvent.VK_LEFT, 40);
		myKeyMap.setKey(keyMap, KeyEvent.VK_F1, 15);
		myKeyMap.setKey(keyMap, KeyEvent.VK_UP, 15);
		myKeyMap.setKey(keyMap, KeyEvent.VK_RIGHT, 15);
		keyMap.setKey(keyMap, KeyEvent.VK_F1, 30);
		keyMap.setKey(keyMap, KeyEvent.VK_LEFT, 40);
		keyMap.setKey(keyMap, KeyEvent.VK_F1, 45);
		myKeyMap.setKey(keyMap, KeyEvent.VK_F1, 15);
		myKeyMap.setKey(keyMap, KeyEvent.VK_UP, 45);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 15);
		keyMap.setKey(keyMap, KeyEvent.VK_F1, 35);
		myKeyMap.setKey(keyMap, KeyEvent.VK_F1, 15);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 35);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 45);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 35);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 5);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 25);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 15);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 25);
		keyMap.setKey(keyMap, KeyEvent.VK_UP, 15);
}
}
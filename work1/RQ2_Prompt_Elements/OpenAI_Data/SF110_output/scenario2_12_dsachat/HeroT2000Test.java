// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains ten unit test cases for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {

	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a valid shortcut.
	 */
	@Test
	void testGetAttrValueValid() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(10, hero.getAttrValue("MU"));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with an invalid shortcut.
	 */
	@Test
	void testGetAttrValueInvalid() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue("IN"));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is null.
	 */
	@Test
	void testGetAttrValueNull() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue(null));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is empty.
	 */
	@Test
	void testGetAttrValueEmpty() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue(""));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is a whitespace.
	 */
	@Test
	void testGetAttrValueWhitespace() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue(" "));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is a tab.
	 */
	@Test
	void testGetAttrValueTab() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue("\t"));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is a newline.
	 */
	@Test
	void testGetAttrValueNewline() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue("\n"));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is a carriage return.
	 */
	@Test
	void testGetAttrValueCarriageReturn() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue("\r"));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is a form feed.
	 */
	@Test
	void testGetAttrValueFormFeed() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue("\f"));
	}
	
	/**
	 * Test case for {@link Hero#getAttrValue(String)}.
	 * It tests the method with a shortcut that is a backspace.
	 */
	@Test
	void testGetAttrValueBackspace() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute attr = new Attribute();
		attr.setShortcut("MU");
		attr.setValue(10);
		hero.attributes.add(attr);
		assertEquals(-1, hero.getAttrValue("\b"));
	}
}
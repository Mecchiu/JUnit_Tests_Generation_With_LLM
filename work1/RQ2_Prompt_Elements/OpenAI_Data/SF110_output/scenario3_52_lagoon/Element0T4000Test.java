// ElementTest.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#lookupAttribute(String, String)} method.
*/
class ElementTest {

	/**
	 * Test case 1 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is null.
	 */
	@Test
	void testLookupAttributeCase1() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute(null, ""));
	}
	
	/**
	 * Test case 2 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is empty.
	 */
	@Test
	void testLookupAttributeCase2() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 3 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the local name is null.
	 */
	@Test
	void testLookupAttributeCase3() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", null));
	}
	
	/**
	 * Test case 4 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the local name is empty.
	 */
	@Test
	void testLookupAttributeCase4() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 5 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI and local name are null.
	 */
	@Test
	void testLookupAttributeCase5() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute(null, null));
	}
	
	/**
	 * Test case 6 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI and local name are empty.
	 */
	@Test
	void testLookupAttributeCase6() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 7 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is null and the local name is empty.
	 */
	@Test
	void testLookupAttributeCase7() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute(null, ""));
	}
	
	/**
	 * Test case 8 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is empty and the local name is null.
	 */
	@Test
	void testLookupAttributeCase8() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", null));
	}
	
	/**
	 * Test case 9 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is not null and the local name is not empty.
	 */
	@Test
	void testLookupAttributeCase9() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 10 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is not empty and the local name is not null.
	 */
	@Test
	void testLookupAttributeCase10() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
}
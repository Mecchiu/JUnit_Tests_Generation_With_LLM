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
	 * It tests the case where the namespace URI is the empty string.
	 */
	@Test
	void testLookupAttribute1() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 2 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is null.
	 */
	@Test
	void testLookupAttribute2() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute(null, ""));
	}
	
	/**
	 * Test case 3 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the local name is the empty string.
	 */
	@Test
	void testLookupAttribute3() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 4 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the local name is null.
	 */
	@Test
	void testLookupAttribute4() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", null));
	}
	
	/**
	 * Test case 5 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI and the local name are the empty string.
	 */
	@Test
	void testLookupAttribute5() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case 6 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI and the local name are null.
	 */
	@Test
	void testLookupAttribute6() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute(null, null));
	}
	
	/**
	 * Test case 7 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is the empty string and the local name is null.
	 */
	@Test
	void testLookupAttribute7() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", null));
	}
	
	/**
	 * Test case 8 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI is null and the local name is the empty string.
	 */
	@Test
	void testLookupAttribute8() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute(null, ""));
	}
	
	/**
	 * Test case 9 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI and the local name are not the empty string.
	 */
	@Test
	void testLookupAttribute9() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("a", "b"));
	}
	
	/**
	 * Test case 10 for {@link Element#lookupAttribute(String, String)}.
	 * It tests the case where the namespace URI and the local name are not null.
	 */
	@Test
	void testLookupAttribute10() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("a", "b"));
	}
}
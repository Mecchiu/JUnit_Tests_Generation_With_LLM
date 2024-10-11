// Element_0Test.java
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
class Element_0Test {

	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_0() {
		Element element = new Element("", "", 0);
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_1() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_2() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_3() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_4() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_5() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_6() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_7() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_8() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns -1 when the attribute does not exist.
	 */
	@Test
	void testLookupAttribute_9() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals(-1, element.lookupAttribute("", ""));
	}
}

// Element_1Test.java
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
class Element_1Test {
		
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns 0 when the attribute exists.
	 */
	@Test
	void testLookupAttribute_0() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	 * Test case for {@link Element#lookupAttribute(String, String)}
	 * <p>
	 * Test if the method returns 0 when the attribute exists.
	 */
	@Test
	void testLookupAttribute_1
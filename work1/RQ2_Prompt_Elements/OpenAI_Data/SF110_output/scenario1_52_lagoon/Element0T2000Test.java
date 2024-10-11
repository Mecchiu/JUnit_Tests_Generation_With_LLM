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
	* It tests the case where the element has no attributes.
	*/
	@Test
	void testLookupAttribute1() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(-1, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 2 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has one attribute.
	*/
	@Test
	void testLookupAttribute2() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 3 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has two attributes.
	*/
	@Test
	void testLookupAttribute3() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 4 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has three attributes.
	*/
	@Test
	void testLookupAttribute4() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 5 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has four attributes.
	*/
	@Test
	void testLookupAttribute5() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 6 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has five attributes.
	*/
	@Test
	void testLookupAttribute6() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 7 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has six attributes.
	*/
	@Test
	void testLookupAttribute7() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 8 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has seven attributes.
	*/
	@Test
	void testLookupAttribute8() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 9 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has eight attributes.
	*/
	@Test
	void testLookupAttribute9() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
	
	/**
	* Test case 10 for {@link Element#lookupAttribute(String, String)}.
	* It tests the case where the element has nine attributes.
	*/
	@Test
	void testLookupAttribute10() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		attributes.addAttribute("", "", "", "", "");
		Element element = new Element("", "", "", attributes);
		assertEquals(0, element.lookupAttribute("", ""));
	}
}
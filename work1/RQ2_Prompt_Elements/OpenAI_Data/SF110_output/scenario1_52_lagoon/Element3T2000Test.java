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
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class ElementTest {

	/**
	* Test case 1 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName1() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		assertEquals("attr", element.getAttributeLocalName(0));
	}
	
	/**
	* Test case 2 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName2() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		assertEquals("attr2", element.getAttributeLocalName(1));
	}
	
	/**
	* Test case 3 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName3() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		assertEquals("attr3", element.getAttributeLocalName(2));
	}
	
	/**
	* Test case 4 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName4() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr4", "prefix", "value");
		assertEquals("attr4", element.getAttributeLocalName(3));
	}
	
	/**
	* Test case 5 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName5() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr4", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr5", "prefix", "value");
		assertEquals("attr5", element.getAttributeLocalName(4));
	}
	
	/**
	* Test case 6 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName6() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr4", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr5", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr6", "prefix", "value");
		assertEquals("attr6", element.getAttributeLocalName(5));
	}
	
	/**
	* Test case 7 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName7() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr4", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr5", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr6", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr7", "prefix", "value");
		assertEquals("attr7", element.getAttributeLocalName(6));
	}
	
	/**
	* Test case 8 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName8() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr4", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr5", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr6", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr7", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr8", "prefix", "value");
		assertEquals("attr8", element.getAttributeLocalName(7));
	}
	
	/**
	* Test case 9 for {@link Element#getAttributeLocalName(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAttributeLocalName9() {
		Element element = new Element("element", "http://www.example.com/", "prefix");
		element.addAttribute("http://www.example.com/", "attr", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr2", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr3", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr4", "prefix", "value");
		element.addAttribute("http://www.example.com/", "attr5", "prefix", "value");
		element.addAttribute("http://www.example.com/", "
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
* It contains ten unit test cases for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {

	/**
	 * Test case for {@link Element#numberOfAttributes()}
	 * <p>
	 * Test if the number of attributes is correct.
	 */
	@Test
	void testNumberOfAttributes() {
		Element element = new Element("", "", 0);
		assertEquals(0, element.numberOfAttributes());
		element = new Element("", "", 1);
		assertEquals(1, element.numberOfAttributes());
		element = new Element("", "", 2);
		assertEquals(2, element.numberOfAttributes());
		element = new Element("", "", 3);
		assertEquals(3, element.numberOfAttributes());
		element = new Element("", "", 4);
		assertEquals(4, element.numberOfAttributes());
		element = new Element("", "", 5);
		assertEquals(5, element.numberOfAttributes());
		element = new Element("", "", 6);
		assertEquals(6, element.numberOfAttributes());
		element = new Element("", "", 7);
		assertEquals(7, element.numberOfAttributes());
		element = new Element("", "", 8);
		assertEquals(8, element.numberOfAttributes());
		element = new Element("", "", 9);
		assertEquals(9, element.numberOfAttributes());
	}
}

// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#addAttribute(String, String, String, String)} method.
*/
class Element_2Test {
		
	/**
	 * Test case for {@link Element#addAttribute(String, String, String, String)}
	 * <p>
	 * Test if the attribute is added correctly.
	 */
	@Test
	void testAddAttribute() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
		element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals(2, element.numberOfAttributes());
		element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		assertEquals(3, element.numberOfAttributes());
		element = new Element("", "", 3);
		element.addAttribute("", "", "", "");
		assertEquals(4, element.numberOfAttributes());
		element = new Element("", "", 4);
		element.addAttribute("", "", "", "");
		assertEquals(5, element.numberOfAttributes());
		element = new Element("", "", 5);
		element.addAttribute("", "", "", "");
		assertEquals(6, element.numberOfAttributes());
		element = new Element("", "", 6);
		element.addAttribute("", "", "", "");
		assertEquals(7, element.numberOfAttributes());
		element = new Element("", "", 7);
		element.addAttribute("", "", "", "");
		assertEquals(8, element.numberOfAttributes());
		element = new Element("", "", 8);
		element.addAttribute("", "", "", "");
		assertEquals(9, element.numberOfAttributes());
		element = new Element("", "", 9);
		element.addAttribute("", "", "", "");
		assertEquals(10, element.numberOfAttributes());
	}
}

// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#removeAttribute(int)} method.
*/
class Element_3Test {
		
	/**
	 * Test case for {@link Element#removeAttribute(int)}
	 * <p>
	 * Test if the attribute is removed correctly.
	 */
	@Test
	void testRemoveAttribute() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(0, element.numberOfAttributes());
		element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(0, element.numberOfAttributes());
		element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(1, element.numberOfAttributes());
		element = new Element("", "", 3);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(2, element.numberOfAttributes());
		element = new Element("", "", 4);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(3, element.numberOfAttributes());
		element = new Element("", "", 5);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(4, element.numberOfAttributes());
		element = new Element("", "", 6);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(5, element.numberOfAttributes());
		element = new Element("", "", 7);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(6, element.numberOfAttributes());
		element = new Element("", "", 8);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(7, element.numberOfAttributes());
		element = new Element("", "", 9);
		element.addAttribute("", "", "", "");
		element.removeAttribute(0);
		assertEquals(8, element.numberOfAttributes());
	}
}

// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_4Test {
		
	/**
	 * Test case for {@link Element#getAttributeNamespaceURI(int)}
	 * <p>
	 * Test if the namespace URI is correct.
	 */
	@Test
	void testGetAttributeNamespaceURI() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(0
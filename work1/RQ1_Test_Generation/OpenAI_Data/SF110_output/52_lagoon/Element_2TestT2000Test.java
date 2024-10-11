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
* It contains ten unit test cases for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {

	@Test
	void testGetAttributeNamespaceURI_0() throws Exception {
		Element element = new Element("", "", 0);
		assertEquals(null, element.getAttributeNamespaceURI(-1));
	}
	
	@Test
	void testGetAttributeNamespaceURI_1() throws Exception {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(0));
	}
	
	@Test
	void testGetAttributeNamespaceURI_2() throws Exception {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(1));
	}
	
	@Test
	void testGetAttributeNamespaceURI_3() throws Exception {
		Element element = new Element("", "", 3);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(2));
	}
	
	@Test
	void testGetAttributeNamespaceURI_4() throws Exception {
		Element element = new Element("", "", 4);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(3));
	}
	
	@Test
	void testGetAttributeNamespaceURI_5() throws Exception {
		Element element = new Element("", "", 5);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(4));
	}
	
	@Test
	void testGetAttributeNamespaceURI_6() throws Exception {
		Element element = new Element("", "", 6);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(5));
	}
	
	@Test
	void testGetAttributeNamespaceURI_7() throws Exception {
		Element element = new Element("", "", 7);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(6));
	}
	
	@Test
	void testGetAttributeNamespaceURI_8() throws Exception {
		Element element = new Element("", "", 8);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(7));
	}
	
	@Test
	void testGetAttributeNamespaceURI_9() throws Exception {
		Element element = new Element("", "", 9);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeNamespaceURI(8));
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
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		
	@Test
	void testGetAttributeLocalName_0() throws Exception {
		Element element = new Element("", "", 0);
		assertEquals(null, element.getAttributeLocalName(-1));
	}
	
	@Test
	void testGetAttributeLocalName_1() throws Exception {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(0));
	}
	
	@Test
	void testGetAttributeLocalName_2() throws Exception {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(1));
	}
	
	@Test
	void testGetAttributeLocalName_3() throws Exception {
		Element element = new Element("", "", 3);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(2));
	}
	
	@Test
	void testGetAttributeLocalName_4() throws Exception {
		Element element = new Element("", "", 4);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(3));
	}
	
	@Test
	void testGetAttributeLocalName_5() throws Exception {
		Element element = new Element("", "", 5);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(4));
	}
	
	@Test
	void testGetAttributeLocalName_6() throws Exception {
		Element element = new Element("", "", 6);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		element.addAttribute
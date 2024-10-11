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

	/**
	 * Test case 1 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_1() throws SAXException {
		Element element = new Element("", "", 0);
		assertNull(element.getAttributeLocalName(-1));
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_2() throws SAXException {
		Element element = new Element("", "", 0);
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(0));
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_3() throws SAXException {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(0));
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_4() throws SAXException {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(1));
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_5() throws SAXException {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(-2));
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_6() throws SAXException {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(0));
	}
	
	/**
	 * Test case 7 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_7() throws SAXException {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeLocalName(1));
	}
	
	/**
	 * Test case 8 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_8() throws SAXException {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(2));
	}
	
	/**
	 * Test case 9 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_9() throws SAXException {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(-3));
	}
	
	/**
	 * Test case 10 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeLocalName_10() throws SAXException {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(-1));
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
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		
	/**
	 * Test case 1 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeType_1() throws SAXException {
		Element element = new Element("", "", 0);
		assertNull(element.getAttributeType(-1));
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeType_2() throws SAXException {
		Element element = new Element("", "", 0);
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeType(0));
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeType_3() throws SAXException {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeType(0));
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeType_4() throws SAXException {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeType(1));
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeType_5() throws SAXException {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeType(-2));
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws SAXException
	 */
	@Test
	void testGetAttributeType_6() throws SAXException {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		element.addAttribute("", "", "", "");
		assertEquals("", element.getAttributeType(0));
	}
	
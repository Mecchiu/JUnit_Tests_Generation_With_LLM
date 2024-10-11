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
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class ElementTest {

	/**
	 * Test case 1 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType1() throws Exception {
		Element element = new Element("element", new AttributesImpl());
		assertEquals(null, element.getAttributeType(-1));
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType2() throws Exception {
		Element element = new Element("element", new AttributesImpl());
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeType(0));
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType3() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "CDATA", "value");
		Element element = new Element("element", attributes);
		assertEquals("CDATA", element.getAttributeType(0));
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType4() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "ID", "value");
		Element element = new Element("element", attributes);
		assertEquals("ID", element.getAttributeType(0));
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType5() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "IDREF", "value");
		Element element = new Element("element", attributes);
		assertEquals("IDREF", element.getAttributeType(0));
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType6() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "IDREFS", "value");
		Element element = new Element("element", attributes);
		assertEquals("IDREFS", element.getAttributeType(0));
	}
	
	/**
	 * Test case 7 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType7() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "NMTOKEN", "value");
		Element element = new Element("element", attributes);
		assertEquals("NMTOKEN", element.getAttributeType(0));
	}
	
	/**
	 * Test case 8 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType8() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "NMTOKENS", "value");
		Element element = new Element("element", attributes);
		assertEquals("NMTOKENS", element.getAttributeType(0));
	}
	
	/**
	 * Test case 9 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType9() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "ENTITY", "value");
		Element element = new Element("element", attributes);
		assertEquals("ENTITY", element.getAttributeType(0));
	}
	
	/**
	 * Test case 10 for {@link Element#getAttributeType(int)}.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	void testGetAttributeType10() throws Exception {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "attribute", "ENTITIES", "value");
		Element element = new Element("element", attributes);
		assertEquals("ENTITIES", element.getAttributeType(0));
	}
}
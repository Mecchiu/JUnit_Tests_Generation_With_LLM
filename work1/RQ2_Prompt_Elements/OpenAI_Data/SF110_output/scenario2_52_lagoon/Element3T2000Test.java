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
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertEquals("attr1", element.getAttributeLocalName(0));
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with a valid index.
	 */
	@Test
	void testGetAttributeLocalName2() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertEquals("attr2", element.getAttributeLocalName(1));
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with a valid index.
	 */
	@Test
	void testGetAttributeLocalName3() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertEquals("attr3", element.getAttributeLocalName(2));
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName4() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(3));
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName5() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(-2));
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName6() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(-1));
	}
	
	/**
	 * Test case 7 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName7() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(4));
	}
	
	/**
	 * Test case 8 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName8() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(5));
	}
	
	/**
	 * Test case 9 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName9() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(6));
	}
	
	/**
	 * Test case 10 for {@link Element#getAttributeLocalName(int)}.
	 * It tests the method with an invalid index.
	 */
	@Test
	void testGetAttributeLocalName10() {
		Element element = new Element("element", "", "");
		element.addAttribute("attr1", "value1");
		element.addAttribute("attr2", "value2");
		element.addAttribute("attr3", "value3");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeLocalName(7));
	}
}
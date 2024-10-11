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
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class ElementTest {

	/**
	 * Test case 1 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 1 is a positive test case.
	 * <p>
	 * Test case 1 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue1() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 2 is a negative test case.
	 * <p>
	 * Test case 2 tests the {@link Element#getAttributeValue(int)} method with an invalid index.
	 * <p>
	 * Expected result: An IndexOutOfBoundsException is thrown.
	 */
	@Test
	void testGetAttributeValue2() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeValue(1));
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 3 is a negative test case.
	 * <p>
	 * Test case 3 tests the {@link Element#getAttributeValue(int)} method with an invalid index.
	 * <p>
	 * Expected result: An IndexOutOfBoundsException is thrown.
	 */
	@Test
	void testGetAttributeValue3() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeValue(-2));
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 4 is a negative test case.
	 * <p>
	 * Test case 4 tests the {@link Element#getAttributeValue(int)} method with an invalid index.
	 * <p>
	 * Expected result: An IndexOutOfBoundsException is thrown.
	 */
	@Test
	void testGetAttributeValue4() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeValue(-1));
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 5 is a positive test case.
	 * <p>
	 * Test case 5 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue5() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 6 is a positive test case.
	 * <p>
	 * Test case 6 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue6() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case 7 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 7 is a positive test case.
	 * <p>
	 * Test case 7 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue7() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case 8 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 8 is a positive test case.
	 * <p>
	 * Test case 8 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue8() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case 9 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 9 is a positive test case.
	 * <p>
	 * Test case 9 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue9() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case 10 for {@link Element#getAttributeValue(int)}.
	 * <p>
	 * Test case 10 is a positive test case.
	 * <p>
	 * Test case 10 tests the {@link Element#getAttributeValue(int)} method with a valid index.
	 * <p>
	 * Expected result: The attribute value is returned.
	 */
	@Test
	void testGetAttributeValue10() {
		Element element = new Element("element", "", "");
		element.addAttribute("attribute", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
}
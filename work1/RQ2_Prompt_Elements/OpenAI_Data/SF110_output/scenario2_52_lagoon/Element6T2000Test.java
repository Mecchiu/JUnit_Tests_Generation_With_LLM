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
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class ElementTest {

	/**
	 * Test case 1 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is zero.
	 */
	@Test
	void testNumberOfNamespaceMappings1() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 2 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is one.
	 */
	@Test
	void testNumberOfNamespaceMappings2() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		assertEquals(1, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 3 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is two.
	 */
	@Test
	void testNumberOfNamespaceMappings3() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(2, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 4 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is three.
	 */
	@Test
	void testNumberOfNamespaceMappings4() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(3, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 5 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is four.
	 */
	@Test
	void testNumberOfNamespaceMappings5() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(4, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 6 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is five.
	 */
	@Test
	void testNumberOfNamespaceMappings6() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(5, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 7 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is six.
	 */
	@Test
	void testNumberOfNamespaceMappings7() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(6, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 8 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is seven.
	 */
	@Test
	void testNumberOfNamespaceMappings8() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(7, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 9 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is eight.
	 */
	@Test
	void testNumberOfNamespaceMappings9() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(8, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 10 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the number of namespace mappings is nine.
	 */
	@Test
	void testNumberOfNamespaceMappings10() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(9, element.numberOfNamespaceMappings());
	}
}
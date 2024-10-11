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
	 * It tests the case when the element has no namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings1() {
		Element element = new Element("", "", "", new AttributesImpl());
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 2 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has one namespace mapping.
	 */
	@Test
	public void testNumberOfNamespaceMappings2() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		assertEquals(1, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 3 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has two namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings3() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		assertEquals(2, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 4 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has three namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings4() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		assertEquals(3, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 5 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has four namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings5() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		element.addNamespaceMapping("prefix3", "http://www.example.com");
		assertEquals(4, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 6 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has five namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings6() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		element.addNamespaceMapping("prefix3", "http://www.example.com");
		element.addNamespaceMapping("prefix4", "http://www.example.com");
		assertEquals(5, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 7 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has six namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings7() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		element.addNamespaceMapping("prefix3", "http://www.example.com");
		element.addNamespaceMapping("prefix4", "http://www.example.com");
		element.addNamespaceMapping("prefix5", "http://www.example.com");
		assertEquals(6, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 8 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has seven namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings8() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		element.addNamespaceMapping("prefix3", "http://www.example.com");
		element.addNamespaceMapping("prefix4", "http://www.example.com");
		element.addNamespaceMapping("prefix5", "http://www.example.com");
		element.addNamespaceMapping("prefix6", "http://www.example.com");
		assertEquals(7, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 9 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has eight namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings9() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		element.addNamespaceMapping("prefix3", "http://www.example.com");
		element.addNamespaceMapping("prefix4", "http://www.example.com");
		element.addNamespaceMapping("prefix5", "http://www.example.com");
		element.addNamespaceMapping("prefix6", "http://www.example.com");
		element.addNamespaceMapping("prefix7", "http://www.example.com");
		assertEquals(8, element.numberOfNamespaceMappings());
	}
	
	/**
	 * Test case 10 for {@link Element#numberOfNamespaceMappings()}.
	 * It tests the case when the element has nine namespace mappings.
	 */
	@Test
	public void testNumberOfNamespaceMappings10() {
		Element element = new Element("", "", "", new AttributesImpl());
		element.addNamespaceMapping("", "http://www.example.com");
		element.addNamespaceMapping("prefix", "http://www.example.com");
		element.addNamespaceMapping("prefix2", "http://www.example.com");
		element.addNamespaceMapping("prefix3", "http://www.example.com");
		element.addNamespaceMapping("prefix4", "http://www.example.com");
		element.addNamespaceMapping("prefix5", "http://www.example.com");
		element.addNamespaceMapping("prefix6", "http://www.example.com");
		element.addNamespaceMapping("prefix7", "http://www.example.com");
		element.addNamespaceMapping("prefix8", "http://www.example.com");
		assertEqu
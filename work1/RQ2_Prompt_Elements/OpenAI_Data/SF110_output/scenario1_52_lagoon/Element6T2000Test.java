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
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfNamespaceMappings1() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = null;
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 2 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with an empty value.
	*/
	@Test
	void testNumberOfNamespaceMappings2() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = new Vector<String>();
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 3 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with a non-empty value.
	*/
	@Test
	void testNumberOfNamespaceMappings3() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = new Vector<String>();
		element.namespacePrefixes.add("");
		assertEquals(1, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 4 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfNamespaceMappings4() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = null;
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 5 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with an empty value.
	*/
	@Test
	void testNumberOfNamespaceMappings5() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = new Vector<String>();
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 6 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with a non-empty value.
	*/
	@Test
	void testNumberOfNamespaceMappings6() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = new Vector<String>();
		element.namespacePrefixes.add("");
		assertEquals(1, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 7 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfNamespaceMappings7() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = null;
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 8 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with an empty value.
	*/
	@Test
	void testNumberOfNamespaceMappings8() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = new Vector<String>();
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 9 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with a non-empty value.
	*/
	@Test
	void testNumberOfNamespaceMappings9() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = new Vector<String>();
		element.namespacePrefixes.add("");
		assertEquals(1, element.numberOfNamespaceMappings());
	}
	
	/**
	* Test case 10 for {@link Element#numberOfNamespaceMappings()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfNamespaceMappings10() {
		Element element = new Element("", "", "");
		element.namespacePrefixes = null;
		assertEquals(0, element.numberOfNamespaceMappings());
	}
}
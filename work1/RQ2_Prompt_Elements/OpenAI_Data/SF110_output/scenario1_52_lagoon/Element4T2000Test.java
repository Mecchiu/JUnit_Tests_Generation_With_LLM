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
	 * Test case 1 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 1 checks if the method returns null when the index is -1.
	 */
	@Test
	void testGetAttributeType1() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(-1));
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 2 checks if the method returns null when the index is 0.
	 */
	@Test
	void testGetAttributeType2() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(0));
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 3 checks if the method returns null when the index is 1.
	 */
	@Test
	void testGetAttributeType3() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(1));
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 4 checks if the method returns null when the index is 2.
	 */
	@Test
	void testGetAttributeType4() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(2));
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 5 checks if the method returns null when the index is 3.
	 */
	@Test
	void testGetAttributeType5() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(3));
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 6 checks if the method returns null when the index is 4.
	 */
	@Test
	void testGetAttributeType6() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(4));
	}
	
	/**
	 * Test case 7 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 7 checks if the method returns null when the index is 5.
	 */
	@Test
	void testGetAttributeType7() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(5));
	}
	
	/**
	 * Test case 8 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 8 checks if the method returns null when the index is 6.
	 */
	@Test
	void testGetAttributeType8() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(6));
	}
	
	/**
	 * Test case 9 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 9 checks if the method returns null when the index is 7.
	 */
	@Test
	void testGetAttributeType9() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(7));
	}
	
	/**
	 * Test case 10 for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test case 10 checks if the method returns null when the index is 8.
	 */
	@Test
	void testGetAttributeType10() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertNull(element.getAttributeType(8));
	}
}
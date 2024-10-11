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
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType1() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(0));
	}
	
	/**
	* Test case 2 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType2() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(1));
	}
	
	/**
	* Test case 3 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType3() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(2));
	}
	
	/**
	* Test case 4 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType4() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(3));
	}
	
	/**
	* Test case 5 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType5() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(4));
	}
	
	/**
	* Test case 6 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType6() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(5));
	}
	
	/**
	* Test case 7 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType7() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(6));
	}
	
	/**
	* Test case 8 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType8() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(7));
	}
	
	/**
	* Test case 9 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType9() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(8));
	}
	
	/**
	* Test case 10 for {@link Element#getAttributeType(int)}.
	* It tests the normal case.
	*/
	@Test
	public void testGetAttributeType10() {
		Element element = new Element("name", "uri", "prefix", new AttributesImpl());
		assertEquals(null, element.getAttributeType(9));
	}
}
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
	* Test case 1 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is -1.
	*/
	@Test
	public void testGetAttributeValue1() {
		Element element = new Element("name", "uri", "prefix");
		assertEquals(null, element.getAttributeValue(-1));
	}
	
	/**
	* Test case 2 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 0.
	*/
	@Test
	public void testGetAttributeValue2() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	* Test case 3 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 1.
	*/
	@Test
	public void testGetAttributeValue3() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		assertEquals("value1", element.getAttributeValue(1));
	}
	
	/**
	* Test case 4 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 2.
	*/
	@Test
	public void testGetAttributeValue4() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		assertEquals("value2", element.getAttributeValue(2));
	}
	
	/**
	* Test case 5 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 3.
	*/
	@Test
	public void testGetAttributeValue5() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		assertEquals("value3", element.getAttributeValue(3));
	}
	
	/**
	* Test case 6 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 4.
	*/
	@Test
	public void testGetAttributeValue6() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		assertEquals("value4", element.getAttributeValue(4));
	}
	
	/**
	* Test case 7 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 5.
	*/
	@Test
	public void testGetAttributeValue7() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		assertEquals("value5", element.getAttributeValue(5));
	}
	
	/**
	* Test case 8 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 6.
	*/
	@Test
	public void testGetAttributeValue8() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		assertEquals("value6", element.getAttributeValue(6));
	}
	
	/**
	* Test case 9 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 7.
	*/
	@Test
	public void testGetAttributeValue9() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		assertEquals("value7", element.getAttributeValue(7));
	}
	
	/**
	* Test case 10 for {@link Element#getAttributeValue(int)} method.
	* It tests the case when the index is 8.
	*/
	@Test
	public void testGetAttributeValue10() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name", "value");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		assertEquals("value8", element.getAttributeValue(8));
	}
}
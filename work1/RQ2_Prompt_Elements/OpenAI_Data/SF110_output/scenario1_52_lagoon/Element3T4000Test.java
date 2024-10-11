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
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName1() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		assertEquals("test", element.getAttributeLocalName(0));
	}
	
	/**
	* Test case 2 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName2() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		assertEquals("test2", element.getAttributeLocalName(1));
	}
	
	/**
	* Test case 3 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName3() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		assertEquals("test3", element.getAttributeLocalName(2));
	}
	
	/**
	* Test case 4 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName4() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		assertEquals("test4", element.getAttributeLocalName(3));
	}
	
	/**
	* Test case 5 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName5() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		element.addAttribute("http://test.org", "test5", "test5", "CDATA", "test5");
		assertEquals("test5", element.getAttributeLocalName(4));
	}
	
	/**
	* Test case 6 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName6() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		element.addAttribute("http://test.org", "test5", "test5", "CDATA", "test5");
		element.addAttribute("http://test.org", "test6", "test6", "CDATA", "test6");
		assertEquals("test6", element.getAttributeLocalName(5));
	}
	
	/**
	* Test case 7 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName7() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		element.addAttribute("http://test.org", "test5", "test5", "CDATA", "test5");
		element.addAttribute("http://test.org", "test6", "test6", "CDATA", "test6");
		element.addAttribute("http://test.org", "test7", "test7", "CDATA", "test7");
		assertEquals("test7", element.getAttributeLocalName(6));
	}
	
	/**
	* Test case 8 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName8() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		element.addAttribute("http://test.org", "test5", "test5", "CDATA", "test5");
		element.addAttribute("http://test.org", "test6", "test6", "CDATA", "test6");
		element.addAttribute("http://test.org", "test7", "test7", "CDATA", "test7");
		element.addAttribute("http://test.org", "test8", "test8", "CDATA", "test8");
		assertEquals("test8", element.getAttributeLocalName(7));
	}
	
	/**
	* Test case 9 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName9() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		element.addAttribute("http://test.org", "test5", "test5", "CDATA", "test5");
		element.addAttribute("http://test.org", "test6", "test6", "CDATA", "test6");
		element.addAttribute("http://test.org", "test7", "test7", "CDATA", "test7");
		element.addAttribute("http://test.org", "test8", "test8", "CDATA", "test8");
		element.addAttribute("http://test.org", "test9", "test9", "CDATA", "test9");
		assertEquals("test9", element.getAttributeLocalName(8));
	}
	
	/**
	* Test case 10 for {@link Element#getAttributeLocalName(int)}.
	* It tests the normal case.
	*/
	@Test
	void testGetAttributeLocalName10() {
		Element element = new Element("test", "http://test.org");
		element.addAttribute("http://test.org", "test", "test", "CDATA", "test");
		element.addAttribute("http://test.org", "test2", "test2", "CDATA", "test2");
		element.addAttribute("http://test.org", "test3", "test3", "CDATA", "test3");
		element.addAttribute("http://test.org", "test4", "test4", "CDATA", "test4");
		element.addAttribute("http://test.org", "test5", "test5", "CDATA", "test5");
		element.addAttribute("http://test.org", "test6", "test6", "CDATA", "test6");
		element.addAttribute("http://test.org", "test7", "test7", "CDATA", "test7");
		element.addAttribute("http://test.org", "test8", "test8", "CDATA", "test8");
		element.addAttribute("http://test.org", "test9", "test9", "CDATA", "test9");
		element.addAttribute("http://test.org", "test10", "test10", "CDATA", "test10");
		assertEquals("test10", element.getAttributeLocalName(9));
	}
}
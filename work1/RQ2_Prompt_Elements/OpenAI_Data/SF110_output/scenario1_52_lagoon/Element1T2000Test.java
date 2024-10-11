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
* It contains ten unit test cases for the {@link Element#numberOfAttributes()} method.
*/
class ElementTest {

	/**
	* Test case 1 for {@link Element#numberOfAttributes()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfAttributes1() {
		Element element = new Element("name", null);
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	* Test case 2 for {@link Element#numberOfAttributes()}.
	* It tests the method with an empty value.
	*/
	@Test
	void testNumberOfAttributes2() {
		Element element = new Element("name", new AttributesImpl());
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	* Test case 3 for {@link Element#numberOfAttributes()}.
	* It tests the method with a non-empty value.
	*/
	@Test
	void testNumberOfAttributes3() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "name", "", "value");
		Element element = new Element("name", attributes);
		assertEquals(1, element.numberOfAttributes());
	}
	
	/**
	* Test case 4 for {@link Element#numberOfAttributes()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfAttributes4() {
		Element element = new Element("name", null);
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	* Test case 5 for {@link Element#numberOfAttributes()}.
	* It tests the method with an empty value.
	*/
	@Test
	void testNumberOfAttributes5() {
		Element element = new Element("name", new AttributesImpl());
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	* Test case 6 for {@link Element#numberOfAttributes()}.
	* It tests the method with a non-empty value.
	*/
	@Test
	void testNumberOfAttributes6() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "name", "", "value");
		Element element = new Element("name", attributes);
		assertEquals(1, element.numberOfAttributes());
	}
	
	/**
	* Test case 7 for {@link Element#numberOfAttributes()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfAttributes7() {
		Element element = new Element("name", null);
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	* Test case 8 for {@link Element#numberOfAttributes()}.
	* It tests the method with an empty value.
	*/
	@Test
	void testNumberOfAttributes8() {
		Element element = new Element("name", new AttributesImpl());
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	* Test case 9 for {@link Element#numberOfAttributes()}.
	* It tests the method with a non-empty value.
	*/
	@Test
	void testNumberOfAttributes9() {
		AttributesImpl attributes = new AttributesImpl();
		attributes.addAttribute("", "", "name", "", "value");
		Element element = new Element("name", attributes);
		assertEquals(1, element.numberOfAttributes());
	}
	
	/**
	* Test case 10 for {@link Element#numberOfAttributes()}.
	* It tests the method with a null value.
	*/
	@Test
	void testNumberOfAttributes10() {
		Element element = new Element("name", null);
		assertEquals(0, element.numberOfAttributes());
	}
}
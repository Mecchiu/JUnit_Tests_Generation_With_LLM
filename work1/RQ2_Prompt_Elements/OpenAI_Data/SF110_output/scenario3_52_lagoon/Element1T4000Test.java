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
	 * It tests the case when the element has no attributes.
	 */
	@Test
	public void testNumberOfAttributes1() {
		Element element = new Element("element", null);
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	 * Test case 2 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has one attribute.
	 */
	@Test
	public void testNumberOfAttributes2() {
		Element element = new Element("element", null);
		element.addAttribute("attribute", "value");
		assertEquals(1, element.numberOfAttributes());
	}
	
	/**
	 * Test case 3 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has two attributes.
	 */
	@Test
	public void testNumberOfAttributes3() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		assertEquals(2, element.numberOfAttributes());
	}
	
	/**
	 * Test case 4 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has three attributes.
	 */
	@Test
	public void testNumberOfAttributes4() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		assertEquals(3, element.numberOfAttributes());
	}
	
	/**
	 * Test case 5 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has four attributes.
	 */
	@Test
	public void testNumberOfAttributes5() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		element.addAttribute("attribute4", "value4");
		assertEquals(4, element.numberOfAttributes());
	}
	
	/**
	 * Test case 6 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has five attributes.
	 */
	@Test
	public void testNumberOfAttributes6() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		element.addAttribute("attribute4", "value4");
		element.addAttribute("attribute5", "value5");
		assertEquals(5, element.numberOfAttributes());
	}
	
	/**
	 * Test case 7 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has six attributes.
	 */
	@Test
	public void testNumberOfAttributes7() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		element.addAttribute("attribute4", "value4");
		element.addAttribute("attribute5", "value5");
		element.addAttribute("attribute6", "value6");
		assertEquals(6, element.numberOfAttributes());
	}
	
	/**
	 * Test case 8 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has seven attributes.
	 */
	@Test
	public void testNumberOfAttributes8() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		element.addAttribute("attribute4", "value4");
		element.addAttribute("attribute5", "value5");
		element.addAttribute("attribute6", "value6");
		element.addAttribute("attribute7", "value7");
		assertEquals(7, element.numberOfAttributes());
	}
	
	/**
	 * Test case 9 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has eight attributes.
	 */
	@Test
	public void testNumberOfAttributes9() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		element.addAttribute("attribute4", "value4");
		element.addAttribute("attribute5", "value5");
		element.addAttribute("attribute6", "value6");
		element.addAttribute("attribute7", "value7");
		element.addAttribute("attribute8", "value8");
		assertEquals(8, element.numberOfAttributes());
	}
	
	/**
	 * Test case 10 for {@link Element#numberOfAttributes()}.
	 * It tests the case when the element has nine attributes.
	 */
	@Test
	public void testNumberOfAttributes10() {
		Element element = new Element("element", null);
		element.addAttribute("attribute1", "value1");
		element.addAttribute("attribute2", "value2");
		element.addAttribute("attribute3", "value3");
		element.addAttribute("attribute4", "value4");
		element.addAttribute("attribute5", "value5");
		element.addAttribute("attribute6", "value6");
		element.addAttribute("attribute7", "value7");
		element.addAttribute("attribute8", "value8");
		element.addAttribute("attribute9", "value9");
		assertEquals(9, element.numberOfAttributes());
	}
}
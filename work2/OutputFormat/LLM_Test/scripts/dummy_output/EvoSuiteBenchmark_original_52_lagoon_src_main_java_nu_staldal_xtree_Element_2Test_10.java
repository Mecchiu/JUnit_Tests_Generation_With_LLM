// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {
		
	/**
	* Check if an un-normalized text string returns one of expected values.
	* It is expected to match one of the expected return values.
	* 
	*/
	@Test
	public void test_1() {

		Element element = new Element("element");

		Vector children = new Vector();

		element.addChildElement("child", children);

		assertNull(element.getAttributeNamespace("namespace"));

		AttributesImpl attrs = new AttributesImpl();

		attrs.addValue(null, "localName", "element");

		assertEquals("element", ((Element) element.lookupNamespace("http://www.w3.org/1999/xhtml"))
				.getAttribute("localName"));
	 }

	/**
	* Check if an un-normalized text string returns nothing for an empty child element.
	* 
	*/
	@Test
	public void test_2() {

		Element element = new Element("element");

		Vector children = new Vector();

		element.addChildElement("child", children);

		assertNull(element.getAttributeNamespace("local"));
	 }

	/**
	* Check if an un-normalized text string with XML processing normalizes its text correctly.
	* It is expected to match one of the expected normalization return values.
	*
	*/
	@Test
	public void test_3() {

        Element element = new Element("element");
        Attributes attributes = new AttributesImpl();

        attributes.addAttributeNS(null, null, "http://xml.apache.org/DOM", "localName", "localName");

        element.setAttributes(attributes);

        String text;
		text = element.getText();

		assertEquals("localName", ((Element) text).getAttribute("localName"));

        attributes.clear();
		text = element.getText();

		assertEquals("localName", ((Element) text).getAttribute("localName"));
	}
}
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
		
    @Test
    void test_lookupAttribute_int_int_int () throws ELException, SAXException {
    	final String tagName = "document";
    	final String elementID = "test:element";
    	AttributesImpl atts = new AttributesImpl();
    	atts.addAttribute("", "id", "id.subelement", "", "test");

		final Element element = new Element(tagName, null, null);
		element.setCDataContent(null);
		element.setIDAttribute(null, null, null);
		element.setElementIDAttribute(null, null, elementID);
		element.setAttribute("", atts);

		final String expected = "(&lt;document&gt;&lt;test:" + elementID + "/&gt;&lt;/" + elementID + "/&gt;)";
		assertEquals(expected, element.lookupAttribute("id").getString());
    }

	@Test
	void test_attributeName_string() throws ELException, SAXException {
		final String tagName = "document";
		final String expected = "&lt;document";
		attributes.addAttribute(null, "tag", "tag.name", "test", "Document");

		final Element element = new Element(tagName, null, null);
		final String tag = element.lookupAttribute("tag").getString();
		assertEquals(expected, tag);
    }

	@Test
	void test_attributeNamespaceURI_string() throws ELException, SAXException {
		final String tagName = "document";
		final String expected = "&lt;document";
		attributes.addAttribute(null, "tag", "tag.namespaceURI", "test", "Document");

		final Element element = new Element(tagName, null, null);
		final String tagNS = element.lookupAttribute("tag").getString();
		assertEquals( expected, tagNS);
    }

	@Test
	void test_attributeName_string_string () throws ELException, SAXException {
		final String tagName = "document";
		final String tagNS = "test";

    	final String expected = "&lt;document";
    	attributes.addAttribute(null, "tag", "tag.name", "test", tagNS);

		final Element element = new Element(tagName, null, null);
    	final String tag = element.lookupAttribute("tag").getString();
    	assertEquals(expected, tag);
    }

    @Configuration
    static public class Test_Configuration {
		
		@Test
		void test_attributeName_string_string_string () throws ELException, SAXException {
			final String tagName = "document";
			final String expected = "&lt;document";
			final String tagNS = "test";
			attr2 = new AttributesImpl();
			attr2.addAttribute(null, "tag", "tag.name", "test", tagNS);
    	attributes.addAttribute(attr2, "tag", "tag.name", "test", tagNS);

    	final Element element = new Element(tagName, null, null);
			final String tag = element.lookupAttribute("tag").getString();
    	assertEquals(expected, tag);

    	final AttributesImpl attr2 = element.getAttributes();
    	assertFalse(attr2.isDefined());
		}

}
}
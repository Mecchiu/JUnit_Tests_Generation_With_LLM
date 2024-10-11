// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		
	@Test
	public void testAttributeTypes1() throws SAXException, IOException {
		Element element = new Element("Element");
		element.setAttribute("id", "Element.1234");
		element.setAttribute("id", "Element.1234");
		element.setAttribute("id", "Element.1234", "CDATA", "Element.1234");
		element.setAttribute("id", "Element.12", "CDATA", "Element.12");
		element.setAttribute("id", "Element.1234", "ID", "Element.1234");
		element.setAttribute("id", "Element.1234", "IDREF", "Element.1234");
		element.setAttribute("id", "Element.1234", "IDREFS", "Element.1234");
		element.setAttribute("id", "Element.1234", "ENTITY", "Element.1234");
		element.setAttribute("id", "Element.1234", "ENTITIES", "Element.1234");
		element.setAttribute("id", "Element.1234", "NOTATION", "Element.1234");
	}

	/**
	 * Test the method {@link Element#getAttributeType(int)}.
	 */
	@Test
	public void testGetAttributeType() throws SAXException, IOException {
		XMLReader xmlReader = null;
		String uriAttribute = null;
		Vector attributes = null;
		String[] names = null;

		// First test with default namespace prefix.
		Element element = new Element("Element");

		try {
			xmlReader = new XMLReader(new InputSource(new StringReader("<myroot>")));
			xmlReader.setProperty(XMLReader.PROPERTY_NAMESPACE_PREFIXES, "http://xml.org/sax/properties/xml-namespace-prefixes");
			xmlReader.setFeature(XMLReader.FEATURE_LEVEL_1_PROCESS_ALL_ATTRIBUTE_GROUPS, true);

			org.xml.sax.InputSource source = new org.xml.sax.InputSource(xmlReader);

			assertEquals(true, element.getAttribute("id", "http://xml.org/sax/properties/xml-namespace-prefixes[0]").equals("http://xml.org/sax/properties/xml-namespace-prefixes"));
			assertSame(XMLReader.XML_NAMESPACE_PREFIX_URI, element.getAttribute("id", "http://xml.org/sax/properties/xml-namespace-prefixes[0]").toString());

			// Second test with other XML namespace uris.
			uriAttribute = element.getAttribute("id", "namespace.uri");
			xmlReader.setProperty(uriAttribute);
			attributes = xmlReader.getAttributes(xmlReader, uriAttribute);

			names = xmlReader.getRootElement().getName().getLocalPartArray();
			assertEquals("Element", xmlReader.getLocalName(names[0]));
			assertEquals("Element", xmlReader.getLocalName(names[1]));
			assertEquals("Element", xmlReader.getLocalName(names[0]));
			assertEquals("Element", xmlReader.getLocalName(names[2]));
		}
		finally {
			if (xmlReader!= null) {
				xmlReader.close();
			}
			if (element!= null) {
				element.setAttribute("id", uriAttribute);
			}
		}
	}

}
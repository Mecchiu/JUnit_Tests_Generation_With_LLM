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
	public void testElements() {
		Element element = new Element("root", new AttributesImpl());
		
		String type = element.getAttributeType("type");
		assertNotNull(type);
		type = type.toLowerCase();
		assertEquals(Element.valueOf("id", type), Element.valueOf("ID", type));
		assertEquals(Element.valueOf("idref"), Element.valueOf("IDREF", type));
		assertEquals(Element.valueOf("IDREFS"), Element.valueOf("IDREFS", type));
		assertEquals(Element.valueOf("NMTOKEN"), Element.valueOf("NMTOKEN", type));
		assertEquals(Element.valueOf("NMTOKENS"), Element.valueOf("NMTOKENS", type));
		assertEquals(Element.valueOf("ENTITY"), Element.valueOf("ENTITY", type));
        assertEquals(Element.valueOf("ENTITIES"), Element.valueOf("ENTITIES", type));
        assertEquals(Element.valueOf("NOTATION"), Element.valueOf("NOTATION", type));		

	}
	
	@Test
	public void testLookupAttribute_defaultMethod() throws SAXException, IOException {
		Element element = new Element("root", new AttributesImpl());
		element.getAttribute(null);  // throws NullPointerException if no attribute found
	}
	
	@Test
	public void testLookupAttribute_setAttribute() throws SAXException, IOException {
		Element element = new Element("root", new AttributesImpl());
		elements.addElement(element);

		element.setAttribute("type", Element.valueOf("NMTOKENS"));

		AttributesImpl attributes = element.getAttributes();
		assertTrue(attributes.getLength() > 0);
		Vector contents = new Vector();
		contents.add("attribute");
		contents.add(Element.valueOf("IDREFs"));
		contents.add(Element.valueOf("ID"));
		assertEquals(contents, attributes.getValue(0));
		Vector childcontents = element.getChildNodes();
		assertEquals(1, childcontents.size());
		Element child = (Element)childcontents.get(0);
		assertEquals(Element.valueOf("IDREF"), child.getAttribute("type"));
		
	}
	
	@Test
	public void testLookupAttribute_setAttribute_setAttribute2() throws SAXException, IOException {
		Element element = new Element("root", new AttributesImpl());
		element.getAttribute();  // throws NullPointerException if no attribute found
	}
	
	@Test
	public void testGetAttribute_defaultMethod() throws SAXException, IOException {
		Element element = new Element("root", new AttributesImpl());
		Element attributes = element.getAttribute("attribute");
		assertNotNull(attributes);
		assertEquals(attributes.getAttributes().getLength(), 0);
	}
	
	@Test
	public void testGetAttribute_setAttribute() throws SAXException, IOException {
		Element element = new Element("root", new AttributesImpl());
		elements.addElement(element);

		element.setAttribute("attribute", valueOf("IDREF"));
		
		assertTrue(element.getAttribute("attribute"));
		AttributesImpl attributes = element.getAttributes();
		assertEquals(Element.valueOf("IDREF"), attributes.get("attribute"));
		
	}

	private String valueOf(final String name) throws SAXException {
			  return new SAXParser(null, new ContentHandler() {
		
		            public void endDocument() throws SAXException {
			        }

		            public void endElement(String uri, String localName, String name) throws SAXException {
		        }
		            
		            public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
		        }

		            public void characters(char[] ch, int start, int length) throws SAXException {
		            }

		            public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		            }

		            public void processingInstruction(String target, String data) throws SAXException {
		            }

		            public void startPrefixMapping (String prefix, String uri) throws SAXException {
		 	        }
		            
		            public void setDocumentLocator(org.xml.sax.Locator locator) {}

	        } );
	}

}
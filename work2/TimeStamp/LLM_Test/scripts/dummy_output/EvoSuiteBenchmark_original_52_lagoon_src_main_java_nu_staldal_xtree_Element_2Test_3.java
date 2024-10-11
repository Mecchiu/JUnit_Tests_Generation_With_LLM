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
		* Test method.
		*/
    @Test
    void testGetAttributeNamespaceURI() {
        Element n1 = new Element("name");
        Element n2 = new Element("name");
        n2.setAttribute("ns1", "uri");
        Element n3 = new Element("name");
        Element n4 = new Element("name");
        Vector<Element> attrs = new Vector<Element>();
        attrs.add(n2);
        attrs.add(n3);
        n1.setAttributes(attrs);
        assertEquals("uri", Element_2Test.getAttributeNamespaceURI(0));
		n3.setAttribute("ns2", "uri");
        assertEquals("uri", Element_2Test.getAttributeNamespaceURI(1));
		n4.setAttribute("ns1", "uri");
        assertEquals("uri", Element_2Test.getAttributeNamespaceURI(2));
		attrs.add(n4);
        n1.setAttributes(attrs);
        assertEquals("uri", Element_2Test.getAttributeNamespaceURI(3));
        n3.setAttribute("ns2", "uri");
        assertEquals("uri", Element_2Test.getAttributeNamespaceURI(4));
    }
    /**
    * Test serialisation.
    */
    @Test
    public void testSerialisation() {
        Element_2Test tm = new Element_2Test();
        AttributesImpl attrs2 = new AttributesImpl();
        tm.traverseAndSetAttributes(new Element("name", "http://schema.domain", attrs2, true));

        Element n1 = new Element("name", null, null, 0);
        tm.serialisation(n1, tm.getXLinkHandler());
        assertEquals(0, n1.hashCode());

        Element n2 = new Element("name", null, "http://example.org", 1);
        tm.serialisation(n1, n2, tm.getXLinkHandler());
        assertEquals(0, n1.hashCode());

        Element n3 = new Element("name", "http://schema.domain", attrs2, true);
        tm.serialisation(n3, tm.getXLinkHandler());
        assertEquals("uri", n3.getAttribute("ns1"));
        assertEquals("uri", n3.getAttributeNamespaceURI(0));
    }
    
    @Test
    public void testGetAttributeNamespaceXLinkHandler() {
        Vector<String> attrs = new Vector<String>();
        Element_2Test tm = new Element_2Test();
        attrs.add(null); // empty
        attrs.add(null);
        tm.traverseAndSetAttributes(new Element("name", null, attrs, false));
        assertNotNull(tm.getXLinkHandler());
        assertTrue(tm.getXLinkHandler() instanceof Element_2Test.NS_URI_linkHandler);
        touchedAttributes.clear();
        tm.traverseAndSetAttributes(new Element("name", "http://schema.domain", null, true));
        assertEquals(2, tm.findAllAttributes("name").size());
        touchedAttributes.clear();
        tm.traverseAndSetAttributes(new Element("name", null, null, true));
        assertEquals(0, tm.findAllAttributes("name").size());
        assertFalse(touchedAttributes.getValue().contains(tm.getTarget().getURI()) );
        touchedAttributes.clear();
        tm.traverseAndSetAttributes(new Element("name", "no URL", null, true));
        assertEquals("no URL",touchedAttributes.getValue());
    }
    
    @Test
    public void testXLinkHandler_Null() throws Exception {
        Element_2Test tm = new Element_2Test();
        assertNotNull(tm.getXLinkHandler());
    }

    @Test
    public void testXLinkHandler_IncludeNull_SetTrue() throws Exception {
        Vector<String> attrs = new Vector<String>();
        attrs.add(null); // empty
        tm.traverseAndSetAttributes(new Element("name", null, attrs, true));
        assertEquals(4, tm.findAllAttributes("name").size());
        tm.traverseAndSetAttributes(new Element("name", "http://schema.domain", null, false));
        assertEquals(2, tm.findAllAttributes("name").size());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testXLinkHandler_IncludeInclude_SetTrue() throws Exception {
        Vector<String> attrs = new Vector<String>();
        attrs.add("urn:a"); // empty
        tm.traverseAndSetAttributes(new Element("name", null, attrs, true));
        assertEquals(4, tm.findAllAttributes("name").size());
        tm.traverseAndSetAttributes(new Element("name", "urn:a", null, true));
        assertEquals(1, tm.findAllAttributes("name").size());
    }

	/**
	 * {@link AttributesImpl} instance for test.
	 */
    private static class NS_URI_linkHandler implements AttributesImpl.XLinkHandler {
		public String getTargetNamespaceURI() {
            return null;
        }
        public String getTargetNamespaceURI2() {
            return null;
        }
        public void setTargetNamespaceURI2(String ns) {
        }
        public String resolveXMLNS(String ns) {
            return ns;
        }
        public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {

        }
        public boolean endElement(String uri, String localName, String qName) {
            return false;
        }
        public void processingInstruction(String target, String data) throws SAXException {

        }
    }
}
// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {
		
	/**
	 * The number of attributes for this element.
	*/
	public static int NUMBER_OF_ATTRIBUTES = 3;
	/**
	* Test the number of attributes.
	*/
	@Test
	public void testNumberOfAttributes() {
		Element element = new Element ();
		assertEquals(0, element.numberOfAttributes());
	}
	
	/**
	 * Add an attribute node (the name will be used as a child).
	*/
    @Test
    public void testAddAttribute_Simple() {
        DocumentBuilder builder = new Parser().builderFor("foo", "src/nu");
        Element element = new Element ();
        builder.addChild(element);
        Vector<Node> atts = new Vector<Node>();
        String[] stringAttrs = {"name", "value"};
        Attr nameAttr = new Attr("name", stringsOf(stringAttrs));
        Attr valueAttr = new Attr("value", new String(stringsOf(stringAttrs)));
        Name name = new Name(stringsOf(stringAttrs));
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute(new Attribute(name, valueAttr));
        atts.addElement(nameAttr);
        atts.addElement(valueAttr);

        element.write(builder.newDocument("UTF-8", null, false, false), atts);
        String actual = builder.getDocument().getDocumentElement().getFirstChild().getNodeValue();
        assertEquals(
            "<name value=\"value\"/>",
            "value",
            actual
        );
    }

	
	/**
	 * Add an attribute node with value.
	*/
	@Test
	public void testAddAttribute_Value() {
		DocumentBuilder builder = new Parser().builderFor("foo", "src/nu");
		Element element = new Element ();
		builder.addChild(element);
        Vector<Node> atts = new Vector<Node>();
        String[] stringAttrs = {"name", "value"};
        Attr nameAttr = new Attr("name", stringsOf(stringAttrs));
        Attr valueAttr = new Attr("value", stringsOf(stringAttrs));
        Name name = new Name(stringsOf(stringAttrs));
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute(new Attribute(name, valueAttr));
        atts.addElement(nameAttr);
        atts.addElement(valueAttr);

        element.write(builder.newDocument("UTF-8", null, false, false), atts);
        String actual = builder.getDocument().getDocumentElement().getFirstChild().getNodeValue();
        assertEquals(
            "<name value=\"value\"/>",
            "value",
            actual
        );
	}
	
	
	/**
	 * Remove an attribute for this element.
	*/
    @Test
    public void testRemoveAttribute_Simple() {
        DocumentBuilder builder = new Parser().builderFor("foo", "src/nu");
        Element element = new Element ();
        builder.addChild(element);

        Vector<Node> atts = new Vector<Node>();
        String[] stringAttrs = {"name", "value"};
        Attr nameAttr = new Attr("name", stringsOf(stringAttrs));
        Attr valueAttr = new Attr("value", new String(stringsOf(stringAttrs)));
        Name name = new Name(stringsOf(stringAttrs));
        atts.add(nameAttr);
        atts.add(valueAttr);

        element.write(builder.newDocument("UTF-8", null, false, false), atts);
        String actual = builder.getDocument().getDocumentElement().getFirstChild().getNodeValue();
        assertEquals(
            "<name value=\"value\"/>",
            "value",
            actual
        );
        String actualAttr = builder.removeXMLDeclaration();
        assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
            "// DO NOT DELETE",
            actualAttr
        );
    }

	/**
	 * Remove an attribute for this element.
	*/
    @Test
    public void testRemoveAttribute_Value() {
        DocumentBuilder builder = new Parser().builderFor("foo", "src/nu");
        Element element = new Element ();
        builder.addChild(element);

        Vector<Node> atts = new Vector<Node>();
        String[] stringAttrs = {"name", "value"};
        Attr nameAttr = new Attr("name", stringsOf(stringAttrs));
        Attr valueAttr = new Attr("value", stringsOf(stringAttrs));
        Name name = new Name(stringsOf(stringAttrs));
        atts.add(nameAttr);
        atts.add(valueAttr);

        element.write(builder.newDocument("UTF-8", null, false, false), atts);
        String actual = builder.getDocument().getDocumentElement().getFirstChild().getLastChild().getNodeValue();
        assertEquals("<value value=\"value\"/>",
            "value",
            actual
        );
        String actualAttr = builder.removeXMLDeclaration();
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
            "// DO NOT DELETE",
            actualAttr
        );
    }

	/// Helper classes
	
	private static class XMLPrinter {
	    void print(Node node) {
            System.out.println("Name: "+node.getName());
            System.out.println("Value: "+node.getValue());
	      }
	  }
    
	public static class BadDocumentHandler extends DTDHandler {
        public void warning(SAXParseException e) throws SAXException {
        	throw e;
        }
    }

	public static class DocumentHandler extends XMLComponent {
	    public void endDocument() throws SAXException {
	        System.out.println("DocumentEnded");
	    }
	    public void endElements() throws SAXException {
	    	System.out.println("ElementEnded");
	    }

        public DTDHandler getDTDHandler() {
            return null;
        }
		public XMLReader getXMLReader() {
            return null;
        }
		
		public void startDocument() throws SAXException {
			// no-op
		}
		public void startDTD(String name, String publicId) throws SAXException {
			System.out.println("StartDTD");
		}
		public void startElement(String name, String namespaceURI, String systemId, Attributes atts) throws SAXException {
			System.out.println("StartElement "+name);
		}

		public void attribute(String name, String value) throws SAXException {
			System.out.println("Attribute "+name);
		}
	}
}
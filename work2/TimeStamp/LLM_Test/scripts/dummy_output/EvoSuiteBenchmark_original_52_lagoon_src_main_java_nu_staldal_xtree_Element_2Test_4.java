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
		* Tests the method {@link Element#getAttributeNamespaceURI()} for the
		* elements of this class.
		*/
		@Test
    public void testGetAttributeNamespaceURI() {
		Element element = new Element(null, null);
        assertEquals("Empty Attribute Namespace URI should return empty string.",
                          "", element.getAttributeNamespaceURI());

        String name = "attribute with namespace uri";
    	String ns = "http://some.namespace";
    	Vector<String> attrs = new Vector<String>();
    	attrs.add("name");
    	attrs.add(ns);
    	String expected = "http://some.namespace_attribute";
    	String s = element.getAttribute(name, String.class);
    	assertEquals("Attribute name and namespace uri should match.",
    			expected, s);
    	
    	try {
    		element.getAttribute("name");
    		fail("Shouldn't be able to retrieve an attribute with a namespace that is not defined.");
    	} catch (DOMException de) {
    		// expected
    	}
    }


	/**
	* Tests the method {@link Element#getAttributeChildNodes (Attributes)} for
	* the elements of this class.
	*/
		@Test
    public void testGetAttributeChildNodes() throws SAXNotRecognizedException, SAXNotSupportedException {
		Element element = new Element(null, null);
		AttributesImpl attrs = new AttributesImpl();
	
		node = new Node();
		node.ns_name = "http://http://xml.org/sax/properties/xml-namespace";
	
		attrs.addAttribute("", "xmlns", "http://xml.org/sax/properties/xml-namespace", null);
		attrs.addAttribute("", "xmlns", "http://x", "foo");
	
		element.setAttributes(attrs);
		Vector<TagNode> result = element.getAttributeChildNodes("xml:namespace");
		assertEquals("Nodes returned must be equal.", 2, result.size());
		
		assertThrows(IllegalArgumentException.class,
					() -> element.getAttributeChildNodes(new String [] {new TagName(null) }));
		
		TagNode tn = result.get(0);
		assertSame("Returned node should equal parent.", node, tn);

		tn = result.get(1);
		assertNotSame("Returned node should not equal parent.", node, tn);
		
		String name = "Attribute Child 1 with namespace uri.";
		String value = "http://xml.org/sax/properties/xml-namespace";
        attrs = new AttributesImpl();
		attrs.setNamedItem(new Attr("xmlns", "http://xml.org/sax/properties/xml-namespace"));
		attrs.addAttribute("", "xmlns", "http://xml.org/sax/properties/xml-namespace", null);
		
		element.setAttributes(attrs);
		result = element.getAttributeChildNodes(name);
		assertEquals("Nodes returned must be equal.", 2, result.size());

		assertEquals("Nodes returned must contain the expected node.", (NodeImpl) node, result.get(0));

		name = "Attribute Child 2 with namespace uri.";
		value = "http://example.com/ns";
		attrs = new AttributesImpl();
		attrs.setNamedItem(new Attr("xmlns", "http://example.com/ns"));
		attrs.addAttribute("", "xmlns", "http://example.com/ns", null);

		element.setAttributes(attrs);
		result = element.getAttributeChildNodes(name);
		assertEquals("Nodes returned must contain the expected node.", (NodeImpl) node, result.get(0));

		try {
			element.getAttributeChildNodes("name");
			fail("No exception thrown for unknown attribute.");
		} catch (ClassCastException e) {
			//okay
		}
    }
	
}
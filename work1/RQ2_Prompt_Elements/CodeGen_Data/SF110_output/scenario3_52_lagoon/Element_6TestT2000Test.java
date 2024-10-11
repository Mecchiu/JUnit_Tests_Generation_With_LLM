// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {
static int nxmappings = 0;
		static final Class[] classArray = new Class[] { Attribute.class };
	/**
	* Test the return value of the number of namespace mapping for this element, based on its name attribute.
		*/
	@Test
	public void testNumberOfNamespaceMappings() {
		assertEquals(nxmappings++, Element_6Test.numberOfNamespaceMappings());
	}		
	/**
	* Test the attribute value for the mapping of the given namespace.
	*/
	@Test
	public void testGetNameAttribute() throws SAXException {
		String name = Element_6Test.class.getName();
		Name n = new Attribute(name, "abc");
		assertNull(n.value("noSuchAttribute").getValue());
		assertEquals("String attribute does not match with namespace mapping", Attribute.NAMESPACE, n.value("foo").getValue());
		assertEquals("String attribute does not match with namespace mapping", "urn:foo", ((Namespace) n.value("foo")).uri.toString());
		
		n = new Attribute(name, "abc");
		n.setValue("noSuchAttribute2", "xyz");
		assertEquals("String attribute does not match with namespace mapping", Attribute.NAMESPACE, n.value("foo").getValue());
		assertEquals("String attribute does not match with namespace mapping", "xyz", ((Namespace) n.value("foo")).uri.toString());
		
		n = new Element();
		n.addAttribute("foo", Attribute.NAMESPACE, "xyz");
		assertEquals("String attribute does not match with namespace mapping 2", Attribute.NAMESPACE, n.value("foo").getValue());
		
		n = new Attribute(name, "urn:foo");
		assertEquals("String attribute does not match with namespace mapping", Attribute.NAMESPACE, n.value("foo").getValue());
		
		assertNull("", n.getParent().getParent());
		assertNull("", n.getParent().getParent().getParent().getParent().getName());
		
		n = new Attribute(name, "a", "b");
		n = new Attribute(name, "elements.namespace.c", "b");
		assertEquals("String attribute returns the value",n.value("a", "b","elements.namespace.c", "b"), "b");
		
		n = new Attribute(name, "urn:foo", "elements.namespace.c");
		n = new Attribute(name, "urn:foo", "elements.namespace.c");
		assertEquals("String attribute returns the value",n.value("a"), "a");
	}		
}

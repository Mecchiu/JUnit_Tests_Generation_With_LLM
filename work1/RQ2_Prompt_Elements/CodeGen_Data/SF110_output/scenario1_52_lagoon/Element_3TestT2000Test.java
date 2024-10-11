// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
/**
		* Test of getAttributeLocalName.
		*/
		@Test
		public void testGetAttributeLocalName_1() {
			// TODO
		}

		/**
		* Test of getAttributeLocalName.
		*/
		@Test
		public void testGetAttributeLocalName_2() {
			// TODO
		}

		/**
		* Test of getAttributeLocalName.
		*/
		@Test
		public void testGetAttributeLocalName_3() {
			// TODO
		}

	/**
	* Test of getAttribute.
	*/
	@Test
	public void testGetAttribute() {
		System.err.println("testGetAttribute");

		// Attributes.
		String a = "c";
		String b = "b", c = "c^b", d = "d = 4";
		System.out.println(new Element(a, b));
		System.out.println(new Element(a, b.substring(1, 4)));
		System.out.println(new Element(a, "b = '" + b + "'"));
		Element e = new Element("e", "b = '" + b + "'");
		System.out.println(new Node(b, e));
		e = new Element("e", "b", "w");
		e.addNode(new Node(b, e));
		e.clear();
		System.out.println(e);
		e.addNode(new Node(b, a));
		e.clear();
		e.addNode(new Node(a, "e"));
		e.clear();
		e = new Element(a, "e = '" + e + "'");
		e.addNode(new Node(b, a));
		System.out.println(c);
		System.out.println(new Node(b, a));
		System.out.println(new Node(a, "e", a));
		System.out.println(new Node(b, "e", a));

		// Vector.
		System.out.println(e.getAttribute("foo"));
		String v = e.getAttributeNS("urn:xml:ns:xml", "foo");
		assertEquals("a", e.getAttribute(v));

		// NodeVector.
		System.out.println(e.getAttributeVector());
	}

	/**
	* Test of isDefaultNamespace.
	*/
	@Test
	public void testIsDefaultNamespace() {

		// Nodes with no attribute but namespace.
		Vector v;
		v = new NodeVector();
		v.addNode(new Node("foo", "http://www.somewhere"));
		assertTrue(v.first().getNamespaceURI() == null);
		assertTrue(v.last().getNamespaceURI() == null);

		// Nodes with attribute and namespace.
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:xml:xml:namespace"));
		v.addNode(new Node("foo", "urn:xml:xmlns:foo"));
		assertTrue(v.first().getNamespaceURI() == null);
		assertTrue(v.last().getNamespaceURI() == null);
		assertTrue(v.last().getAttribute() == null);

		// Nodes with namespace and no attribute.
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:xml:xmlns:foo = 'http://www.someothernamespace'"));
		v.addNode(new Node("foo", "urn:xmlns:foo"));
		assertTrue(v.first().getNamespaceURI() == null);
		assertTrue(v.last().getNamespaceURI() == null);
		assertTrue(v.first().getAttribute() == null);
		assertTrue(v.last().getAttribute() == null);

		// Nodes with attribute and namespace.
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:xml:xml:namespace", "urn:xmlns:foo = 'http://www.someothernamespace'"));
		v.addNode(new Node("foo", "urn:xmlns:foo", "urn:xml:xmlns:foo"));
		assertTrue(v.first().getNamespaceURI() == null);
		assertTrue(v.last().getNamespaceURI() == null);
		assertTrue(v.first().getAttribute() == null);
		assertTrue(v.last().getAttribute() == null);

		// Nodes with attribute and namespace.
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:xml:xmlns:foo = 'http://www.someothernamespace'", "urn:xmlns:foo", "urn:xmlns:foo"));
		v.addNode(new Node("foo", "urn:xmlns:foo", "urn:xml:xmlns:foo", "urn:xmlns:foo"));
		assertTrue(v.first().getNamespaceURI() == null);
		assertTrue(v.last().getNamespaceURI() == null);
		assertTrue(v.first().getAttribute() == null);
		assertTrue(v.last().getAttribute() == null);

		// Nodes with namespace and attribute.
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:xml:xmlns:foo = 'http://www.someothernamespace'", "urn:xmlns:foo", "urn:xmlns:foo", "urn:xmlns:foo"));
		v.addNode(new Node("foo", "urn:xmlns:foo", "urn:xml:xmlns:foo", "urn:xmlns:foo"));
		assertTrue(v.first().getNamespaceURI() == "urn:xmlns:xml");
		assertTrue(v.last().getNamespaceURI() == "urn:xmlns:xml");
		assertTrue(v.first().getAttribute() == "urn:xmlns:foo");
		assertTrue(v.last().getAttribute() == "urn:xmlns:foo");
	}

	/**
	* Test of namespace.
	*/
	@Test
	public void testNamespace() {
		System.out.println("Test of namespace.");
		
		// Test default.
		Vector v;
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:/foo"));
		v.addNode(new Node("foo", "urn:foo", "urn:xml"));
		System.out.println(v.first());
		System.out.println(v.last());
		assertEquals("http://www.somewhere", v.first().getNamespaceURI());
		assertEquals("urn", v.last().getNamespaceURI());
		
		// Test other namespace.
		v = new NodeVector();
		v.addNode(new Node("foo", "urn:foo"));
		v.addNode(new Node("foo", "urn:xml", "urn:nfo"));
		v.addNode(new Node("foo", "urn:xmlns:foo", "urn:xmlns:foo"));
		v.addNode(new Node("foo", "urn:xmlns:foo", "urn:nfo"));
		System.out.println(v.first());
		System.out.println(v.last());
		assert
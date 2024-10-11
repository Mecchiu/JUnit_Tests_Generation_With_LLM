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
	 * Test the {@link Element#getAttributeNamespaceURI(int)} method.
	 */
	@Test
	public void test_getAttributeNamespaceURI_1() {
		
		assertNotNull(Element_1.class.getDeclaredMethod("getAttributeNamespaceURI", int.class));
		final String expected = Element_1.class.getDeclaredMethod("getAttributeNamespaceURI", Vector.class).invoke(null, new Object[] { new Vector<String>() });
		final Vector<String> namespace = Element_1.class.getDeclaredMethod("getAttributeNamespaceURI", Vector.class).invoke(null, new Object[] { namespace_0 });

		assertEquals("<element xmlns='foo' ns='bar'></element>", expected, namespace.get(0));
		assertTrue(namespace.get(1).startsWith("foo"));
		assertTrue(namespace.get(1).endsWith("bar"));
	}
	
	/**
	 * Test the {@link Element#getAttributeNamespaceURI(int)} method.
	 */
	@Test
	public void test_getAttributeNamespaceURI_2() {
		
		assertNotNull(Element_1.class.getDeclaredMethod("getAttributeNamespaceURI", int.class, Vector.class));
		final String expected = Element_1.class.getDeclaredMethod("getAttributeNamespaceURI", Vector.class).invoke(null, new Object[] { new Vector<String>(), namespace_0 } );
		final Vector<String> namespace = Element_1.class.getDeclaredMethod("getAttributeNamespaceURI", Vector.class).invoke(null, new Object[] { namespace_1, namespace_0 });

		assertEquals("<element xmlns='foo' ns='bar'></element><element xmlns='foo' ns='bar'></element>", expected, namespace.get(0));
		assertTrue(namespace.get(2).startsWith("foo"));
		assertTrue(namespace.get(2).endsWith("bar"));
	}
	
	/**
	 * Test the {@link Element#lookupAttribute(String)} method.
	 */
	@Test
	public void test_lookupAttribute_01() throws SAXException, IOException {
		
		// System.out.println("");
		
		final Vector<String> namespaces = new Vector<String>(2);

		namespaces.addElement("foo");
		namespaces.addElement("bar");

		final AttributesImpl attributes = new AttributesImpl();

		attributes.addAttribute("xmlns", "http://xml.org/sax/properties/xml-ns-xxx", namespaces);
		attributes.addAttribute("xml:space", "preserve");

		final StringBuilder sb = new StringBuilder();
		sb.append("<element xmlns='foo' xml:space='preserve' xml:id=\"foo-id-0\" xml:lang=\"foo-lang-0\" xml:base=\"foo-base-0</element>");

		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		xmlHelper.parse(docBuilderFactory.newDocumentBuilder().parse(new StringReader(sb.toString())), new DomHandler());		

		// System.out.println("AttributeNamespaces=" + namespaces);
		// System.out.println("Attr.getLength()=" + attributes.getLength());
		// System.out.println("Attr.getOffset()=" + attributes.getOffset());
	}
	
	/**
	 * Test the {@link Element#lookupAttribute(String)} method.
	 */
	@Test
	public void test_lookupAttribute_02() throws SAXException, IOException {
		
		// System.out.println("");
		
		final Vector<String> namespaces = new Vector<String>(2);

		namespaces.addElement("foo");
		namespaces.addElement("bar");

		final AttributesImpl attributes = new AttributesImpl();

		attributes.addAttribute("xmlns", "http://xml.org/sax/properties/xml-ns-xxx", namespaces);
		attributes.addAttribute("xml:space", "preserve");
		attributes.addAttribute("xml:base", "#base");

		final StringBuilder sb = new StringBuilder();
		sb.append("<element xmlns='foo' xml:space='preserve' xml:id=\"foo-id-0\" xml:lang=\"foo-lang-0\" xml:base=\"foo-base-0\">bar</element>");

		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		xmlHelper.parse(docBuilderFactory.newDocumentBuilder().parse(new StringReader(sb.toString())), new DomHandler());	
	}
}
// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {
		private static Element element;
		private static Element childElement1;
		private static Element childElement2;
		private static Element childElement3;
		private static Element childElement4;
		private static Element siblingElement1;

	/**
	* The value of the {@link #attributeName(int)} method must be
	* {@link #ATTRIBUTE_NOT_FOUND} if no such attribute exists.
	*/
	@Test
	public void testGetAttributeValue() throws Exception {
		assertSame(element.attributeValue(ATTRIBUTE_NOT_FOUND), "not found");
	}

	/**
	* It is necessary to construct a DOM by default.
	*/
	@Test
	public void testConstructDomByDefault() throws Exception {
        Element rootElement = ElementBuilder.buildTestElement("<test/>", "");
		Element doc = rootElement.getOwnerDocument();
		assertEquals("Not equal", 0, doc.getDocumentElement().getAttributeCount());
		assertEquals("Not equal", 0, doc.getDocumentElement().getPrefixCount());
		System.out.println(attributesToString(rootElement.getAttributes()));
	}

	/**
	* It is necessary to construct a DOM by using the DOMFactory.
	*/
	@Test
	public void testConstructDomByFactory() throws Exception {
        Element rootElement = ElementBuilder.buildTestElement("<test/>", "html");
		DOMFactory factory = new DOMFactoryImpl();
		Element doc = rootElement.getOwnerDocument();
		assertEquals("Not equal", 0, doc.getDocumentElement().getAttributeCount());
		assertEquals("Not equal", 0, doc.getDocumentElement().getPrefixCount());
		DOMConfiguration configuration = factory.getDomConfiguration();
		ConfigurationElement[] children = configuration.getAllConfigurationElements();
		assertEquals("Not equal", 1, children.length);
		for (ConfigurationElement child : children) {
			assertNotNull("child should be not null", child);
			if (ATTRIBUTE_NOT_FOUND == child.getAttributeValue("html") && child.isValid()) {
				assertNotNull("element may be not null", child);
			}
		}
		System.out.println(attributesToString(rootElement.getAttributes()));
	}

	/**
	* It is necessary to construct XML by default.
	*/
	@Test
	public void testConstructXMLByDefault() throws Exception {
		Element rootElement = ElementBuilder.buildTestElement("<test/>", "");
		Element xml = rootElement.getOwnerDocument().createElement("html");
		AttributesImpl xmlAttributes = new AttributesImpl();
		xmlAttributes.clear();
		xml.getAttr(xmlAttributes);
		System.out.println(xmlAttributes.getCDataLines());
		assertTrue("XML element name must be equal", rootElement.getNodeName().equals("html"));
		assertEquals("Not equal", rootElement, xml);
		System.out.println(xml.getAttributeValue("html"));
		assertEquals("Not equal", xml.getAttributeValue("html"), "abc");
	}

	/**
	* It is necessary to construct XML by using the DOMFactory.
	*/
	@Test
	public void testConstructXMLByFactory() throws Exception {
        Element rootElement = ElementBuilder.buildTestElement("<test/>", "html");
		DOMFactory factory = new DOMFactoryImpl();
		Element doc = rootElement.getOwnerDocument();
		assertEquals("Not equal", 0, doc.getDocumentElement().getAttributeCount());
		assertEquals("Not equal", 0, doc.getDocumentElement().getPrefixCount());
		ConfigurationElement[] children = factory.getDomConfiguration().getAllConfigurationElements();
		assertEquals("Not equal", 1, children.length);
		Element element = children[0];
		assertNotNull("root element should be not null", element);
		DOMConfiguration configuration = factory.getDomConfiguration();
		ConfigurationElement[] children2 = configuration.getAllConfigurationElements();
		assertEquals("Not equal", 1, children2.length);
		ConfigurationElement childElement = children2[0];
		boolean hasAttribute = childElement.hasAttribute("html");
		assertTrue(hasAttribute, "Not found");
	}

	/**
	* It is necessary to construct XML by using the DOMBuilder.
	*/
	@Test
	public void testConstructXMLByBuilder() throws Exception {
		ElementBuilder.declareElement(0);
		Element rootElement = ElementBuilder.buildTestElement("<test/>", "html");
		assertEquals("Not equal", rootElement.getNodeName().equals("html"), "html");
		assertEquals("Not equal", rootElement, rootElement.getOwnerDocument().createElement("html"));
		Element.ElementFactory elementFactory = ElementBuilder.buildElementFactory(0);
		assertFalse("Builder should be not null", elementFactory == null);
		rootElement = rootElement.getOwnerDocument().createElement("html");
		assertNotNull("Root element may not be null", rootElement);
		try {
			elementFactory.build(new AttributesImpl(new HashMap()), rootElement);
			fail("Should throw IllegalStateException");
		} catch (IllegalStateException e) {
			String msg = e.getMessage();
			assertTrue("IllegalStateException message " + msg, rootElement.getNodeName().equals("html"));
		}
	}

	/**
	* Each element must not be the child element of another element.
	*/
	@Test(expected = DOMException.class)
	public void testNodeTypeException() throws Exception {
		Element element = ElementBuilder.buildTestElement("<test/>", "html");
		assertEquals("Not equal", ELEMENT_NONE, element.getNodeType());
	}

	private static String attributesToString(Attributes atts) {
		StringBuilder sb = new StringBuilder();
		SB.buildText(sb, 0, atts);
		return sb.toString();
	}

	/**
	* Each element must not be the child element of another element. The name of the child element cannot equal the root element's name.
	*/
	@Test(expected = DOMException.class)
	public void testNameException() throws Exception {
		Element rootElement = ElementBuilder.buildTestElement("<test/>", "");
		assertEquals("Not equal", ELEMENT_NONE, rootElement.getNodeName().equals("html"));
		assertEquals("Not equal", ELEMENT_NONE, rootElement.getNodeName().equals("html"));
		assertEquals("Not equal", rootElement, rootElement.getParent());
	}

}
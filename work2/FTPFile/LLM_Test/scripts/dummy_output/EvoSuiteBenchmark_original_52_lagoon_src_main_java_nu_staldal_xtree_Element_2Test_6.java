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
	public void getAttributeNamespaceURI_0() throws SAXException { // TODO
		int index = 0;
		String namespaceURI = null;
		try {
	
			namespaceURI = Element.getAttributeNamespaceURI(index);
		}
		catch (IndexOutOfBoundsException ex) {
		}
	}

	@Test(expected = SAXException.class)
	public void getAttributeNamespaceURI_1() throws SAXException { // TODO
		String namespaceURI = null;
		int index = 0;
		try {
	
			namespaceURI = Element.getAttributeNamespaceURI(index);
		}
		catch (IndexOutOfBoundsException ex) {
		}
		finally {
			index = 0;
		}
	}

	@Test
	public void testElement() throws Exception { // TODO
		int nbrTestcases = 1;
		AttributesImpl actualAttributes = new AttributesImpl();
		URL base = getClass().getClassLoader().getResource("test_xml/element/element.1.xsd");

		Element element = new Element();
		Element.preProcess(element);
		try {
			element.process(new TestContentHandler2Impl());
		}
		catch (Exception e) {

			assertNotNull(e);
			throw e;
		}

		// test default namespace
		assertEquals(String.valueOf(Element.ATTRIBUTE),
				((Vector) actualAttributes.getAttributes())
						.element(0).getName());
		attributesToElement(element, actualAttributes);
		assertEquals(String.valueOf(element),
				(String) actualAttributes.getValue(ATTRIBUTE_NS, 0));

		// test empty attribute names
		int index = 2;
		actualAttributes.addAttribute("", 0, index, "", null);
		element.addElement(null, null, actualAttributes);
		attributesToElement(element, actualAttributes);
		assertEquals(String.valueOf(element),
				(String) actualAttributes.getValue(ATTRIBUTE_NS, 0));

		// test the same element
		element = new Element();
		element.addElement(null, null, actualAttributes);
		assertTrue(element.equals(element));
		Vector v = new Vector();
		v.add(element);
		v.add(element);
		attributesToElement(element, actualAttributes);
		v.remove(2);
		attributesToElement(element, actualAttributes);
		assertTrue(!(elemsEqual(v, element)));
		assertTrue(v.equals(element));
	}

	// Element with children
	public static boolean elemsEqual(Vector a, Vector b) throws Exception {

		boolean elemI = false, elemII = false, aElemsI = false, aElemII = false;

		for (int i = a.size() - 1; i >= 0; i--) {
			Object oC = a.get(i);
			Object oA = a.getElementAt(i);

			assertTrue(oA instanceof Element);
			Element aElem = (Element) oA;

			// assertElement is inherited from Element
			elemI = elemI || aElem.equals(a.getElementAt(i));

			// check children
			elemII = elemII || aElem.equals(b.getElementAt(i));
			elemII = elemII || oA instanceof Element;

			// check AttributeNamespace
			aElemsI = aElemsI || aElem.getAttributeNamespaceURI().equals(oA.toString());
			elemII = elemII || aElemsI;

			// check namespace
			elemII = elemII || oA.getNamespace().equals(oC.toString());
		}

		return (elemI && elemII) || (aElemsI && elemII);
	}

	public static boolean attrEquals(Attributes actualAttributes, Attributes expectAttributes) {
		return attrEquals(actualAttributes.getURI(), expectAttributes.getURI());
	}

	public static boolean attrEquals(String actualURI, String expectURI) {
		return actualURI.equals(expectURI);
	}

	public static boolean attrEquals(String actualURI, Attributes expectedAttributes) {
		return attrEquals(actualURI, expectedAttributes.getURI());
	}
}
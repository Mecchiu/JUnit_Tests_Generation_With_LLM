// XmlElement_0Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_0Test {
		
	/**
	 * Test the default constructor
	 * @throws Exception
	 */
	@Test
	public void test0() throws Exception {
		
		// Create an element with no attributes, but with a single attribute
		XmlElement xmlElem = new XmlElement(null);
		assertNull(xmlElem.getAttributeValue("test"));
		
		// Create an element with no attributes, but multiple attributes
		XmlElement xmlElem2 = new XmlElement("xmlElement", null);
		assertNull(xmlElem2.getAttributeValue("test"));
		
		// Add some attributes to element
		Element1 attr1 = new Element1("test", new Integer(50));
		xmlElem.addAttribute("test", attr1);
		// Check and see if attribute was indeed added
		assertEquals(50, xmlElem.getAttributeValue("test"));
		assertEquals(6, xmlElem.getAttributeCount());
		assertEquals("xmlElement", xmlElem.getTagName());
		// Get some additional ones after
		attr1 = (Element1) xmlElem.getAttribute("test");
		assertEquals("test", attr1.getElementStringValue());
		assertNull(xmlElem.getAttributeValue(""));
		assertNull(xmlElem.getAttributeValue(attributesNames[0]));
		assertNull(xmlElem.getAttributeValue(attributesNames[1]));
		assertNull(xmlElem.getAttributeValue(attributesNames2[2]));
		
		xmlElem = new XmlElement("xmlElement");
		assertNull(xmlElem.getAttributeValue(""));
		assertNull(xmlElem.getAttributeValue(attributesNames[0]));
		assertNull(xmlElem.getAttributeValue(attributesNames[1]));
		assertNull(xmlElem.getAttributeValue(attributesNames2[2]));
		
	}
	
	/**
	 * Test clone method.
	 */
	@Test
	public void test2() {
		// Try to copy an XML element
		XmlElement xmlElem = new XmlElement("xmlElem2");
		// Check if the copied element is the same as the original
		assertTrue(xmlElem instanceof XmlElement);
		// Check if the copy of XML Element is the same
		// as the original
		assertEquals("xmlElement", xmlElem.getParent().getTagName());
		// Clone an XML element
		XmlElement xml = xmlElem.clone();
		// Check if the cloned XML element is the same as the original
		assertEquals("xmlElement2", xml.getTagName());
		
		assertEquals(xml, xmlElem);
	}
	
	/**
	 * Test element clone.
	 */
	@Test
	public void test3() {
		try {
			XmlElement xmlElem = new XmlElement("element2");
			// Check cloning an XML element
			XmlElement xml = xmlElem.clone();
			// Check the XML element is not a parent, because some test
			// XML element was copied.
			assertEquals("element2", xml.getParent().getTagName());
			
			// Check XmlElement is only clones of parent
			xmlElem = xml;
			xmlElem = null;
			// Check XmlElement is the same as XmlElement2
			assertEquals("XmlElement2", xml.getParent().getTagName());
			
		} catch (CloneNotSupportedException e) {
			// Should be impossible
			throw new Error(e);
		}
	}

	@Test
	public void test4() {
		XmlElement xml = new XmlElement("xmlElement");
		// Check cloning of element and its parent
		Element2 element2 = xml.clone();
		// Check parent has been cloned itself
		assertEquals(xml, element2);
		
		// Check cloning of an XML element with no parent
		XmlElement xml2 = xml.clone();
		assertTrue(xml.getParent() == xml2.getParent());
		assertFalse(xml.getParent().getParent() == xml);
	}
	
	@Test
	public void test5() {
		Vector<String> stringVect = new Vector<String>();
		Element1 value1 = new Element1("string", new Integer(50));
		Attribute2 value2 = new Attribute2("value2", value1);
		Elements xmlElement = new XmlElement("xmlElements");
		xmlElem.addElement("xmlElement");
		xmlElem.addElement("xmlElements");
		Element1 parent = new Element1("parent", new Integer(1));
		parent.addElement(value2);
		parent.addElement(value1);
		parent.addElement("parent");

		element2 = new Element2(stringVect, xmlElem, parent);
		
		String value1Value = value1.getElementStringValue();
		String value2Value = value2.getElementStringValue();
		String stringValue = (value1!= null? value1.getElementStringValue() : value2Value);
		
		assertNotNull(parent);
		assertNotNull(parent.getElement2());
		// Check equality
		assertFalse(parent.equals(null));
		assertTrue(parent.equals(new Element2(stringVect, xmlElem, parent)));
		assertFalse(parent.equals(element));
		assertFalse(stringVect.contains(stringValue));
		assertFalse(parent.equals(element2));
		assertFalse(parent.equals(new Element2(null, xmlElem, null)));
	}
	
	/**
	 * Test vector of elements
	 */	
	@Test
	public void test6() {
		Vector<String> stringVect = new Vector<String>();
		Element1 value1 = new Element1("value1", new Integer(50));
		Element1 value2 = new Element1("value2", new Integer(60));
		Element1 value3 = new Element1("value3", new Integer(70));
}
}
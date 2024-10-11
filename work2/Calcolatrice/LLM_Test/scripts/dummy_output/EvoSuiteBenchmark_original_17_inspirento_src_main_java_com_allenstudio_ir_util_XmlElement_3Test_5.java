// XmlElement_3Test.java
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
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
		
	/**
	 * Test implementation of
	 * {@link XmlElement#addSubElement(String, String)}
	 */
	@Test
	public void testAddSubElement() {
		XmlElement xElement = new XmlElement();
		assertNull(xElement.getSubElementAt(0));
		xElement.addSubElement("a", "valuea");
		assertNotNull(xElement.getSubElementAt(0));
		assertNull(xElement.getSubElementAt(1));
	}

	/**
	 * Test implementation of
	 * {@link XmlElement#addSubElement(String, String)}
	 */
	@Test
	public void testCopySubElement() {
		XmlElement xElement = new XmlElement();
		assertNull(xElement.getSubElementAt(1));
		xElement.addSubElement("a", "valuea");
		assertNotNull(xElement.getSubElementAt(0));
		assertNull(xElement.getSubElementAt(1));
	}

	/**
	 * Test implementation of
	 * {@link XmlElement#addSubElement(String, String)}
	 */
	@Test
	public void testAddSubElementAsEnumeration() {
		XmlElement xElement = new XmlElement();
		assertNull(xElement.getSubElementAt(0));
		xElement.addSubElement("a", null);
		assertNotNull(xElement.getSubElementAt(0));
	}

	/**
	 * Test implementation of
	 * {@link XmlElement#addSubElement(String, String)}
	 */
	@Test
	public void testParseValueAfterAddSubElement() {
		XmlElement xElement = new XmlElement();
		xElement.clear();

		// Test case on parse an empty value
		String value = "";
		xElement.addSubElement("a", value);
		assertNull(xElement.getSubElementAt(0));

		// Test case 1
		xElement = new XmlElement();
		int size = xElement.getSize();
		xElement.addSubElement("a", value);
		assertTrue(size > 1);
	}

	/**
	 * Test implementation of
	 * {@link XmlElement#getSubElements()}
	 */
	@Test
	public void testGetSubElements() {
		XmlElement xElement = new XmlElement();
		xElement.clear();

		assertNull(xElement.getSubElementAt(0));
		xElement.addSubElement("a", "valuea");

		List l = xElement.getSubElements();
		assertNotNull(l);
		assertTrue(l.size() == 1);

		XmlElement xEnumeration = (XmlElement) l.get(0);
		assertEquals("a", xEnumeration.getName());
		assertNull(xEnumeration.getSubElementAt(0));
	}

	/**
	 * Test implementation of
	 * {@link XmlElement#addSubElement(String, String)}
	 */
	@Test
	public void testSetValue() {
		XmlElement xElement = new XmlElement();
		String value = "valueb";
		xElement.addSubElement("a", value);

		boolean changed = false;
		Enumeration enumeration = xElement.getSubElements();
		while (enumeration.hasMoreElements()) {
			List currentElements = (List) enumeration.nextElement();
			Enumeration currentSubElements = ((XmlElement) currentElements.get(0)).getSubElements();
			while (currentSubElements.hasMoreElements()) {
				List itemList = (List) currentSubElements.nextElement();
				assertNotNull(itemList);
				String item = (String) itemList.get(0);
				assertEquals("a", item);
				item = (String) itemList.get(1);
				if (item.equals(value)) {
					changed = true;
					break;
				}
			}
			assertTrue(changed);
		}

		boolean hasChanged = false;
		enumeration = xElement.getSubElements();
		while (enumeration.hasMoreElements()) {
			List currentElements = (List) enumeration.nextElement();
			Enumeration currentSubElements = ((XmlElement) currentElements.get(0)).getSubElements();
			while (currentSubElements.hasMoreElements()) {
				List itemList = (List) currentSubElements.nextElement();
				String item = (String) itemList.get(0);
				assertEquals("valueb", item);
				itemList = (List) currentSubElements.nextElement();
				assertNotNull(itemList);
				String item2 = (String) itemList.get(1);
				if (item2.equals(value)) {
					hasChanged = true;
					break;
				}
			}
			assertTrue(hasChanged);
		}
	}
}
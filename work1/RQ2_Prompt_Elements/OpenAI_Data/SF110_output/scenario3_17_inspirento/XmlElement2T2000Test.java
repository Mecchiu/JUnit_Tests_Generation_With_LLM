// XmlElementTest.java
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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElementTest {

	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is null and expects NullPointerException.
	*/
	@Test
	void testAddSubElement_NullPath() {
		XmlElement xmlElement = new XmlElement();
		try {
			xmlElement.addSubElement(null);
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is empty and expects IllegalArgumentException.
	*/
	@Test
	void testAddSubElement_EmptyPath() {
		XmlElement xmlElement = new XmlElement();
		try {
			xmlElement.addSubElement("");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is invalid and expects IllegalArgumentException.
	*/
	@Test
	void testAddSubElement_InvalidPath() {
		XmlElement xmlElement = new XmlElement();
		try {
			xmlElement.addSubElement(".");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath2() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath3() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath4() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath5() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath6() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath7() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath8() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement.subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath9() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement.subElement.subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String)} method.
	* It tests the case that the path is valid and expects the sub element is added.
	*/
	@Test
	void testAddSubElement_ValidPath10() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement.subElement.subElement.subElement.subElement.subElement.subElement.subElement.subElement.subElement");
		assertEquals("subElement", subElement.getName());
	}
}
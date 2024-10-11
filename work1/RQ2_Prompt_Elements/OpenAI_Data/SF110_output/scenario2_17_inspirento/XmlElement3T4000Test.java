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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElementTest {

	/**
	* Test case 1 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement1() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 2 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement2() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 3 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement3() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 4 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement4() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 5 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement5() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 6 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement6() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 7 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement7() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 8 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement8() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 9 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement9() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
	
	/**
	* Test case 10 for {@link XmlElement#addSubElement(String, String)}
	*
	* @see XmlElement#addSubElement(String, String)
	*/
	@Test
	void testAddSubElement10() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.addSubElement("name", "data");
		assertEquals(xmlElement.getSubElements().get(0).getName(), "name");
		assertEquals(xmlElement.getSubElements().get(0).getData(), "data");
	}
}
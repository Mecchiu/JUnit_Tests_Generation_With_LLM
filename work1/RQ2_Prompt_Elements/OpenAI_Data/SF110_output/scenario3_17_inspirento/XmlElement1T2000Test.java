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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElementTest {

	/**
	* Test case 1 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is null.
	*/
	@Test
	void testGetElement_1() {
		XmlElement xmlElement = new XmlElement();
		assertNull(xmlElement.getElement(null));
	}
	
	/**
	* Test case 2 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is empty.
	*/
	@Test
	void testGetElement_2() {
		XmlElement xmlElement = new XmlElement();
		assertNull(xmlElement.getElement(""));
	}
	
	/**
	* Test case 3 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is not null.
	*/
	@Test
	void testGetElement_3() {
		XmlElement xmlElement = new XmlElement();
		XmlElement xmlElement1 = new XmlElement();
		xmlElement.addSubElement(xmlElement1);
		assertEquals(xmlElement1, xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 4 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is null.
	*/
	@Test
	void testGetElement_4() {
		XmlElement xmlElement = new XmlElement();
		assertNull(xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 5 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is not null.
	*/
	@Test
	void testGetElement_5() {
		XmlElement xmlElement = new XmlElement();
		XmlElement xmlElement1 = new XmlElement();
		xmlElement.addSubElement(xmlElement1);
		assertEquals(xmlElement1, xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 6 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is null.
	*/
	@Test
	void testGetElement_6() {
		XmlElement xmlElement = new XmlElement();
		assertNull(xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 7 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is not null.
	*/
	@Test
	void testGetElement_7() {
		XmlElement xmlElement = new XmlElement();
		XmlElement xmlElement1 = new XmlElement();
		xmlElement.addSubElement(xmlElement1);
		assertEquals(xmlElement1, xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 8 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is null.
	*/
	@Test
	void testGetElement_8() {
		XmlElement xmlElement = new XmlElement();
		assertNull(xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 9 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is not null.
	*/
	@Test
	void testGetElement_9() {
		XmlElement xmlElement = new XmlElement();
		XmlElement xmlElement1 = new XmlElement();
		xmlElement.addSubElement(xmlElement1);
		assertEquals(xmlElement1, xmlElement.getElement("XmlElement"));
	}
	
	/**
	* Test case 10 for {@link XmlElement#getElement(String)} method.
	* It tests the case when the path is not empty and the element is null.
	*/
	@Test
	void testGetElement_10() {
		XmlElement xmlElement = new XmlElement();
		assertNull(xmlElement.getElement("XmlElement"));
	}
}
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
	* Test case 1 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is null.
	*/
	@Test
	void testAddSubElement_1() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement(null);
		assertEquals(null, result);
	}
	
	/**
	* Test case 2 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is empty.
	*/
	@Test
	void testAddSubElement_2() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("");
		assertEquals(null, result);
	}
	
	/**
	* Test case 3 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name.
	*/
	@Test
	void testAddSubElement_3() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("name");
		assertEquals("name", result.getName());
	}
	
	/**
	* Test case 4 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot.
	*/
	@Test
	void testAddSubElement_4() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("name.");
		assertEquals("name", result.getName());
	}
	
	/**
	* Test case 5 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot at the end.
	*/
	@Test
	void testAddSubElement_5() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement(".name");
		assertEquals("name", result.getName());
	}
	
	/**
	* Test case 6 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot at the beginning.
	*/
	@Test
	void testAddSubElement_6() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("name.");
		assertEquals("name", result.getName());
	}
	
	/**
	* Test case 7 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot at the beginning and the end.
	*/
	@Test
	void testAddSubElement_7() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement(".name.");
		assertEquals("name", result.getName());
	}
	
	/**
	* Test case 8 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot at the beginning and the end.
	*/
	@Test
	void testAddSubElement_8() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("name1.name2");
		assertEquals("name2", result.getName());
	}
	
	/**
	* Test case 9 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot at the beginning and the end.
	*/
	@Test
	void testAddSubElement_9() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("name1.name2.name3");
		assertEquals("name3", result.getName());
	}
	
	/**
	* Test case 10 for {@link XmlElement#addSubElement(String)} method.
	* It tests the case when the path is a single name with a dot at the beginning and the end.
	*/
	@Test
	void testAddSubElement_10() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement result = xmlElement.addSubElement("name1.name2.name3.name4");
		assertEquals("name4", result.getName());
	}
}
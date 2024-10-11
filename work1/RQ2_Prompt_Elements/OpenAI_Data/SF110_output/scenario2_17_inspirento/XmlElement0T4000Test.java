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
* It contains ten unit test cases for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElementTest {

	/**
	* Test case 1 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is null and the value is null.
	*/
	@Test
	void testAddAttribute_1() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute(null, null);
		assertNull(returnValue);
	}
	
	/**
	* Test case 2 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is null and the value is not null.
	*/
	@Test
	void testAddAttribute_2() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute(null, "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 3 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is null.
	*/
	@Test
	void testAddAttribute_3() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", null);
		assertNull(returnValue);
	}
	
	/**
	* Test case 4 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_4() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 5 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_5() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 6 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_6() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 7 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_7() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 8 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_8() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 9 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_9() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
	
	/**
	* Test case 10 for {@link XmlElement#addAttribute(String, String)} method.
	* It tests the case when the name is not null and the value is not null.
	*/
	@Test
	void testAddAttribute_10() {
		XmlElement xmlElement = new XmlElement();
		Object returnValue = xmlElement.addAttribute("name", "value");
		assertNull(returnValue);
	}
}
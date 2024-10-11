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
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#name} field.
	*/
	@Test
	void testAddSubElement_1() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals("name", result.name);
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#data} field.
	*/
	@Test
	void testAddSubElement_2() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals("data", result.data);
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#parent} field.
	*/
	@Test
	void testAddSubElement_3() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(e, result.parent);
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#subElements} field.
	*/
	@Test
	void testAddSubElement_4() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(0, result.subElements.size());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#attributes} field.
	*/
	@Test
	void testAddSubElement_5() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(0, result.attributes.size());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#observers} field.
	*/
	@Test
	void testAddSubElement_6() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(0, result.observers.size());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#changed} field.
	*/
	@Test
	void testAddSubElement_7() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(false, result.changed);
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#countObservers} field.
	*/
	@Test
	void testAddSubElement_8() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(0, result.countObservers());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#deleteObservers} field.
	*/
	@Test
	void testAddSubElement_9() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(0, result.countObservers());
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the default value of the {@link XmlElement#hasChanged} field.
	*/
	@Test
	void testAddSubElement_10() {
		XmlElement e = new XmlElement("name");
		e.setData("data");
		e.setParent(new XmlElement("parent"));
		e.subElements.add(new XmlElement("subElement"));
		XmlElement result = e.addSubElement("name", "data");
		assertEquals(false, result.hasChanged());
	}
}
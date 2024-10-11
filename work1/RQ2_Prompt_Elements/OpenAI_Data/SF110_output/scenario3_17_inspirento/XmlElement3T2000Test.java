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
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement1() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement2() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement3() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement4() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement5() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement6() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement7() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement8() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement9() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>name: "test"</li>
	* <li>data: "test"</li>
	* </ul>
	* and expects the following return value:
	* <ul>
	* <li>return: "test"</li>
	* </ul>
	*/
	@Test
	public void testAddSubElement10() {
		XmlElement xmlElement = new XmlElement();
		String name = "test";
		String data = "test";
		XmlElement return = xmlElement.addSubElement(name, data);
		assertEquals(return, "test");
	}
}
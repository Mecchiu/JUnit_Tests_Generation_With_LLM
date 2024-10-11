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
	* Test case 1 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement1() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		assertTrue(subElement != null);
	}
	
	/**
	* Test case 2 for {@link XmlElement#addSubElement(String)} method.
	* Test case 2 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement2() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		assertTrue(subElement != null && subElement2 != null);
	}
	
	/**
	* Test case 3 for {@link XmlElement#addSubElement(String)} method.
	* Test case 3 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement3() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null);
	}
	
	/**
	* Test case 4 for {@link XmlElement#addSubElement(String)} method.
	* Test case 4 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement4() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null);
	}
	
	/**
	* Test case 5 for {@link XmlElement#addSubElement(String)} method.
	* Test case 5 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement5() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		XmlElement subElement5 = xmlElement.addSubElement("subElement5");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null && subElement5 != null);
	}
	
	/**
	* Test case 6 for {@link XmlElement#addSubElement(String)} method.
	* Test case 6 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement6() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		XmlElement subElement5 = xmlElement.addSubElement("subElement5");
		XmlElement subElement6 = xmlElement.addSubElement("subElement6");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null && subElement5 != null && subElement6 != null);
	}
	
	/**
	* Test case 7 for {@link XmlElement#addSubElement(String)} method.
	* Test case 7 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement7() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		XmlElement subElement5 = xmlElement.addSubElement("subElement5");
		XmlElement subElement6 = xmlElement.addSubElement("subElement6");
		XmlElement subElement7 = xmlElement.addSubElement("subElement7");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null && subElement5 != null && subElement6 != null && subElement7 != null);
	}
	
	/**
	* Test case 8 for {@link XmlElement#addSubElement(String)} method.
	* Test case 8 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement8() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		XmlElement subElement5 = xmlElement.addSubElement("subElement5");
		XmlElement subElement6 = xmlElement.addSubElement("subElement6");
		XmlElement subElement7 = xmlElement.addSubElement("subElement7");
		XmlElement subElement8 = xmlElement.addSubElement("subElement8");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null && subElement5 != null && subElement6 != null && subElement7 != null && subElement8 != null);
	}
	
	/**
	* Test case 9 for {@link XmlElement#addSubElement(String)} method.
	* Test case 9 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement9() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		XmlElement subElement5 = xmlElement.addSubElement("subElement5");
		XmlElement subElement6 = xmlElement.addSubElement("subElement6");
		XmlElement subElement7 = xmlElement.addSubElement("subElement7");
		XmlElement subElement8 = xmlElement.addSubElement("subElement8");
		XmlElement subElement9 = xmlElement.addSubElement("subElement9");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null && subElement5 != null && subElement6 != null && subElement7 != null && subElement8 != null && subElement9 != null);
	}
	
	/**
	* Test case 10 for {@link XmlElement#addSubElement(String)} method.
	* Test case 10 is to test the normal case.
	* The test result should be true.
	*/
	@Test
	public void testAddSubElement10() {
		XmlElement xmlElement = new XmlElement();
		XmlElement subElement = xmlElement.addSubElement("subElement");
		XmlElement subElement2 = xmlElement.addSubElement("subElement2");
		XmlElement subElement3 = xmlElement.addSubElement("subElement3");
		XmlElement subElement4 = xmlElement.addSubElement("subElement4");
		XmlElement subElement5 = xmlElement.addSubElement("subElement5");
		XmlElement subElement6 = xmlElement.addSubElement("subElement6");
		XmlElement subElement7 = xmlElement.addSubElement("subElement7");
		XmlElement subElement8 = xmlElement.addSubElement("subElement8");
		XmlElement subElement9 = xmlElement.addSubElement("subElement9");
		XmlElement subElement10 = xmlElement.addSubElement("subElement10");
		assertTrue(subElement != null && subElement2 != null && subElement3 != null && subElement4 != null && subElement5 != null && subElement6 != null && subElement7 != null && subElement8 != null && subElement9 != null && subElement10 != null);
	}
}
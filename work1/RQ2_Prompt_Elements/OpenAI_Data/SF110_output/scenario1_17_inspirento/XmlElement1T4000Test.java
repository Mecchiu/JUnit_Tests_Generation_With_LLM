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
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement1() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 2 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement2() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 3 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement3() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 4 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement4() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 5 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement5() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 6 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement6() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 7 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement7() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 = new XmlElement();
		subElement3.setName("sub3");
		xmlElement.addSubElement(subElement1);
		xmlElement.addSubElement(subElement2);
		xmlElement.addSubElement(subElement3);
		XmlElement subElement4 = new XmlElement();
		subElement4.setName("sub4");
		XmlElement subElement5 = new XmlElement();
		subElement5.setName("sub5");
		subElement3.addSubElement(subElement4);
		subElement3.addSubElement(subElement5);
		XmlElement subElement6 = new XmlElement();
		subElement6.setName("sub6");
		XmlElement subElement7 = new XmlElement();
		subElement7.setName("sub7");
		subElement5.addSubElement(subElement6);
		subElement5.addSubElement(subElement7);
		XmlElement subElement8 = new XmlElement();
		subElement8.setName("sub8");
		XmlElement subElement9 = new XmlElement();
		subElement9.setName("sub9");
		subElement7.addSubElement(subElement8);
		subElement7.addSubElement(subElement9);
		XmlElement subElement10 = new XmlElement();
		subElement10.setName("sub10");
		subElement9.addSubElement(subElement10);
		XmlElement result = xmlElement.getElement("sub3.sub5.sub7.sub9.sub10");
		assertEquals(subElement10, result);
	}
	
	/**
	* Test case 8 for {@link XmlElement#getElement(String)} method.
	* It tests the method with a valid path.
	*/
	@Test
	void testGetElement8() {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setName("root");
		XmlElement subElement1 = new XmlElement();
		subElement1.setName("sub1");
		XmlElement subElement2 = new XmlElement();
		subElement2.setName("sub2");
		XmlElement subElement3 =
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
	* It tests the method with a path that contains only one element.
	*/
	@Test
	void testAddSubElement1() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child");
		assertEquals("child", subElement.getName());
	}
	
	/**
	* Test case 2 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains two elements.
	*/
	@Test
	void testAddSubElement2() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2");
		assertEquals("child2", subElement.getName());
	}
	
	/**
	* Test case 3 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains three elements.
	*/
	@Test
	void testAddSubElement3() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3");
		assertEquals("child3", subElement.getName());
	}
	
	/**
	* Test case 4 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains four elements.
	*/
	@Test
	void testAddSubElement4() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4");
		assertEquals("child4", subElement.getName());
	}
	
	/**
	* Test case 5 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains five elements.
	*/
	@Test
	void testAddSubElement5() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4.child5");
		assertEquals("child5", subElement.getName());
	}
	
	/**
	* Test case 6 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains six elements.
	*/
	@Test
	void testAddSubElement6() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4.child5.child6");
		assertEquals("child6", subElement.getName());
	}
	
	/**
	* Test case 7 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains seven elements.
	*/
	@Test
	void testAddSubElement7() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4.child5.child6.child7");
		assertEquals("child7", subElement.getName());
	}
	
	/**
	* Test case 8 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains eight elements.
	*/
	@Test
	void testAddSubElement8() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4.child5.child6.child7.child8");
		assertEquals("child8", subElement.getName());
	}
	
	/**
	* Test case 9 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains nine elements.
	*/
	@Test
	void testAddSubElement9() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4.child5.child6.child7.child8.child9");
		assertEquals("child9", subElement.getName());
	}
	
	/**
	* Test case 10 for {@link XmlElement#addSubElement(String)} method.
	* It tests the method with a path that contains ten elements.
	*/
	@Test
	void testAddSubElement10() {
		XmlElement xmlElement = new XmlElement("root");
		XmlElement subElement = xmlElement.addSubElement("child1.child2.child3.child4.child5.child6.child7.child8.child9.child10");
		assertEquals("child10", subElement.getName());
	}
}
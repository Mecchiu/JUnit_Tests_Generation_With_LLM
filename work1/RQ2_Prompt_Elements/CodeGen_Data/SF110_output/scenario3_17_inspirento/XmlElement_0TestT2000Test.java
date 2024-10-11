// XmlElement_0Test.java
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
* It contains one unit test case for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_0Test {

	/**
	 * Test class for {@link XmlElement#addAttribute(String, String)}.
	 */
	@Test
	void attributeTest() {
		XmlElement xmlElement = new XmlElement(null, "test");
		Object o = xmlElement.addAttribute("test", "elementTest");
        assertEquals(o, xmlElement.getAttribute("test"));
        assertNotNull(xmlElement.getAttribute("test"));
        
        xmlElement.setChanged();
		try{
			throw new RuntimeException();
		} catch (RuntimeException x) {
			o = xmlElement.getAttribute("test2");
	    	assertEquals(o, "elementTest");
        }
		o = xmlElement.addAttribute("test","element2Test");
        assertEquals(o, "element2Test");
        
        xmlElement.removeAttribute("test2");
        xmlElement.removeAttribute("test");
        o = xmlElement.getAttribute("test2");
	    assertNull(o);
        o = xmlElement.getAttribute("test");
	    assertNull(o);
		
        o = xmlElement.addAttribute("test2","element2");
        assertEquals("element2", xmlElement.getAttribute("test"));
        xmlElement.addAttribute("test3","element3");
        xmlElement.addAttribute("test4","element4");
        
        o = xmlElement.getAttribute("test2");
        o = xmlElement.getAttribute("test3");
        o = xmlElement.getAttribute("test4");
        assertEquals("element4", o);
        o = xmlElement.getAttribute("test5");
        assertNull(o);
		throw new RuntimeException();
	}
	
	/**
	 * Test class for {@link XmlElement#addAttribute(String, String)}.
	 */
	@Test
	void attributeTestInclude() {
		XmlElement xmlElement = new XmlElement("test", "test");
		Vector v = new Vector();
		v.addElement("test");
        Object o = xmlElement.addAttribute("test","another");
        o = xmlElement.addAttribute("test1","another1");
        o = xmlElement.addAttribute("test2","another2");
        o = xmlElement.addAttribute("test3","another");
        o = xmlElement.addAttribute("test3","third");
		xmlElement.addAttribute("test","element");
        assertEquals(v.elementAt(0), xmlElement.getAttribute("test"));
        xmlElement.removeAttribute("test1");
        xmlElement.removeAttribute("test2");
        xmlElement.removeAttribute("test");
        xmlElement.removeAttribute("test3");
		xmlElement.removeAttribute("test4");
        xmlElement.removeAttribute("test5");
	}
	
	/**
	 * This method creates a {@link XmlElement} instance using the parameters in params parameter.
	 * @param params the {@link XmlElement} parameters as {@link Vector}
	 * @return a {@link XmlElement} instance
	 */
	private XmlElement getInstance(java.util.Vector params){
		return (XmlElement) params.firstElement();
	}
	
	// Object to test:
	Vector<XmlElement> testVector1, testVector2, testVector3, testObject;
	
	// Vector to test:
	@Test
	public void testVector1() {
	    Object[] params = new Object[]{testVector1, new XmlElement("test", "testing")};
	    XmlElement xmlElement = getInstance(params);
	    assertVectorInner1(xmlElement);
	}
	
	// Vector to test:
	@Test
	public void testVector2() {
		testVector2 = new Vector();
		testVector2.addElement(testVector1.elementAt(0));
		testVector2.addElement(new XmlElement("test", "element1"));
		testVector2.addElement(new XmlElement("test", "element3"));
			Object[] params = new Object[]{testVector2};
		XmlElement xmlElement = getInstance(params);
		assertVectorInner1(xmlElement);
	}
	
	@Test
	public void testVector3() {
		testVector3 = new Vector();
		testVector3.addElement(new XmlElement("test", "element1"));
		testVector3.addElement(testVector1.elementAt(2));
		testVector3.addElement(testVector2.elementAt(4));
			Object[] params = new Object[]{testVector3};
		XmlElement xmlElement = getInstance(params);
		assertVectorInner1(xmlElement);
	}
	
	// Vector to test:
	@Test
	public void testObject() {
	    XmlElement xmlElement = new XmlElement("test", "testing");
	    xmlElement.addAttribute("attributeToBeRemoved","attrToBeRemoved");
	    xmlElement.addAttribute("attrToBeRemoved", "test");
	    Object[] params = new Object[]{null, xmlElement, null};
	    XmlElement xmlElement2 = getInstance(params);
		assertObjectInner1(xmlElement, xmlElement2, params);
	}
	
	@Test
	public void testVectorWithNotToInclude() {
		xmlElement = new XmlElement("test", "testing");
		Enumeration<String> v = xmlElement.attributeNames();
		while (v.hasMoreElements()) {
			String name = v.nextElement();
			System.out.println(xmlElement);
		}
		v = xmlElement.attributeNames();
		while (v.hasMoreElements()) {
			assertFalse(v.nextElement().equals("attrToBeRemoved"));
			System.out.println(xmlElement);
		}
	}

	private void assertVectorInner1(Object o){
		if (o instanceof Vector){
		throw new RuntimeException("testVector1");
		}
	}

	private void assertVectorInner2(Object o){
		if (o instanceof Vector)
		throw new RuntimeException("testVector
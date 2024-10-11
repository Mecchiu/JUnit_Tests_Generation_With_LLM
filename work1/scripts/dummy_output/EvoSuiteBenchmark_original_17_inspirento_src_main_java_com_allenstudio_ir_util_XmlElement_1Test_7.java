// XmlElement_1Test.java
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
* It contains one unit test case for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_1Test {
		
	/**
	* Test if {@link Vector} instances as they should
	* can be cloned.
	* @throws CloneNotSupportedException 
	 */
	@Test
	public void testClone_Vectors() throws CloneNotSupportedException {
		final Object[] data = {1.0, 2.0, 3.0};
		Vector<Double> d1 = new Vector<Double>();
		d1.addElement((Double) data[0]);
		Vector<Double> d2 = new Vector<Double>();
	}
	
	/**
	* Test if enumeration is {@link #getElement(Enumeration)}.
	* @throws CloneNotSupportedException 
	 */
	@Test
	public void testCloneEnumeration_Enumeration() throws CloneNotSupportedException {
		Enumeration e = _xml.getElements("/" + XML_ELEMENT.getLocalTableName());
		//System.out.println(e.nextElement());
		Vector<Double> result1 = new Vector<Double>();
		while (e.hasMoreElements()) {
			String s = (String) e.nextElement();
			result1.addElement(_getXmlValue(s));
		}
		Vector<Double> result2 = new Vector<Double>();
		Enumeration e2 = _xml.getEnumeration(e.nextElement());
		while (e2.hasMoreElements()) {
			String s = (String) e2.nextElement();
			result2.addElement(_getXmlValue(s));
		}
		assertNotNull("Enumeration was null", e);
		assertTrue("First enumeration value differs from second", result1.getValue(0) == result2.getValue(0));
		assertEquals("First enumeration value differs",result1.getValue(0), result2.getValue(0));
	}
	
		/**
	* A more detailed test for the {@link XmlElement#getElement(Enumeration)}.
	* @throws CloneNotSupportedException 
	*/
	@Test
	public void testCloneEnumeration_EnumIter() throws CloneNotSupportedException {
		Enumeration e = _xml.getEnumeration(new Vector<String>());
		Vector<String> result = new Vector<String>();
		
		//no. of items
		while (e.hasMoreElements()) {
			String s = (String) e.nextElement();
			result.addElement(s);
		}
		
		assertNotNull("Enumeration was null", e);
		assertTrue("First enumeration value differs from second", result.getValue(0) == result.getValue(0));
		assertEquals("First enumeration value differs",result.getValue(0), result.getValue(0));
	}
	
	/**
	* Test {@link XmlElement#getElement(String)}.
	* @throws CloneNotSupportedException 
	*/
	@Test
	public void testGetXMLElement() throws CloneNotSupportedException {
		XmlElement xmlElement = new XmlElement();
		Vector<Double> result = xmlElement.getElement("/" + XML_ELEMENT.getLocalTableName());
		assertNotNull("Result is null", result);
		assertTrue("No element was found", result.size() == 1);
	}
	
	/**
	* Test XML Element instance created from the same Xml document as a
	* parent (XML file) where a child is not a sub element of parent.
	* @throws CloneNotSupportedException 
	*/
	@Test
	public void testGetSamePath() throws CloneNotSupportedException{
		XmlElement xml2 = new XmlElement();
		
		xml2.addObserver(new Observer() { 	
		     public void notifyObservers() {
		    	 System.out.println("Notify all observers from children..");
		    }
		});
		
		Vector v = xml2.getElement(_path);
		System.out.println();
		Iterator i = v.iterator();
		XmlElement element = (XmlElement) i.next();
		Element e = (Element) i.next();
		
		assertTrue("Incorrect element", e!= null);
		assertNotSame("Path not matched", "/"+ XML_ELEMENT.getLocalTable(), e.getLocalTable());
	}
	
	/**
	* Test XML Elements and vectors are compared.
	*/
	@Test
	public void testCompare() {
		Vector<Double> result = new Vector<Double>();
		
		XmlElement xml1 = new XmlElement();
		XmlElement xml2 = new XmlElement();
		Vector<Double> xml1result, xml2result;
		
		Enumeration enumeration1 = Enumeration.class.getEnumConstants();
		Vector v = new Vector();
		
		for (int i = 0; i < enumeration1.size(); i++) {
		    try {
		        xml1.addObserver((MyObserver) enumeration1.nextElement());
		    } 
		    catch (NullPointerException e) {
		        e.printStackTrace();
		        return;
		    } catch (ClassCastException e) {
		        throw e;
		    }
		}
		
		enumeration1 = Enumeration.class.getEnumConstants();
}
}
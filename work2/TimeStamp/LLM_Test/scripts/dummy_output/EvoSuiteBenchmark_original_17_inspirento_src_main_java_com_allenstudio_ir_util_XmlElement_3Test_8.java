// XmlElement_3Test.java
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
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
		Vector<TestEntry> vec;
		
		
		/**
* Empty constructor for unit tests
*/
	public XmlElement_3Test() {
		vec = new Vector<TestEntry>();
	}
	/**
	* Add elements to this element.
	*
	* @param name Name of the element to be added.
	* @param data Data to be added
	*/
	public void addSubElement(int name, String data);
	
	/**
	* Test if an element is equal to itself
	*/
	@Test
	public void testEqual(){
		XmlElement e = new XmlElement();
		assertEquals("Equal element equals own", e, e);
	}
	
	/**
	* Test if each element in this vector is equal to the other.
	*
	* @param other Object to compare to
	*/
	@Test
	public void testVectorToSelf(){
		XmlElement e;
		
		int index;
		int name;	
		
		for(int i=0; i<vec.size(); i++) {
			e = (XmlElement) vec.get(i);

			assertEquals("Vector element size", e.size() + " (in vec)", vec.size());
			for(index=0; index<e.size(); index++) {
				name = vec.get(index).name; 
				assertEquals("Vector element index", index, e.get(index), name);
			}
			assertEquals("Vector element same", vec.size(), e.size());
			
		}
	}
	/**
	* Test if each element in this array is equal to the other.
	*
	* @param other Array to compare to
	*/
	@Test
	public void testArrayToSelf(){
		Vector<XmlElement> v;
		
		int index;
		int name;	
		
		for(int i=0; i<vec.length; i++) {
			v = (Vector<XmlElement>) vec;
			
			v.get(i).size();
			
			assertEquals("Array vector length", v.size(), vec.size());
			for(index=0; index<v.size(); index++) {
				name = v.get(index).name; 
				
				assertEquals("Array value element", index, v.get(index), name);
			}
			assertEquals("Array vector same", vec.size(), v.size());
		}
	}
	/**
	* Delete the elements in this array.
	*/
	public void delete(){
		Vector<XmlElement> v;
		
		int index; 
		int name; 
		
		for(int i=0; i<vec.size(); i++) {
			index=i;
			name=vec.get(index).name; 
			vec.set(i, vec.removeElementAt(index));
		}
	}
	/**
	* Test if at least one element is in this vector.
	*
	* @param v Vector to check.
	*/
	public void testVectorCheckExist(Vector v){
		Iterator e = v.iterator();
		boolean found = false;
		
		while(e.hasNext()){
			XmlElement ee = (XmlElement) e.next();
			if(ee.size() > 0){
				found = true;
				break;
			}
		}
		assertTrue("Element count in vector", found);
	}
	
	/**
	* Add another element to this one.
	*
	* @param name name of the other element to add
	* @param data Data to be added
	*/
	public void addSubElement(String name, String data);
}

class TestEntry implements Enumeration<TestEntry> {
		Vector<XmlElement> vec;
		
		
		/** 
		 * Get a list describing the contents of this element.
		 *
		 * @return a list describing the elements
		 */
		public Enumeration<TestEntry> elements() {
			vec = new Vector<XmlElement>();
			
			return vec.elements();
		}
		
		public TestEntry(String name) {
			this.name = name;
		}
		
		String name; 
}
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
	 * Test of addAttribute method, of class XmlElement.
	 */
	@Test
	void testAddAttribute() {
		// Test for same Name
		XmlElement instance = new XmlElement("test");
		String oldValue = instance.addAttribute("", "");
		assertEquals(String.class, instance.getClass());
		assertEquals("test", instance.getName());
		instance.addAttribute("", "");
		assertEquals(null, instance.getAttribute(""));

		// Test for different
		instance.addAttribute("", "");
		instance.addAttribute("", "old");
		assertEquals(null, instance.getAttribute(""));
		assertEquals(oldValue, instance.getAttribute("old"));

		// Test for different
		instance.addAttribute("new", "old");
		assertEquals("new", instance.getAttribute("new"));
		assertEquals(null, instance.getAttribute("old"));
		assertEquals(oldValue, instance.getAttribute("new"));
		
		// Test for different name
		instance.addAttribute("", "");
		instance.addAttribute("", "new");
		assertEquals("new", instance.getAttribute("new"));
		
		// Test for different value
		instance.addAttribute("", "");
		instance.addAttribute("", "new");
		instance.addAttribute("", "old");
		assertEquals("oldnew", instance.getAttribute("new"));
		
		// Test for multiple
		instance.addAttribute("", "");
		instance.addAttribute("new", "");
		instance.addAttribute("old", "");
		
		// Test for remove
		instance.addAttribute("", "");
		instance.removeAttribute("old");
		instance.removeAttribute("new");

		// No Change!
		assertEquals(null, instance.getAttribute("new"));
		
		// Test for remove
		instance.removeAttribute("old");
		instance.removeAttribute("new");
		instance.removeAttribute("new");
	}

	@Test
    void testClone() {
    List list  = new Vector();
    hashtable h2  = new hashtable();
    XmlElement xmlElement = new XmlElement("test");
		
		// set element into
		xmlElement.setChanged();
		xmlElement.setAttribute("name", "the test");
		list.add(xmlElement);
		

    assertEquals(true, list.size());
    assertEquals("the test", list.get(0).getName());
    assertEquals("name", list.get(0).getAttribute(""));
    	
    list = new Vector();
    xmlElement.appendChild(new XmlElement("a"));
    list.add(xmlElement);
    
    xmlElement.appendChild(new XmlElement("b"));
    list.add(xmlElement);

    xmlElement.appendChild(new XmlElement("c"));
    list.add(xmlElement);
    
    xmlElement.removeAttribute("name");
    list.removeAll(list);
    xmlElement.setChanged();
	
    assertEquals("the test", list.get(0).getName(), "name");
    Vector allAttributes = list.getMatchingKeys();
    Hashtable newAttributeHashtable = new hashtable();
    Iterator newAttributeIterator = allAttributes.iterator();
    
    while (newAttributeIterator.hasNext()) {
    	XmlElement xmlElement = (XmlElement) newAttributeIterator.next();
    	assertEquals(String.class, xmlElement.getClass());
    	assertEquals("the test", xmlElement.getName());
    	assertFalse(newAttributeHashtable.containsKey(xmlElement.getName()));
    	
    	newAttributeHashtable.put(xmlElement.getName(), xmlElement.getAttribute(""));	
    }
				
    assertEquals("a", list.get(1).getName());
    assertEquals("b", list.get(2).getName());
    assertEquals("c", list.get(3).getName());
    assertEquals(false, list.get(2).getAttribute(""));
    
    list = new Vector();
    xmlElement = new XmlElement("test");
    xmlElement.setChanged();
    xmlElement.appendChild(xmlElement);
    list.add(xmlElement);
    
    assertEquals(3, list.size());
    assertEquals("test", list.get(0).getName());
    assertEquals("test", list.get(0).getAttribute(""));
    assertEquals("1", list.get(1).getName());
    assertEquals("2", list.get(2).getName());
		
	// Test the vector with all the other
	vector allOther = new Vector();
	
    XmlElement another = new XmlElement("new");
    another.setChanged();
    another.appendChild(new XmlElement("1"));
    another.appendChild(new XmlElement("2"));
    xmlElement.appendChild(another);
    list.add(xmlElement);
	
	allOther.add(xmlElement);
	allOther.add(another);
	
	
	Iterator it = list.iterator();
	List testList = new Vector();
	
	while (it.hasNext()) {
		testList.add(it.next());
	}
	
	assertEquals(true, testList.size());
    assertEquals("the test", testList.get(0).getName());
    assertEquals("the new", testList.get(1).getName());
    assertEquals("1", testList.get(2).getName());
    assertEquals("2", testList.get(3).getName());
		
	assertEquals(3, list.size());
	assertEquals("test", list.get(0).getName());
    assertEquals("test", list.get(1).getName());
    assertEquals("1", list.get(2).getName());
    assertEquals("2", list.get(3).getName());
}
}
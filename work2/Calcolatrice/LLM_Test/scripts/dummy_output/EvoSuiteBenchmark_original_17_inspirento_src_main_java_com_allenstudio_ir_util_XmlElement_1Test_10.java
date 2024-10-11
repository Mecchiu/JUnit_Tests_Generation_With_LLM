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
		* Empty test case of {@link XmlElement#getElement(String)}.
		*/
//		List aList = new Vector();
//		Enumeration enumeration = aList.listIterator();
//		assertEquals("First element of list not equal", String.valueOf(2), enumeration.next().toString());

		/**
		* Tests if the element has childs specified.
		*/
//		List children = new Vector();
//		children.add("childChild");
//		enumeration = children.listIterator();
//		assertEquals("First child of list not equal", "childChild", enumeration.next().toString());
		
		/**
		* Tests if the element has children specified.
		*/
		@Test
		public void testGetChildElementsEnumeration() {
			checkElement("//first/child/children", true);
		}
	
		/**
		* Tests if enumeration.next() throws an exception.
		*/
		@Test(expected = NoSuchElementException.class)
		public void testGetEnumerationNext() {
			Enumeration enumeration = null;
			enumeration.next();
		}
}
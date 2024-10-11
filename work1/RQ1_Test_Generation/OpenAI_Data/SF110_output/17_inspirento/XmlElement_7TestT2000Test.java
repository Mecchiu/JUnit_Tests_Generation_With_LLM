// XmlElement_7Test.java
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
class XmlElement_7Test {

		/**
		* Test case 1 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 1 tests the case that the path is null.
		* <p>
		* Expected result: <code>null</code>
		*/
		@Test
		void testGetElement_1() {
				XmlElement element = new XmlElement("root");
				XmlElement result = element.getElement(null);
				assertNull(result);
		}
		
		/**
		* Test case 2 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 2 tests the case that the path is empty.
		* <p>
		* Expected result: <code>null</code>
		*/
		@Test
		void testGetElement_2() {
				XmlElement element = new XmlElement("root");
				XmlElement result = element.getElement("");
				assertNull(result);
		}
		
		/**
		* Test case 3 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 3 tests the case that the path is not valid.
		* <p>
		* Expected result: <code>null</code>
		*/
		@Test
		void testGetElement_3() {
				XmlElement element = new XmlElement("root");
				XmlElement result = element.getElement("/root");
				assertNull(result);
		}
		
		/**
		* Test case 4 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 4 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_4() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("child");
				assertEquals(child, result);
		}
		
		/**
		* Test case 5 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 5 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_5() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("/root/child");
				assertEquals(child, result);
		}
		
		/**
		* Test case 6 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 6 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_6() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("/root/./child");
				assertEquals(child, result);
		}
		
		/**
		* Test case 7 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 7 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_7() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("/root/child/");
				assertEquals(child, result);
		}
		
		/**
		* Test case 8 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 8 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_8() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("/root/child/.");
				assertEquals(child, result);
		}
		
		/**
		* Test case 9 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 9 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_9() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("/root/child/..");
				assertEquals(element, result);
		}
		
		/**
		* Test case 10 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 10 tests the case that the path is valid.
		* <p>
		* Expected result: <code>XmlElement</code>
		*/
		@Test
		void testGetElement_10() {
				XmlElement element = new XmlElement("root");
				XmlElement child = new XmlElement("child");
				element.addSubElement(child);
				XmlElement result = element.getElement("/root/child/../child");
				assertEquals(child, result);
		}
}
//END public class XmlElement_7Test

// XmlElement_8Test.java
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
class XmlElement_8Test {
		
		/**
		* Test case 1 for {@link XmlElement#getElement(String)} method.
		* <p>
		* Test case 1 tests the case that the path is null.
		* <p>
		* Expected result: <code>null</code>
		*/
		@Test
		void testGetElement_1() {
				XmlElement element = new XmlElement("root");
				XmlElement result = element.getElement(null);
				assertNull(result
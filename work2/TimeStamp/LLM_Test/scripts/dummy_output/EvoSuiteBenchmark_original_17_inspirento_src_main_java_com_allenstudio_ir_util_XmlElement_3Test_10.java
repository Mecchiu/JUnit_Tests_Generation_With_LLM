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
		/**
		 * Test method for {@link XmlElement#addSubElement(String, String)}.
		 * @throws Exception 
		 */
		@Test
		public void testAddSubElement() throws Exception {
				XmlElement etel = new XmlElement();
				String name = "Element";
				String data = "Data for Element";
				etel.addSubElement(name, data);
				assertNotNull(etel);
				System.out.println("Element Test Passed For "+data+" with "+name);
		}
		
		/**
		* Test method for {@link XmlElement#clearSubElements()}.
		* it clears the data list sent to the constructor
		*/
		@Test
		public void testClearSubElements()
		{
				List<String> list = new Vector<String>();
				XmlElement etel = new XmlElement();
				this.clearSubElements();
				etel.setDataList(list);
				assertEquals(list, etel.getDataList());
		}
		
		/**
		* Test method for {@link XmlElement#clearSubElements()}.
		* it clears the data list sent to the constructor
		*/
		@Test
		public void testClearSubElements2()
		{
				XmlElement etel = new XmlElement();
				this.clearSubElements();
				etel.clearDataList();
				assertNull("List", etel.getDataList()); 
		}
}
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
		 * Unit test for {@link XmlElement#getElement(String)}
		 */
        @Test
		public void getElement_with_parameters() {
				// Setup
				String path = "1-Test-Path";
				XmlElement xmlElement = new XmlElement(path);
				// Check
				assertTrue(xmlElement.getElement("name") == null);
				assertTrue(xmlElement.getElement("type") == null);
		}

		/**
		 * Unit test for {@link XmlElement#setElement(XmlElement)}
		 */
        @Test
		public void setElement_with_parameters() {
				// Setup
				String path = "1-Test-Path";
				XmlElement xmlElement = new XmlElement(path);
				// Check
				assertTrue(xmlElement.getElement("name")  == null);
				assertTrue(xmlElement.getElement("type")  == null);
				xmlElement.setElement(xmlElement);
				assertTrue(xmlElement.getElement("name")  == path);
				assertTrue(xmlElement.getElement("type")  == path);
		}

		/**
		 * Unit test for {@link XmlElement#toString()}
		 */
        @Test
		public void toString_with_parameters() {
				// Setup
				XmlElement xmlElement = new XmlElement();

				// Check
				assertNotNull(xmlElement.toString());
				assertTrue(xmlElement.toString().length() > 0);
				assertTrue(xmlElement.getElement("name").length() > 0);
				assertTrue(xmlElement.getElement("type").length() > 0);
		}
}
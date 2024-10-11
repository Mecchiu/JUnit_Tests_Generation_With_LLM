// XPathReaderFactory_0Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test {
		/**
		* Creates an <code>XPathReaderFactory</code> instance which uses the
		* default driver.
		*
		* @return A <code>XPathReaderFactory</code> instance which uses
		*          the default <code>org.saxpath.driver</code>.
		* @throws SAXPathException if the property was not found.
		*/
		private XPathReaderFactory createReader() throws SAXPathException {
			return XPathReaderFactory.createReader("org.saxpath.config.internal.XPathReaderFactory");
		}

		/**
		* Returns the class being used in this unit test.
		*
		* @return Returns the class being used in this unit test.
		*/
		private Class getClass() {
			return XPathReaderFactory.class;
		}

		/**
		* Tests if the default <code>org.saxpath.driver</code> property name
		*  is set.
		*/
		@Test
		public void testProperty() {
			assertEquals("org.saxpath.driver",  DEFAULT_DRIVER);
		}

		/**
		* Tests if an empty {@link XPathReader} instance is obtained.
		*
		* @throws Exception if an error occurs.
		*/
		@Test
		public void testEmptyXPathReader() throws Exception {
			XPathReader xPathReader = createReader();
			assertNotNull(xPathReader);
		}

		/**
		* Tests if an empty {@link XPathReader} instance is obtained.
		*
		* @param className The name of the class which implements
		*          the <code>XPathReader</code> interface.
		* @throws Exception if an error occurs.
		*/
		@Test
		public void testEmptyXPathReader(String className) throws Exception {
			try {
				XPathReaderFactory.createReader(className);
				fail("Create of an empty XPathReader should throw a SAXPathException.");
			} catch (SAXPathException e) {
			}
		}

		/**
		 * Tests if the <code>org.saxpath.driver</code> system property is set.
		 */
		@Test
		public void testPropertySystemProperty() {
			assertEquals("true", System.getProperty(DRIVER_PROPERTY));
		}

		/**
		 * Tests if the <code>org.saxpath.driver</code> system property value is set.
		 */
		@Test
		public void testSetPropertySystemProperty() {
			System.setProperty(DRIVER_PROPERTY, "");
			assertEquals("", System.getProperty(DRIVER_PROPERTY));
			System.setProperty(DRIVER_PROPERTY, DEFAULT_DRIVER);
			assertEquals("true", System.getProperty(DRIVER_PROPERTY));
			System.setProperty(DRIVER_PROPERTY, USE_DEFAULT? null : "");
			assertEquals("false", System.getProperty(DRIVER_PROPERTY));
		}
}
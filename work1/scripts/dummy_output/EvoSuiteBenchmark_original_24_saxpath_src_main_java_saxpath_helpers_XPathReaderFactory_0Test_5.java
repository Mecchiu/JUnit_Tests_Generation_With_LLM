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
		* Test the constructor with a valid configuration.
		*/
		@Test
		void testValidConfiguration() throws SAXPathException, InstanceOfException{
			assertTrue(XPathReaderFactory.createReader().getClass()!= XPathReader.class);
		}
		@Test
		void testValidClassName() throws SAXPathException, InstanceOfException {
			XPathReaderFactory.createReader(true,DEFAULT_DRIVER);
		}
		@Test
		void testNoClassName() throws SAXPathException, InstanceOfException {
			XPathReaderFactory.createReader();
		}
		/**
		* test default when the properties are set with a value different from null.
		*/
		@Test
		void testDefaultWhenNonNullValue() throws SAXPATHException, InstanceOfException {
				// when nothing is passed in
				assertSame(DEFAULT_DRIVER,XPathReaderFactory.createReader().getClass());
		}
		/**
		 *  Test that the default is set for the
		 *  system property driver if the property is set
		 */
		@Test
		void testSystemPropertyDefault() throws SAXPATHException, InstanceOfException {
			// when the system property is set but no
			// system value is set
			try {
				final XPathReaderFactory.createReader();
				fail("A SAXPathException was expected");
			} catch (SAXPathException x) {
			}

		}
		/**
		*  Test that the system property value is
		*  set if a value is set in the system properties
		*/
		@Test
		void testSystemPropertyValue() throws SAXPATHException, InstanceOfException {
			// when the system property is set
			XPathReaderFactory.createReader().
				getClass().getName();
		}
		/**
		*  Test that the specified class name gets returned
		*  if the specification specifies one.
		*/
		@Test
		@TestForIssue(jiraKey = "SAXPATH-1128")
		void testClassName() throws SAXPATHException, InstanceOfException {
			try {
				final XPathReaderFactory.createReader("true",DRIVER_PROPERTY);
				fail("A SAXPathException was expected");
			} catch (SAXPathException x) {
			}
		}
		/**
		*  Test that the system property value is returned as string
		*  if the specification specifies it in system properties
		*/
		@Test
		void testSystemPropertyValueAsString() throws SAXPATHException, InstanceOfException {
			// when the system property value is specified
			XPathReaderFactory.createReader().
			getClass().getName();
		}
	}
	// test class
	class XPathReaderFactory_0Test$TestClass {
		@Test
		void testValidConfiguration() throws SAXPATHException, InstanceOfException{
			assertTrue(XPathReaderFactory.createReader().getClass()!= XPathReader.class);
		}
		@Test
		void testValidClassName(){
			XPathReaderFactory.createReader(true);
		}
		@Test
		void testNoClassName(){
			XPathReaderFactory.createReader();
		}
	}
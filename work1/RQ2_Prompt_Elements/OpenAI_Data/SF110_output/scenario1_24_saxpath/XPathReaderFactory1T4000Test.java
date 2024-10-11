// XPathReaderFactoryTest.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactoryTest {

	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is null.
	*/
	@Test
	void testCreateReader_NullClassName() {
		try {
			XPathReaderFactory.createReader(null);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class name cannot be null", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is empty.
	*/
	@Test
	void testCreateReader_EmptyClassName() {
		try {
			XPathReaderFactory.createReader("");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class name cannot be empty", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not found.
	*/
	@Test
	void testCreateReader_ClassNotFound() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [org.saxpath.helpers.XPathReaderFactoryTest] not found", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not an instance of XPathReader.
	*/
	@Test
	void testCreateReader_ClassNotInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [java.lang.String] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassNotInstantiable() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Unable to create XPathReader", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and it can be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstantiable() {
		try {
			XPathReader reader = XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			assertNotNull(reader);
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
}

// XPathReaderImpl.java
package org.saxpath;

import org.saxpath.helpers.DefaultXPathHandler;
import org.saxpath.helpers.XPathReaderFactory;
import org.saxpath.helpers.XPathReader;
import org.saxpath.helpers.XPathHandler;
import org.saxpath.helpers.XPathHandlerResolver;
import org.saxpath.helpers.XPathHandlerResolverImpl;
import org.saxpath.helpers.XPathHandlerResolverException;
import org.saxpath.helpers.XPathHandlerResolverFactory;
import org.saxpath.helpers.XPathHandlerResolverFactoryImpl;
import org.saxpath.helpers.XPathHandlerResolverFactoryException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeError;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationRuntimeException;
import org.saxpath.helpers.XPathHandlerResolverFactoryConfigurationAssertionError;
import org.saxpath.helpers
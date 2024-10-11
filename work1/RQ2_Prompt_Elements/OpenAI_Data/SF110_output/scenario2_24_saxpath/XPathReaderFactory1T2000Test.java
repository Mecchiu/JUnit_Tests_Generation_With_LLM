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
			assertEquals("org.saxpath.helpers.XPathReaderFactoryTest", e.getMessage());
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
	* It tests the case when the class name is an instance of XPathReader.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReader() {
		try {
			XPathReader xPathReader = XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			assertNotNull(xPathReader);
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReader");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReader", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated2() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated3() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated4() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated5() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated6() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated7() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated8() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPath
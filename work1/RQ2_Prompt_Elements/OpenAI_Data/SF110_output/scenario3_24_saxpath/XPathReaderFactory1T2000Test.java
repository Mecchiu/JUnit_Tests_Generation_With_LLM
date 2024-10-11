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
	public void testCreateReader_NullClassName() {
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
	public void testCreateReader_EmptyClassName() {
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
	public void testCreateReader_ClassNotFound() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class not found: org.saxpath.helpers.XPathReaderFactoryTest", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not an instance of XPathReader.
	*/
	@Test
	public void testCreateReader_ClassNotInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class is not an instance of org.saxpath.XPathReader: java.lang.String", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is not accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassNotAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class is not accessible: org.saxpath.helpers.XPathReaderFactory", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is not instantiable.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassNotInstantiable() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class is not instantiable: org.saxpath.helpers.XPathReaderFactoryTest", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable but the constructor throws an exception.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorThrowsException() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Exception thrown by constructor: org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the class is not accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ClassNotAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class is not accessible: org.saxpath.helpers.XPathReaderFactory", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the class is accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ClassAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the class is accessible and the class is not instantiable.
	*/
	@Test
	public void testCreateReader
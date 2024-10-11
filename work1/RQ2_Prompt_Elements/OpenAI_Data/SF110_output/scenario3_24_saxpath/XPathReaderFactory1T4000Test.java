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
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor returns null.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorReturnsNull() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl2");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Constructor returned null: org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl2", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is not accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceNotAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl3");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Instance is not accessible: org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl3", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible and the instance is not an instance of XPathReader.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible_InstanceNotInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl4");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Instance is not an instance of org.saxpath.XPathReader: org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl4", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible and the instance is an instance of XPathReader.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible_InstanceInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible and the instance is an instance of XPathReader and the instance is not accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible_InstanceInstanceOfXPathReader_InstanceNotAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl5");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Instance is not accessible: org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl5", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible and the instance is an instance of XPathReader and the instance is accessible.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible_InstanceInstanceOfXPathReader_InstanceAccessible() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible and the instance is an instance of XPathReader and the instance is accessible and the instance is not instantiable.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible_InstanceInstanceOfXPathReader_InstanceAccessible_InstanceNotInstantiable() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl6");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Instance is not instantiable: org.saxpath.helpers.XPathReaderFactoryTest$XPathReaderImpl6", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and the class is instantiable and the constructor does not throw an exception and the constructor does not return null and the constructor returns an instance of XPathReader and the instance is accessible and the instance is an instance of XPathReader and the instance is accessible and the instance is instantiable.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader_ClassInstantiable_ConstructorDoesNotThrowException_ConstructorDoesNotReturnNull_ConstructorReturnsInstanceOfXPathReader_InstanceAccessible_InstanceInstanceOfXPathReader_InstanceAccessible_InstanceInstantiable()
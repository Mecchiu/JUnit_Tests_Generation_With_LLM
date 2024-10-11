// XPathReaderFactoryTest.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactoryTest {

	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name.
	*/
	@Test
	public void testCreateReader_ValidClassName() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader");
		XPathReader reader = XPathReaderFactory.createReader();
		assertNotNull(reader);
		assertTrue(reader instanceof TestXPathReader);
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to an invalid class name.
	*/
	@Test
	public void testCreateReader_InvalidClassName() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$InvalidTestXPathReader");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which does not implement the XPathReader interface.
	*/
	@Test
	public void testCreateReader_ClassNotImplementingXPathReader() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which does not exist.
	*/
	@Test
	public void testCreateReader_ClassNotExist() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassNotExist");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which does not have a default constructor.
	*/
	@Test
	public void testCreateReader_ClassNotHavingDefaultConstructor() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassNotHavingDefaultConstructor");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is an abstract class.
	*/
	@Test
	public void testCreateReader_ClassIsAbstract() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsAbstract");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is an interface.
	*/
	@Test
	public void testCreateReader_ClassIsInterface() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsInterface");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is an enum.
	*/
	@Test
	public void testCreateReader_ClassIsEnum() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsEnum");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is an annotation.
	*/
	@Test
	public void testCreateReader_ClassIsAnnotation() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsAnnotation");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is an array.
	*/
	@Test
	public void testCreateReader_ClassIsArray() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsArray");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a primitive.
	*/
	@Test
	public void testCreateReader_ClassIsPrimitive() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsPrimitive");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a void.
	*/
	@Test
	public void testCreateReader_ClassIsVoid() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsVoid");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a type variable.
	*/
	@Test
	public void testCreateReader_ClassIsTypeVariable() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsTypeVariable");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a wildcard type.
	*/
	@Test
	public void testCreateReader_ClassIsWildcardType() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsWildcardType");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.create
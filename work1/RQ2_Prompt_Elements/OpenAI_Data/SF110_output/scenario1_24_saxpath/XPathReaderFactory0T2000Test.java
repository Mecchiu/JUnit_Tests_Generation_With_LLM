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
	* It tests the case when the system property is set to a valid class name but the class is not an instance of {@link XPathReader}.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotInstanceOfXPathReader() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReaderFactory");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not accessible.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotAccessible() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NotAccessible");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_NoDefaultConstructor");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor_NoClass() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor_NoClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor_NoClass_NoPackage() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor_NoClass_NoPackage");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor_NoClass_NoPackage_NoClassName() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "XPathReaderFactoryTest");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_NoDefaultConstructor_NoPublicConstructor_NoConstructor_NoClass_NoPackage_NoClassName_NoPackageName() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY
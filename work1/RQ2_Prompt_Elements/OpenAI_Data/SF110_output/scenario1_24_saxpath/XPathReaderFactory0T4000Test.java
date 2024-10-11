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
	* It tests the case when the system property is set to a valid class name but the class is not public.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotPublic() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NotPublic");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is abstract.
	*/
	@Test
	public void testCreateReader_ValidClassName_Abstract() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_Abstract");
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
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_Private() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_Private");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_Protected() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_Protected");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_PackagePrivate() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_PackagePrivate");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_Argument() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_Argument");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_Exception() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_Exception");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_Error() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_Error");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_Throwable() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_Throwable");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_RuntimeException() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_RuntimeException");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathRuntimeException() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathRuntimeException");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathParseException() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathParseException");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Argument() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException_Argument");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Throwable() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException_Throwable");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument_Argument() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument_Argument");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument_Argument_Argument() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument_Argument_Argument");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument_Argument_Argument_Argument() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestXPathReader_NoPublicNoArgConstructor_SAXPathException_Throwable_Argument_Argument_Argument_Argument");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor_SAXPathException_Throwable_
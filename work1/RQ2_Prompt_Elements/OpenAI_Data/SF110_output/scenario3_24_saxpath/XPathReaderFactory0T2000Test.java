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
		System.setProperty("org.saxpath.driver", "org.saxpath.XPathReaderImpl");
		XPathReader reader = XPathReaderFactory.createReader();
		assertNotNull(reader);
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to an invalid class name.
	*/
	@Test
	public void testCreateReader_InvalidClassName() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.XPathReaderImpl1");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not implement the XPathReader interface.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotImplementingXPathReader() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not accessible.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotAccessible() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class does not have a public no-argument constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoPublicNoArgConstructor() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is abstract.
	*/
	@Test
	public void testCreateReader_ValidClassName_AbstractClass() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestAbstractClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is an interface.
	*/
	@Test
	public void testCreateReader_ValidClassName_Interface() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestInterface");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is an enum.
	*/
	@Test
	public void testCreateReader_ValidClassName_Enum() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestEnum");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is an annotation.
	*/
	@Test
	public void testCreateReader_ValidClassName_Annotation() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestAnnotation");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is an array.
	*/
	@Test
	public void testCreateReader_ValidClassName_Array() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestArray");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is a primitive.
	*/
	@Test
	public void testCreateReader_ValidClassName_Primitive() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestPrimitive");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is a void.
	*/
	@Test
	public void testCreateReader_ValidClassName_Void() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestVoid");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is a type variable.
	*/
	@Test
	public void testCreateReader_ValidClassName_TypeVariable() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestTypeVariable");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is a wildcard type.
	*/
	@Test
	public void testCreateReader_ValidClassName_WildcardType() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestWildcardType");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is a generic
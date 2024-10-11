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
	* It tests the case when the system property is set to a valid class name but the class does not have a default constructor.
	*/
	@Test
	public void testCreateReader_ValidClassName_NoDefaultConstructor() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is an abstract class.
	*/
	@Test
	public void testCreateReader_ValidClassName_AbstractClass() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is an interface.
	*/
	@Test
	public void testCreateReader_ValidClassName_Interface() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.XPathReader");
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
	* It tests the case when the system property is not set.
	*/
	@Test
	public void testCreateReader_SystemPropertyNotSet() throws SAXPathException {
		System.clearProperty("org.saxpath.driver");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to an empty string.
	*/
	@Test
	public void testCreateReader_SystemPropertyEmptyString() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a null value.
	*/
	@Test
	public void testCreateReader_SystemPropertyNull() throws SAXPathException {
		System.setProperty("org.saxpath.driver", null);
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not accessible.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotAccessible() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotAccessible");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not found.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotFound() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotFound");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not instantiable.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotInstantiable() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotInstantiable");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not visible.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotVisible() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotVisible");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_Interface() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_Interface");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_AbstractClass() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_AbstractClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_Enum() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_Enum");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_Annotation() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_Annotation");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_Array() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_Array");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_Primitive() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_Primitive");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_Void() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_Void");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_NotAccessible() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_NotAccessible");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a valid class name but the class is not a subclass of XPathReader.
	*/
	@Test
	public void testCreateReader_ValidClassName_NotSubclassOfXPathReader_NotFound() throws SAXPathException {
		System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactoryTest$TestNotSubclassOfXPathReader_NotFound");

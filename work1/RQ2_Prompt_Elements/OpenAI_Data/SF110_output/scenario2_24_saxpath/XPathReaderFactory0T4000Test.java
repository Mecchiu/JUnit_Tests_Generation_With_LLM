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
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a generic array type.
	*/
	@Test
	public void testCreateReader_ClassIsGenericArrayType() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsGenericArrayType");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a parameterized type.
	*/
	@Test
	public void testCreateReader_ClassIsParameterizedType() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsParameterizedType");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a raw type.
	*/
	@Test
	public void testCreateReader_ClassIsRawType() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsRawType");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a nested class.
	*/
	@Test
	public void testCreateReader_ClassIsNestedClass() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsNestedClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a local class.
	*/
	@Test
	public void testCreateReader_ClassIsLocalClass() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsLocalClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a member class.
	*/
	@Test
	public void testCreateReader_ClassIsMemberClass() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsMemberClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is an anonymous class.
	*/
	@Test
	public void testCreateReader_ClassIsAnonymousClass() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsAnonymousClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a synthetic class.
	*/
	@Test
	public void testCreateReader_ClassIsSyntheticClass() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsSyntheticClass");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a class literal.
	*/
	@Test
	public void testCreateReader_ClassIsClassLiteral() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsClassLiteral");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a module.
	*/
	@Test
	public void testCreateReader_ClassIsModule() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsModule");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a package.
	*/
	@Test
	public void testCreateReader_ClassIsPackage() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsPackage");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a module layer.
	*/
	@Test
	public void testCreateReader_ClassIsModuleLayer() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsModuleLayer");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a module graph.
	*/
	@Test
	public void testCreateReader_ClassIsModuleGraph() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsModuleGraph");
		assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the system property is set to a class name which is a module system.
	*/
	@Test
	public void testCreateReader_ClassIsModuleSystem() throws SAXPathException {
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactoryTest$TestClassIsModuleSystem");
		assertThrows(SAXPath
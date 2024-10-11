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
			assertEquals("org.saxpath.helpers.XPathReaderFactoryTest", e.getMessage());
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
			assertEquals("Class [java.lang.String] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader.
	*/
	@Test
	public void testCreateReader_ClassInstanceOfXPathReader() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated2() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated3() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated4() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated5() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated6() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated7() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated8() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated9() {
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
	public void testCreateReader_ClassInstanceOfXPathReaderButCannotBeInstantiated10() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("org.saxpath.XPathReaderImpl", e.getMessage());
		}
	}
}

// XPathReaderImpl.java
package org.saxpath;

import org.saxpath.helpers.DefaultXPathHandler;
import org.saxpath.helpers.XPathReaderFactory;
import org.saxpath.helpers.XPathReader;
import org.saxpath.conformance.ConformanceXPathHandler;
import org.saxpath.SAXPathException;
import org.saxpath.SAXPathParseException;
import org.saxpath.XPathSyntaxException;
import org.saxpath.XPathHandler;
import org.saxpath.XPathVisitor;
import org.saxpath.XPathExpression;
import org.saxpath.XPath;
import org.saxpath.XPathConstants;
import org.saxpath.XPathContext;
import org.saxpath.XPathExpressionException;
import org.saxpath.XPathFunctionResolver;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathFunction;
import org.saxpath.XPathFunctionException;
import org.saxpath.XPathVariable;
import org.saxpath.XPathFunctionLibrary;
import org.saxpath.XPathFunctionLibraryImpl;
import org.saxpath.XPathFunctionContext;
import org.saxpath.XPathFunctionContextImpl;
import org.saxpath.XPathFunctionResolverImpl;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolverImpl;
import org.saxpath.XPathVariable;
import org.saxpath.XPathVariableResolver;
import org.saxpath.XPathVariableResolver
// XPathReaderFactory_1Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_1Test {

	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is null and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_Null() {
		try {
			XPathReaderFactory.createReader(null);
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is empty and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_Empty() {
		try {
			XPathReaderFactory.createReader("");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is not exist and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_NotExist() {
		try {
			XPathReaderFactory.createReader("NotExist");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is not a class and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_NotClass() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is not a XPathReader and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_NotXPathReader() {
		try {
			XPathReaderFactory.createReader("java.lang.Object");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is a XPathReader and expects success.
	*/
	@Test
	public void testCreateReader_Success() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Expects no SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is a XPathReader and expects success.
	*/
	@Test
	public void testCreateReader_Success2() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Expects no SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is a XPathReader and expects success.
	*/
	@Test
	public void testCreateReader_Success3() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Expects no SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is a XPathReader and expects success.
	*/
	@Test
	public void testCreateReader_Success4() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Expects no SAXPathException");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that when className is a XPathReader and expects success.
	*/
	@Test
	public void testCreateReader_Success5() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
		} catch (SAXPathException e) {
			fail("Expects no SAXPathException");
		}
	}
}

// XPathReaderFactory_2Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_2Test {
		
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when className is null and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_Null() {
		try {
			XPathReaderFactory.createReader(null);
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when className is empty and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_Empty() {
		try {
			XPathReaderFactory.createReader("");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when className is not exist and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_NotExist() {
		try {
			XPathReaderFactory.createReader("NotExist");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when className is not a class and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_NotClass() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when className is not a XPathReader and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_NotXPathReader() {
		try {
			XPathReaderFactory.createReader("java.lang.Object");
		
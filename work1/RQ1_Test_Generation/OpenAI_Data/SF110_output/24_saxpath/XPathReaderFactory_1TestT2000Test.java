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
	* It tests the case that the class name is null and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Null() {
		try {
			XPathReaderFactory.createReader(null);
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is empty and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Empty() {
		try {
			XPathReaderFactory.createReader("");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not found and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotFound() {
		try {
			XPathReaderFactory.createReader("NotFound");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance2() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_1Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance3() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_2Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance4() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_3Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance5() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_4Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance6() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_5Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance7() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_6Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance8() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_7Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance9() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_8Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is an instance of XPathReader and expects success.
	*/
	@Test
	void testCreateReader_Instance10() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_9Test");
		} catch (SAXPathException e) {
			fail("SAXPathException unexpected.");
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
	* It tests the case that the class name is
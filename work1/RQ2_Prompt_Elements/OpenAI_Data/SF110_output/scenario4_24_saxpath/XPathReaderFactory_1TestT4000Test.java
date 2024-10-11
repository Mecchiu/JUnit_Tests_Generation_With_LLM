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
	* It tests the case that the class name is empty and expects SAXPathException.
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
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName() {
		try {
			XPathReaderFactory.createReader("InvalidClassName");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName2() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName3() {
		try {
			XPathReaderFactory.createReader("java.lang.String[]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName4() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName5() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName6() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName7() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName8() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName9() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName10() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
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
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_2Test {
		
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is null and expects SAXPathException.
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
	* It tests the case that the class name is empty and expects SAXPathException.
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
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName() {
		try {
			XPathReaderFactory.createReader("InvalidClassName");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName2() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName3() {
		try {
			XPathReaderFactory.createReader("java.lang.String[]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName4() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName5() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName6() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName7() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName8() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName9() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName10() {
		try {
			XPathReaderFactory.createReader("java.lang.String[][][][][][][][]");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
}

// XPathReaderFactory_3Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_3Test {
		
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is null and expects SAXPathException.
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
	* It tests the case that the class name is empty and expects SAXPathException.
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
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName() {
		try {
			XPathReaderFactory.createReader("InvalidClassName");
			fail("Expects a SAXPathException");
		} catch (SAXPathException e) {
			// good
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not a valid class name and expects SAXPathException.
	*/
	@Test
	public void testCreateReader_InvalidClassName2() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expects
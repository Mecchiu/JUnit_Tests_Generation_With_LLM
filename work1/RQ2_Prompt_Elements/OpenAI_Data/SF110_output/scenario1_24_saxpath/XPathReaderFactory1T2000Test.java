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
	void testCreateReader_NullClassName() {
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
	void testCreateReader_EmptyClassName() {
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
	void testCreateReader_ClassNotFound() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactoryTest");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [org.saxpath.helpers.XPathReaderFactoryTest] not found", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not an instance of XPathReader.
	*/
	@Test
	void testCreateReader_ClassNotInstanceOfXPathReader() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [java.lang.String] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader but it cannot be instantiated.
	*/
	@Test
	void testCreateReader_ClassNotInstantiable() {
		try {
			XPathReaderFactory.createReader("org.saxpath.XPathReader");
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Unable to create XPathReader", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is an instance of XPathReader and it can be instantiated.
	*/
	@Test
	void testCreateReader_ClassInstantiable() {
		try {
			XPathReaderFactory.createReader("org.saxpath.helpers.DefaultXPathReader");
		} catch (SAXPathException e) {
			fail("Unexpected SAXPathException");
		}
	}
}

// XPathSyntaxException.java
package org.saxpath;

/**
 * Indicates a syntax error in an XPath expression.
 *
 * @author bob mcwhirter (bob@werken.com)
 */
public class XPathSyntaxException extends SAXPathException {

    /**
     * Construct.
     *
     * @param message The error message.
     */
    public XPathSyntaxException(String message) {
        super(message);
    }
}

// XPathSyntaxExceptionTest.java
package org.saxpath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathSyntaxException}.
* It contains one unit test case for the {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
*/
class XPathSyntaxExceptionTest {
		
	/**
	* Test case for {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
	* It tests the case when the error message is null.
	*/
	@Test
	void testXPathSyntaxException_NullErrorMessage() {
		try {
			new XPathSyntaxException(null);
			fail("Expected NullPointerException");
		} catch (NullPointerException e) {
			assertEquals("message cannot be null", e.getMessage());
		}
	}
}

// XPathSyntaxExceptionTest.java
package org.saxpath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathSyntaxException}.
* It contains one unit test case for the {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
*/
class XPathSyntaxExceptionTest {
		
	/**
	* Test case for {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
	* It tests the case when the error message is null.
	*/
	@Test
	void testXPathSyntaxException_NullErrorMessage() {
		try {
			new XPathSyntaxException(null);
			fail("Expected NullPointerException");
		} catch (NullPointerException e) {
			assertEquals("message cannot be null", e.getMessage());
		}
	}
}

// XPathSyntaxExceptionTest.java
package org.saxpath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathSyntaxException}.
* It contains one unit test case for the {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
*/
class XPathSyntaxExceptionTest {
		
	/**
	* Test case for {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
	* It tests the case when the error message is null.
	*/
	@Test
	void testXPathSyntaxException_NullErrorMessage() {
		try {
			new XPathSyntaxException(null);
			fail("Expected NullPointerException");
		} catch (NullPointerException e) {
			assertEquals("message cannot be null", e.getMessage());
		}
	}
}

// XPathSyntaxExceptionTest.java
package org.saxpath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathSyntaxException}.
* It contains one unit test case for the {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
*/
class XPathSyntaxExceptionTest {
		
	/**
	* Test case for {@link XPathSyntaxException#XPathSyntaxException(String)} constructor.
	* It tests the case when the error message is null.
	*/
	@Test
	void testXPathSyntaxException_NullErrorMessage() {
		try {
			new XPathSyntaxException(null);
			fail("Expected NullPointerException");
		} catch (NullPointerException e) {
			assertEquals("message cannot be null", e.getMessage());
		}
	}
}

// XPathSyntaxExceptionTest.java
package org.saxpath;

import org.junit.jupiter.
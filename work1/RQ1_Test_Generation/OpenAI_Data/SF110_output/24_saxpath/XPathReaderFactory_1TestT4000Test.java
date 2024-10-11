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
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_1() {
		String className = null;
		try {
			XPathReaderFactory.createReader(className);
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// expected
		} catch (SAXPathException e) {
			fail("IllegalArgumentException expected but got " + e);
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is empty.
	*/
	@Test
	public void testCreateReader_2() {
		String className = "";
		try {
			XPathReaderFactory.createReader(className);
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// expected
		} catch (SAXPathException e) {
			fail("IllegalArgumentException expected but got " + e);
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_3() {
		String className = "com.werken.saxpath.XPathReader1";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_4() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_5() {
		String className = "com.werken.saxpath.XPathReader2";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_6() {
		String className = "com.werken.saxpath.XPathReader3";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_7() {
		String className = "com.werken.saxpath.XPathReader4";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_8() {
		String className = "com.werken.saxpath.XPathReader5";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_9() {
		String className = "com.werken.saxpath.XPathReader6";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_10() {
		String className = "com.werken.saxpath.XPathReader7";
		try {
			XPathReaderFactory.createReader(className);
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
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
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_1() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_2() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_3() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_4() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_5() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_6() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_7() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_8() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_9() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_10() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
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
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_3Test {
		
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_1() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_2() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_3() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_4() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_5() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_6() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_7() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_8() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_9() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_10() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected");
		} catch (SAXPathException e) {
			// expected
		}
	}
}

// XPathReaderFactory_4Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;

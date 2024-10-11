// XPathReaderFactory_1Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_1Test {

	@Test
	void createReader1NoProp() throws Exception {
	
		try {
			new XPathReaderFactory().createReader("org.saxpath.helpers.Test.prop");
			fail("Must throw for class that doesn't implement the XPathReader interface");
		}catch(SAXPathException e) {
			assertEquals("Unable to parse the input in the DOM against the specified name", e.getMessage());
		}
	}
	
	@Test
	void createReader1ProperClass() throws Exception {		
		
	assertNotNull(new XPathReaderFactory().createReader("org.saxpath.test.Class1"));
	}
	
	@Test
	void createReader2NoProp() throws Exception {		
		
		try {
			new XPathReaderFactory().createReader("org.saxpath.helpers.Test.properClass");
			fail("Must throw for class that doesn't implement the XPathReader interface");
		}catch(SAXPathException e) {
			assertEquals("Unable to parse the input in the DOM against the specified name", e.getMessage());
		}
	}
	
	@Test
	void createReader2ProperClass() throws Exception {		
		
		assertNotNull(new XPathReaderFactory().createReader("org.saxpath.test.Class1"));
		assertNotNull(new XPathReaderFactory().createReader("org.saxpath.test.Class2"));
	}
	
	@Test
	void createReader3NoProp() throws Exception {		
		
		try {
			new XPathReaderFactory().createReader("org.saxpath.helpers.Test.properClass", "org.saxpath.test.Class1");
			fail("Must throw for class that doesn't implement the XPathReader interface");
		}catch(SAXPathException e) {
			assertEquals("Unable to parse the input in the DOM against the specified name", e.getMessage());
		}
	}
	
	@Test
	void createReader3ProperClass() throws Exception {		
		
		assertNotNull(new XPathReaderFactory().createReader("org.saxpath.test.Class1"));
		assertNotNull(new XPathReaderFactory().createReader("org.saxpath.test.Class2"));		
	}
	
}

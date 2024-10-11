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
		
	@junit.jupiter.Repeat (5000)
	@test
	public void testCreator() throws SAXPathException{
		try {
			XPathReaderFactory.createReader("org.saxpath.jaxp.JaxpReaderProvider");
		} catch (SAXPathException e) {
				assertEquals(e.getMessage(), "No provider could be loaded, there may be a problem with the XML parser (XML schema, javax.xml.parsers.)");
		}		
	}

	/**
	 * Test passing a bad class name.
	*/
	@test
	public void badConstructor() throws SAXPathException {
		XPathReaderFactory f = new XPathReaderFactory();
		try {
			f.createReader("invalid");
		} catch (SAXPathException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Test a null class name.
	*/
	@Test
	public void bad() throws SAXPathException {
		try {
			XPathReaderFactory.createReader(null);
		} catch (SAXPathException e) {
			assertEquals(e.getMessage(), ". class must not be null.");
		}
	}
}
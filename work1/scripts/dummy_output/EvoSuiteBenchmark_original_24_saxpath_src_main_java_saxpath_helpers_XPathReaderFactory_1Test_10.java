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
		// @Test
	public void testCreateReader() throws Exception {
		// Create an XPath.Reader.
		XPathReader reader = XPathReaderFactory.createReader("org.saxpath.domain.XPath");
		assertNotNull(reader);
		assertEquals(XPathReaderFactory.class.getProtectionDomain().getCodeSource().getLocation(), reader.getClass().getProtectionDomain().getCodeSource().getLocation());
		
		// Test that the class exists
		assertTrue(XPathReaderFactory.class.getClassLoader().loadClass("org.saxpath.domain.XPath")!= null);
		
		System.out.println("Test passed");
	}
}
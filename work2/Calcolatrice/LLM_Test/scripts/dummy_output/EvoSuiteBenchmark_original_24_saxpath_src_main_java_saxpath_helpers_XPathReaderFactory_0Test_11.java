// XPathReaderFactory_0Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test {
		
    // Test case for the <code>createReader(String)</code> method.
	@Test
	public void whenCreateReaderReturnsXPathReader() throws SAXPathException {
		XPathReaderFactory.createReader(this.getClass().getName());
	}

	// Test case for the createReader(String) method.
	@Test( expected = IllegalArgumentException.class)
	public void whenCreateReaderThrowsIllegalArgumentException() throws Exception {
		XPathReaderFactory.createReader();
	}

	@Test
	public void whenCreateReaderReturnsXPathValidClass() throws SAXPathException {
		assertNotNull(XPathReaderFactory.createReader(this.getClass().getName()));
	} 

        @Test
	public void whenCreatingXPathReaderTwiceReturnsXpathValidClass() throws SAXPathException {
		XPathReaderFactory.createReader();
	}

	@Test(expected = SAXPathException.class)
	public void whenCreatingXPathReaderThrowsSAXPathException() throws Exception {
		assertNotNull(XPathReaderFactory.createReader(DEFAULT_DRIVER));
	}
}
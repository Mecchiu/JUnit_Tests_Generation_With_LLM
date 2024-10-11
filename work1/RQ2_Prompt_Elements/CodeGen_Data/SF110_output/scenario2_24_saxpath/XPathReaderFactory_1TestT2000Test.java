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
/**
		 * @throws SAXPathException when the method runs successfully, or when it's unable to create an XPathReader.
	 */
	@Test
	public void testNullInput() throws SAXPathException {
		XPathReaderFactory.createReader(null);
	}

	/**
	 * Test method of {@link XPathReaderFactory#newReader()}.
	 * @throws Exception
	 */
	@Test
    public void testNewReader() throws Exception {
		XPathReaderFactory.createReader("dummy");
	}
}

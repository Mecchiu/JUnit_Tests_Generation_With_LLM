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
		/**
		 * <p>Test to check that a value returned by the {@link XPathReaderFactory#createReader()} will not be
		 * null.</p>
		 *
		 * @throws SAXPathException If an error occurs while making
		 *         the request.
		 */
		@Test
		void createReaderCanReturnNull() throws SAXPathException {
				XPathReaderFactory factory = new XPathReaderFactory();
				XPathReader r = factory.createReader();
				assertNotNull(r);
		}
};
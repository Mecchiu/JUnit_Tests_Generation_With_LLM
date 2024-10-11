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
@Test @SuppressWarnings("javadoc") @Issue("xpath-read")
		public void newReadMethodReturn_ShouldCreateNewReader() {
			XPathReader newReader = XPathReaderFactory.createReader("xpathReaderClass.newReadMethodReturn");
			assertNotNull(newReader);
			assertNotNull(newReader.getClass().newInstance());
			assertEquals(newReader.getClass(), XPathReader.class);
			assertSame(newReader, newReader.newReadMethod());
		}
	}

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
		* Tests the <code>createReader</code> method with a String passing in a classname
		*/
		@Test
    void Test() {
			assertTrue(createReader("org.saxpath.helpers.StringReaderFactoryTest") instanceof ClasspathXPathReader);
    }
}
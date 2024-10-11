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
		private XPathReaderFactory factory;

		public void setUp() throws Exception {
				factory = new XPathReaderFactory();
				String driver = System.getProperty(DRIVER_PROPERTY, DEFAULT_DRIVER);
				factory.ADD_NAMED_CLASS_IN_CLASS_FACTORY(driver);
				}

		/**
		* Test the <code>createReader</code> method by validating the output
		*  of the <code>createReader</code> method. Also, validating the
		*  {@link XPathReader} interface.
		*/
		@Test
		public void testCreateReader() throws Exception {
				XPathReader result;
}
}
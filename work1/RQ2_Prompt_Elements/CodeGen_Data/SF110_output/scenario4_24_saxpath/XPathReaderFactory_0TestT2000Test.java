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
		 * Tests default Constructor for <code>createReader</code> method
		 * without passing in a className, that only uses the
		 * <code>DEFAULT_DRIVER</code> property.
		 *
		 * @throws SAXPathException
		 */
		@Test(expected=SAXPathException.class)
		public void test0Constructor_NO_DRIVER() throws SAXPathException{
			xpathReaderFactory = 
				new XPathReaderFactory.XPathReaderFactory(
					DEFAULT_DRIVER);
        }

		/**
		 * Tests Constructor for <code>createReader</code> method
		 * with passing in a className and a driver to be used
		 * in a system property.
		 *
		 * @throws SAXPathException
		 */
		@Test(expected=SAXPathException.class)
		public void test0Constructor_USE_DRIVER() throws SAXPathException{
			System.setProperty(DRIVER_PROPERTY, 
					DEFAULT_DRIVER);
			xpathReaderFactory = 
				new XPathReaderFactory.XPathReaderFactory("com.foo.driver.XPathReader");
        }
}

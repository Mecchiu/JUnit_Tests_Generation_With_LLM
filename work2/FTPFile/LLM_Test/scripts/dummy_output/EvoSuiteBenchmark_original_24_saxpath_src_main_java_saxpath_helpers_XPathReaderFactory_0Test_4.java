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
		 * No-args constructor
		 */
    	@Test
    	public void checkNoArgs() {
            XPathReaderFactory.XPathReaderFactory_0 instance = XPathReaderFactory.XPathReaderFactory_0.getInstance();

            assertNotNull(instance);
            assertNotNull(instance.getClass());
            assertNotNull(instance.getClass().getName());
            assertEquals(instance.getClass(), instance.getClass().getSimpleName());
    	}
    	/**
    	 * Check property access
    	 */
		@Test
		public void checkProperties() {
            XPathReaderFactory.XPathReaderFactory_0 instance = XPathReaderFactory.XPathReaderFactory.XPathReaderFactory_0.getInstance();
            instance.setClassName("java.lang.String");
            instance.setDriver(DEFAULT_DRIVER);
            instance.setDriverName(DEFAULT_DRIVER);

            assertEquals("java.lang.String", instance.setClassName(DEFAULT_DRIVER));
            assertEquals(DEFAULT_DRIVER, instance.getDriver());
            assertEquals("java.lang.String", instance.setDriverName(DEFAULT_DRIVER));
            assertEquals(DEFAULT_DRIVER, instance.getDriverName());
        }

    }
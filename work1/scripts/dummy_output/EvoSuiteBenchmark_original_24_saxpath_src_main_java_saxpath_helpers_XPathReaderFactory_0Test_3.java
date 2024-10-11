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
		private static final XPathReaderFactory INSTANCE = new XPathReaderFactory();

    /**
     * Test {@link XPathReaderFactory#createReader()} method
     * with a system property name which is the value
     * <code>org.saxpath.driver</code> if unset, otherwise
     * returns <code>null</code>.
     */
    @Test
    void testXPathReaderFactory_0CreateReaderWithSystemProperty_CreateReader() throws SAXPathException {
        if (USE_DEFAULT) {
            return;
        }
        assertEquals("org.saxpath.driver",INSTANCE.createReader().getDriver());
    }

   /**
    * Test {@link XPathReaderFactory#createReader()} method
    * with a named class name which is the value
    * <code>org.saxpath.driver</code> if unset, otherwise returns <code>null</code>.
    */
    @Test
    void testXPathReaderFactory_0CreateReaderWithNamedClassName_CreateReader() throws SAXPathException {
        assertFalse("Named class name can not be null.",
                  INSTANCE.createReader(null).getDriver()!= null);
        assertEquals("Named class name should not have null value",
                 "com.werken.saxpath.XPathReader",
                 INSTANCE.createReader(null).getDriver().getClass().getCanonicalName());
    }
}
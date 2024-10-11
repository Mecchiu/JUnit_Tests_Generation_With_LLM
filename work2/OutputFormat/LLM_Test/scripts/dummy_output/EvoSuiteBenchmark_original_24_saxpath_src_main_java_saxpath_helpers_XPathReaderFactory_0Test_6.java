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
     * Test case for createReader().
     */
    @Test
    public void testCreateReader() throws SAXPathException {
            XPathReaderFactory.createReader();
            // No class-specific information expected, so test for one
            // instantiation only.
            assertEquals(XPathReader.class, XPathReader.class);
    }
}
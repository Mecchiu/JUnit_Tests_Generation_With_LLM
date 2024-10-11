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
     * Test class of a {@link XPathReaderFactory} with a specific
     * system property name and value.
     */
    @Test
    public void test_createReader() throws SAXPathException {
    	XPathReaderFactory.createReader();
		XPathReaderFactory.clearSystemProperty();
    }
}

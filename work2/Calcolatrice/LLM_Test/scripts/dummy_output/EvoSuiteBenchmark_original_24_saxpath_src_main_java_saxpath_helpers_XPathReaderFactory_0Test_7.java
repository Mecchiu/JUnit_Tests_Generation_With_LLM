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
		
/*
 *	Simple unit test class for {@link org.saxpath.helpers.XPathReaderFactory#createReader(String)}.
 *
 *	It contains one unit test case for the {@link org.saxpath.helpers.XPathReaderFactory#createReader(String)}.
 */
    @Test
    public void test_10_1ClassImplementation() throws SAXPathException {
        String className = "org.saxpath.helpers.XPathReaderFactory.XPathReaderFactory_1Test_10";
        XPathReader reader = createReader(className);
        try {
            checkReaderClass(className, reader);
        } catch (SAXPathException e) {
            fail(e.getMessage());
        } catch (ClassNotFoundException e) {
            fail(e.getMessage());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test_10_2ClassImplementation() throws SAXPathException {
        String className = "org.saxpath.helpers.XPathReaderFactory.XPathReaderFactory_2Test_10";
        XPathReader reader = createReader(className);
        try {
            checkReaderClass(className, reader);
        } catch (SAXPathException e) {
            fail(e.getMessage());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

	private void checkReaderClass(String aClassName, XPathReader reader) throws SAXPathException {
		assertTrue(reader.getClass().getName() + " is correct.",
				aClassName.matches("(\\w+)\\s+\\w+\\s+\\w+(\\s+\\w+)*\\s*\\[xml:(\\w+)\\]"));
	}

	@Test
	public void test_10_3ClassImplementation() throws SAXPathException {
		String className = "org.saxpath.helpers.XPathReaderFactory.XPathReaderFactory_3Test_10";
		XPathReader reader = createReader(className);
		try {
            assertEquals(false, reader.hasMore());
            assertEquals(false, reader.hasMore());
            assertEquals(true, reader.next().isEmpty());
            assertEquals(true, reader.next().isEmpty());
            assertEquals(false, reader.hasMore());
		} catch (Exception e) {
            fail(e.getMessage());
		}
	}

}
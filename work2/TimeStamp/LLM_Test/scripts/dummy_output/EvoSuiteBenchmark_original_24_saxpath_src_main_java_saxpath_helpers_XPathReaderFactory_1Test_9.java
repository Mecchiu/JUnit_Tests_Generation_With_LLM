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
		
    private final String[] names;
    private final XPathReaderFactory factory;

	/**
	 * Simple constructor
	 * @param names The names of classes which implements {@link XPathReader} as class types.
	 */
	public XPathReaderFactory_1Test(String[] names) {
		this.names = names;
		try {
			factory = (XPathReaderFactory) Class.forName(names[0]).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Test the <code>createReader</code> and <code>factory</code> method
	 * in conjunction.
	 */
	@Test
    public void testCreateReader() {
		// test a general call
		assertNotNull("XPathReaderFactory can create " +
				"a reader from any name of a class.", factory.createReader(names[0]));

		// test a specific call
		XPathReader reader = factory.createReader(names[1]);
		assertNotNull("An XPath reader must not be null.", reader);

		// check that the two can be used together
		assertNotNull("The XPath reader can not two be used together.",
					factory.createReader(names[0]));
		assertNotNull("The XPath reader cannot be used twice.",
					factory.createReader(names[1]));

		// test error cases
		try {
			factory.createReader(names[2]);
			fail("Error expected.");  // no class instance

		} catch (SAXPathException e) {
		}
	}

	/**
	 * Test that the {@link XPathReader} cannot be constructed with an empty name
	 */
	@Test
	public void testInvalid() {
		try {
			factory.createReader("");
			fail("An empty reader cannot be constructed.");  // no class instance

		} catch (SAXPathException e) {
		} finally {
			System.out.println(factory);
			System.out.println(names);
		}
	}
}
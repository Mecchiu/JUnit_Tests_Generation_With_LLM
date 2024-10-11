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
	 * Tests creating an <code>XPathReader</code> using the value of
	 * the <code>org.saxpath.driver</code> system property.
	 *
	 * @see XPathReaderFactory#createReader(String)
	 * @throws SAXPathException if the property is unset, or if
	 *          the class can not be instantiated for some reason
	 * @throws IOException if the IOException is thrown
	 */
	@Test
	public void testGetReader() throws SAXPathException, IOException {
		try {
			System.getProperties().put(DRIVER_PROPERTY, "UTF-8");

			new XPathReaderFactory ().createReader("org.saxpath.helpers.Test_1");
			fail();
		}
		catch (SAXPathException e) {
			assertNotNull (e.getMessage());
			assertNotNull (e.getCause());
		}
		catch (IOException e) {
			assertNotNull (e.getMessage());
			assertNotNull (e.getCause());
		}
	}

	/**
	 * Tests creating an <code>XPathReader</code> using the passed in
	 * class name.
	 *
	 * @see XPathReaderFactory#createReader(String)
	 * @throws SAXPathException if the class can not be
	 *          instantiated for some reason, or if
	 *          the class doesn't implement the <code>XPathReader</code>
	 *          interface.
	 * @throws IOException if the IOException is thrown
	 */
	@Test
	public void testGetReader_1() throws SAXPathException, IOException {
		try {
			new XPathReaderFactory ().createReader("org.saxpath.helpers.Test_1");
			fail();
		}
		catch (SAXPathException e) {
			assertNotNull (e.getMessage());
			assertNotNull (e.getCause());
		}
		catch (IOException e) {
			assertNull (e.getMessage());
			assertNull (e.getCause());
		}
	}
}

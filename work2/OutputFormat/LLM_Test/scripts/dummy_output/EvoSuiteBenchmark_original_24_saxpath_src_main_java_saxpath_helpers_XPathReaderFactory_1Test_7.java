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
	 * Test case to test a system property with the value that is ignored.
	 * It tests the value of the property passed to the new system property
	 * via the system property <code>driver</code>.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetReader() throws Exception {
		final XPathReaderFactory instance = XPathReaderFactory.createReader();
		assertEquals(DEFAULT_DRIVER, instance.getReader().getClass().getName());
	}
	
	/**
	 * Create a new <code>XPathReader</code>
	 * with the value passed to the <code>driver</code> attribute
	 * via the system property passed to the new class defined
	 * with the value <code>org.saxpath.driver</code>.
	 *
	 * @return An instance of the <code>XPathReader</code> instantiated.
	 *
	 * @throws SAXPathException if the property is unset, or if
	 *  the class can not be instantiated for some reason, or if the
	 *  class doesn't implement the <code>XPathReader</code> interface.
	 */
	@Test
	public void testCreateReader() throws Exception {
		final XPathReaderFactory instance = XPathReaderFactory.createReader();
		assertEquals(instance.getReader().getClass().getName(), DEFAULT_DRIVER);
	}

	/**
	 * Create a new <code>XPathReader</code>
	 * with the value passed to the <code>driver</code>
	 * property with the value passed to the <code>driver</code>
	 * attribute. 
	 *
	 * @return An instance of the <code>XPathReader</code> instance
	 *          created.
	 *
	 * @throws SAXPathException if the property is unset, or if
	 *  the class can not be instantiated for some reason, or if the
	 *  class doesn't implement the <code>XPathReader</code> interface.
	 */
	@Test
	public void testCreateReaderDriver() throws Exception {
		final XPathReaderFactory instance = XPathReaderFactory.createReader(DEFAULT_DRIVER);
		assertEquals(instance.getReader().getClass().getName(), DEFAULT_DRIVER);
	}

	/**
	 * Verify null in case of both property sets and default
	 * for the <code>useDefault</code> attribute of the class.
	 *
	 * @throws SAXPathException if property set with set to null is set,
	 *         or if a class or class instance is null.
	 */
	@Test
	public void testNullUseDefault() throws SAXPathException {
		final XPathReaderFactory instance =
			XPathReaderFactory.createReader(UNINITIALIZED);
		assertNull("Null useDefault should set the useDefault value to null",
				instance.getReader().getUseDefault());
	}
	
}
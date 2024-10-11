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
		 * Test of <code>createReader</code> method, of class
		 *  {@link XPathReaderFactory}.
		 */
		@Test
		void test3() {
			// A non-null result from <code>createReader</code>
			XPathReaderFactory obj = new XPathReaderFactory();
			String clazz = obj.createReader(null);
			assertNotNull(clazz);
			assertNotNull(clazz);

			assertEquals(DEFAULT_DRIVER, clazz);

			// Test with an empty string, null String, empty String etc.
			XPathReaderFactory.createReader("");
			clazz = obj.createReader(null);
			assertNotNull(clazz);
			assertNotNull(clazz);

			assertEquals(DEFAULT_DRIVER, clazz);

			// Test with null
			clazz = obj.createReader(null);
			assertNotNull(clazz);
			assertNotNull(clazz);
			assertNull(obj.createReader(""));

			clazz = obj.createReader("");
			assertNotNull(clazz);
			assertNotNull(clazz);
			assertNull(obj.createReader(""));
			clazz = obj.createReader("Nul");
			assertNotNull(clazz);
			assertNotNull(clazz);
			assertNull(obj.createReader(""));

			// Test with null String, empty String etc.
			String s = "";
			clazz = obj.createReader(s);
			assertNull(clazz);

			s = null;
			clazz = obj.createReader(s);
			assertNotNull(clazz);
			assertNotNull(clazz);
			assertNull(obj.createReader(""));
			clazz = obj.createReader("Nul");
			assertNotNull(clazz);
			assertNotNull(clazz);
			assertNull(obj.createReader(""));
			

		}
}
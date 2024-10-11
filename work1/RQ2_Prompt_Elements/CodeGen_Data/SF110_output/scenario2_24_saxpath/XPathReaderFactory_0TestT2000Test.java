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
		 * Test of constructors of class {@link XPathReaderFactory}.
		 */
		@Test
		public void test_Constructor_IllegalArgumentException_IllegalClassnameParameter() throws Exception {
			String className = null;
			try {
				new XPathReaderFactory(className);
			} catch (IllegalArgumentException e) {
				String msg = e.getMessage();
				assertTrue(msg, msg.contains("null"));
			}
		}
		@Test
		public void 	test_Constructor_ParameterizedName_ParameterizedName_ClassNameParameter() throws Exception {
			SAXPathReaderFactory factory = new XPathReaderFactory("junit", "driver=org.apache.xpath.objects.jaxp.XPathReaderFactoryImplTest");
			XPathReader reader = (XPathReader) factory.createReaders().get(0);
			assertTrue(reader.getClass().getName().endsWith("jaxp.XPathReaderFactoryImplTest"));
		}
}

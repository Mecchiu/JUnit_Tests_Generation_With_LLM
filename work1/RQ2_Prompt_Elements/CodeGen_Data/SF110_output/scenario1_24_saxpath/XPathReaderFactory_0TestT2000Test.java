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
public XPathReaderFactory_0Test(){}

		@Test
		void testCreateReader(){
			//test case 2:
			try {
			XPathReaderFactory testDriver = new XPathReaderFactory();
			XPathReader testReader = testDriver.createReader();
			//System.out.println("test");
			assertNotNull(testReader);
			assertTrue(!testReader.getClass().isAnonymous());
			assertEquals(testDriver,testReader.getClass());
			} catch(SAXPathException e) {
				fail();
			}
			}
		@Test
		void testCreateDefaultDriver() {
			try {
			new XPathReaderFactory().createReader();
			fail();
			} catch(SAXPathException e) {
				assertTrue(e.getMessage(), 
						e.getMessage().contains("Property org.saxpath.driver can not be specified without a system property"));
			}
		}
	}


// Test.java

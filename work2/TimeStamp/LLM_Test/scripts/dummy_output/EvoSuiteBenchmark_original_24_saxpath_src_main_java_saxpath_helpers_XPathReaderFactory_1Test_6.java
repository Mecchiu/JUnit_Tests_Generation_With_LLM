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
		String testClassName = "org.saxpath.helpers.XPathReaderFactory.XPathReaderFactory_1Test";
		String className = "org.saxpath.helpers.XPathReaderFactory.XPathReaderFactory_1Test$XPathReaderFactory_1TestClass";
			
		/**
		 * Test the constructor that takes in a class name
		 * and constructs an <code>XPathReader</code>.
		 */
		@Test
		public void test_XPathReaderFactory_1Constructor() throws  SAXPathException {		
			String className2 = "org.saxpath.helpers.XPathReaderFactory";
			
			String xml1 =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
							+ "<a>Hello</a>"
							+ "<a></a>"
							+ "<a>Welcome</a>"
							+ " <w:w xmlns:w='http://test.saxpath.org/w'><a></a></w>"
							+ "<b>\u00FF</b>";

			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidationScheme(SAXParser.VALIDATION_ALL_CONTENT);
			SAXParser parser = factory.newSAXParser();

			parser.parse(new StringReader(xml1),new TestXPathReader_1());
	
		}
		
		@Test
		public void test_XPathReaderFactory_1Parse() throws  SAXPathException {		
		
				String xml1 =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
								+ "<a>Hello</a>"
								+ "<a></a>"
								+ "<a>Welcome</a>"
								+ " <w:w xmlns:w=\"http://test.saxpath.org/w\"><a></a></w>"
								+ "<b>\u00FF</b>";
		
				SAXParserFactory factory = SAXParserFactory.newInstance();
				factory.setValidationScheme(SAXParser.VALIDATION_ALL_CONTENT);
				SAXParser parser = factory.newSAXParser();
				
				parser.parse(new StringReader(xml1), new TestXPathReader_1());
			
		}
		
}

class TestXPathReader_1 extends XMLReader {
	
	public XMLReader next() throws SAXPathException  {
				return super.next();
	}

	public void close() throws SAXPathException {
				super.close();
	}

}
// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		private final String xmlText = "<html xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"myXulTreeTest.xml\" xmlns=\"http://www.example.com\"><head></head><body></body></html>";
		private final String xmlTextWithNoParms = "<html xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"myXulTreeTest.xml\" xmlns=\"http://www.example.com\"><head></head><body></body></html>";

	/**
	 * Test that the tree is valid XML data, including the XML declaration.
	 * @throws IOException The input error
	 */
	@Test
    void testValidXML() throws IOException {
		TreeBuilder xmlTreeBuilder = new TreeBuilder();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        dbf.setFeature("http://xml.org/sax/features/namespaces", false);
		dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);

		try {
			javax.xml.parsers.SAXParserFactory parserFactory = javax.xml.parsers.SAXParserFactory.newInstance();

			String xml = xmlTreeBuilder.parseXML(new InputSource(new BufferedReader(new XMLReaderInputStream(new StringReader(xmlText))).getInputStream(), "UTF-8"));
			assertNotNull("Should not throw an exception.", xml);
			if(! xml.equals(xmlTextWithNoParms)){
				fail("XML tree was not parsed correctly.");
			}

		} finally {
			// Set to the default
			dbf.setFeature(DocumentBuilder.FEATURE_PROCESS_NAMESPACES, false);
			dbf.setFeature("http://xml.org/sax/features/namespaces", false);
		}
	}
}
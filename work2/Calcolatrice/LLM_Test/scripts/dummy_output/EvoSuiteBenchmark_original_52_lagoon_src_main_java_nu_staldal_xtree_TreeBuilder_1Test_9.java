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
		/**
		 * Parse an XML data and validate that the result is true.
		 */
final class TestParseXML extends TreeBuilder {
	@Override
	public void content(XMLContent content, boolean validateDTD){
		assertTrue(content.isEmpty());
	}

        @Override public void error(SAXParseException exception) {
	}

	@Override public void endDocument() throws SAXException {
	}
}

/**
 * If you have many test runs on a single
 * {@link nu.staldal.xtree.TreeBuilder}, this is a convenient place to create a
 * {@link TestParseXML} instance.
 *
 * @post runs a number of unit tests:
 */
//@Test
//public final class TestParseXML extends TreeBuilder_1Test {

	/**
	 * A simple parser for the XML data.
	 * Must accept or return an instance of {@link Parseable}
	 *
	 * @post parses the XML data
	 * @throws SAXException if any other unexpected error occurs
	 * @throws InvalidConfiguration if a {@link ContentHandler} is set.
	 * @throws IOException if there was any I/O error
	 */
	static void testXML() throws SAXException, IOException, ParserConfigurationException, InvalidConfiguration, SAXException {
		TestParseXML t = new TestParseXML();
		XMLReader parser = XMLReaderFactory.createXMLReader();
		parser.setEntityResolver(new TestEntityResolver());
		parser.configure(AccessController.doPrivileged(
			(PrivilegedAction<Configurable>) () -> ConfigFactory.createReader(
								"file:"
										, "UTF-8"
				)));
		parser.setContentHandler(t);
		parser.parse(new InputSource("META-INF/MANIFEST.MF"), null);
/*		// Parse XML inputstream and convert to DOM document.
		System.out.println("Parsing XML...");
		Document document;
		InputStream inputStream = new FileInputStream("tree.xml");
		Element root = XMLUtils.parse(inputStream, null);
		inputStream.close();
		inputStream = new FileInputStream("tree.xml.dtd");
		Element dtd = XMLUtils.parse(inputStream, null);
		inputStream.close();
		InputStream inputStream1 = new FileInputStream("tree.xml.content.xml");
		Document document1 = XMLUtils.parse(inputStream1, true);
		inputStream1.close();
*/
	}
}

//#include "TreeBuilder_1Test.java" //To run the test suite.
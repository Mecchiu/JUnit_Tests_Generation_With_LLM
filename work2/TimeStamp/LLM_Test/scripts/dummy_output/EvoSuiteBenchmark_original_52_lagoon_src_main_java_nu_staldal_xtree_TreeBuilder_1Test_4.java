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
		final int testCount = 1;

	/**
	 * Build an XML document and then parse back into an XTree.
	 *
	 * @param xmlInput input to parse
	 * @param validateDTD validate using DTD
	 * @return an XTree representation of the document
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException if there was some I/O error while reading the input.
	 */
	public static Element parseXML (InputSource xmlInput, boolean validateDTD) throws SAXParseException, SAXException, IOException {
		return parseXML (xmlInput, validateDTD, null);
	}

	/**
	 * Build an XML document and then parse back into an XTree.
	 *
	 * @param xmlInput input to parse
	 * @param validateDTD validate using DTD
	 * @param errorEncoding error encoding to use
	 * @return an XTree representation of the document
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException if there was some I/O error while reading the input.
	 */
	public static Element parseXML (InputSource xmlInput, boolean validateDTD, String errorEncoding) throws SAXParseException, SAXException, IOException {
	String testName = "parse " + xmlInput.toString();
	System.out.println ("=== test start ===");
	System.out.println (testName);
	System.out.println (testCount + " test(s)");

		Element elementTree = null;

	for (int i=0; i < testCount; i++) {
		elementTree = TreeBuilder.parseXML (xmlInput, validateDTD).getElementsByTagName ("Tree");

		//System.out.println ("tree = " + elementTree);
	}

		if (elementTree == null) {
			System.out.println ("null return from parseXML");
			throw new AssertionError ("Could not parse XML data");
		}

		return elementTree;
	}

	/**
	 * Parse an XML document into an XTree.
	 *
	 * @param xmlInput input to parse
	 * @param validateDTD validate using DTD
	 * @param errorEncoding error encoding to use
	 * @param errorHandler if not null, the error handler will be call upon every line
	 * @return an XTree representation of the input data
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException if there was some I/O error while reading the input.
	 * @see TreeBuilder#parseXML(InputSource, boolean)
	 */
	public static Element parseXML (InputSource xmlInput, boolean validateDTD, String errorEncoding, ErrorHandler errorHandler) throws SAXParseException, SAXException, IOException {
		Element elementTree = parseXML (xmlInput, validateDTD);

		if (errorHandler!= null) {
			(new Parser()).setFeature(Constants.ERROR_FEATURE, true);
			(new TreeBuilder()).setErrorHandler (errorHandler);
		}

		//System.out.println ("tree = " + elementTree);

		return elementTree;
	}

	/**
	 * Parse an XML document into an XTree.
	 *
	 * @param xmlInput input to parse
	 * @param validateDTD validate using DTD
	 * @param errorEncoding error encoding to use
	 * @return an XTree representation of the input data.
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 */
	public static Element parseXML (InputSource xmlInput, boolean validateDTD, String errorEncoding) throws SAXParseException, SAXException {
	Element elementTree = parseXML (xmlInput, validateDTD, errorEncoding, null);

		return ElementBuilder.build (elementTree);
	}
}
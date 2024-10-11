// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
		final static boolean VERIFY_DTD = true;
		final static boolean TRUTH_ERRORS_IN_DTD = false;
		final static String TEST_DATA_DIR = "data/";
		//
		private static final String TEST_PATH = TEST_DATA_DIR + "";
		//
		private static final String BASE_URI = "cdfs://cdfs:2181/";
		//
		private static final String TEST_URI = BASE_URI + "testfile";
		//
		private static final String TEST_RESULT_FILE = TEST_DATA_DIR
				+ "testfile.xml";
		//
		public static final String TEST_XML_PREFIX =
				"<?xml version=\"1.0\"?> ";
		public static final String TEST_XML_SCHEMA_LOCATION =
				"";
		//
		private static final boolean DATATYPES = false;

		static {
			System.out.println("Testing validator, schema, validator in "
					+ System.getProperty("java.vendor"));
		}
		//
	
	private static final String VALIDATOR_NAME = "nu.test.Tester";
    //private static final String VALIDATOR_TYPE = "nu.test.Tester";
    //private static final String VALIDATOR_CUSTOM_PARSER = 
    //"http://www.test.nu/nu/nu/test/validator/Tester";
    //private final static String DOM_TEMPLATE = "";

	// Set up the DOM used in validator
	//
	private static final String VALIDATOR_DOM = TEST_XML_PREFIX
			+"nu/test/testfile/validator/Tester.valid.xml";

	// Set up the DOM used in schema
	//
	private static final String SCHEMA_DOM = "";

	// Set up the DOM used for xml validation
	//
	private static final String XML_DOM = TEST_XML_PREFIX
			+"nu/test/testfile/testfile.xml";

	// Set up the DOM used for validation (for schema validation)
	//
	private static final String XML_SCHEMA_DOM = SCHEMA_DOM;

	// Set up the parser used for validator and schema validator
	//
	private static final String XML_PYTHON_PARSER = "";
	private static XMLValidator xmlValidator = null;
	private static SchemaSource xmlSchemaSource = null;
	//
	private static XMLWriter xmlWriter = null;
	//
	private static InputSource xmlInput = null;
	private static ElementHandlerHandler handler = null;
	private static InputStream xmlInputStream = null;
	final static int XML_MAX_LINES_LEVELS = 100;

	/**
	* Returns the XML document to parse
	*
	* @param xmlInput the input to parse
	* @return the XML document parsed
	* @throws SAXParseException if the XML data is not valid
	* @throws SAXException if any other error occurs while parsing the XML data
	* @throws IOException if there was some I/O error while reading the input.
	*/
	public static Element parseXMLSequential(InputSource xmlInput)
			throws SAXParseException, SAXException, IOException {
		return XTreeUtil_1Test.parseXMLSequential(xmlInput, VERIFY_DTD,
				XML_SCHEMA_DOM, XML_SCHEMA_LOCATION, XML_DOM);
	}
	
}
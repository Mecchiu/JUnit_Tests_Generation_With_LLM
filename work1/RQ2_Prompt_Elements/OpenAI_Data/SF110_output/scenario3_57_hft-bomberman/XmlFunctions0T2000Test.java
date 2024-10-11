// XmlFunctionsTest.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctionsTest {

		private static final Logger LOGGER = Logger.getLogger(XmlFunctionsTest.class);
		
		private static final String XML_FILE = "test.xml";
		
		private static final String XML_PATH = "//test/test";
		
		private static final String XML_VALUE = "test";
		
		private static final String XML_PATH_INVALID = "//test/test/test";
		
		private static final String XML_PATH_EMPTY = "//test/test/test/test";
		
		private static final String XML_PATH_NULL = "//test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_VALUE = "//test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_VALUE = "//test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_VALUE = "//test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE = "//test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE = "//test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE = "//test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_NAME = "//test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_NAME = "//test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_NAME = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_PATH = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_PATH = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH_NAME = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_PATH_NAME = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_PATH_NAME = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH_NAME_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_PATH_NAME_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_PATH_NAME_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH_NAME_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_PATH_NAME_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_PATH_NAME_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH_NAME_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_PATH_NAME_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_PATH_NAME_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH_NAME_XML_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_EMPTY_FILE_PATH_NAME_XML_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_NULL_FILE_PATH_NAME_XML_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test";
		
		private static final String XML_PATH_INVALID_FILE_PATH_NAME_XML_XML_XML_XML_XML = "//test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test
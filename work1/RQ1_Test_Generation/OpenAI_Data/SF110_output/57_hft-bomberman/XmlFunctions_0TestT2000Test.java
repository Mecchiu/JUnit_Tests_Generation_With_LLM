// XmlFunctions_0Test.java
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
class XmlFunctions_0Test {

		private static final Logger logger = Logger.getLogger(XmlFunctions_0Test.class);
		
		private static final String XML_FILE_NAME = "test.xml";
		
		private static final String XML_PATH_1 = "/root/element1";
		private static final String XML_PATH_2 = "/root/element2";
		private static final String XML_PATH_3 = "/root/element3";
		private static final String XML_PATH_4 = "/root/element4";
		private static final String XML_PATH_5 = "/root/element5";
		private static final String XML_PATH_6 = "/root/element6";
		private static final String XML_PATH_7 = "/root/element7";
		private static final String XML_PATH_8 = "/root/element8";
		private static final String XML_PATH_9 = "/root/element9";
		private static final String XML_PATH_10 = "/root/element10";
		
		private static final String XML_VALUE_1 = "value1";
		private static final String XML_VALUE_2 = "value2";
		private static final String XML_VALUE_3 = "value3";
		private static final String XML_VALUE_4 = "value4";
		private static final String XML_VALUE_5 = "value5";
		private static final String XML_VALUE_6 = "value6";
		private static final String XML_VALUE_7 = "value7";
		private static final String XML_VALUE_8 = "value8";
		private static final String XML_VALUE_9 = "value9";
		private static final String XML_VALUE_10 = "value10";
		
		private static final String XML_VALUE_1_NEW = "value1_new";
		private static final String XML_VALUE_2_NEW = "value2_new";
		private static final String XML_VALUE_3_NEW = "value3_new";
		private static final String XML_VALUE_4_NEW = "value4_new";
		private static final String XML_VALUE_5_NEW = "value5_new";
		private static final String XML_VALUE_6_NEW = "value6_new";
		private static final String XML_VALUE_7_NEW = "value7_new";
		private static final String XML_VALUE_8_NEW = "value8_new";
		private static final String XML_VALUE_9_NEW = "value9_new";
		private static final String XML_VALUE_10_NEW = "value10_new";
		
		private static final String XML_VALUE_1_NEW_2 = "value1_new_2";
		private static final String XML_VALUE_2_NEW_2 = "value2_new_2";
		private static final String XML_VALUE_3_NEW_2 = "value3_new_2";
		private static final String XML_VALUE_4_NEW_2 = "value4_new_2";
		private static final String XML_VALUE_5_NEW_2 = "value5_new_2";
		private static final String XML_VALUE_6_NEW_2 = "value6_new_2";
		private static final String XML_VALUE_7_NEW_2 = "value7_new_2";
		private static final String XML_VALUE_8_NEW_2 = "value8_new_2";
		private static final String XML_VALUE_9_NEW_2 = "value9_new_2";
		private static final String XML_VALUE_10_NEW_2 = "value10_new_2";
		
		private static final String XML_VALUE_1_NEW_3 = "value1_new_3";
		private static final String XML_VALUE_2_NEW_3 = "value2_new_3";
		private static final String XML_VALUE_3_NEW_3 = "value3_new_3";
		private static final String XML_VALUE_4_NEW_3 = "value4_new_3";
		private static final String XML_VALUE_5_NEW_3 = "value5_new_3";
		private static final String XML_VALUE_6_NEW_3 = "value6_new_3";
		private static final String XML_VALUE_7_NEW_3 = "value7_new_3";
		private static final String XML_VALUE_8_NEW_3 = "value8_new_3";
		private static final String XML_VALUE_9_NEW_3 = "value9_new_3";
		private static final String XML_VALUE_10_NEW_3 = "value10_new_3";
		
		private static final String XML_VALUE_1_NEW_4 = "value1_new_4";
		private static final String XML_VALUE_2_NEW_4 = "value2_new_4";
		private static final String XML_VALUE_3_NEW_4 = "value3_new_4";
		private static final String XML_VALUE_4_NEW_4 = "value4_new_4";
		private static final String XML_VALUE_5_NEW_4 = "value5_new_4";
		private static final String XML_VALUE_6_NEW_4 = "value6_new_4";
		private static final String XML_VALUE_7_NEW_4 = "value7_new_4";
		private static final String XML_VALUE_8_NEW_4 = "value8_new_4";
		private static final String XML_VALUE_9_NEW_4 = "value9_new_4";
		private static final String XML_VALUE_10_NEW_4 = "value10_new_4";
		
		private static final String XML_VALUE_1_NEW_5 = "value1_new_5";
		private static final String XML_VALUE_2_NEW_5 = "value2_new_5";
		private static final String XML_VALUE_3_NEW_5 = "value3_new_5";
		private static final String XML_VALUE_4_NEW_5 = "value4_new_5";
		private static final String XML_VALUE_5_NEW_5 = "value5_new_5";
		private static final String XML_VALUE_6_NEW_5 = "value6_new_5";
		private static final String XML_VALUE_7_NEW_5 = "value7_new_5";
		private static final String XML_VALUE_8_NEW_5 = "value8_new_5";
		private static final String XML_VALUE_9_NEW_5 = "value9_new_5";
		private static final String XML_VALUE_10_NEW_5 = "value10_new_5";
		
		private static final String XML_VALUE_1_NEW_6 = "value1_new_6";
		private static final String XML_VALUE_2_NEW_6 = "value2_new_6";
		private static final String XML_VALUE_3_NEW_6 = "value3_new_6";
		private static final String XML_VALUE_4_NEW_6 = "value4_new_6";
		private static final String XML_VALUE_5_NEW_6 = "value5_new_6";
		private static final String XML_VALUE_6_NEW_6 = "value6_new_6";
		private static final String XML_VALUE_7_NEW_6 = "value7_new_6";
		private static final String XML_VALUE_8_NEW_6 = "value8_new_6";
		private static final String XML_VALUE_9_NEW_6 = "value9_new_6";
		private static final String XML_VALUE_10_NEW_6 = "value10_new_6";
		
		private static final String XML_VALUE_1_NEW_7 = "value1_new_7";
		private static final String XML_VALUE_2_NEW_7 = "value2_new_7";
		private static final String XML_VALUE_3_NEW_7 = "value3_new_7";
		private static final String XML_VALUE_4_NEW_7 = "value4_new_7";
		private static
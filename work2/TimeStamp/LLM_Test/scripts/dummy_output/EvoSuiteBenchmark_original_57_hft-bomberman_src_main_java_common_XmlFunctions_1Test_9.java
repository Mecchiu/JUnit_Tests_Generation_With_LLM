// XmlFunctions_1Test.java
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
* It contains one unit test case for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_1Test {
		private final static String XML_PATH = "src/main/resources/test/test/XmlFunctions/XmlFunctions_1Test.xml";

		/**
		 * Returns XML content for the element 'fileName' according to path 'fileName'.
		 *
		 * @param fileName -
		 *            path to file.
		 * @return value of XML content for specified fileName
		 */
		public String getXmlContent(String fileName);

		/**
		 * returns a list of nodes matching to the element 'elementName'
		 *
		 * @param NodeName -
		 *            name of element
		 * @return NodeList with found nodes
		 */
		public NodeList findXmlNodes(String NodeName);

		/**
		 * writes a XML content to a xml file
		 *
		 * @return path to the xml file created
		 */
		public String writeXmlFile();
}
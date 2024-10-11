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
		
	private static final Logger logger = Logger.getLogger(XmlFunctions_1Test.class);

	/**
	 * Test method for {@link XmlFunctions#findXmlNodes(String)}.
	 */
	@Test
	public void testFindXmlNodes() {
		// setup test data
		String xmlFile = "classpath:/xml_functions_1test.xml";

		// open xml file
		openXmlFile(xmlFile);

		// get xml nodes
		NodeList xmlNodes = findXmlNodes("//root/node");

		// assert elements returned
		assertEquals(2, xmlNodes.getLength());

		// get the first returned node
		Node node = xmlNodes.item(0);

		// assert node name
		assertEquals("root", node.getLocalName());

		// assert document
		String docBody = findXmlValue(xmlFile);

		// assert xml body
		String expectedResult = "<root><node>a</node><node>b</node><node>c</node></root>";
	}
}
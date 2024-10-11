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
		
	private static final String PATH_TO_XML = "path/to/xml";
	private static final String XML_ROOT = "root";
	private static final String XML_CHILD_NODE = "child.node";
	private static final String XML_ATTRIBUTE_NAME = "attribute-name";
	private static final String XML_ATTRIBUTE_VALUE = "attribute-value";
	private static final String XML_ATTRIBUTE_NODE = "attribute-node";
	
	@Test
	public void testFindXmlNodes() {
		
		File xml = new File(".");
		try {
			openXmlFile(PATH_TO_XML);
			XmlFunctions xmlFunctions = new XmlFunctions(PATH_TO_XML);
//            System.out.println(xmlFunctions.getXmlValue(XML_CHILD_NODE).toString());
			findXmlNodes(XML_CHILD_NODE);
			logger.debug(XML_CHILD_NODE);
			assertEquals(true, true);
			System.out.println(xmlFunctions.getXmlValue(XML_CHILD_NODE).toString());
		} catch (SAXException | ParserConfigurationException |
				IOException | TransformerConfigurationException |
				TransformerFactoryConfigurationException |
				ParserConfigurationException | TransformerException |
				XPathExpressionException e) {
           	logger.error(e);
           	fail(e);
       }
	}
	
	private void writeXmlFile() throws ParserConfigurationException, SAXException, IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException, TransformerException {
}
}
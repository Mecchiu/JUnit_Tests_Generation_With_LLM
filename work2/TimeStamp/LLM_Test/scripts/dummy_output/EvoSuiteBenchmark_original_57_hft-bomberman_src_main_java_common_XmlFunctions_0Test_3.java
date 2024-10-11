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
* It contains one unit test case for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {
		public static final String DEFAULT_MATCHRES = "";


	/**
	* test method for
	* {@link XmlFunctions#getXmlValue(String)}
	* @throws XPathExpressionException
	* @throws SAXException
	* @throws IOException
	* @throws ParserConfigurationException
	* @throws TransformerConfigurationException
	* @throws TransformerException
	*/
	@Test
    public void getXmlValue_01() throws XPathExpressionException, SAXException, IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException {
		openXmlFile("src/test/resources/default_XML.xml");
		XPathFactory xpXPathfactory = XPathFactory.newInstance();
		XPath xpXPath = xpXPathfactory.newXPath();
		xpXPath.setNamespaceContext(new DefaultNamespaceContext());
		String match = ".";
		Node result = (Node) xpXPath.evaluate("//*[@match='" + match + "']",xml,XPathConstants.NODE);
		assertEquals("test result", "", result.getTextContent());
	}

	/**
	* test method for
	* {@link XmlFunctions#openXmlFile(String)}
	* @throws TransformerException
	*/
	@Test
    public void openXmlFile_02() throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer(new StreamSource(XmlFunctions_0Test_1.class.getResourceAsStream("src/test/resources/default_XML_file.xml")));
		t.setParameter("match", ".");
		assertNull("The result contains the XML file", StringUtil.toString((NodeList) t.transform(xml, Result.createOutputSource(new DOMSource(xml)))));
	}

	/**
	* test method for
	* {@link XmlFunctions#findXmlNode(String)}
	* @throws TransformerException
	* @throws XPathExpressionException
	* @throws SAXException
	*/
	@Test
    public void findXmlNode_03() throws TransformerException, XPathExpressionException, SAXException {
		openXmlFile("src/test/resources/default_XML_file.xml");

		XPathFactory xfp = XPathFactory.newInstance();
		XPath xpXPath = xfp.newXPath();
		xpXPath.setNamespaceContext(new DefaultNamespaceContext());
		XPathExpression xpXPathExpr = xpXPath.compile("//*[@match='.xml' or @match='*.xml']");
		NodeList nodeList = (NodeList) xpXPathExpr.evaluate(xml, XPathConstants.NODESET);
		for (int i = 0; i < nodeList.getLength(); i++) {
			System.out.println("Found Node " + i);
			Node node = nodeList.item(i);
			NodeName nodeName = node.getNodeName();
			assertEquals("XPathExpression result", "", nodeName.getLocalPart());
			Node child = getXmlNode(node);
			assertNotNull("The returned node has a child", child);
			assertEquals("A Node is the correct Node", "nodes", nodeName.getLocalPart());
		}
	}

}
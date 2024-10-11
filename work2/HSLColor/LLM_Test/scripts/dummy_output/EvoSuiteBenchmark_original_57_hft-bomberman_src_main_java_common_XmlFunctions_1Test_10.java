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
		private final static String DATA_PATH = "C:/test/Test/src/main/java";
		private final static File fileName = new File(DATA_PATH);
		private static final String XPATH = "//doc.xml";

	/**
	* Test the findXmlNodes method.
	* It should return only elements that match
	* the XPATH
	* @throws Exception
	*/
	@Test
		public void findXmlNodesTest() throws Exception {

			assertArrayEquals(new String[]{"id", "node"},
					XmlFunctions.findXmlNodes(XML_NODE_XML_PATH));
			
			assertNull(XmlFunctions.findXmlNodes(XML_NODE_NOT_EXIST));
			assertEquals(0,
					XmlFunctions
							.findXmlNodes(
									XML_NODE_NOT_EXIST + XPATH));

		}

	/**
	* test the getXmlValue method of {@link XmlFunctions}.
	* It should return value of the XML document with the given name.
	* @throws SAXException
	* @throws IOException
	* @throws ParserConfigurationException
	* @throws XPathExpressionException
	* @throws TransformerException
	* @throws DOMException
	* @throws TransformerConfigurationException
	*/
	@Test
		public void getXmlValueTest() throws Exception {

			//create a document with its name
			Document document = new Document();
			document.appendChild(document.createElement("doc.xml"));

			//create an xml element for the document and set some
			//properties in the xml element
			Node xmlNode = document.createElement(XML_NODE_XML_PATH);
			xmlNode.setAttribute(XML_VALUE, "Hello");


			//create a node list with a single node in the array
			NodeList nodes = document.getElementsByTagName(XML_NODE_XML_NODE);

			//when the method is called for the empty node list
			for (int i = 0; i < nodes.getLength(); i++) {
				Node n1 = nodes.item(i);
				//it should return value of the xml document with the name
				//XML_NODE_XML_PATH/XML_NODE_XML_NODE
				assertTrue(
						n1.getNodeValue()
								.toString()
								.equals(
										xmlNode.getNodeValue()
												.toString()
												.replace(
														XML_NODE_XML_PATH,
														XML_NODE_XML_NODE)));
			}

		}

	/**
	* test the getXmlNodes method for the first XML node in the array.
	* This method returns an array with two nodes because of the second
	* XML node for XML path value.
	* The array elements should be the second XML node with the attribute
	* XML_VALUE in the second XML node.
	* @throws SAXException
	* @throws IOException
	* @throws ParserConfigurationException
	* @throws XPathExpressionException
	* @throws InvalidXPathException
	*/

	//@Test
	//	public void secondLastElementShouldBeNode() throws Exception{
	//
	//		String value = XPathFactory
	//				.newInstance()
	//				.newXPath()
	//				.compile(String.format("//%s %
}
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
		private Document result;

        /**
         * test method that sets value to a specific xml node
         *
         * @param XML_CONTENT -
         *            JAXP DOM XML to be passed to parse element
         * @param XML_NAME -
         *            Element Name (element to be parsed)
         */
        private void setXmlValue(String XML_CONTENT, String XML_NAME) {
            Document document = null;
            try {
                document = parseDOM(new SAXSource(new SAXSourceFactory() {

                    public Source createEntityResolver(Configuration configuration) throws SAXException {
                        return null;
                    }
                }, XML_CONTENT ), null);
                Node node = document.getElementsByTagName(XML_NAME).item(0);
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Node nodeContent = documentBuilder.parse(node.getOwnerDocument().getDocumentElement()).getFirstChild();
                DOMSource source = new DOMSource(nodeContent);
                Source src = source;
                result = TransformerFactory.newInstance().newTransformer(src).transform(src, result);
                document.appendChild(result);
            } catch (ParserConfigurationException | TransformerConfigurationException | SAXException | IOException
                | TransformerException | TransformerFactoryConfigurationException | XPathExpressionException e) {
                result = document;
                e.printStackTrace();
            }
            throw new AssertError("Test expected to fail as element is not found : " + XML_CONTENT);
        }

        /**
         * test method that reads a value from a
         * specific xml node
         *
         * @param XML_PATH -
         *            Element path (XPath)
         * @return value of a specific element
         */
        private String readXmlValueFromElement(String XML_PATH) {
            Node childNode = findXmlNode(XML_PATH);
            return childNode.getTextContent();
        }

		@Test
		public void testgetXmlValue() {
			assertEquals("XML content", "test 1", readXmlValueFromElement("/testXml/childNode"));
			assertEquals("XML content", "test", readXmlValueFromElement("/testXml/Text"));
			assertEquals("XML content", "1", readXmlValueFromElement("/testXml/Text"));
			assertEquals("XML content", "test", readXmlValueFromElement("/testXml/Text"));
			assertEquals("XML content", null, readXmlValueFromElement("/testXml/Text"));
			assertNull("XML content", readXmlValueFromElement("/testXml/Text"));
		}

		@Test
		public void testaddXmlNodes() {
}
}
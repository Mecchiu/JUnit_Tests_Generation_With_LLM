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
private final Logger logger = Logger.getLogger(XmlFunctions_1Test.class);
	private static final String XSL_XML = "/org/w3c/dom/css1.xul/stylesheet.xsl";
        private static final String XML_TEST_DIR = "/tests/xml";

        @Test
        public void test_findXmlNodes() throws SAXException, IOException {
    	        logger.info("Starting test to check xml nodes in directory:" + XML_TEST_DIR);
            String resultPath = "xml/";
            File xmlFile = new File(XML_TEST_DIR + File.separator + "xml_test" + File.separator + XML_TEST_DIR + ".xml");

            if (xmlFile.exists()) {
                resultPath += xmlFile.getName();
            }

            //load xml
            logger.info("Loading xml from: " + XML_TEST_DIR);
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(xmlFile.getAbsolutePath());

            transXml2Xml(resultPath+ XML_TEST_DIR, doc.getDocumentElement());
        }

        @Test
        public void test_findXmlNodes_null() throws ParserConfigurationException, SAXException, IOException {
    	        logger.info("Starting test to check xml nodes in directory:" + XML_TEST_DIR);
            String resultPath = "xml/";

            logger.info("Loading xml from:" + XML_TEST_DIR);
            DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = docBuilder.parse(xmlFile.getAbsolutePath());

            Node result = findXmlNodes(null);
            assertNull("Should not return NN", result);
        }

        @Test
        public void test_findXmlNodes_excel() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerConfigurationException {
        	logger.info("Starting test to check xml nodes in Excel file (" + XML_TEST_DIR + ").");
        	String resultPath = "xml/";
    	        File xmlFile = new File(XML_TEST_DIR + File.separator + "xml_test" + File.separator + XML_TEST_DIR + ".xml");

    	        DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    	        Document doc = docBuilder.parse(xmlFile.getAbsolutePath());
    	        NodeList resultList = xPath.compile("/root/stylesheet/body/table/thead/tr/th").evaluateList(doc.getDocumentElement(), XPathConstants.NODESET);
    	        transXml2Xml(resultPath+ XML_TEST_DIR, resultList);
    	}
}
// End of XmlFunctions_1Test.java
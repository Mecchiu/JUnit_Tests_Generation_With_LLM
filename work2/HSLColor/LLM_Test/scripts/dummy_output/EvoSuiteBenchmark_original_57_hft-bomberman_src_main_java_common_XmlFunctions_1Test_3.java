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
		
    /**
     * main for unit-test
     *
     * @param args args
     */
    @Test
    public void testFindXmlNodes() {
        logger.info("Test FindXmlNodes");
        //create xml file and set some values to it
        File file = new File("data/xml_output/XmlFunctions_1FindXmlNodes.xml");
        String text = createXmlFile(file);

        try {
            //read xml and write it to the xml file
            String value1 = findXmlNode(text, XmlPathConstants.ELEMENT_NAME_VALUE_NAME);
            assertEquals(text, value1);

            //read xml and read it back through XPath query and print it
            value1 = XPathExpression.evaluate(text, XPathFactory.newInstance().newXPath(), XPathConstants.STRING);
            assertEquals("IAMEMBER", value1);

            //read xml file and list nodes
            value1 = XPathExpression.evaluate(text, XPathFactory.newInstance().newXPath(), XPathConstants.NODESET);
            assertEquals(xmlNodes(text), value1);

            //read xml file and list nodes across all nodes
            value1 = XPathExpression.evaluate(text, XPathFactory.newInstance().newXPath(), XPathConstants.NODE);
            assertEquals(xmlNodes(text), value1);

        } catch (XPathExpressionException e) {
            log.error("An error occured", e);
            fail("An error occured");
        } catch (ParserConfigurationException e) {
            log.error("An error occured", e);
        } catch (SAXException e) {
            log.error("An error occured", e);
        } catch (IOException e) {
            log.error("An error occured", e);
        }

        //clean up
        File file = new File("data/xml_output/XmlFunctions_1FindXmlNodes_cleanup");
        deleteFile(file);
    }

    /**
     * @param xmlNodes
     * @return String
     */
    private String createXmlFile(File xmlFile) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document(dBuilder);
            String fileName = xmlFile.getName();
            return createXmlFile(fileName);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            log.error(e);
            return null;
        }
    }

    /**
     * @param xmlPath
     * @return String
     */
    private String xmlNodes(String xmlPath) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(xmlPath);
            XPath xp = XPathFactory.newInstance().newXPath();
            return xp.evaluate(doc, "<nodes/>").trim();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            log.error(e);
            return null;
        }
    }

    /**
     * @param xmlFile
     * @return String with all xml found in xmlFile
     */
    private String xmlFile(File xmlFile) {
}
}
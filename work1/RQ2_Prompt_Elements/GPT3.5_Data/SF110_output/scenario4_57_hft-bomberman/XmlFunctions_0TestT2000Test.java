// XmlFunctions.java
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

/**
 * basic functions for reading and writing xml files
 *
 * @author christian
 */
public class XmlFunctions {

    private static final Logger logger = Logger.getLogger(XmlFunctions.class);

    Document xml;

    String fileName;

    /**
     * constructor
     *
     * @param XmlFileName -
     *            path to xml file
     */
    public XmlFunctions(String XmlFileName) {
        this.fileName = XmlFileName;
        openXmlFile(XmlFileName);
    }

    /**
     * sets value to specific xml node and saves the xml file
     *
     * @param element -
     *            name of xml element
     * @param value -
     *            String, value to be set
     */
    public void setXmlValue(String xmlPath, String value) {
        Node node = findXmlNode(xmlPath);
        if (node != null) {
            node.setTextContent(value);
            writeXmlFile();
        } else {
            logger.error("Node not found: " + xmlPath);
        }
    }

    /**
     * returns value of specific xml element
     *
     * @param XmlPath -
     *            element path (XPath)
     * @return String with value of element
     */
    public String getXmlValue(String XmlPath) {
        String value = null;
        try {
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile(XmlPath);
            value = (String) expr.evaluate(xml, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            logger.error("Error evaluating XPath expression: " + XmlPath, e);
        }
        return value;
    }

    /**
     * reads a xml file into a Document object
     *
     * @param fileName -
     *            path to xml file
     */
    private void openXmlFile(String fileName) {
        try {
            File xmlFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            xml = dBuilder.parse(xmlFile);
            xml.getDocumentElement().normalize();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            logger.error("Error opening XML file: " + fileName, e);
        }
    }

    /**
     * finds a xml node in the Document object and returns it
     *
     * @param XmlPath -
     *            element path (XPath)
     * @return Node - found node
     */
    private Node findXmlNode(String XmlPath) {
        Node node = null;
        try {
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile(XmlPath);
            node = (Node) expr.evaluate(xml, XPathConstants.NODE);
        } catch (XPathExpressionException e) {
            logger.error("Error evaluating XPath expression: " + XmlPath, e);
        }
        return node;
    }

    /**
     * returns a list of nodes matching to the element name
     *
     * @param NodeName -
     *            name of element(s)
     * @return NodeList with found nodes
     */
    public NodeList findXmlNodes(String NodeName) {
        NodeList nodes = null;
        try {
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("//" + NodeName);
            nodes = (NodeList) expr.evaluate(xml, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            logger.error("Error evaluating XPath expression: " + NodeName, e);
        }
        return nodes;
    }

    /**
     * writes global Document object xml (back) into xml file
     */
    private void writeXmlFile() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(xml);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            logger.error("Error configuring XML transformer", e);
        } catch (TransformerException e) {
            logger.error("Error transforming XML", e);
        }
    }
}

// XmlFunctions_0Test.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {

    @Test
    void testGetXmlValue() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        assertEquals("John", xmlFunctions.getXmlValue("//person[1]/name"));
        assertEquals("Doe", xmlFunctions.getXmlValue("//person[1]/surname"));
        assertEquals("25", xmlFunctions.getXmlValue("//person[1]/age"));
        assertEquals("Jane", xmlFunctions.getXmlValue("//person[2]/name"));
        assertEquals("Doe", xmlFunctions.getXmlValue("//person[2]/surname"));
        assertEquals("30", xmlFunctions.getXmlValue("//person[2]/age"));
        assertEquals("Bob", xmlFunctions.getXmlValue("//person[3]/name"));
        assertEquals("Smith", xmlFunctions.getXmlValue("//person[3]/surname"));
        assertEquals("40", xmlFunctions.getXmlValue("//person[3]/age"));
        assertNull(xmlFunctions.getXmlValue("//person[4]/name"));
    }

    @Test
    void testGetXmlValueWithInvalidXPath() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        assertNull(xmlFunctions.getXmlValue("//person[4]"));
        assertNull(xmlFunctions.getXmlValue("invalidXPath"));
    }
}
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
        Node node = findXmlNode(XmlPath);
        if (node != null) {
            return node.getTextContent();
        } else {
            logger.error("Node not found: " + XmlPath);
            return null;
        }
    }

    /**
     * reads a xml file into a Document object
     *
     * @param fileName -
     *            path to xml file
     */
    private void openXmlFile(String fileName) {
        try {
            File file = new File(fileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            xml = db.parse(file);
            xml.getDocumentElement().normalize();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            logger.error("Error while opening xml file: " + fileName, e);
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
        try {
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile(XmlPath);
            return (Node) expr.evaluate(xml, XPathConstants.NODE);
        } catch (XPathExpressionException e) {
            logger.error("Error while finding xml node: " + XmlPath, e);
            return null;
        }
    }

    /**
     * returns a list of nodes matching to the element name
     *
     * @param NodeName -
     *            name of element(s)
     * @return NodeList with found nodes
     */
    public NodeList findXmlNodes(String NodeName) {
        try {
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("//" + NodeName);
            return (NodeList) expr.evaluate(xml, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            logger.error("Error while finding xml nodes: " + NodeName, e);
            return null;
        }
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
            logger.error("Error while writing xml file: " + fileName, e);
        } catch (TransformerException e) {
            logger.error("Error while writing xml file: " + fileName, e);
        }
    }
}

// XmlFunctions_1Test.java
package common;

import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XmlFunctions}.
 * It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
 */
class XmlFunctions_1Test {

    @Test
    void testFindXmlNodes() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book");
        assertNotNull(nodeList);
        assertEquals(2, nodeList.getLength());
    }

    @Test
    void testFindXmlNodes_EmptyResult() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("nonexistent");
        assertNotNull(nodeList);
        assertEquals(0, nodeList.getLength());
    }

    @Test
    void testFindXmlNodes_NullResult() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes(null);
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book/author");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath2() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book[author='John Doe']");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath3() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book/@id");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath4() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book[1]");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath5() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book[author='John Doe']/title");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath6() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book[author='John Doe']/*");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodes_InvalidXmlPath7() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("book[author='John Doe']//title");
        assertNull(nodeList);
    }
}
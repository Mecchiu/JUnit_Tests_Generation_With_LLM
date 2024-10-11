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

	private static final Logger logger = Logger.getLogger(XmlFunctions_0Test.class);
    //
	// Test cases
	//

    /**
     * Check that file can be read correctly and contains xml text content
     */
    @Test
    void testReadFileCorrect() {

        File file = XmlFunctions_0Test.class.getClassLoader().getResource("example.xml").getFile();
        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (TransformerException ex) {
            ex.printStackTrace();
        }
        assertNotNull(document);
        assertTrue(document.getNodeName().equals("root"));
        String value = getXmlValue(document.getElementsByTagName("first")[0].getTextContent());
        assertNotNull(value);
        assertTrue(value.startsWith("<first>"));
        value = getXmlValue(document.getElementsByTagName("second")[0].getTextContent());
        assertNotNull(value);
        assertTrue(value.startsWith("<second>"));
        value = getXmlValue(document.getElementsByTagName("third")[0].getTextContent());
        assertNotNull(value);
        assertTrue(value.startsWith("<third>"));
        value = getXmlValue(document.getElementsByTagName("fourth")[0].getTextContent());
        assertNotNull(value);
        assertTrue(value.startsWith("<fourth>"));
    }

    /**
     * Check that there is only one node in the html document
     */
    @Test
    public void testOnlyOneNodeInDocument() {
        Document document = null;
        try {
            document = DocumentFactory.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        }
        assertNotNull(document);
        assertTrue(document.getElementsByTagName("html").getLength() > 1);
        document.add(new DOMSource(document.getElementsByTagName("html").item(0)));
        // the HTML document must be unchanged now,
        String value = document.getElementsByTagName("html").item(0).getTextContent();
        assertNotNull(value);
        assertTrue(value.startsWith("<body>"));
    }

    /**
     * Check that every element contained in the document has been
     * transformed to an Element
     */
    @Test
    public void testTransformedElements() {

        Document document = null;
        try {
            document = DocumentFactory.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        }
        assertNotNull(document);
        ArrayList list = new ArrayList();
        list.add(0, document.getElementsByTagName("root").item(0));
	XPath xPath = XPathFactory.newInstance().newXPath();
	try {
		String resultString =
				((org.w3c.dom.Node) xPath.evaluate(
						"//html:body", document,
						XPathConstants.NODE)).getTextContent();
		logger.debug(resultString);
		logger.debug(resultString.replace("</body>", ""));
		assertTrue(resultString.contains("<body>"));
	} catch (XPathExpressionException ex) {
		assertTrue(false);
	} catch (XPathExpressionException ex) {
		assertTrue(false);
	}
    }

    /**
     * Test XPath functionality
     */
    @Test
    public void testXPathFunctionality() {
        Document document = null;
        XPath xPath = XPathFactory.newInstance().newXPath();
        xPath.setXPathFunction("text");
        try {
        	// test all DOM elements
            NodeList nodeList;
            nodeList= ((org.w3c.dom.Node) xPath.evaluate("//body//div/text()", document,
                    XPathConstants.NODESET)).getNodes();
            assertEquals(1, nodeList.getLength());
            assertEquals("The text in the first", nodeList.item(0)
                   .getTextContent());
            nodeList= ((org.w3c.dom.Node) xPath.evaluate("//body//p", document,
                    XPathConstants.NODESET)).getNodes();
            assertEquals(1, nodeList.getLength());
            assertEquals("This is a  test.
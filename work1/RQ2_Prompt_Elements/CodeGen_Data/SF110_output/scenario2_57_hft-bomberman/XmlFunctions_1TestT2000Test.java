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
 * test function to find xml nodes by name of the element.
 */
		String ElementName = "//Name";

		/**
     * Constructor for {@link XmlFunctions_1Test}.
     */
    public XmlFunctions_1Test() {
        logger = new Logger(XmlFunctions_1Test.class.getName());
	}
	
	/**
	 * tests basic functionality of {@link XmlFunctions#findXmlNodes(X...)}
     */
    @Test
    public void testFindXmlElements() {
		XmlFunctions_1Test.ElementName = "//Element";
		NodeList xml = findXmlNodes(XmlFunctions_1Test.ElementName);
		assertInstanceOf(Node.class, xml.get(0));

	}
	
	/**
	 * tests basic functionality of {@link XmlFunctions#findXmlElements(X...)}
     */
    @Test
    public void testFindXmlNodeWithChild() {
		XmlFunctions_1Test.ElementName = "//Element/Child/Name";
		NodeList xml = findXmlNodes(XmlFunctions_1Test.ElementName);
		assertInstanceOf(Node.class, xml.get(0));
		assertTrue(xml.get(0).equals(xml.get(1)));
	}
	
	/**
	 * tests basic functionality of {@link XmlFunctions#findXmlNodeWithChilds(X...)}
     */
    @Test
    public void testFindXmlNodeWithChilds() {
		XmlFunctions_1Test.ElementName = "//Element/Child/String";
		NodeList xml = findXmlNodes(XmlFunctions_1Test.ElementName);
		assertInstanceOf(Node.class, xml.get(1));
		assertTrue(xml.get(1).equals(xml.get(2)));
	}
	
	/**
	 * tests basic functionality of {@link XmlFunctions#findXmlElementWithChild(X...)}
	 */
    @Test
    public void testFindXmlElementWithChild() {
		XmlFunctions_1Test.ElementName = "//Element/Child/ChildList[2]";
		NodeList xml = findXmlNodes(XmlFunctions_1Test.ElementName);
		assertInstanceOf(Node.class, xml.get(0));
		assertTrue(xml.get(1).equals(xml.get(2)));

	}
	
	/**
	 * test of {@link XmlFunctions#findXmlNodes(X...)}
	 */
    @Test
    public void testFindXmlNodes() {
		logger.info("testFindXmlNodes");
		NodeList xml = findXmlNodes(XmlFunctions.ElementName);
		assertInstanceOf(Node.class, xml.get(0));

	}
	
	/**
	 * test of {@link XmlFunctions#findXmlNodeWithChilds(X...)}
	 */
    @Test
    public void testFindXmlNodeWithChilds() {
		logger.info("testFindXmlNodeWithChilds");
		NodeList xml = findXmlNodes(XmlFunctions.ElementName);
		assertInstanceOf(Node.class, xml.get(1));

	}
	
	/**
	 * test of {@link XmlFunctions#findXmlNodesByName(String...)}
	 */
    @Test
    public void testFindXmlNodesByName() {
		logger.info("testFindXmlNodesByName");
		NodeList xml = findXmlNodesByName(XmlFunctions.ElementName);
		assertInstanceOf(Node.class, xml.get(0));

	}
	
	/**
	 * test of {@link XmlFunctions#findXmlNodesByName(String...)}
	 */
    @Test
    public void testFindXmlNodesByNameWithChilds() {
		logger.info("testFindXmlNodesByNameWithChilds");
		NodeList xml = findXmlNodesByName(XmlFunctions.ElementName);
		assertInstanceOf(Node.class, xml.get(2));

	}
	
	/**
	 * test of {@link XmlFunctions#findXmlElementsByName(String...)}
	 */
    @Test
    public void testFindXmlElementsByName() {
		logger.info("testFindXmlElementsByName");
		NodeList xml = find
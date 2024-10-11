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
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//book");
        assertNotNull(nodeList);
        assertEquals(4, nodeList.getLength());
    }

    @Test
    void testFindXmlNodesWithInvalidNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//invalid");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithNullNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes(null);
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithEmptyNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithWhitespaceNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("   ");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithInvalidXml() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//book");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithValidXmlButNoMatchingNodes() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//invalid");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithValidXmlAndSingleNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//book[1]");
        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

    @Test
    void testFindXmlNodesWithValidXmlAndMultipleNodeNames() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//book | //cd");
        assertNotNull(nodeList);
        assertEquals(7, nodeList.getLength());
    }

    @Test
    void testFindXmlNodesWithValidXmlAndNamespace() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//ns:book", "ns", "http://example.com");
        assertNotNull(nodeList);
        assertEquals(2, nodeList.getLength());
    }
}
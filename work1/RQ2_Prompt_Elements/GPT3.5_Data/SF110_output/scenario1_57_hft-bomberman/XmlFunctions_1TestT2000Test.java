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
    void testFindXmlNodesWithValidXmlButInvalidNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("//invalid");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithValidXmlButNullNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes(null);
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithValidXmlButEmptyNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithValidXmlButWhitespaceNodeName() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("   ");
        assertNull(nodeList);
    }
}
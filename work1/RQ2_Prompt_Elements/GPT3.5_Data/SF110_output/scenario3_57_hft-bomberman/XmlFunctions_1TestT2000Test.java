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

    /**
     * Test case for finding a single node.
     */
    @Test
    void testFindXmlNodes_singleNode() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("node1");
        assertEquals(1, nodeList.getLength());
    }

    /**
     * Test case for finding multiple nodes.
     */
    @Test
    void testFindXmlNodes_multipleNodes() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("node2");
        assertEquals(3, nodeList.getLength());
    }

    /**
     * Test case for finding no nodes.
     */
    @Test
    void testFindXmlNodes_noNodes() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("nonexistentNode");
        assertEquals(0, nodeList.getLength());
    }

    /**
     * Test case for finding nodes with a null argument.
     */
    @Test
    void testFindXmlNodes_nullArgument() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        assertThrows(IllegalArgumentException.class, () -> {
            xmlFunctions.findXmlNodes(null);
        });
    }

    /**
     * Test case for finding nodes with an empty string argument.
     */
    @Test
    void testFindXmlNodes_emptyStringArgument() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        assertThrows(IllegalArgumentException.class, () -> {
            xmlFunctions.findXmlNodes("");
        });
    }

    /**
     * Test case for finding nodes with a whitespace argument.
     */
    @Test
    void testFindXmlNodes_whitespaceArgument() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        assertThrows(IllegalArgumentException.class, () -> {
            xmlFunctions.findXmlNodes("   ");
        });
    }

    /**
     * Test case for finding nodes with an invalid XML file.
     */
    @Test
    void testFindXmlNodes_invalidXmlFile() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        assertThrows(SAXException.class, () -> {
            xmlFunctions.findXmlNodes("node1");
        });
    }

    /**
     * Test case for finding nodes with a non-existent XML file.
     */
    @Test
    void testFindXmlNodes_nonExistentXmlFile() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        assertThrows(IOException.class, () -> {
            xmlFunctions.findXmlNodes("node1");
        });
    }

    /**
     * Test case for finding nodes with a valid XML file but non-existent node.
     */
    @Test
    void testFindXmlNodes_validXmlFile_nonExistentNode() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("nonexistentNode");
        assertEquals(0, nodeList.getLength());
    }

    /**
     * Test case for finding nodes with a valid XML file and valid node name with namespace.
     */
    @Test
    void testFindXmlNodes_validXmlFile_validNodeWithNamespace() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("ns:node3");
        assertEquals(1, nodeList.getLength());
    }

    /**
     * Test case for finding nodes with a valid XML file and valid node name with default namespace.
     */
    @Test
    void testFindXmlNodes_validXmlFile_validNodeWithDefaultNamespace() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        NodeList nodeList = xmlFunctions.findXmlNodes("defaultns:node4");
        assertEquals(1, nodeList.getLength());
    }
}
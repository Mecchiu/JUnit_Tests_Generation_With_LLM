// XmlFunctions_0Test.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XmlFunctions}.
 * It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
 */
class XmlFunctions_0Test {

    /**
     * Test case for getting value of an existing element.
     */
    @Test
    void testGetXmlValue_existingElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/element1";
        String expectedValue = "value1";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of a non-existing element.
     */
    @Test
    void testGetXmlValue_nonExistingElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/nonExistingElement";
        String expectedValue = null;
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with empty value.
     */
    @Test
    void testGetXmlValue_emptyValueElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/emptyValueElement";
        String expectedValue = "";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with whitespace value.
     */
    @Test
    void testGetXmlValue_whitespaceValueElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/whitespaceValueElement";
        String expectedValue = "   ";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with special characters in value.
     */
    @Test
    void testGetXmlValue_specialCharactersElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/specialCharactersElement";
        String expectedValue = "<>&\"'";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with special characters in path.
     */
    @Test
    void testGetXmlValue_specialCharactersPath() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/specialCharactersElement[@attribute='<>&\"']";
        String expectedValue = "value5";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with namespace.
     */
    @Test
    void testGetXmlValue_namespaceElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/ns:root/ns:element6";
        String expectedValue = "value6";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with default namespace.
     */
    @Test
    void testGetXmlValue_defaultNamespaceElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/d:root/d:element7";
        String expectedValue = "value7";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with multiple namespaces.
     */
    @Test
    void testGetXmlValue_multipleNamespacesElement() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/ns:root/d:element8";
        String expectedValue = "value8";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }

    /**
     * Test case for getting value of an element with attribute.
     */
    @Test
    void testGetXmlValue_elementWithAttribute() {
        XmlFunctions xmlFunctions = new XmlFunctions();
        String xmlPath = "/root/element9[@attribute='value9']";
        String expectedValue = "value10";
        String actualValue = xmlFunctions.getXmlValue(xmlPath);
        assertEquals(expectedValue, actualValue);
    }
}
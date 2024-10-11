// XmlIO_1Test.java
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XmlIO}.
 * It contains ten unit test cases for the {@link XmlIO#load(URL)} method.
 */
class XmlIO_1Test {

    /**
     * Test case for loading a valid XML file.
     */
    @Test
    void testLoadValidXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/valid.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an invalid XML file.
     */
    @Test
    void testLoadInvalidXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/invalid.xml");
        assertFalse(xmlIO.load(url));
    }

    /**
     * Test case for loading a non-existent XML file.
     */
    @Test
    void testLoadNonExistentXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/nonexistent.xml");
        assertFalse(xmlIO.load(url));
    }

    /**
     * Test case for loading an empty XML file.
     */
    @Test
    void testLoadEmptyXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/empty.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an XML file with only a root element.
     */
    @Test
    void testLoadXmlFileWithOnlyRootElement() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/onlyroot.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an XML file with multiple elements.
     */
    @Test
    void testLoadXmlFileWithMultipleElements() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/multiple.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an XML file with attributes.
     */
    @Test
    void testLoadXmlFileWithAttributes() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/attributes.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an XML file with CDATA.
     */
    @Test
    void testLoadXmlFileWithCData() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/cdata.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an XML file with comments.
     */
    @Test
    void testLoadXmlFileWithComments() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/comments.xml");
        assertTrue(xmlIO.load(url));
    }

    /**
     * Test case for loading an XML file with mixed content.
     */
    @Test
    void testLoadXmlFileWithMixedContent() {
        XmlIO xmlIO = new XmlIO();
        URL url = getClass().getResource("/mixed.xml");
        assertTrue(xmlIO.load(url));
    }
}
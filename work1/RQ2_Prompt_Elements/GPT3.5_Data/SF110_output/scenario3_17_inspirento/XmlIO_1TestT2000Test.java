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
        URL inputURL = getClass().getResource("/valid.xml");
        assertTrue(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading an invalid XML file.
     */
    @Test
    void testLoadInvalidXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/invalid.xml");
        assertFalse(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading a non-existent XML file.
     */
    @Test
    void testLoadNonExistentXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/nonexistent.xml");
        assertFalse(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading an empty XML file.
     */
    @Test
    void testLoadEmptyXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/empty.xml");
        assertFalse(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading a large XML file.
     */
    @Test
    void testLoadLargeXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/large.xml");
        assertTrue(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading a small XML file.
     */
    @Test
    void testLoadSmallXmlFile() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/small.xml");
        assertTrue(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading an XML file with special characters.
     */
    @Test
    void testLoadXmlFileWithSpecialCharacters() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/special.xml");
        assertTrue(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading an XML file with multiple elements.
     */
    @Test
    void testLoadXmlFileWithMultipleElements() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/multiple.xml");
        assertTrue(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading an XML file with nested elements.
     */
    @Test
    void testLoadXmlFileWithNestedElements() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/nested.xml");
        assertTrue(xmlIO.load(inputURL));
    }

    /**
     * Test case for loading an XML file with attributes.
     */
    @Test
    void testLoadXmlFileWithAttributes() {
        XmlIO xmlIO = new XmlIO();
        URL inputURL = getClass().getResource("/attributes.xml");
        assertTrue(xmlIO.load(inputURL));
    }
}
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

    @Test
    void testLoadValidXml() {
        XmlIO xmlIO = new XmlIO();
        URL validXmlUrl = getClass().getResource("/valid.xml");
        assertTrue(xmlIO.load(validXmlUrl));
    }

    @Test
    void testLoadInvalidXml() {
        XmlIO xmlIO = new XmlIO();
        URL invalidXmlUrl = getClass().getResource("/invalid.xml");
        assertFalse(xmlIO.load(invalidXmlUrl));
    }

    @Test
    void testLoadNonExistentXml() {
        XmlIO xmlIO = new XmlIO();
        URL nonExistentXmlUrl = getClass().getResource("/nonexistent.xml");
        assertFalse(xmlIO.load(nonExistentXmlUrl));
    }

    @Test
    void testLoadNullXml() {
        XmlIO xmlIO = new XmlIO();
        assertFalse(xmlIO.load(null));
    }

    @Test
    void testLoadEmptyXml() {
        XmlIO xmlIO = new XmlIO();
        URL emptyXmlUrl = getClass().getResource("/empty.xml");
        assertTrue(xmlIO.load(emptyXmlUrl));
    }

    @Test
    void testLoadXmlWithNoRootElement() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithNoRootElementUrl = getClass().getResource("/noRootElement.xml");
        assertFalse(xmlIO.load(xmlWithNoRootElementUrl));
    }

    @Test
    void testLoadXmlWithMultipleRootElements() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithMultipleRootElementsUrl = getClass().getResource("/multipleRootElements.xml");
        assertFalse(xmlIO.load(xmlWithMultipleRootElementsUrl));
    }

    @Test
    void testLoadXmlWithInvalidAttribute() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithInvalidAttributeUrl = getClass().getResource("/invalidAttribute.xml");
        assertFalse(xmlIO.load(xmlWithInvalidAttributeUrl));
    }

    @Test
    void testLoadXmlWithInvalidElement() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithInvalidElementUrl = getClass().getResource("/invalidElement.xml");
        assertFalse(xmlIO.load(xmlWithInvalidElementUrl));
    }

    @Test
    void testLoadXmlWithValidAttributeAndElement() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithValidAttributeAndElementUrl = getClass().getResource("/validAttributeAndElement.xml");
        assertTrue(xmlIO.load(xmlWithValidAttributeAndElementUrl));
    }
}
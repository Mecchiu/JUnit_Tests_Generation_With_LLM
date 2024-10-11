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
    void testLoadNullUrl() {
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
    void testLoadXmlWithInvalidRootElement() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithInvalidRootElementUrl = getClass().getResource("/invalidRootElement.xml");
        assertFalse(xmlIO.load(xmlWithInvalidRootElementUrl));
    }

    @Test
    void testLoadXmlWithInvalidChildElement() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithInvalidChildElementUrl = getClass().getResource("/invalidChildElement.xml");
        assertFalse(xmlIO.load(xmlWithInvalidChildElementUrl));
    }

    @Test
    void testLoadXmlWithInvalidAttribute() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithInvalidAttributeUrl = getClass().getResource("/invalidAttribute.xml");
        assertFalse(xmlIO.load(xmlWithInvalidAttributeUrl));
    }

    @Test
    void testLoadXmlWithInvalidText() {
        XmlIO xmlIO = new XmlIO();
        URL xmlWithInvalidTextUrl = getClass().getResource("/invalidText.xml");
        assertFalse(xmlIO.load(xmlWithInvalidTextUrl));
    }
}
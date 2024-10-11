// XmlIO_0Test.java
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Test class of {@link XmlIO}.
 * It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
 */
class XmlIO_0Test {

    /**
     * Test case for loading an empty XML file.
     */
    @Test
    void testLoadEmptyXml() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root></root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with one element.
     */
    @Test
    void testLoadXmlWithOneElement() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <element1>value1</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with multiple elements.
     */
    @Test
    void testLoadXmlWithMultipleElements() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <element1>value1</element1>\n" +
                     "  <element2>value2</element2>\n" +
                     "  <element3>value3</element3>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with attributes.
     */
    @Test
    void testLoadXmlWithAttributes() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <element1 attribute1=\"value1\" attribute2=\"value2\">value1</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with CDATA.
     */
    @Test
    void testLoadXmlWithCData() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <element1><![CDATA[<html><body><p>Some text</p></body></html>]]></element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with comments.
     */
    @Test
    void testLoadXmlWithComments() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <!-- This is a comment -->\n" +
                     "  <element1>value1</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with a DOCTYPE declaration.
     */
    @Test
    void testLoadXmlWithDoctype() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<!DOCTYPE root [\n" +
                     "  <!ELEMENT root (element1)>\n" +
                     "  <!ELEMENT element1 (#PCDATA)>\n" +
                     "]>\n" +
                     "<root>\n" +
                     "  <element1>value1</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with an external DTD.
     */
    @Test
    void testLoadXmlWithExternalDtd() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<!DOCTYPE root SYSTEM \"http://example.com/root.dtd\">\n" +
                     "<root>\n" +
                     "  <element1>value1</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with an internal DTD.
     */
    @Test
    void testLoadXmlWithInternalDtd() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<!DOCTYPE root [\n" +
                     "  <!ELEMENT root (element1)>\n" +
                     "  <!ELEMENT element1 (#PCDATA)>\n" +
                     "]>\n" +
                     "<root>\n" +
                     "  <element1>value1</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an XML file with an entity reference.
     */
    @Test
    void testLoadXmlWithEntityReference() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <element1>&lt;value1&gt;</element1>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
    }

    /**
     * Test case for loading an invalid XML file.
     */
    @Test
    void testLoadInvalidXml() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "<root>\n" +
                     "  <element1>value1</element2>\n" +
                     "</root>";
        InputStream input = new ByteArrayInputStream(xml.getBytes());
        XmlIO xmlIO = new XmlIO();
        assertFalse(xmlIO.load(input));
    }
}
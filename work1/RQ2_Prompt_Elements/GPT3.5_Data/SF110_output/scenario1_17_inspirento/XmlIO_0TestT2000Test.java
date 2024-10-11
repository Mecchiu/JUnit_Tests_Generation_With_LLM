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

    @Test
    void testLoadWithNullInputStream() {
        XmlIO xmlIO = new XmlIO();
        assertFalse(xmlIO.load(null));
    }

    @Test
    void testLoadWithEmptyInputStream() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("".getBytes());
        assertFalse(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithInvalidXml() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<invalid>".getBytes());
        assertFalse(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithValidXml() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<valid></valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithXmlContainingOneElement() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<root><element></element></root>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithXmlContainingMultipleElements() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<root><element1></element1><element2></element2></root>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithXmlContainingAttributes() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<root><element attribute1=\"value1\" attribute2=\"value2\"></element></root>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithXmlContainingText() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<root><element>text</element></root>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithXmlContainingCDATA() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<root><element><![CDATA[<html><body>text</body></html>]]></element></root>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithXmlContainingComments() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<root><!-- comment --><element></element></root>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }
}
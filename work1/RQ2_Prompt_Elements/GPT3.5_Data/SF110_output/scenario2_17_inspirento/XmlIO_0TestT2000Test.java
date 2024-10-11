// XmlIO_0Test.java
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

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
    void testLoadWithValidXmlContainingData() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<valid>data</valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithValidXmlContainingAttributes() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<valid attribute=\"value\"></valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithValidXmlContainingNestedElements() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<valid><nested></nested></valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithValidXmlContainingMultipleElements() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<valid></valid><valid></valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithValidXmlContainingComments() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<!-- comment --><valid></valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }

    @Test
    void testLoadWithValidXmlContainingCDATA() {
        XmlIO xmlIO = new XmlIO();
        InputStream inputStream = new ByteArrayInputStream("<valid><![CDATA[<data>]]></valid>".getBytes());
        assertTrue(xmlIO.load(inputStream));
    }
}
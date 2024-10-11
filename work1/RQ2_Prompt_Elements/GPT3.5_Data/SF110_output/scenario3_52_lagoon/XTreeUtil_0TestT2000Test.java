// XTreeUtil_0Test.java
package nu.staldal.xtree;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class of {@link XTreeUtil}.
 * It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
 */
class XTreeUtil_0Test {

    @Test
    void testParseXML_ValidXML() throws IOException, SAXException {
        String xml = "<root><child>text</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element element = XTreeUtil.parseXML(inputSource, false, null, null);
        assertEquals("root", element.getName());
        assertEquals("text", element.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidXML() {
        String xml = "<root><child>text</child>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(inputSource, false, null, null));
    }

    @Test
    void testParseXML_ValidXMLWithDTDValidation() throws IOException, SAXException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>text</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element element = XTreeUtil.parseXML(inputSource, true, null, null);
        assertEquals("root", element.getName());
        assertEquals("text", element.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidXMLWithDTDValidation() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>text</child>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(inputSource, true, null, null));
    }

    @Test
    void testParseXML_ValidXMLWithSchemaValidation() throws IOException, SAXException {
        String xml = "<root xmlns=\"http://example.com\"><child>text</child></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\" type=\"xs:string\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        Element element = XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", schemaSource);
        assertEquals("root", element.getName());
        assertEquals("text", element.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidXMLWithSchemaValidation() {
        String xml = "<root xmlns=\"http://example.com\"><child>text</child><invalid></invalid></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\" type=\"xs:string\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", schemaSource));
    }

    @Test
    void testParseXML_ValidXMLWithInvalidSchema() {
        String xml = "<root><child>text</child></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"invalid\"></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        assertThrows(SAXException.class, () -> XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", schemaSource));
    }

    @Test
    void testParseXML_ValidXMLWithInvalidSchemaType() {
        String xml = "<root><child>text</child></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        assertThrows(SAXException.class, () -> XTreeUtil.parseXML(inputSource, false, "invalidSchemaType", schemaSource));
    }

    @Test
    void testParseXML_ValidXMLWithNullSchemaType() throws IOException, SAXException {
        String xml = "<root><child>text</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element element = XTreeUtil.parseXML(inputSource, false, null, null);
        assertEquals("root", element.getName());
        assertEquals("text", element.getChild(0).getValue());
    }

    @Test
    void testParseXML_ValidXMLWithNullSchema() throws IOException, SAXException {
        String xml = "<root><child>text</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element element = XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", null);
        assertEquals("root", element.getName());
        assertEquals("text", element.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidInputSource() {
        InputSource inputSource = new InputSource();
        assertThrows(IOException.class, () -> XTreeUtil.parseXML(inputSource, false, null, null));
    }
}
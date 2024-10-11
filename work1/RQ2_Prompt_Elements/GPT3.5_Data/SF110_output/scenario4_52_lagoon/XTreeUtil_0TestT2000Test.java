// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.io.IOException;
import java.io.StringReader;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XTreeUtil}.
 * It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
 */
class XTreeUtil_0Test {

    @Test
    void testParseXML_ValidXML() throws SAXException, IOException {
        String xml = "<root><child>text</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(inputSource, false, null, null);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals("text", root.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidXML() {
        String xml = "<root><child>text</child>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(inputSource, false, null, null));
    }

    @Test
    void testParseXML_ValidXMLWithDTD() throws SAXException, IOException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>text</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(inputSource, true, null, null);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals("text", root.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidXMLWithDTD() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>text</child>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(inputSource, true, null, null));
    }

    @Test
    void testParseXML_ValidXMLWithSchema() throws SAXException, IOException {
        String xml = "<root xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"test.xsd\"><child>text</child></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\" type=\"xs:string\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        Element root = XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", schemaSource);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals("text", root.getChild(0).getValue());
    }

    @Test
    void testParseXML_InvalidXMLWithSchema() {
        String xml = "<root xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"test.xsd\"><child>text</child></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\" type=\"xs:int\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", schemaSource));
    }

    @Test
    void testParseXML_InvalidSchema() {
        String xml = "<root><child>text</child></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\" type=\"xs:int\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schemaSource = new InputSource(new StringReader(schema));
        assertThrows(SAXException.class, () -> XTreeUtil.parseXML(inputSource, false, "http://www.w3.org/2001/XMLSchema", schemaSource));
    }

    @Test
    void testParseXMLSequential_ValidXML() throws SAXException, IOException {
        String xml = "<root><child>text1</child><child>text2</child></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXMLSequential(inputSource, false, null, null, (element) -> {
            assertNotNull(element);
            assertEquals("child", element.getName());
        });
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(0, root.getChildCount());
    }

    @Test
    void testParseXMLSequential_InvalidXML() {
        String xml = "<root><child>text1</child><child>text2</root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXMLSequential(inputSource, false, null, null, (element) -> {}));
    }

    @Test
    void testSerialize() throws IOException {
        Element root = new Element("root");
        root.addChild(new Element("child", "text"));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        XTreeUtil.serialize(root, outputStream);
        String expected = "<root><child>text</child></root>";
        assertEquals(expected, outputStream.toString());
    }

    @Test
    void testSerialize_WithProperties() throws IOException {
        Element root = new Element("root");
        root.addChild(new Element("child", "text"));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Properties properties = new Properties();
        properties.setProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        XTreeUtil.serialize(root, outputStream, properties);
        String expected = "<root><child>text</child></root>";
        assertEquals(expected, outputStream.toString());
    }
}
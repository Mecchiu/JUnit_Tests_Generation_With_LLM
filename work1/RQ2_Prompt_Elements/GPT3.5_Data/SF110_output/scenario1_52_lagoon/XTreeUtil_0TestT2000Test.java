// XTreeUtil_0Test.java
package nu.staldal.xtree;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XTreeUtil}.
 * It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
 */
class XTreeUtil_0Test {

    @Test
    void testParseXMLValid() throws SAXException, IOException {
        String xml = "<root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(input, false, null, null);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, root.getNumChildren());
        assertEquals("child", root.getChild(0).getName());
    }

    @Test
    void testParseXMLInvalid() {
        String xml = "<root><child></root>";
        InputSource input = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, false, null, null));
    }

    @Test
    void testParseXMLValidWithDTD() throws SAXException, IOException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(input, true, null, null);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, root.getNumChildren());
        assertEquals("child", root.getChild(0).getName());
    }

    @Test
    void testParseXMLInvalidWithDTD() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child></root>";
        InputSource input = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, true, null, null));
    }

    @Test
    void testParseXMLValidWithSchema() throws SAXException, IOException {
        String xml = "<root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"root\"><xsd:complexType><xsd:sequence><xsd:element name=\"child\"/></xsd:sequence></xsd:complexType></xsd:element></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        Element root = XTreeUtil.parseXML(input, false, "http://www.w3.org/2001/XMLSchema", schemaInput);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, root.getNumChildren());
        assertEquals("child", root.getChild(0).getName());
    }

    @Test
    void testParseXMLInvalidWithSchema() {
        String xml = "<root><child></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"root\"><xsd:complexType><xsd:sequence><xsd:element name=\"child\"/></xsd:sequence></xsd:complexType></xsd:element></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, false, "http://www.w3.org/2001/XMLSchema", schemaInput));
    }

    @Test
    void testParseXMLValidWithDTDAndSchema() throws SAXException, IOException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"root\"><xsd:complexType><xsd:sequence><xsd:element name=\"child\"/></xsd:sequence></xsd:complexType></xsd:element></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        Element root = XTreeUtil.parseXML(input, true, "http://www.w3.org/2001/XMLSchema", schemaInput);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, root.getNumChildren());
        assertEquals("child", root.getChild(0).getName());
    }

    @Test
    void testParseXMLInvalidWithDTDAndSchema() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"root\"><xsd:complexType><xsd:sequence><xsd:element name=\"child\"/></xsd:sequence></xsd:complexType></xsd:element></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, true, "http://www.w3.org/2001/XMLSchema", schemaInput));
    }

    @Test
    void testParseXMLValidWithInvalidSchema() throws SAXException, IOException {
        String xml = "<root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"foo\"/></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, false, "http://www.w3.org/2001/XMLSchema", schemaInput));
    }

    @Test
    void testParseXMLValidWithInvalidSchemaAndDTD() throws SAXException, IOException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"foo\"/></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, true, "http://www.w3.org/2001/XMLSchema", schemaInput));
    }

    @Test
    void testParseXMLValidWithInvalidDTD() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, true, null, null));
    }

    @Test
    void testParseXMLValidWithInvalidDTDAndSchema() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><xsd:element name=\"foo\"/></xsd:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXML(input, true, "http://www.w3.org/2001/XMLSchema", schemaInput));
    }
}
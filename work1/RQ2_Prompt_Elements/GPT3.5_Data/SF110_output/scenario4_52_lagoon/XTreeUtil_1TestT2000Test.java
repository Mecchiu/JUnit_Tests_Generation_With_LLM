// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XTreeUtil}.
 * It contains ten unit test cases for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
 */
class XTreeUtil_1Test {

    @Test
    void testParseXMLSequential_noElements() throws SAXException, IOException {
        String xml = "<root/>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        Element root = XTreeUtil.parseXMLSequential(input, false, null, null, handler);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertTrue(elements.isEmpty());
    }

    @Test
    void testParseXMLSequential_oneElement() throws SAXException, IOException {
        String xml = "<root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        Element root = XTreeUtil.parseXMLSequential(input, false, null, null, handler);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, elements.size());
        assertEquals("child", elements.get(0).getName());
    }

    @Test
    void testParseXMLSequential_multipleElements() throws SAXException, IOException {
        String xml = "<root><child1/><child2/><child3/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        Element root = XTreeUtil.parseXMLSequential(input, false, null, null, handler);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(3, elements.size());
        assertEquals("child1", elements.get(0).getName());
        assertEquals("child2", elements.get(1).getName());
        assertEquals("child3", elements.get(2).getName());
    }

    @Test
    void testParseXMLSequential_nestedElements() throws SAXException, IOException {
        String xml = "<root><child1><grandchild1/><grandchild2/></child1><child2/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        Element root = XTreeUtil.parseXMLSequential(input, false, null, null, handler);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(2, elements.size());
        assertEquals("child1", elements.get(0).getName());
        assertEquals(2, elements.get(0).getNumChildren());
        assertEquals("grandchild1", elements.get(0).getChild(0).getName());
        assertEquals("grandchild2", elements.get(0).getChild(1).getName());
        assertEquals("child2", elements.get(1).getName());
    }

    @Test
    void testParseXMLSequential_withDTD() throws SAXException, IOException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        Element root = XTreeUtil.parseXMLSequential(input, true, null, null, handler);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, elements.size());
        assertEquals("child", elements.get(0).getName());
    }

    @Test
    void testParseXMLSequential_withSchema() throws SAXException, IOException {
        String xml = "<root xmlns=\"http://example.com\"><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        Element root = XTreeUtil.parseXMLSequential(input, false, "http://www.w3.org/2001/XMLSchema", schemaInput, handler);
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, elements.size());
        assertEquals("child", elements.get(0).getName());
    }

    @Test
    void testParseXMLSequential_invalidXML() {
        String xml = "<root><child/></invalid>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXMLSequential(input, false, null, null, handler));
    }

    @Test
    void testParseXMLSequential_invalidDTD() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXMLSequential(input, true, null, null, handler));
    }

    @Test
    void testParseXMLSequential_invalidSchema() {
        String xml = "<root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"invalid\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>";
        InputSource schemaInput = new InputSource(new StringReader(schema));
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        assertThrows(SAXParseException.class, () -> XTreeUtil.parseXMLSequential(input, false, "http://www.w3.org/2001/XMLSchema", schemaInput, handler));
    }

    @Test
    void testParseXMLSequential_nullInput() {
        List<Element> elements = new ArrayList<>();
        ElementHandler handler = elements::add;
        assertThrows(NullPointerException.class, () -> XTreeUtil.parseXMLSequential(null, false, null, null, handler));
    }

    @Test
    void testParseXMLSequential_nullHandler() {
        String xml = "<root><child/></root>";
        InputSource input = new InputSource(new StringReader(xml));
        assertThrows(NullPointerException.class, () -> XTreeUtil.parseXMLSequential(input, false, null, null, null));
    }
}
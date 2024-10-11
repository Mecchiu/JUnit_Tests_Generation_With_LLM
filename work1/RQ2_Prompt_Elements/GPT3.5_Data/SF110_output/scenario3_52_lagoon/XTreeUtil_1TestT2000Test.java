// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XTreeUtil}.
 * It contains ten unit test cases for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
 */
class XTreeUtil_1Test {

    @Test
    void testParseXMLSequential_noValidation() throws SAXException, IOException {
        String xml = "<root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        XTreeUtil.parseXMLSequential(inputSource, false, null, null, new ElementHandler() {
            @Override
            public void onElement(Element element) {
                elements.add(element);
            }
        });
        assertEquals(1, elements.size());
        Element root = elements.get(0);
        assertEquals("root", root.getName());
        assertEquals(2, root.getNumChildren());
        assertEquals("child1", root.getChild(0).getName());
        assertEquals("child2", root.getChild(1).getName());
    }

    @Test
    void testParseXMLSequential_withDTDValidation() throws SAXException, IOException {
        String xml = "<!DOCTYPE root SYSTEM \"root.dtd\"><root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        List<Element> elements = new ArrayList<>();
        XTreeUtil.parseXMLSequential(inputSource, true, null, null, new ElementHandler() {
            @Override
            public void onElement(Element element) {
                elements.add(element);
            }
        });
        assertEquals(1, elements.size());
        Element root = elements.get(0);
        assertEquals("root", root.getName());
        assertEquals(2, root.getNumChildren());
        assertEquals("child1", root.getChild(0).getName());
        assertEquals("child2", root.getChild(1).getName());
    }

    @Test
    void testParseXMLSequential_withSchemaValidation() throws SAXException, IOException {
        String xml = "<root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schema = new InputSource(getClass().getResourceAsStream("/root.xsd"));
        List<Element> elements = new ArrayList<>();
        XTreeUtil.parseXMLSequential(inputSource, false, "http://www.w3.org/2001/XMLSchema", schema, new ElementHandler() {
            @Override
            public void onElement(Element element) {
                elements.add(element);
            }
        });
        assertEquals(1, elements.size());
        Element root = elements.get(0);
        assertEquals("root", root.getName());
        assertEquals(2, root.getNumChildren());
        assertEquals("child1", root.getChild(0).getName());
        assertEquals("child2", root.getChild(1).getName());
    }

    @Test
    void testParseXMLSequential_withInvalidSchema() {
        String xml = "<root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schema = new InputSource(getClass().getResourceAsStream("/invalid.xsd"));
        assertThrows(SAXException.class, () -> {
            XTreeUtil.parseXMLSequential(inputSource, false, "http://www.w3.org/2001/XMLSchema", schema, new DefaultHandler());
        });
    }

    @Test
    void testParseXMLSequential_withInvalidXML() {
        String xml = "<root><child1/><child2></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> {
            XTreeUtil.parseXMLSequential(inputSource, false, null, null, new DefaultHandler());
        });
    }

    @Test
    void testParseXMLSequential_withEmptyInput() {
        String xml = "";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(SAXParseException.class, () -> {
            XTreeUtil.parseXMLSequential(inputSource, false, null, null, new DefaultHandler());
        });
    }

    @Test
    void testParseXMLSequential_withNullInput() {
        assertThrows(NullPointerException.class, () -> {
            XTreeUtil.parseXMLSequential(null, false, null, null, new DefaultHandler());
        });
    }

    @Test
    void testParseXMLSequential_withNullHandler() {
        String xml = "<root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        assertThrows(NullPointerException.class, () -> {
            XTreeUtil.parseXMLSequential(inputSource, false, null, null, null);
        });
    }

    @Test
    void testParseXMLSequential_withInvalidSchemaType() {
        String xml = "<root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schema = new InputSource(getClass().getResourceAsStream("/root.xsd"));
        assertThrows(IllegalArgumentException.class, () -> {
            XTreeUtil.parseXMLSequential(inputSource, false, "invalidSchemaType", schema, new DefaultHandler());
        });
    }

    @Test
    void testParseXMLSequential_withInvalidSchemaURL() {
        String xml = "<root><child1/><child2/></root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        InputSource schema = new InputSource(getClass().getResourceAsStream("/invalid.xsd"));
        assertThrows(IOException.class, () -> {
            XTreeUtil.parseXMLSequential(inputSource, false, "http://www.w3.org/2001/XMLSchema", schema, new DefaultHandler());
        });
    }
}
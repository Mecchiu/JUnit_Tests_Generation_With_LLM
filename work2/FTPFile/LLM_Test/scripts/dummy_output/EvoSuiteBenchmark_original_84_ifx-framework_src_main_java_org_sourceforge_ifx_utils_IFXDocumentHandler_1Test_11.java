// IFXDocumentHandler_1Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_1Test {
		private static final String BASE = "org/sourceforge/ifx/utils/IFXTestFolder";

    @Test
    public void test_parse_null_IFXObject() throws Exception {
        InputStream istream = getClass().getResourceAsStream("/no-input.doc");
        Document doc = build(null, null, null);
        IFXObject obj = parse(doc);
        assertEquals("Invalid object in null", null, obj);

    }

    @Test
    public void test_parse_IFXObject() throws Exception {
        InputStream istream = getClass().getResourceAsStream("/my-input.doc");
        Document doc = build(new IFXObject("myInput"), null, null);
        IFXObject obj = parse(doc);
        assertNotNull("IFXObject was null", obj);

    }

    @Test
    public void test_parse_IFXObject_XMLOutput() throws Exception {
        InputStream istream = getClass().getResourceAsStream("/my-input.xml");
        Document doc = build(new IFXObject("myInput"), null, null);
        IFXObject obj = parse(doc);
        assertNotNull("IFXObject was null", obj);
        assertEquals("Invalid Document type", Document.class, obj.getClass());
        assertEquals("Invalid element name", Element.class, obj.getClass());
        assertEquals("Invalid element namespace", Namespace.class, obj.getClass());
        XMLOutputter xml = new XMLOutputter();
        obj = (IFXObject) xml.output(obj, new OutputStream() {
        });
    }

    @Test
    public void test_parse_IFXObject_xmlOutput() throws Exception {
        InputStream istream = getClass().getResourceAsStream("/my-input.xml");
        Document doc = build(new IFXObject("myInput"), null, null);
        IFXObject obj = parse(doc);
        assertNotNull("IFXObject was null", obj);

    }

    @Test
    public void test_build_null_IFXObject() throws Exception {
        InputStream istream = getClass().getResourceAsStream("/no-input.doc");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = null;
        try {
            doc = builder.parse(istream);
        }
        catch (IOException e) {
            fail("Could not create document");
        }
        assertNotNull("Document was null", doc);
        try {
            DocumentBuilder parentBuilder =
                DocumentBuilderFactory.newInstance().newDocumentBuilder();
            DocumentBuilderError err = null;
            Document doc = parentBuilder.newDocument();
            err = doc.getDocumentElement().getErrorElement();
            assertNull("Error Element with null value", err);
        }
        catch (org.jdom.ParserConfigurationException e) {
            fail("Parser configuration error");
        }
        catch (org.jdom.InvalidSchemaException e) {
            fail("Invalid schema");
        }
        try {
            Document doc = new Document();
            fail("Document instance was null");
        }
        catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
        try {
            Document doc = build(null);
            fail("Document was not built");
        }
        catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
        try {
            Document doc = build(new IFXObject("myInput"));
            fail("Document was not built");
        }
        catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
        try {
            Document doc = build(new IFXObject("myInput"), null, null);
        }
        catch (Exception e) {
        }
    }
}
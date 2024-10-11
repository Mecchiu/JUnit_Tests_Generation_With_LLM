// IFXDocumentHandler_2Test.java
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
* It contains one unit test case for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {
		
    @Test
    public void test_read_read() throws IOException {
        InputStream istream = new BufferedInputStream(new FileInputStream("somerandomfilename.xml"));
        Document doc = read(istream, true, null);
        Document expectedDoc = read(new BufferedInputStream( new FileInputStream("somerandomfilename.xml")), true, null);
        assertEquals(expectedDoc, doc);
    }

    @Test
    public void test_parse_create_element() throws IOException,
            SAXException {
        InputStream istream = new BufferedInputStream(new FileInputStream("somerandomfilename.xml"));
        Document doc = build(istream, null, null);

        // get element name (should be "d:" from "ns:")
        assertEquals(doc.getRootElement().getName(), "d:document1");

        // get element namespaces (can use null) - can't test for namespace otherwise
        assertNotNull(doc.getRootElement().getNamespace("ns1"));
        assertNotNull(doc.getRootElement().getNamespace("ns2"));
        assertEquals("http://somewhere", doc.getRootElement().getNamespace("ns3"));

        Element docElement =
                (Element)doc.getRootElement().getContent();
        assertEquals(doc.getRootElement().getChildCount(), 1);

        assertEquals("Document1", docElement.getName());
    }

    @Test
    public void test_parse_create_namespace() throws IOException, SAXException {
        InputStream istream = new BufferedInputStream(new FileInputStream("somerandomfilename.xml"));
        Document doc = build(istream, "", Namespace.getNamespace("ns1"));

        // get namespace from document (can't use this, since doc contains one namespace)
        assertEquals(doc.getRootElement().getNamespace("ns1"), "ns1");
        
        // get namespace from "ns1:document1" (namespace is empty)
        String docNamespace = doc.getRootElement().getNamespace("document1").getNamespaceURI();
        assertEquals(Namespace.NULL, docNamespace);
    }

    @Test
    public void test_write_ns_to_stream() throws IOException {
        InputStream istream = new BufferedInputStream(new FileInputStream("somerandomfilename.xml"));
        
        Document doc = build(istream, null, null);
        
        Document expectedDoc = build(new BufferedInputStream( new FileInputStream("somerandomfilename.xml")), true, null);
        
        write(doc, null, null);
        
        Document readDoc = read(new BufferedInputStream( new FileInputStream("somerandomfilename.xml")), true, null);
        assertEquals(expectedDoc, readDoc);
    }

    @Test
    public void test_write_ns_to_stream_fail() throws IOException {    
        Document doc = build(null, "", null);
        write(doc, null, null);
    }

    @Test
    public void test_write_ns_to_stream_fail_with_namespace() throws IOException {
        Document doc = build(null, "ns1:document1", Namespace.getNamespace("ns1"));
        write(doc, null, Namespace.getNamespace("ns3"));
    }

    @Test
    public void test_write_ns_to_stream_fail_without_namespace() throws IOException {
        Document doc = build(null, "ns1:document1", null);
        write(doc, null, null);
    }

    @Test
    public void test_write_content_to_streams() throws IOException {
        InputStream istream = new BufferedInputStream(new FileInputStream("somerandomfilename.xml"));
        
        Document doc = build(istream, "", null);
        
        Document expectedDoc = build(new BufferedInputStream( new FileInputStream("somerandomfilename.xml")), true, null);
}
}
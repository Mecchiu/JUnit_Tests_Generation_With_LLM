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
private Parser pars;
    private Document out;
    private void Parse(String doc) throws IOException {
        Document doc2 = parser.parse(doc);
    }

    @Test
    void test1() throws IOException,
               Exception {
        XMLOutputter xmlOutput = new XMLExportToDOM().sax(getClass().getResourceAsStream("IFXDocumentHandler_1Test.doc"));
        xmlOutput.setIndenting(true);
        assertTrue(xmlOutput.toString().contains("Version"));
        Element element = (Element) xmlOutput.getRootElement().getChild("IFXObject");
        assertNotNull(element);
        assertNotNull(element.getName());
        assertNotNull(element.getNamespace());
        assertEquals("1.0", element.getValue().trim());
        out = xmlOutput.toOutputStream();
        in = new InputStream() {
            public int read() throws IOException {
                return 0;
            }
            public int read(byte[] b, int off, int len)
            throws IOException {
              return 0;
            }
        };
    }

	@Test
    void test2() throws IOException,
               Exception {
        InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_1Test.doc");
        Map<String,  IFXObject.ObjectType> types = IFXObject.ObjectType.getTypes();
        Parser parser = ParserFactory.getParser(types);
        Document document = parser.parse(inputStream);

        out = XMLOutputter.getDefaultFormat().setIndenting(true).
           setStandalone(false).
           createPrettyPrintedTree(document);
        in = new InputStream() {
            public int read() throws IOException {

            	return 0;
            }
            public int read(byte[] b, int off, int len)
            throws IOException {
              return 0;
            }

        };
    }

    @Test
    void test3() throws IOException,
               Exception {
        InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_1Test.doc");
        Document document = parser.parse(inputStream);
        out = parser.getDocumentHandler(parse(document).getDocument());// Parses document into a document object
        in = new InputStream() {
            public int read() throws IOException {

            	return 0;
            }
            public int read(byte[] b, int off, int len)
            throws IOException {
              return 0;
            }

        };
    }

    @Test
    void test4() throws IOException,
               Exception {
        Element element = out.getRootElement();
        Iterator iterator = element.getContent().iterator();
        while (iterator.hasNext()) {
            String s = ElementHelper.toString(element.getContent());
            System.out.println("<"+s+">");
        }
        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build(new InputStream() {
                public int read() throws IOException {
                    return 0;
                }
                public int read(byte[] b, int off, int len)
                throws IOException {
                    return 0;
                }

            });
       out = parser.getDocumentHandler(document);// Parses document into a document object
        in = new InputStream() {
            public int read() throws IOException {

            	return 0;
            }
            public int read(byte[] b, int off, int len)
            throws IOException {
              return 0;
            }
        };
       assertNotNull(out.getContent());
       }

}

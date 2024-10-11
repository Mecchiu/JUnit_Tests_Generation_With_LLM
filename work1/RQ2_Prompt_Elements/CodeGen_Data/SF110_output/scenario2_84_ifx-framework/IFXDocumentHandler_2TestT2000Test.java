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
// IFXDocumentHandler.java
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

/**
 * The IFXDocumentHandler provides methods for formatting and validating
 * IFX XML Documents.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.2 $
 */
public class IFXDocumentHandler {

    /**
     * Reads an XML stream from the specified InputStream and returns a
     * JDOM Document object. If validation is requested, then the XML is
     * validated while reading it into a Document.
     *
     * @param istream the InputStream to read from.
     * @param validate XML is validated against schema if true.
     * @param validationProperties a Map of name value pairs specifying
     * the schema and the namespaces to validate against.
     * @exception IFXExveption if there was a problem reading the document.
     */
    public static Document read(InputStream istream, boolean validate, Map validationProperties) throws IFXException {
        SAXBuilder builder = null;
        if (validate) {
            builder = new SAXBuilder("org.apache.xerces.parsers.SAXParser", true);
            builder.setFeature("http://apache.org/xml/features/validation/schema", true);
            if (validationProperties!= null) {
                Iterator propIter = validationProperties.keySet().iterator();
                StringBuffer buf = new StringBuffer();
                int i = 0;
                while (propIter.hasNext()) {
                    String key = (String) propIter.next();
                    String value = (String) validationProperties.get(key);
                    if (i > 0) {
                        buf.append(" ");
                    }
                    buf.append(key).append(" ").append(value);
                    i++;
                }
                builder.setProperty("http://apache.org/xml/properties/schema/external-schemaLocation", buf.toString());
            }
        } else {
            builder = new SAXBuilder();
        }
        Document doc = null;
        try {
            doc = builder.build(istream);
        } catch (Exception e) {
            throw new IFXException("Error reading Document", e);
        }
        return doc;
    }
}

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
		
    /**
     * Test method for {@link IFXDocumentHandler#read(InputStream, boolean, Map)}.
     * @throws MalformedInputException throws if the XML is invalid.
     */
    @Test
    public void testRead_2() throws MalformedInputException {

        // Create a new document builder
        final Document doc = new Document();
        try {
            // Create an XMLStreamReader using a Reader
            final InputStream istream = new InputStream() {

                public int read() throws IOException {
                    return -1;
                }
                public int read(byte[] b, int offset, int len) throws IOException {
                    return -1;
                }
                public void close() throws IOException {
                    
                }
            };

                SAXBuilder builder = null;
                if ( istream instanceof SAXBuilder ) {
                    try {
                        builder = (SAXBuilder) istream;
                    } catch (Exception ex) {
                        throw new RuntimeException("Cannot create the document using input stream", ex);
                    }

                } else if ( istream instanceof InputStream ) {
                    try {
                        builder = new SAXBuilder();
                    } catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                
                final Document doc = builder.build(new InputStreamReader(istream));
            }
            
            // Save the document
            final OutputStream ostream = new OutputStream() {

                public void write(byte[] b, int off, int len) throws IOException {
                    
                }
                public void write(int b) throws IOException {
                    
                }
                            
            };
            XMLOutputter outputter = new XMLOutputter(true);
            doc.setRootElement( new Element("root"));

            // Create a document in which the Document is the root element
            Document doc1 = doc;

            // Create a Element
            Element el = new Element("p");
            el.setAttribute("foobar", "fooValue");
            el.setAttribute("nfoobar", "foobarValue");
            el.setAttribute("bazd", "bazValue");
            el.setAttribute("name", "foobar2");

            // Save the document
            ostream.write(doc.getAsString().getBytes("UTF-8"));
            // Verify the serialized Document against the original document
            outputter.output(doc1);
            Document doc2 = (Document) outputter.output();
            checkSerializedAttributes(doc);

            // Create a Document
            Document doc3 = null;
            try {
                // Create a Document without root element
                doc3 = new Document();

            } catch(Exception ex2) {
                throw new RuntimeException(ex2);
            }

            // Create the Element in the Document after serialization of the Document without root element
            el = doc.getRootElement().addElement("par");

            // Save the Document
            ostream.write(doc3.asXML().getBytes("UTF-8"));

            // Verify the serialized Document against the original document
            outputter.output(doc3);

            // Verify the serialized Document against the original document
            try {
                Document doc4 = (Document) outputter.output();
                assertTrue(true);
            } catch(Exception ex4) {
                ex4.printStackTrace();
                assertFalse(true);
            }

        } catch(Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Verify that serialized attributes are in alphabetical order.
     */
    @Test
    public void checkSerializedAttributes( Document document ) {
        Iterator it1 = document.getRootElement().getChildren().iterator();
        while ( it1.hasNext() ) {
            Element el = (Element) it1.next();
            Iterator it2 = el.getChildren().iterator();
            while ( it2.hasNext() ) {
                Element e = (Element) it2.next();
                String name = e.getName();
                String value = e.getBaseVal();
                String n = e.getNamespaceURI();
                assertTrue("Name not in alphabetical order", name.compareTo(n) < 0);
                assertTrue("Value wrong", value.compareTo(n) < 0);
            }
        }
    }
}

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
		* Tests that the method will read from inputStream a document.
		* It is supposed to be a case where the input stream has no closing
		* tag.
		*/
		@Test
		public void testNoInputStream() throws UnsupportedEncodingException {
			// The input stream should only accept text, comments and
			// CDATA lines.
			InputStream istream = null;
			SAXBuilder builder = new SAXBuilder();
			try {
				istream = newInputStream(istream(""));	
				Document document = builder.build(istream);
			} finally {
				if (istream!= null) {
					istream.close();
				}
			}

			Document document = builder.getDocument();
			
			IFXObject object = new Parser(document).parseFile();

			assertTrue(object.isElement());
			Element element = (Element) object;
			assertTrue(element.getName().equals("ifx:document"));
			
		}


		/**
		* Test method for
		* {@link IFXDocumentHandler#read(InputStream, boolean, Map)}.
		*/
		@Test
		public void testStreamInputStreamWithValidation() throws UnsupportedEncodingException {
    InputStream istream = null;
    SAXBuilder builder = new SAXBuilder();
    try {
      istream = newInputStream(istream(""));	
    } finally {
      if (istream!= null) {
        istream.close();
      }
    }

    Document document = builder.build(istream);

    IFXObject object = new Parser(document).parseFile();
    assertTrue(object.isElement());
            
    assertTrue(object.getValidationProperties().size() > 0);
            
        Map.Entry entry;
        Object key;
        Iterator iter;

        element = (Element) object;
        assertTrue(element.getName().equals("ifx:document"));
        Namespace ns = Namespace.getNamespace("", "http://sourceforge.net/IFXM/IFXDocument");
        assertNotNull(ns);
        nameSpace = ns;
        Iterator<?> iterators = entry.getValue().iterator();
        assertNotNull(iterators);
        assertTrue(iterators.hasNext());
        key = getChild(iterators.next(), "ifx:version", null, true);
        assertNotNull(key);
        assertEquals("2.0", getChild(entry.getValue(), "ifx:version", key, true));

        entry = iterators.next();
        assertNotNull(iterators.next());
        assertEquals(Namespace.XML, getChild(entry.getValue(), "ifx:namespace", null, true));
        assertEquals(ns, getChild(entry.getValue(), "ifx:namespace", entry.getKey(), true));
        assertEquals(key, getChild(entry.getValue(), "ifx:namespace", entry.getKey(), false));

        iterator = entry.getValue().iterator();

        assertNotNull("No IFOXObjects", iterator);

        object = (IFXObject) iterator.next();
        assertNotNull(object);
//      System.out.println("IFXObjects");
//      System.out.println(object.describe());
        assertEquals("IFXException", object.getValidationProperties().get("invalid"));
        assertTrue(!object.getValidationProperties().get("validation"));

                }

}
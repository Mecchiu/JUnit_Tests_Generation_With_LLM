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
/**
		 * Test the <code>parse()</code> method.
		 *
		 * @throws IOException if I/O error occurred.
		 */
	@Test
    public void test1Parse() throws IOException {
        XMLOutputter out = new XMLOutputter();
        OutputStream outStream = null;
        try {
            out.setProperty("jdom.topLevelTag", "doc");
            SAXBuilder builder = new SAXBuilder();
            Document document = new Document(builder.build(new InputStreamReader(IFXDocumentHandler.class.getResourceAsStream("IFXDocumentHandler_1.xml"), "UTF-8")));
            outStream = document.getRootElement().newOutputStream();
            new XMLOutputter().output(document, out);
            Document actualDocument = XMLOutputter.createDocument();
            try {
                XMLOutputter.output(actualDocument, outStream);
            } finally {
                outStream.close();
            }
            assertTrue("IFXDocumentHandlers don't always return valid XML", actualDocument.getRootElement().isValid());
        } finally {
            outStream.close();
        }
    }
}

// IFXDocumentHandlerTest.java

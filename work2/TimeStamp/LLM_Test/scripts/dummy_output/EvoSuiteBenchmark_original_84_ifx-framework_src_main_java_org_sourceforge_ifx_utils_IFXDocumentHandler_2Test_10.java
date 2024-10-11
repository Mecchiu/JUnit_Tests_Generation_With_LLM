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
		 * Constructor Testing {@link IFXDocumentHandler#read(InputStream, boolean, Map)}
		 * with a null parameter and with no validation.
		* @throws IFXException if any problems were encountered in testing.
		*/
	@Test
	public void readTest() throws IFXException {
		IFXDocumentHandler handler = new IFXDocumentHandler();

		// Reads an XML stream from the input stream, validates the document,
		// and validates the result by collecting validators.
		if (handler.validateStream(null, true, false)) {
	       assertFalse(handler.read(null, true, null));
	    }
	}

		/**
		 * Constructor Testing {@link IFXDocumentHandler#read(InputStream, boolean, Map)}
		 * with a null parameter and with no validation.
		* @throws IFXException if any problems were encountered in testing.
		*/
	@Test
	public void readTest2() throws IFXException {
		IFXDocumentHandler handler = new IFXDocumentHandler();

		// Reads an XML stream, validates the document,
		// and validates the result by collecting validators.
		handler.validateStream("", true, false);
	}


		/**
		 * Constructor Testing {@link IFXDocumentHandler#read(InputStream, boolean, Map)}
		 * with a null parameter and with no validation.
		* @param namespacePrefix the name of the prefix to use in the default namespace.
		 * @param indentSize the indentation size in indentation spaces.
		 * @param lineSeparator a line separator that is used to separate each lines.
		 * @throws IFXException if any problems were encountered in testing.
		*/
	@Test
	public void readTest3() throws IFXException {
		IFXDocumentHandler handler = new IFXDocumentHandler();

                // Reads an XML stream using a null parameter,
                // and reads the input stream, validates the document,
                // and validates the result by collecting validators.
		if (!handler.read(null, true, null)) {
	    assertFalse(handler.read(null, true, null));
            }
	}

		/**
		 * Constructor Testing {@link IFXDocumentHandler#xmlObjectRead(String,String, Document)}
		 * with a null parameter.
		 * @throws IFXException if any problems were encountered in testing.
		*/
	@Test
	public void xmlObjectReadTest() throws IFXException {

                        IFXObject obj;
                        Document doc;
		try {
			// Reads an XML stream using the null parameter
			obj = handler.xmlObjectRead("", "", new Document());
			assertFalse(obj.getIFXObjectWrapper().isObjectValid());
			assertTrue(obj.getValidators().isEmpty());
		} catch (NullPointerException e) {
			fail();
		}
	}

        /**
         * Constructor Testing {@link IFXDocumentHandler#xmlObjectRead(IFXObject,IFXObject, Document)}
         * with both a null parameter and a document.
         * @throws IFXException if any problems were encountered in testing.
         */
	@Test
	public void xmlObjectReadTest2() throws IFXException {
        try {
                // Reads an XML stream using the null parameter with a document
                obj = handler.xmlObjectRead(null, null, new Document());
                assertFalse(obj.getIFXObjectWrapper().isObjectValid());
                assertTrue(obj.getValidators().isEmpty());

	    } catch(NullPointerException e) {
	    fail();
	}

	}

		/**
		 * Constructor Testing {@link IFXDocumentHandler#getDocument(Document)}
		 *
         * @param doc a JDom document.
         */
	@Test
	public void getDocumentTest(Document doc) {
                IFXObject obj = null;
                boolean error = false;
                Iterator<IFXObject> it = null;
                IFXObject expected = null;
                Iterator<IFXObject> ite = null;

}
}
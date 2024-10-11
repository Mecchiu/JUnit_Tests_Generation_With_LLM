// IFXDocumentHandler_0Test.java
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
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
		private IFXDocumentHandler handler;
		private Document doc;
  	
		/**
		 * Set up test case for build() method.
		 * @throws IOException if an I/O operation throws this error.
		*/
		IFXDocumentHandler_0Test() throws IOException {
			SAXBuilder builder = new SAXBuilder();
  		input = System.in;
  		output = System.out;

			String[] namespaces = { "xml.ns.0" };
  		handler = new IFXDocumentHandler(namespaces, output, input);
    	doc = handler.build(new IFXObject(), "", "");
  	}

		/**
  		Tests parsing.
  		@throws IFXException if parsing fails.
  		@throws InvalidObjectException if the parsed document is invalid.
  		*/
		@Test
    	public void testParsing() throws IFXException, InvalidObjectException {
  		System.out.println("Test if using default line separator and default line " +
  				"separator in the output.");

			assertTrue("There was a problem parsing documents.", doc instanceof Document);

  		assertEquals("There was a validator.", true, new IFXDecoder(doc).validate());

  		saveParsedDocument("", "", doc.getRootElement().getName());

  		assertTrue("Invalid document was parsed", doc.getRootElement().isEmpty());

  		assertEquals("Invalid document was parsed.", true, new IFXDecoder(doc, doc.createInputSource(), true).validate());

  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());

  		assertRaise("Invalid document was parsed.", doc.getRootElement(), new Document(doc.getRootElement()));

				// check for invalidation of documents:
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  		saveParsedDocument("", "", doc.getRootElement().getName());
  	}


		/**
  		Saves the parsed document back out of a document and its root element.
  		@param outParseFilename The name of the output file.
  		@param xmlString The XML Document String that the document should
  		  	be parsed to.
  		@param rootElementName The name of the root element.
  		@exception IFXExveption if there was an error parsing the document.
  		*/
    	private void saveParsedDocument(String outParseFilename, String xmlString, String rootElementName) throws IFXException, IOException {
    		Namespace ns = null;
  		OutputStream out = null;
  		InputStream in = null;

    		// save a new document, containing the parsed document
  		if (out!= null) {
    			out.flush();
    			out.close();
    		}

  		if (xmlString == null || xmlString.trim().length() == 0) {
  			throw ifXEx(0, IFXEx.ERROR_WRONG_PARSING);
  		}

  		if (doc instanceof Document)
  			out = System.out;
  		else {
  			out = System.out;
  			doc = new Document(xmlString);
  			doc.getRootElement().setName(rootElementName);
  		}
}
}
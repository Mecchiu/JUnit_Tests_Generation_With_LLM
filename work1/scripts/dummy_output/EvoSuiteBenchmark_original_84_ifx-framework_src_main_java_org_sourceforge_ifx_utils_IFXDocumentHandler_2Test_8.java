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
		 * The test XML document.
		 */
		private Document testdoc = null;

		/**
		 * Constructor test for class
		 * Creation date &  time.
		 * @throws Exception exception
		 */
		public IFXDocumentHandler_2Test() throws Exception
		{
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				dbf.setValidating(true);
				dbf.setNamespaceAware(false);
	            dbf.setIgnoringComments(false);
	            dbf.setIgnoringElementContentWhitespace(false);
	            dbf.setExpandEntityReferences(true);
	            dbf.setXIncludeAware(false);
	            dbf.setXIncludeDecls(true);
	            dbf.setXIncludeDefault(false);
	            dbf.setXIncludeRuntime(false);
				// set the default indentation to 4.
				dbf.setIndentation("4");
				// set the default line.separator to the system property.
				// value depends on the operating system.
				try {
					System.setProperty("line.separator", DEFAULT_LINE_SEPARATOR);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				// set the default line.separator to the system property.
				// value depends on the operating system.
				try {
					System.setProperty("line.separator", DEFAULT_LINE_SEPARATOR);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
		}

		/****************************************************************************
             * DOCUMENT METHODS
			 *
			 ****************************************************************************/

		/**
		 * Tries to set the test xml on the Document object given. This method
		 * does not attempt any validation for the Document.
		 *
		 * @param doc Document object to modify
		 * @param xmlDoc the string representation of the test document
		 * @throws IFXException if there was a problem modifying the Document.
		 */
		public void setTestxml(Document doc, String xmlDoc) throws IFXException {
				try {
					testdoc = doc;
				} catch (Exception ex) {
					ex.printStackTrace();
					throw new IFXException("Test XML Document failed to be modified.");
				}
			}

		/**
		 * Tries to parse the test XML string. This method does not attempt
		 * any validation for the Document.
		 *
		 * @return a parsed Document instance.
		 * @exception IFXException if there was a problem parsing the Document.
		 */
		public Document parseTestxml() throws IFXException {
				try {
					return testdoc.getRootElement().setText("");
				} catch (Exception ex) {
					ex.printStackTrace();
					throw new IFXException("testxml parsing failed.");
				}
		}

    /**
     * Writes a Document object as a JDOM Document object.
     *
     * @params doc the JDOM Document object to write.
     * @exception IFXException if any problems were encountered in writing the Document.
     */
    public void writeJDOMDocument(Document doc) throws IFXException {
        SAXBuilder sb = new SAXBuilder();
        OutputStream fileout = null;
        try {
            String xml = XMLOutputter.outputString(this.testdoc);
            fileout = new OutputStream() {
                public void write(int c) throws IOException {}
            };
            sb.setOutput(fileout);
            sb.build(new InputSource(xml));
        } finally {
            IFFXObject.close(fileout);
        }
    }

    /****************************************************************************
     * TEST METHODS DEFINITIONS
     ****************************************************************************/

    /**
     * Basic test case.
     * @exception IFXException if problems arise.
     */
    @Test
    public void basicTest() throws IFXException {
}
}
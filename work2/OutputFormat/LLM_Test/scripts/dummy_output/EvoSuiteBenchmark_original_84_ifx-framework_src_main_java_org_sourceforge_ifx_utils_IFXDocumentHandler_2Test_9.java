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
	 * Test cases from:
		   - <br><a href="http://developer.sun.com/developer/ide/docs/manual/jdom/src/IFXDocumentHandler.doc.html">IFXDocumentHandler.doc</a>
	 * @throws java.io.IOException is thrown if an I/O error occurs
	 * @throws java.lang.Throwable is thrown if an undeclared error occurs
	 */
	@Test
    public void testUnaryOperations1() throws IOException {
    	// Test cases from:
		// - IFXObject.copyToDOM(src, target)
		// - IFXObject.copyToXMSPBF(src, target)
		// - IFXDocumentXMLSAXBuilder.createDocument()
		// - Document/XMLReader/XMLStreamReader/SAXBuilder/SAXNotifier/SAXBuilderFactory
		// - IFXDocumentHandler.getRoot()
		// - IFXDocumentHandler.getParentElement()
		// - IFXDocumentHandler.getNamespace()
		// - IFXDocumentHandler.getNamespacePrefix()
    	// create a test Document with an XMLLittle XML fragment
    	IFXDocument doc1 = null;
        OutputStream ostream1 = null;
        Document doc2;
        Document out2;
}
}
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
		/**
		 * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#build(IFXObject,String,String)}.
		 * @throws IFXException if an error occurred during parsing of document.
		 */
		@Test
		public void testBuild() throws IFXException {
			Document doc1;
			Document doc2;
			doc1 = build(new TestObject(), "rootns", "IFX");
			doc2 = build(new TestObject(), "rootns", "IFX");
			assertEquals("NILayoutElement", doc1.getRootElement().getName());
	}

		/**
		 * Method to test the implementation of IFXDocumentHandler.build()
		 * given the name of the namespace prefix and a Document.
		 */
		private static class TestObject implements IFXObject {
		private Map namespaceMap = new TestNamespaceMap();

		/**
		 * Add a namespace mapping to this document.
		 * Nodes without namespaces will be assigned a default namespace.
		 * @param prefix the namespace's prefix (as a String).
		 * @param uri the namespace's URI (as a string).
		 */
		public void setNamespaceMapping(String prefix, String uri) {
		this.namespaceMap.put(prefix, uri);
		}

	    
		/**
		 * @see org.sourceforge.ifx.basetypes.IFXObject#write(org.jdom.output.OutputStream, java.util.Map)
		 */
//		public void write(OutputStream out, Map map) throws IOException {
//			XMLOutputter xmlOut = new XMLOutputter();

	    	XMLOutputter xmlOut = new XMLOutputter();
}
}
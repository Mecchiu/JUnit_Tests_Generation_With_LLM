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
	 * Unit test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	 * @throws java.io.IOException a thrown by the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	 */
	@Test
	void testReadToStream_B() throws IOException {
		IFXObject obj = new IFXBasicObject();
		assertNotNull("Called getChild with 0", obj.getChild(0));
		InputStream istream = null;
		try {
			istream = new InputStream() {
				@Override
				public int read() throws IOException {
					return 0;
				}
			};
			Document doc = build(obj, null, null);
			IFXObject decodedObject =IFXDocumentHandler.read(istream, true, null);
			assertNotNull("Called getChild with null", decodedObject.getChild(0));
			decodedObject.validate(doc, schema, validationProperties);
		}
		finally {
			if (istream!= null) {
				istream.close();
			}
		}
	}

	/**
	 * Unit test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	 * @throws java.io.IOException a thrown by the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	 */
	@Test
	void testReadToOutputStream_B() throws IOException {
		IIFProperties.logger.info("[IFXDocumentHandler_2Test] Starting unit test for read()");
		StringBuilder builder = new StringBuilder();
		IFXObject obj = new IFXBasicObject();
		assertNotNull("Called getChild with 0", obj.getChild(0));
		InputStream istream = null;
}
}
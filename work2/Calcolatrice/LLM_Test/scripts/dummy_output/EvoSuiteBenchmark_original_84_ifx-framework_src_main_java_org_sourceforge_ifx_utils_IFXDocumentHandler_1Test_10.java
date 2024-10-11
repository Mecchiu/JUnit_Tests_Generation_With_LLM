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
		
	@Test
	public void testParse() throws Exception {
		
		Document doc = build(new IFXObject(), null, null);
		assertEquals(IFXObject.NAMESPACE_XML, doc.getNamespace(0));
		
		// validate the output
		SAXBuilder builder = new SAXBuilder();
		Document out = builder.build(getClass().getResourceAsStream("/validation.xml"));
		parse(out);
		assertEquals(IFXObject.NAMESPACE_METS, doc.getNamespace(0));
		
		// validate the output
		XMLOutputter xml = new XMLOutputter();
		xml.output(out, new OutputStream() {
			public void write(byte[] b, int off, int len) throws IOException {
				fail("write() should not be called on an input stream.");
			}
		});
	}

}
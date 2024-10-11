// IFXDocumentHandlerTest.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandlerTest {
		
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the case when the document is null.
	*/
	@Test
	public void testParse_NullDocument() throws IFXException {
		IFXObject ifxObject = IFXDocumentHandler.parse(null);
		assertNull(ifxObject);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the case when the document is not null.
	*/
	@Test
	public void testParse_NotNullDocument() throws IFXException {
		IFXObject ifxObject = IFXDocumentHandler.parse(new Document());
		assertNotNull(ifxObject);
	}
}
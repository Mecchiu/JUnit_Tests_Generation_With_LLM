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
	void parse_Valid() throws IFXException{
		System.out.println("\nTEST PASSED!");
		Document doc = null;
		IOException exc = null;
		InputStream istream = null;

		if(validate) {
			istream = new CountingInputStream(new CountingInputStream((InputStream)IFXDocumentHandler_1Test.this.parse(doc)));
		} else {
			istream = IFXDocumentHandler_1Test.this.parse(doc);
		}

		try {
			while(istream.available() > 0) {
				doc = build(doc, IFXDocumentHandler.NAMESPACE_PREFIX, IFXDocumentHandler.NAMESPACE_URI);
				assertNotNull(doc);

				Element element = (Element) doc.getRootElement();
				assertNotNull(element);
				System.out.println("element is: " + element);
				NSContext nsContext = NSContext.create(element, IFXDocumentHandler.NAMESPACE_PREFIX);
				assertNotNull(nsContext);

				System.out.println();
				System.out.println("Element element is: " + element);

				NSContext nsContext2 = NSContext.create(element, IFXDocumentHandler.NAMESPACE_PREFIX);
				assertNotNull(nsContext2);

				Element child = element.getChild(element.getChildCount() - 1, 0);
				assertNotNull("Missing child element for first element: ", child);

				IFXObject element_1 = (IFXObject)nsContext.lookup(element, "element(1)");
				assertNotNull(element_1);
				System.out.println("element_1: " + element_1);

				Element element2 = (Element)nsContext2.lookup(element_1, "element(1)");
				assertNotNull("Missing element 2 (Element(2) element)", element2);

				IFXObject element2_1 = (IFXObject)nsContext2.lookup(element2, "element(1)");
				assertNotNull(element2_1);
				System.out.println("element2_1: " + element2_1);
			}
		} catch (SAXException | IOException t) {
			throw new IFXException("Exception during parsing.", t);
		} finally {
			if(istream!= null) {
				try { istream.close(); } catch(IOException t) {}}
			if (exc!= null) {
				throw exc;
			}
		}
	}

	@Test
	void parse_Invalid() throws IFXException{
		System.out.println("\nTEST FAILED!");
		Document doc = null;
		IOException err = null;
		InputStream istream = null;

		istream = new CountingInputStream((InputStream)IFXDocumentHandler_1Test.this.parse(doc));
}
}
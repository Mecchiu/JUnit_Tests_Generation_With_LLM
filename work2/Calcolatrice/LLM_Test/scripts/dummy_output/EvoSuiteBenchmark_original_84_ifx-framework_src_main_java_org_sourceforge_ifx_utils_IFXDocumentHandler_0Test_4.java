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
		private static final String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<!DOCTYPE IFX SYSTEM \"../ifx-core.dtd\">\n" +
				"<IFX xmlns=\"http://xml.apache.org/IFX\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://xml.apache.org/IFX/IFX-1_1.dtd IFXDocumentHandler.dtd\">\n" +
				"<!--\n" +
				"<!------------------------------------------------------------------------------------------>\n" +
				"<IFXElement id=\"ifxElement\"/>\n" +
				"<IFXDocument xmlns=\"http://xml.apache.org/IFX\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://xml.apache.org/IFX/IFX-1_1.dtd IFXDocumentHandler.dtd\">\n"
		;
		private static final String IFX = "<IFX><IFX Element='ifxElement'></IFX>";

        @Test
		public void TestConstructor() {
			//Test that a Document can be built of the standard IFX document as is.
			Document doc;
			doc = build(new IFXObject(new StringBuilder(XML)),null,null);
			System.out.println("\nXML:\n" + doc.getDocumentElement().getText());
			assertNotNull("Document can be built of standard XML.",doc);
		}

		@Test
		public void TestValidate() {
			//Test whether a valid doc can be built.
			Document doc;
			doc = build(new IFXObject(new StringBuilder(XML)),null,null);
			doValidate(doc);
		}

		@Test
		public void TestBuild() {
			Document doc = build(new IFXObject(new StringBuilder(XML)),null,null);
			assertEquals("Document with the standard XML was not valid.",XML,doc.getDocumentElement().getText());
		}

		@Test
		public void TestDecode() throws Exception {
			Document docFromFile = load("IFXDocumentHandler_0Test-decode.xml", null);
			Document docWithError = load("IFXDocumentHandler_0Test-bad.xml", null);
			assertNotNull("Document should not be null.",docFromFile);
			assertNotNull("Document should not be null.",docWithError);
			doDecode(docFromFile, docWithError);
			assertEquals("Document should have changed.",docFromFile,docWithError);
		}

		private static void doValidate(Document doc) throws Exception {
			Document expectedDoc = validate(doc);
			if (!doc.getNamespace().equals(expectedDoc.getNamespace())) {
				fail("Namespace change violated - did not expect namespacing " + doc.getNamespace() + ", but did expect: " + expectedDoc.getNamespace());
			}
			Element expectedRoot = doc.getRootElement();
			Element actualRoot = expectedDoc.getRootElement();
			assertEquals("Root Element should have been null.",expectedRoot,actualRoot);
			XMLOutputter xmlOutput = new XMLOutputter();
			assertEquals("Line separator should have been '\\n'.",DEFAULT_LINE_SEPARATOR,xmlOutput.outputString(expectedRoot,System.out));
			assertEquals("line-separator-on-first-element should be false.",false,xmlOutput.outputLineSeparatorProperty(expectedRoot));
			expectedDoc.write(expectedRoot,System.out);
}
}
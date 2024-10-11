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
private static final int MAX_CHARS = 64 * 1024;// 128;// 64k;
		private static final String TEXT = "This is some text, text";
		
        @Test
		public void testParse() throws IOException, IFXException {
			// Parses the document into two IFXObject's.
			// The first one is the text, and should thus have a single IFXObject
			// which has a single IFXObject as its content.
			IFXObject documentText = parse(new SAXBuilder()).getFileContent();

			// The second one should exist with content in twoIFXObjects: one which has a
			// single IFXObject, and another which has three IFXObjects.
			IFXObject documentText2 = parse(new SAXBuilder()).getFileContent();

			// If an IFXObject is added, the third one should exist with content in only oneIFXObject.
			IFXObject documentText3 = parse(new SAXBuilder()).getFileContent();
			assertNotNull(documentText3);
		}

        @Test
		public void testFormat() throws IOException, IFXException {
			// The result of the parse is written to the XML output.
			IFXObject documentText = parse(new SAXBuilder()).getFileContent();
			IFXObject documentText2 = parse(new SAXBuilder()).getFileContent();
			IFXObject documentText3 = parse(new SAXBuilder()).getFileContent();

			// The result of a human would be the XMLOutputter class which writes the XML in XMLEncoder(XHTML).
			String result = XMLOutputter.getInstance().outputString(documentText.getFileContent().get());
		}

        @Test
		public void testSave() throws IOException {
			Element element = new Element("testSave");
			Namespace prefix = new Namespace("testPrefix", "testPrefix", "testNamespace");

			// Creates the first three IFXObjects.
			Element documentText = element.addContent(IFXObject._create(TEXT, prefix));
			Element documentText2 = element.addContent(IFXObject._create(TEXT, prefix));
			Element documentText3 = element.addContent(IFXObject._create(TEXT, prefix));

			OutputStream output = System.out;
			output.write(documentText.toString().getBytes(IFXObject._ENCODING));
			output.write(documentText2.toString().getBytes(IFXObject._ENCODING));
			output.write(documentText3.toString().getBytes(IFXObject._ENCODING));
			output.close();

			// Gets the outputstream using an SAX builder.
			SAXBuilder builder = new SAXBuilder();
			InputStream is = System.in;
			try {
				is = new InputStream() {
					@Override
					public int read() throws IOException {
						return is.read();
					}
				};

				Document document = builder.build(is);

				assertNotNull(document);

				// Gets the filecontent for the document text element using DocumentBuilder
				Document documentText = document.getRootElement();

				// Gets the filecontent for the document text element using DocumentBuilder
				Document text = documentText.getDocumentElement();

				// Gets the filecontent for the document text element using DocumentBuilder
				Document text2 = text.getDocumentElement();

				// Gets the filecontent for the document text element using DocumentBuilder
				Document text3 = text2.getDocumentElement();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

        @Test
		public void testLoad() throws IOException {
			// The result of the parse is written to the XML output.
			// Parses the document into two IFXObject's.
			IFXObject documentText = parse(new SAXBuilder()).getFileContent();
			IFXObject documentText2 = parse(new SAXBuilder()).getFileContent();
			IFXObject documentText3 = parse(new SAXBuilder()).getFileContent();

			System.out.println(documentText.validate());
			assertTrue(documentText.validate());
			assertFalse(documentText2.validate());
			assertFalse(documentText3.validate());

			System.out.println(documentText.getIFXObject());
			System.out.println(documentText2.getIFXObject());
			System.out.println(documentText3.getIFXObject());

		}

        @Test
		public void testAddObject() throws IOException {
			// Parses the document into two IfXObjects.
			IFXObject documentText1 = parse(new SAXBuilder()).getFileContent();
			IFXObject documentText2 = parse(new SAXBuilder()).getFileContent();

			// Creates an element in the document and adds this element.
			Element documentTextElement = documentText1.addChild(IFXObject._create(new Text(TEXT, 1, 0), new Namespace("TEXT", new String("1"), null)));
			documentText2.addChild(documentTextElement);

			IFXObject documentText3 = parse(new SAXBuilder()).getFileContent();
		}
}

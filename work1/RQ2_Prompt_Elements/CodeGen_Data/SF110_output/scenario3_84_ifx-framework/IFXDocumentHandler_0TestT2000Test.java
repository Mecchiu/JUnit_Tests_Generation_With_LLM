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
private Document testObj;

		/**
		 * The constructor.
		 * @throws IFXException when there was a problem getting the object
		 */
		public IFXDocumentHandler_0Test() throws IFXException {
			testObj = build(1);
		}

		/**
		 * Sets up the test for the class.
		 * @exception IFXException when the test object could not be built
		 */
		@Test
		public void setup() throws IFXException {
			assertNotNull("Document object must not be null.", testObj);
		}

		/**
		 * Test for the empty constructor.
		 * @throws IFXException when there was a problem getting the object
		 */
		@Test
		public void empty_ctor() throws IFXException {
			IFXDocumentHandler handler = new IFXDocumentHandler();
			try {
				handler.build(null, null, null);
				fail("Expected an exception not thrown");
			} catch (IFXException e) {
				// expected
			}
		}

		/**
		 * Test for the build().
		 * @throws IFXException when there was a problem getting the object
		 */
		@Test
		public void build() throws IFXException {
			IFXDocumentHandler handler = new IFXDocumentHandler();
			handler.setup();

			assertNotNull("Document object must not be null.", handler.testObj);
			// test 1 - The output should start with the namespace prefix.
			String expOutputStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<!DOCTYPE IF XML PUBLIC \"-//W3C//DTD IF XML Soft 1.0//EN\" \"http://www.w3.org/2001/XMLSchema-instance\">" + 
				"<IF XMLns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
				" XSI:type=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"type\">" +
				"	<type xsi:type=\"type\">test</type>" +
				"</IF>" + 
				"<IF XMLns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
				" XSI:type=\"type\">" +
				"	<type xsi:type=\"type\">test</type>" +
				"</IF>" + 
				"<IF XMLns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
				" XSI:type=\"type\">" +
				"	<type xsi:type=\"type\">test</type>" +
				"</IF>";

			assertEquals("Unescaped characters should have been preserved.", expOutputStr.substring(1, 4), testObj.getDocumentElement().getText());

			// test 2 - The output should contain the namespace prefix
			String expOutputDom = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<root><xsi:type=\"type\">test</xsi:type></root>";

			assertEquals("Unescaped characters should have been preserved.", expOutputDom, testObj.getDocumentElement().getText());

			// test 3 - Build the document
			Document expResultDoc = XMLOutputter.outputStringAsUTF8(expOutputStr, "UTF-8").getRootElement();

			// test 4 - The output should contain the namespace URI
			String expResultDom = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<root>" + 
				"	<xsi:type xsi:type=\"type\">test</xsi:type>" + 
				"</root>";

			assertEquals("Unescaped characters should have been preserved.", expResultDom, new String(testObj.getDocumentElement().getText()));

			// test 5 - Build the document and check validity
			handler.setup();
			Document resultDoc = handler.build(testObj);

			// test 6 - The document returned should have the proper content
			assertTrue("Document should start with the correct prefix.", expResultDoc.getPrefix(Namespace.getNamespaceURI("xsi")).equals("xsi"));
			assertTrue("Document should have the right namespace prefix.", expResultDoc.getNamespaceContext().getNamespaceURI("xsi").equals("xsi"));
			assertTrue("Document should be empty.", resultDoc.getRootElement().getChildren().size() == 0);

			// test 7 - Clear the output
			XMLOutputter.outputStringAsUTF8(StringUtils.EMPTY_STRING, "UTF-8").flush();
		}

		/**
		* Test for the setBuildParams() method.
		* @throws IFXException when there was a problem getting the object
		*/
		@Test
		public void setBuildParams() throws IFXException {
			IFXDocumentHandler handler = new IFXDocumentHandler();
			handler.setup();

			assertNotNull("Document object must not be null.", handler.testObj);
			// test 1 - The output should not end with the namespace prefix.
			String expOutputStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<!DOCTYPE IF XML PUBLIC \"-//W3C//DTD IF XML Soft 1.0//EN\" \"http://www.w3.org/2001/XMLSchema-instance\">" + 
				"<IF XMLns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
				" xsi:type=\"type\">" +
				"	<type xsi:type=\"type\">test</type>" +
				"</IF>" + 
				"<IF XMLns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
				" xsi:type=\"type\">" +
				"	<type xsi:type=\"type\">test</type>" +
				"</IF
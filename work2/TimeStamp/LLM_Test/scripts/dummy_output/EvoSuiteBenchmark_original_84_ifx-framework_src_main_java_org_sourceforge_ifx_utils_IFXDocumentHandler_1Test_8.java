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
		/**
		 * This method is a test of the class {@link IFXDocumentHandler#getDecodeResult()}.
		 */
        @Test
        void getDecodeResult() throws IFExpectedFailure, IFXExveption, IFXException {
			final IFXDocumentHandler testSubject = new IfXDocumentHandler("DUMMY CONTENT.IFX");
			final IFXObject obj = testSubject.parse(new InputStream() {
				@Override
				public int read() throws IOException {
					throw new IOException();
				}
			});
			IFXObject result = testSubject.getDecodeResult(obj, 0);
			assertTrue(result instanceof IFXObject);
			IFXObject decodedResult = testSubject.getDecodeResult(result, 0);
			assertNotNull(decodedResult);
			assertNotSame(decodedResult, result);
			IFXObject decodedResult2 = testSubject.decode(obj, new byte[] {1}, 0);
			assertNotSame(decodedResult2, result);
			assertFalse(decodedResult2 instanceof IFXObject);
			result = testSubject.getDecodeResult(decodedResult2, 0);
			assertTrue(result instanceof IFXObject);
			result = testSubject.getDecodeResult(obj, new byte[] {2}, 0);
			assertNotSame(result, decodedResult2);
			assertTrue(result instanceof IFXObject);
			result = testSubject.getDecodeResult(result, 0);
			assertTrue(result == decodedResult || result.equals(decodedResult));
			assertNotSame(result, result2);
		}

		/**
		 * This test uses the same test code as the class {@link IFXDocumentHandler#getDecodeResult()} which
		 * verifies the default encoding (UTF-8) has been returned.
		 */
        @Test
        void getDecodeResult2() throws IFExveption, IFXException, IFXException {
			final IFXDocumentHandler testSubject = new IfXDocumentHandler("DUMMY CONTENT.IFX");
			final OutputStream ostream = new OutputStream() {
				@Override
				public void write(int b) throws IOException {
					throw new IOException();
				}
			};
			testSubject.setDebug(true);
			final Document doc = testSubject.decode(null, new byte[] {2}, ostream);
			assertEquals("", doc.getElementsByTagName("xml").remove(0).getFirstChild().getNodeValue());
		}

		/**
		 * This test uses the same test code as the class {@link IFXDocumentHandler#decode(org.jdom.Element, byte[], OutputStream)}
		 * which verifies the encoding of the Element is returned when the Element parameter is null.
		 */
        @Test
        void decode() throws IFExveption, IFXException {
			final IFXDocumentHandler testSubject = new IfXDocumentHandler("FOO");
			final InputStream istream = new InputStream() {
				@Override
				public int read() throws IOException {
					throw new IOException();
				}
			};
			testSubject.setDebug(true);
			final boolean shouldDecodeFoo = true;
			final Document document = testSubject.decode(null, null, istream, shouldDecodeFoo);
			assertEquals("", document.getElementsByTagName("xml").remove(0).getFirstChild().getNodeValue());
		}

		/**
		 * This test uses the same test code as the class {@link IFXDocumentHandler#decode(org.jdom.Document, byte[], OutputStream)}
		 * which verifies the Node name of the Element is returned when the Element parameter is null.
		 */
        @Test
        void decodeDocumentElement() throws IFExveption, IFXException {
			final IFXDocumentHandler testSubject = new IfXDocumentHandler("FOO");
			final boolean shouldDecodeFoo = true;
			final Document document = testSubject.decode(new Element("test"), null, new ByteArrayOutputStream(), shouldDecodeFoo);
}
}
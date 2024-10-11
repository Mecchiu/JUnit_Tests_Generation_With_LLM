// XmlIO_1Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains one unit test case for the {@link XmlIO#load(URL)} method.
*/
class XmlIO_1Test {
		private static final Logger log = Logger.getLogger(XmlIO_1Test.class.getName());

		private static final char[] ARCHIVE_DIR_CHAR = XmlIO.ARCHIVE_DIR_CHAR;

		public static String testFileURL = XmlIO_1Test.class.getResource("test.xsd").toString();

		private class MyXMLReader extends XMLReader {
				MyXMLReader(XMLReader parent) {
						super(parent);
				}

				public boolean getFeature(XMLReader.Feature f)
								throws SAXException {
						return true;
				}

		}

		private class MySAXParser extends SAXParser {
				MySAXParser() {
					super();
				}

		   public void release() {
		   }

		   public void parse(InputSource inputSource)
				throws SAXException, IOException {

				InputStream input = inputSource.getByteStream();
				// input = new FileInputStream(testFileURL);
				// create a default reader
				MyXMLReader reader = new MyXMLReader(this);
				// get an XMLReader from the input
				setContentHandler(reader);
				// read the first byte from the input
				int c = input.read();
				if (c!='') {
					Exception thrown = new SAXException(
							"Error while parsing XML from "+
							testFileURL);
					throw thrown;
				}
				// get the character reader
				setErrorHandler(reader);
				// The buffer is used by default;
				// it is an array of char
				char[] buf = new char[2048];
				// Read until a character of value 0
				do {
					// Read a byte from the input
					c = input.read();
					buf[0] = (char) (c & 0xff);
					// Add the characters to the buffer
					System.arraycopy(buf, 1, buf, 1, buf.length - 1);
				} while (c!= -1);
				// Reset the reader
				// (c == -1) => we had an i/oerror; set ErrorHandler to null
				// set ErrorHandler to Error
				errorHandler = null;
				// Read the string
				parseString ( reader
						, testFileURL, true );
				// Do not return, so we can test for errors
				System.exit(1);
			}
		}

		@Test
		public void load_01() throws Exception {
				Reader reader = new InputStreamReader(
						getClass().getResourceAsStream(testFileURL));
				MySAXParser parser = new MySAXParser();
				SAXParserFactory factory = SAXParserFactory.newInstance();
				try {
					SAXParser saxParser = factory.newSAXParser();
					MyXMLReader parserAsXML = parser.getXMLReader();
					List<String> elements = parserAsXML.getElementsByTagName("e");
					assertNotNull(elements);
					assertEquals(elements.size(), 0);
					assertNull(parserAsXML.getErrors());
				} finally {
					parser.release();
				}
		}

		private List<XmlIO.VectorElement> testVector()
				throws Exception{

				if (!(new File(testFileURL).exists()))

				// TODO Auto-generated test stub
				return null;

				XMLReader reader = new MyXMLReader(this);

 				// Check for errors
 				assertNull(reader.getErrors()); 

				List<XmlIO.VectorElement> list = reader.getElementsByTagName("e");
				assertNotNull(list);
				if (list.size() < 0) {
					list = list.subList(0, 1);
				}
 				assertEquals(1, list.size());
				XmlIO.VectorElement e = list.get(0);
 				System.out.println(e);
 				assertNotNull(e);

				//
				// Try reading twice:
				//
				XMLReader reader2 = new MyXMLReader(this);
				// first read from a file
				reader2.setContentHandler(e);
				// now read multiple times
				// by using setContentHandler:
				reader = new MySAXParser();
				// Read first byte from input
				int c = reader.next();
				// Read first character from input
				c = reader.next();
				// get the reader
				reader = reader.getContentHandler();
				List<String> elements = reader.getElementsByTagName("e");
				assertNotNull(elements);
				list = reader.getElementsByTagName("e");
				assertEquals(1, list.size());
				XmlIO.VectorElement e2 = list.get(0);
 				assertNotNull(e2);
				System.out.println(e2);

				//
				// Check for errors
				assertNull(reader2.getErrors());
				//
				// try again
				reader = new MySAXParser();
				System.out.println(e.getName());
				readAndTestString(reader, testFileURL);
        readAndTestVector(reader, testFileURL);
        readAndTestVector(reader, testFileURL);
				return list;
		}

		private void testException(Exception e)
				throws SAXException {
			if (isException(e)) {
				assertTrue(e.getMessage().startsWith("File is corrupted"));
			} else {
				throw e;
			}
		}
		private boolean isException(Exception e) {
			if (e instanceof SAXException)
				throw (SAXException) e;
			if (e instanceof IOException)
				throw (IOException) e;
}
}
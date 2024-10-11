// XTreeUtilTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains ten unit test cases for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtilTest {

		/**
		* Test case 1 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential1() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 2 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential2() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 3 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential3() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 4 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential4() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 5 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential5() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 6 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential6() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 7 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential7() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 8 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential8() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 9 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential9() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
		
		/**
		* Test case 10 for method {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
		* @throws SAXParseException if the XML data is not valid
		* @throws SAXException if any other error occurs while parsing the XML data
		* @throws IOException if there was some I/O error while reading the input.
		*/
		@Test
		public void testParseXMLSequential10() throws SAXParseException, SAXException, IOException {
				InputSource xmlInput = new InputSource(new StringReader("<a><b/><c/></a>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				ElementHandler handler = new ElementHandler() {
						public void onStart(ElementPath path) {
						}
						public void onEnd(ElementPath path) {
						}
				};
				Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);
				assertEquals("a", result.getLocalName());
				assertEquals(0, result.getChildCount());
		}
}
// XTreeUtil_1Test.java
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
class XTreeUtil_1Test {

	/**
	 * Test case 1 for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
	 * 
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException  if there was some I/O error while reading the input.
	 */
	@Test
	void testParseXMLSequential1() throws SAXParseException, SAXException, IOException {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(ElementPath path) {
				Element e = path.getCurrent();
				e.addAttribute("", "", "foo", "CDATA", "bar");
			}
			public void onEnd(ElementPath path) {
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getAttributeCount());
		assertEquals(3, root.getChildCount());
		assertEquals("a", root.getChild(0).getLocalName());
		assertEquals(1, root.getChild(0).getAttributeCount());
		assertEquals("foo", root.getChild(0).getAttribute(0).getLocalName());
		assertEquals("bar", root.getChild(0).getAttribute(0).getValue());
		assertEquals("b", root.getChild(1).getLocalName());
		assertEquals(1, root.getChild(1).getAttributeCount());
		assertEquals("foo", root.getChild(1).getAttribute(0).getLocalName());
		assertEquals("bar", root.getChild(1).getAttribute(0).getValue());
		assertEquals("c", root.getChild(2).getLocalName());
		assertEquals(1, root.getChild(2).getAttributeCount());
		assertEquals("foo", root.getChild(2).getAttribute(0).getLocalName());
		assertEquals("bar", root.getChild(2).getAttribute(0).getValue());
	}
	
	/**
	 * Test case 2 for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
	 * 
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException  if there was some I/O error while reading the input.
	 */
	@Test
	void testParseXMLSequential2() throws SAXParseException, SAXException, IOException {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(ElementPath path) {
				Element e = path.getCurrent();
				e.addAttribute("", "", "foo", "CDATA", "bar");
				e.addAttribute("", "", "foo", "CDATA", "baz");
			}
			public void onEnd(ElementPath path) {
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getAttributeCount());
		assertEquals(3, root.getChildCount());
		assertEquals("a", root.getChild(0).getLocalName());
		assertEquals(1, root.getChild(0).getAttributeCount());
		assertEquals("foo", root.getChild(0).getAttribute(0).getLocalName());
		assertEquals("baz", root.getChild(0).getAttribute(0).getValue());
		assertEquals("b", root.getChild(1).getLocalName());
		assertEquals(1, root.getChild(1).getAttributeCount());
		assertEquals("foo", root.getChild(1).getAttribute(0).getLocalName());
		assertEquals("baz", root.getChild(1).getAttribute(0).getValue());
		assertEquals("c", root.getChild(2).getLocalName());
		assertEquals(1, root.getChild(2).getAttributeCount());
		assertEquals("foo", root.getChild(2).getAttribute(0).getLocalName());
		assertEquals("baz", root.getChild(2).getAttribute(0).getValue());
	}
	
	/**
	 * Test case 3 for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
	 * 
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException  if there was some I/O error while reading the input.
	 */
	@Test
	void testParseXMLSequential3() throws SAXParseException, SAXException, IOException {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(ElementPath path) {
				Element e = path.getCurrent();
				e.addAttribute("", "", "foo", "CDATA", "bar");
				e.addAttribute("", "", "foo", "CDATA", "baz");
				e.addAttribute("", "", "foo", "CDATA", "quux");
			}
			public void onEnd(ElementPath path) {
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getAttributeCount());
		assertEquals(3, root.getChildCount());
		assertEquals("a", root.getChild(0).getLocalName());
		assertEquals(1, root.getChild(0).getAttributeCount());
		assertEquals("foo", root.getChild(0).getAttribute(0).getLocalName());
		assertEquals("quux", root.getChild(0).getAttribute(0).getValue());
		assertEquals("b", root.getChild(1).getLocalName());
		assertEquals(1, root.getChild(1).getAttributeCount());
		assertEquals("foo", root.getChild(1).getAttribute(0).getLocalName());
		assertEquals("quux", root.getChild(1).getAttribute(0).getValue());
		assertEquals("c", root.getChild(2).getLocalName());
		assertEquals(1, root.getChild(2).getAttributeCount());
		assertEquals("foo", root.getChild(2).getAttribute(0).getLocalName());
		assertEquals("quux", root.getChild(2).getAttribute(0).getValue());
	}
	
	/**
	 * Test case 4 for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
	 * 
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException  if there was some I/O error while reading the input.
	 */
	@Test
	void testParseXMLSequential4() throws SAXParseException, SAXException, IOException {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(ElementPath path) {
				Element e = path.getCurrent();
				e.addAttribute("", "", "foo", "CDATA", "bar");
				e.addAttribute("", "", "foo", "CDATA", "baz");
				e.addAttribute("", "", "foo", "CDATA", "quux");
				e.addAttribute("", "", "foo", "CDATA", "xyzzy");
			}
			public void onEnd(ElementPath path) {
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getAttributeCount());
		assertEquals(3, root.getChildCount());
		assertEquals("a", root.getChild(0).getLocalName());
		assertEquals(1, root.getChild(0).getAttributeCount());
		assertEquals("foo", root.getChild(0).getAttribute(0).getLocalName());
		assertEquals("xyzzy", root.getChild(0).getAttribute(0).getValue());
		assertEquals("b", root.getChild(1).getLocalName());
		assertEquals(1, root.getChild(1).getAttributeCount());
		assertEquals("foo", root.getChild(1).getAttribute(0).getLocalName());
		assertEquals("xyzzy", root.getChild(1).getAttribute(0).getValue());
		assertEquals("c", root.getChild(2).getLocalName());
		assertEquals(1, root.getChild(2).getAttributeCount());
		assertEquals("foo", root.getChild(2).getAttribute(0).getLocalName());
		assertEquals("xyzzy", root.getChild(2).getAttribute(0).getValue());
	}
	
	/**
	 * Test case 5 for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
	 * 
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException  if there was some I/O error while reading the input.
	 */
	@Test
	void testParseXMLSequential5() throws SAXParseException, SAXException, IOException {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(ElementPath path) {
				Element e = path.getCurrent();
				e.addAttribute("", "", "foo", "CDATA", "bar");
				e.addAttribute("", "", "foo", "CDATA", "baz");
				e.addAttribute("", "", "foo", "CDATA", "quux");
				e.addAttribute("", "", "foo", "CDATA", "xyzzy");
				e.addAttribute("", "", "foo", "CDATA", "plugh");
			}
			public void onEnd(ElementPath path) {
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getAttributeCount());
		assertEquals(3, root.getChildCount());
		assertEquals("a", root.getChild(0).getLocalName());
		assertEquals(1, root.getChild(0).getAttributeCount());
		assertEquals("foo", root.getChild(0).getAttribute(0).getLocalName());
		assertEquals("plugh", root.getChild(0).getAttribute(0).getValue());
		assertEquals("b", root.getChild(1).getLocalName());
		assertEquals(1, root.getChild(1).getAttributeCount());
		assertEquals("foo", root.getChild(1).getAttribute(0).getLocalName());
		assertEquals("plugh", root.getChild(1).getAttribute(0).getValue());
		assertEquals("c", root.getChild(2).getLocalName());
		assertEquals(1, root.getChild(2).getAttributeCount());
		assertEquals("foo", root.getChild(2).getAttribute(0).getLocalName());
		assertEquals("plugh", root.getChild(2).getAttribute(0).getValue());
	}
	
	/**
	 * Test case 6 for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
	 * 
	 * @throws SAXParseException if the XML data is not valid
	 * @throws SAXException if any other error occurs while parsing the XML data
	 * @throws IOException  if there was some I/O error while reading the input.
	 */
	@Test
	void testParseXMLSequential6() throws SAXParseException, SAXException, IOException {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(ElementPath path) {
				Element e = path.getCurrent();
				e.addAttribute("", "", "foo", "CDATA", "bar");
				e.addAttribute("", "", "foo", "CDATA", "baz");
				e.addAttribute("", "", "foo", "CDATA", "quux");
				e.addAttribute("", "", "foo", "CDATA", "xyzzy");
				e.addAttribute("", "", "foo", "CDATA", "plugh");
				e.addAttribute("", "", "foo", "CDATA", "thud");
			}
			public void onEnd(ElementPath path) {
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getAttributeCount());
		assertEquals(3, root.getChildCount());
		assertEquals("a", root.getChild(0).getLocalName());
		assertEquals(1, root.getChild(0).getAttributeCount());
		assertEquals("foo", root.getChild(0).getAttribute(0).getLocalName());
		assertEquals("thud", root.getChild(0).getAttribute(0).getValue());
		assertEquals("b", root.getChild(1).getLocalName());
		assertEquals(1, root.getChild(1).getAttributeCount());
		assertEquals("foo", root.getChild(1).getAttribute(0).getLocalName());
		assertEquals("thud", root.getChild(1).getAttribute(0).getValue());
		assertEquals("c", root.getChild(2).getLocalName());
		assertEquals(1, root.getChild(2).getAttributeCount());
		assertEquals("foo", root.getChild(2).getAttribute(0).getLocalName());
		assertEquals("thud", root.getChild(2).getAttribute(0).getValue());
	}
	
	/**
	 * Test case 7 for {@link XTreeUtil#parse
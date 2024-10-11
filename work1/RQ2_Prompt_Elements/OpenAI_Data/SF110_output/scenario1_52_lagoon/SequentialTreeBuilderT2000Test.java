// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document.
	*/
	@Test
	void testParseXMLSequential1() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a DTD.
	*/
	@Test
	void testParseXMLSequential2() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root SYSTEM \"test.dtd\"><root><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a DTD and an external entity.
	*/
	@Test
	void testParseXMLSequential3() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root SYSTEM \"test.dtd\"><root><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a DTD and an external entity.
	*/
	@Test
	void testParseXMLSequential4() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root SYSTEM \"test.dtd\"><root><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a DTD and an external entity.
	*/
	@Test
	void testParseXMLSequential5() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root SYSTEM \"test.dtd\"><root><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a DTD and an external entity.
	*/
	@Test
	void testParseXMLSequential6() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root SYSTEM \"test.dtd\"><root><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).
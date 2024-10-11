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
				assertEquals(0, element.getNamespaceCount());
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace.
	*/
	@Test
	void testParseXMLSequential2() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns=\"http://www.example.com/\"><child1/><child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential3() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential4() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential5() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential6() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential7() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential8() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0, element.getChildCount());
			}
			public void endElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(2, element.getChildCount());
				assertEquals("child1", element.getChild(0).getLocalName());
				assertEquals("child2", element.getChild(1).getLocalName());
			}
		};
		SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* It tests the parsing of a simple XML document with a namespace and a prefix.
	*/
	@Test
	void testParseXMLSequential9() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root xmlns:p=\"http://www.example.com/\"><p:child1/><p:child2/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void startElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(1, element.getNamespaceCount());
				assertEquals("http://www.example.com/", element.getNamespaceUri(0));
				assertEquals("p", element.getNamespacePrefix(0));
				assertEquals(0,
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

	@Test
	void testParseXMLSequential() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(0, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential2() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("a", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(0, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential3() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("b", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(0, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential4() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("c", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(0, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential5() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(3, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential6() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(3, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential7() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(3, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testParseXMLSequential8() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void handleElement(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getAttributeCount());
				assertEquals(0, element.getNamespaceCount());
				assertEquals(3, element.getChildCount());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
		assertEquals(0, rootElement.getAttributeCount());
		assertEquals(0, rootElement.getNamespaceCount());
		assertEquals(0, rootElement.getChildCount());
	}
	
	@Test
	void testPar
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
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML_WithElementHandler() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, new ElementHandler() {
				public void onStart(Element element) {
					assertNotNull(element);
				}
				public void onEnd(Element element) {
					assertNotNull(element);
				}
			});
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML_WithElementHandler_WithAttributes() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1 attr1=\"value1\" attr2=\"value2\"/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, new ElementHandler() {
				public void onStart(Element element) {
					assertNotNull(element);
					if (element.getLocalName().equals("child1")) {
						assertEquals("value1", element.getAttribute("attr1"));
						assertEquals("value2", element.getAttribute("attr2"));
					}
				}
				public void onEnd(Element element) {
					assertNotNull(element);
				}
			});
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML_WithElementHandler_WithNamespaces() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root xmlns=\"http://www.example.com/\" xmlns:ns1=\"http://www.example.com/ns1\"><child1/><ns1:child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, new ElementHandler() {
				public void onStart(Element element) {
					assertNotNull(element);
					if (element.getLocalName().equals("child1")) {
						assertEquals("http://www.example.com/", element.getNamespaceURI());
					} else if (element.getLocalName().equals("child2")) {
						assertEquals("http://www.example.com/ns1", element.getNamespaceURI());
					}
				}
				public void onEnd(Element element) {
					assertNotNull(element);
				}
			});
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML_WithElementHandler_WithNamespaces_WithAttributes() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root xmlns=\"http://www.example.com/\" xmlns:ns1=\"http://www.example.com/ns1\"><child1 attr1=\"value1\" attr2=\"value2\"/><ns1:child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, new ElementHandler() {
				public void onStart(Element element) {
					assertNotNull(element);
					if (element.getLocalName().equals("child1")) {
						assertEquals("http://www.example.com/", element.getNamespaceURI());
						assertEquals("value1", element.getAttribute("attr1"));
						assertEquals("value2", element.getAttribute("attr2"));
					} else if (element.getLocalName().equals("child2")) {
						assertEquals("http://www.example.com/ns1", element.getNamespaceURI());
					}
				}
				public void onEnd(Element element) {
					assertNotNull(element);
				}
			});
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML_WithElementHandler_WithNamespaces_WithAttributes_WithText() {
		try {
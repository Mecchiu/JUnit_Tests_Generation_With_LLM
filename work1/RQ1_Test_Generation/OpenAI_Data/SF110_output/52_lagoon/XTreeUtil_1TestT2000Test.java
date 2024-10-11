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

		@Test
		void test_1() throws Exception {
				String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
										 "<!DOCTYPE root [\n" +
										 "<!ELEMENT root (child1, child2)>\n" +
										 "<!ELEMENT child1 (#PCDATA)>\n" +
										 "<!ELEMENT child2 (#PCDATA)>\n" +
										 "]>\n" +
										 "<root>\n" +
										 "  <child1>text1</child1>\n" +
										 "  <child2>text2</child2>\n" +
										 "</root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				ElementHandler handler = new ElementHandler() {
						public void handleElement(Element element) {
								assertEquals("child1", element.getLocalName());
								assertEquals("text1", element.getText());
						}
				};
				Element root = XTreeUtil.parseXMLSequential(xmlInput, true, null, null, handler);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getChildCount());
		}
		
		@Test
		void test_2() throws Exception {
				String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
										 "<!DOCTYPE root [\n" +
										 "<!ELEMENT root (child1, child2)>\n" +
										 "<!ELEMENT child1 (#PCDATA)>\n" +
										 "<!ELEMENT child2 (#PCDATA)>\n" +
										 "]>\n" +
										 "<root>\n" +
										 "  <child1>text1</child1>\n" +
										 "  <child2>text2</child2>\n" +
										 "</root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				ElementHandler handler = new ElementHandler() {
						public void handleElement(Element element) {
								assertEquals("child2", element.getLocalName());
								assertEquals("text2", element.getText());
						}
				};
				Element root = XTreeUtil.parseXMLSequential(xmlInput, true, null, null, handler);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getChildCount());
		}
		
		@Test
		void test_3() throws Exception {
				String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
										 "<!DOCTYPE root [\n" +
										 "<!ELEMENT root (child1, child2)>\n" +
										 "<!ELEMENT child1 (#PCDATA)>\n" +
										 "<!ELEMENT child2 (#PCDATA)>\n" +
										 "]>\n" +
										 "<root>\n" +
										 "  <child1>text1</child1>\n" +
										 "  <child2>text2</child2>\n" +
										 "</root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				ElementHandler handler = new ElementHandler() {
						public void handleElement(Element element) {
								assertEquals("child1", element.getLocalName());
								assertEquals("text1", element.getText());
						}
				};
				Element root = XTreeUtil.parseXMLSequential(xmlInput, true, null, null, handler);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getChildCount());
		}
		
		@Test
		void test_4() throws Exception {
				String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
										 "<!DOCTYPE root [\n" +
										 "<!ELEMENT root (child1, child2)>\n" +
										 "<!ELEMENT child1 (#PCDATA)>\n" +
										 "<!ELEMENT child2 (#PCDATA)>\n" +
										 "]>\n" +
										 "<root>\n" +
										 "  <child1>text1</child1>\n" +
										 "  <child2>text2</child2>\n" +
										 "</root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				ElementHandler handler = new ElementHandler() {
						public void handleElement(Element element) {
								assertEquals("child2", element.getLocalName());
								assertEquals("text2", element.getText());
						}
				};
				Element root = XTreeUtil.parseXMLSequential(xmlInput, true, null, null, handler);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getChildCount());
		}
		
		@Test
		void test_5() throws Exception {
				String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
										 "<!DOCTYPE root [\n" +
										 "<!ELEMENT root (child1, child2)>\n" +
										 "<!ELEMENT child1 (#PCDATA)>\n" +
										 "<!ELEMENT child2 (#PCDATA)>\n" +
										 "]>\n" +
										 "<root>\n" +
										 "  <child1>text1</child1>\n" +
										 "  <child2>text2</child2>\n" +
										 "</root>";
		
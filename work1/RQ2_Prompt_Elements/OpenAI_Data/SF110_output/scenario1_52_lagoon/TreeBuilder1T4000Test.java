// TreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilderTest {

		/**
		* Test case 1 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is valid and well-formed.
		*/
		@Test
		public void testCase1() {
				try {
						InputSource xmlInput = new InputSource(new File("test1.xml").toURI().toString());
						Element root = TreeBuilder.parseXML(xmlInput, false);
						assertEquals("root", root.getTagName());
						assertEquals(1, root.getChildCount());
						assertEquals("child", root.getChild(0).getTagName());
						assertEquals(1, root.getChild(0).getChildCount());
						assertEquals("grandchild", root.getChild(0).getChild(0).getTagName());
						assertEquals(0, root.getChild(0).getChild(0).getChildCount());
				} catch (Exception e) {
						fail("Exception should not be thrown");
				}
		}
		
		/**
		* Test case 2 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is valid but not well-formed.
		*/
		@Test
		public void testCase2() {
				try {
						InputSource xmlInput = new InputSource(new File("test2.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, false);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 3 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase3() {
				try {
						InputSource xmlInput = new InputSource(new File("test3.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 4 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase4() {
				try {
						InputSource xmlInput = new InputSource(new File("test4.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 5 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase5() {
				try {
						InputSource xmlInput = new InputSource(new File("test5.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 6 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase6() {
				try {
						InputSource xmlInput = new InputSource(new File("test6.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 7 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase7() {
				try {
						InputSource xmlInput = new InputSource(new File("test7.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 8 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase8() {
				try {
						InputSource xmlInput = new InputSource(new File("test8.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 9 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase9() {
				try {
						InputSource xmlInput = new InputSource(new File("test9.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
		
		/**
		* Test case 10 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
		* It tests the case when the input XML document is not valid.
		*/
		@Test
		public void testCase10() {
				try {
						InputSource xmlInput = new InputSource(new File("test10.xml").toURI().toString());
						TreeBuilder.parseXML(xmlInput, true);
						fail("SAXParseException should be thrown");
				} catch (SAXParseException e) {
						assertEquals(2, e.getLineNumber());
						assertEquals(1, e.getColumnNumber());
				} catch (Exception e) {
						fail("SAXParseException should be thrown");
				}
		}
}
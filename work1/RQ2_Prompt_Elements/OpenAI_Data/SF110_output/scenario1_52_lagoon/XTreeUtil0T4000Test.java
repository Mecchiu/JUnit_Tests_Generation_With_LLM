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
* It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtilTest {

		/**
		* Test case 1 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is valid and the DTD validation is enabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase1() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test1.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 2 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is valid and the DTD validation is disabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase2() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test1.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 3 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is invalid and the DTD validation is enabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase3() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test2.xml"));
				assertThrows(SAXParseException.class, () -> {
						Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
				});
		}
		
		/**
		* Test case 4 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is invalid and the DTD validation is disabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase4() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test2.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 5 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is valid and the DTD validation is enabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase5() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test3.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 6 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is valid and the DTD validation is disabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase6() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test3.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 7 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is invalid and the DTD validation is enabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase7() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test4.xml"));
				assertThrows(SAXParseException.class, () -> {
						Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
				});
		}
		
		/**
		* Test case 8 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is invalid and the DTD validation is disabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase8() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test4.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 9 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is valid and the DTD validation is enabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase9() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test5.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
		
		/**
		* Test case 10 for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
		* It tests the case when the input XML document is valid and the DTD validation is disabled.
		* @throws Exception if any error occurs
		*/
		@Test
		public void testCase10() throws Exception {
				InputSource xmlInput = new InputSource(new FileInputStream("src/test/resources/nu/staldal/xtree/test5.xml"));
				Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
				assertEquals("root", root.getLocalName());
				assertEquals("http://www.example.com/", root.getNamespaceURI());
				assertEquals(1, root.getChildCount());
				assertEquals(Element.ELEMENT, root.getType(0));
				Element child = (Element) root.getChild(0);
				assertEquals("child", child.getLocalName());
				assertEquals("http://www.example.com/", child.getNamespaceURI());
				assertEquals(0, child.getChildCount());
		}
}
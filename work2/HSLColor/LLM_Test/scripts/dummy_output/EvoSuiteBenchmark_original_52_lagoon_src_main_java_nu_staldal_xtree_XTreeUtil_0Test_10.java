// XTreeUtil_0Test.java
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
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {
		/**
		 * @throws Exception if any.
		 */
		@Test
		public void parseXMLEl() throws Exception {
			// Parse an XML from a file with a base class
			final XTreeTestUtil parseXMLTest = new XTreeTestUtil("test-x.xml");
			assertTrue("Test failed.", parseXMLTest.isValid());

			// Generate a XML document
			final XTreeTestUtil doc = new XTreeTestUtil("test-x.xml");
			XTreeUtil.generateDocument(doc);

			// The result should be the same as the generated XML
			final Element docResult = parseXML(new InputSource(new XTreeInputStream(new XTreeTestUtil("test-x.xml")), false, false), true, "UTF-8", new InputSource(new XTreeInputStream(new XTreeTestUtil("test-x.xml")), false, false));
			assertEquals("Test assertion failed.", doc.getNode(), docResult);
		}

        /**
         * @throws Exception if any.
        */
        @Test
        public void parseXMLElNoBase() throws Exception {
            // Parse an XML from a base class only, without a base class
            final XTreeTestUtil parseXMLTest = new XTreeTestUtil("test-x.xml");
            assertTrue("Test failed.", parseXMLTest.isValid());

            // Generate a XML document
			final XTreeTestUtil doc = new XTreeTestUtil("test-x.xml");
			XTreeUtil.generateDocument(doc);
			// The result should be the same as the generated XML
			final Element docResult = parseXML(new InputSource(new XTreeInputStream(new XTreeTestUtil("test-x.xml")), false, false), true, "UTF-8", new InputSource(new XTreeInputStream(new XTreeTestUtil("test-x.xml")), false, false));
			assertEquals("Test assertion failed.", doc.getNode(), docResult);
		}

		/**
		 * @throws Exception if any.
		 */
        @Test
        public void parseXMLWithNoBase() throws Exception {
			XTreeUtil.generateDocument(XTreeTestUtil.parseXML("<document/>"));
			assertEquals("Test assertion failed.", 0, XTreeTestUtil.countAllNodes(XTreeTestUtil.getDocument()));
		}
  
		/**
		 * Test the parseXML() method using a valid xml input.
		 * @throws Exception
		 */
		@Test
		public void testParseXMLValid() throws Exception {
			final String filename = "testParseXML.xml";
			final String base = "";
            final XTreeTestUtil testObj = new XTreeTestUtil(filename);
			testObj.loadSource(base + "/test.xml");
			assertEquals("Test assertion failed.", null, testObj.getNode());
		}

		/**
		 * Test the parseXML() method using a valid xml input.
		 * @throws Exception
		 */
		@Test
		public void testParseXMLNoBase() throws Exception {
			final String filename = "testParseXML.xml";
			final String base = "no_base";
			final XTreeTestUtil testObj = new XTreeTestUtil(filename);
			testObj.loadSource(base + "/test.xml");
			assertEquals("Test assertion failed.", null, testObj.getNode());
		}

		/**
		 * Test the parseXML() method using a valid xml input.
		 * @throws Exception
		 */
		@Test
		public void testParseXMLValid2() throws Exception {
			final InputStream input = new XTreeTestUtil("testParseXML.xml");
			final String filename = "testParseXML.xml";
			final String base = "null base";
			final XTreeTestUtil testObj = new XTreeTestUtil(filename);
			testObj.loadSource(base + "/test.xml");
			assertEquals("Test assertion failed.", null, testObj.getNode());
            XTreeUtil.setProperty(testObj, "base", base, true);
			assertEquals("Test assertion failed.", null, testObj.getNode().getAttribute("base"));
		}

	}
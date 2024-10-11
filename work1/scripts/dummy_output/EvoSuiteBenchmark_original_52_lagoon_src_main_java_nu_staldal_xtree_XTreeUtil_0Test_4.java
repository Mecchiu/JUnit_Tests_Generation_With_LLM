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
		Element elem;
        TestSuite suite;
        String elemName;
        InputSource eInput;

 	
	/**
	 * Create a new test suite for testing this class.
	 * This unit test case must contain exactly one XTree test case.
	 *
	 * @return the test suite
	 * @throws IOException if a problem occured while creating the test suite
	*/
	public static Test suite() throws IOException {

		TestSuite ts = new TestSuite();
		try {
			suite = new TestSuite();

 
			// add test case for a non-empty XML file
			suite.addTest(new XTreeUtil_0Test("testEmpty-XML"));

			// test case for an empty XML file
			suite.addTest(new XTreeUtil_0Test("testEmpty"));
			suite.addTest(new XTreeUtil_0Test("testBadSchema"));
			
			//testCase(suite, "testBadSchema");

		} catch (Exception e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}

		return suite;
	}
	
	/**
	 * Adds test case for a "nested" tree.
	 * Checks whether the XML parsed correctly, and whether it contains the expected
	 * node.
	 * @throws IOException a problem occurred while parsing the XML.
	 * @throws SAXException any of the SAX exception occurred.
	 */
	public  void testNestedXML() throws IOException, SAXException {

		final String TESTCASE = 
			"<test>\n" +
			"  <complexType name=\"complex\">" +
			"   <complexContent>" +
			"     <restriction base=\"root\">" +
			"       <group>\n" +
			"         <element name=\"a\" type=\"xsd:string\"/>" +
			"       </group>" +
			"     </restriction>" +
			"   </complexContent>" +
			"</complexType>\n" +
			"</test>\n" +
			"";
		
		final String XML_IN_PATH = 
			"src/test/data/nested.dtd";

		final String XML_OUT_PATH = "C:/temp/nested.xml";

		final TestCase tc = new TestCase() {
			public void run() throws Exception {
				XTreeUtil.parseXML(new InputSource(new java.io.File(XML_OUT_PATH)), true, null, null);
			}
		}.loadTestData(XML_IN_PATH, XML_IN_PATH);

		assertParseOK(tc);

		Map<String,ArrayList<String>> childMap = tc.elem.getChildList();
		Element element = tc.elem.getElement(0);

		assertFalse("The XML string has a root.", childMap.containsKey("root"));
		assertNull("Missing expected node.", element);

		tc.elem.getAttributes().removeAll();
		tc.elem.getAttributes().addAttribute("", "type", "xsd:string");
		tc.elem.getAttributes().addAttribute("type", "xsd:string", "a");

		childMap = tc.elem.getChildList();

		assertFalse("The XML string has not the expected child element.", childMap.containsKey("complex"));

		tc.elem.getParent().removeChild(tc.elem);
		assertFalse("The XML string has not the expected parent element.", childMap.containsKey("complex"));

		element = tc.elem.getElement(0);
		tc.elem.remove(tc.elem.getElement(0), true);
//		eInput.setBaseURI("foo-bar");
		tc.elem.removeAll();

	}

	/**
	 * Tests whether a valid XML string parsed correctly by a
	 * {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} with
	 * the schema type set.
	 *
	 * @throws SAXException if the schema verification fails.
	 * @throws IOException if any I/O error occurs while reading the input.
	 */
	private static void assertParseOK(TestCase tc) throws SAXException, IOException {
		XTreeUtil.parseXML(eInput, true, null, eInput);
		if (tc.schemaType!= null) {
			assertTrue(tc.schemaType + " doesn't contain children.", tc.elem.getChildList().size() > 0);
			assertTrue(tc.schemaType + " has a parent.", tc.elem.getParent()!= null);
			assertEquals(tc.schemaType + " doesn't contain a correct schema type", tc.elem.getSchemaType(), tc.schemaType, 0);
			Element newChild = tc.elem.getChild(tc.schemaType, tc.elem.getOwnerDocument().getBaseURI());
			ContentHandlerFixer.fixNewChild(newChild, tc, tc.schemaType);
		}
	}

	public static final String NO_SCHEMA_DTD = 
		"http://unused.here/dtd/empty.dtd";

	public static final String SCHEMA_TEXT = 
		"<?xml-stylesheet type=\"text/xsl\" href=\"no-schema.xslt\" " +
			"?>\n";

}
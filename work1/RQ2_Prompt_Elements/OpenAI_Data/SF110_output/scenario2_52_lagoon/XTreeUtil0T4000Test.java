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
	* Test case 1 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is null.
	*/
	@Test
	public void testParseXML1() throws Exception {
		InputSource xmlInput = null;
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		try {
			Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
			fail("Expected NullPointerException");
		} catch (NullPointerException e) {
			assertEquals("xmlInput cannot be null", e.getMessage());
		}
	}
	
	/**
	* Test case 2 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is not valid.
	*/
	@Test
	public void testParseXML2() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		try {
			Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
			fail("Expected SAXParseException");
		} catch (SAXParseException e) {
			assertEquals("The element type \"b\" must be terminated by the matching end-tag \"</b>\".", e.getMessage());
		}
	}
	
	/**
	* Test case 3 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML3() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b></b></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(1, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
	}
	
	/**
	* Test case 4 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML4() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(1, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
	}
	
	/**
	* Test case 5 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML5() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b><c>text</c></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(2, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
		assertEquals("c", result.getChild(1).getTagName());
		assertEquals("text", result.getChild(1).getText());
	}
	
	/**
	* Test case 6 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML6() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b><c>text</c><d>text</d></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(3, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
		assertEquals("c", result.getChild(1).getTagName());
		assertEquals("text", result.getChild(1).getText());
		assertEquals("d", result.getChild(2).getTagName());
		assertEquals("text", result.getChild(2).getText());
	}
	
	/**
	* Test case 7 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML7() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b><c>text</c><d>text</d><e>text</e></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(4, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
		assertEquals("c", result.getChild(1).getTagName());
		assertEquals("text", result.getChild(1).getText());
		assertEquals("d", result.getChild(2).getTagName());
		assertEquals("text", result.getChild(2).getText());
		assertEquals("e", result.getChild(3).getTagName());
		assertEquals("text", result.getChild(3).getText());
	}
	
	/**
	* Test case 8 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML8() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b><c>text</c><d>text</d><e>text</e><f>text</f></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(5, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
		assertEquals("c", result.getChild(1).getTagName());
		assertEquals("text", result.getChild(1).getText());
		assertEquals("d", result.getChild(2).getTagName());
		assertEquals("text", result.getChild(2).getText());
		assertEquals("e", result.getChild(3).getTagName());
		assertEquals("text", result.getChild(3).getText());
		assertEquals("f", result.getChild(4).getTagName());
		assertEquals("text", result.getChild(4).getText());
	}
	
	/**
	* Test case 9 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML9() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b><c>text</c><d>text</d><e>text</e><f>text</f><g>text</g></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(6, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
		assertEquals("c", result.getChild(1).getTagName());
		assertEquals("text", result.getChild(1).getText());
		assertEquals("d", result.getChild(2).getTagName());
		assertEquals("text", result.getChild(2).getText());
		assertEquals("e", result.getChild(3).getTagName());
		assertEquals("text", result.getChild(3).getText());
		assertEquals("f", result.getChild(4).getTagName());
		assertEquals("text", result.getChild(4).getText());
		assertEquals("g", result.getChild(5).getTagName());
		assertEquals("text", result.getChild(5).getText());
	}
	
	/**
	* Test case 10 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* It tests the case when the input is valid.
	*/
	@Test
	public void testParseXML10() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a><b>text</b><c>text</c><d>text</d><e>text</e><f>text</f><g>text</g><h>text</h></a>"));
		boolean validateDTD = false;
		String schemaType = null;
		InputSource schema = null;
		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
		assertEquals("a", result.getTagName());
		assertEquals(7, result.getChildCount());
		assertEquals("b", result.getChild(0).getTagName());
		assertEquals("text", result.getChild(0).getText());
		assertEquals("c", result.getChild(1).getTagName());
		assertEquals("text", result.getChild(1).getText());
		assertEquals("d", result.getChild(2).getTagName());
		assertEquals("text", result.getChild(2).getText());
		assertEquals("e", result.getChild(3).getTagName());
		assertEquals("text", result.getChild(3).getText());
		assertEquals("f", result.getChild(4).getTagName());
		assertEquals("text", result.getChild(4).getText());
		assertEquals("g", result.getChild(5).getTagName());
		assertEquals("text", result.getChild(5).getText());
		assertEquals("h", result.getChild(6).getTagName());
		assertEquals("text", result.getChild(6).getText());
	}
}
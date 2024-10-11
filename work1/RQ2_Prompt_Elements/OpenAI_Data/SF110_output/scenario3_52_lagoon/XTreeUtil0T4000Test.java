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
	* Test case 1 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML1() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 2 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML2() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		Element root = XTreeUtil.parseXML(xmlInput, false, "http://www.w3.org/2001/XMLSchema", null);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 3 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML3() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'><xs:element name='root'/></xs:schema>"));
		Element root = XTreeUtil.parseXML(xmlInput, false, "http://www.w3.org/2001/XMLSchema", schema);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 4 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML4() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 5 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML5() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", null);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 6 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML6() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'><xs:element name='root'/></xs:schema>"));
		Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", schema);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 7 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML7() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		Element root = XTreeUtil.parseXML(xmlInput, false, "http://relaxng.org/ns/structure/1.0", null);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 8 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML8() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		InputSource schema = new InputSource(new StringReader("<element name='root'/>"));
		Element root = XTreeUtil.parseXML(xmlInput, false, "http://relaxng.org/ns/structure/1.0", schema);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 9 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML9() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		Element root = XTreeUtil.parseXML(xmlInput, true, "http://relaxng.org/ns/structure/1.0", null);
		assertEquals("root", root.getTagName());
	}
	
	/**
	* Test case 10 for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	* It tests the method with a valid XML document.
	*/
	@Test
	public void testParseXML10() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root/>"));
		InputSource schema = new InputSource(new StringReader("<element name='root'/>"));
		Element root = XTreeUtil.parseXML(xmlInput, true, "http://relaxng.org/ns/structure/1.0", schema);
		assertEquals("root", root.getTagName());
	}
}
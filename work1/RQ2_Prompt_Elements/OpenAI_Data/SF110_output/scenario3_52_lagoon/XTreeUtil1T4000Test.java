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
* It contains ten unit test cases for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtilTest {

	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document.
	 */
	@Test
	void testParseXMLSequential_Valid() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(Element element, Attributes atts) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getChildCount());
			}
			public void onEnd(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(3, element.getChildCount());
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'><xs:element name='root'><xs:complexType><xs:sequence><xs:element name='a' type='xs:string'/><xs:element name='b' type='xs:string'/><xs:element name='c' type='xs:string'/></xs:sequence></xs:complexType></xs:element></xs:schema>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(Element element, Attributes atts) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getChildCount());
			}
			public void onEnd(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(3, element.getChildCount());
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, "http://www.w3.org/2001/XMLSchema", schema, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root (a,b,c)>]><root><a/><b/><c/></root>"));
		InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'><xs:element name='root'><xs:complexType><xs:sequence><xs:element name='a' type='xs:string'/><xs:element name='b' type='xs:string'/><xs:element name='c' type='xs:string'/></xs:sequence></xs:complexType></xs:element></xs:schema>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(Element element, Attributes atts) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getChildCount());
			}
			public void onEnd(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(3, element.getChildCount());
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, true, "http://www.w3.org/2001/XMLSchema", schema, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root (a,b,c)>]><root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(Element element, Attributes atts) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getChildCount());
			}
			public void onEnd(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(3, element.getChildCount());
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, true, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void onStart(Element element, Attributes atts) {
				assertEquals("root", element.getLocalName());
				assertEquals(0, element.getChildCount());
			}
			public void onEnd(Element element) {
				assertEquals("root", element.getLocalName());
				assertEquals(3, element.getChildCount());
			}
		};
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, null);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<a/><b/><c/>"));
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, null);
		assertEquals("root", root.getLocalName());
		assertEquals(3, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader(""));
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, null);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput() throws Exception {
		InputSource xmlInput = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, null);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, "http://www.w3.org/2001/XMLSchema", schema, null);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema_NoSchemaType() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, schema, null);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema_NoSchemaType_NoValidateDTD() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, schema, null);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema_NoSchemaType_NoValidateDTD_NoHandler() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		ElementHandler handler = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, schema, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema_NoSchemaType_NoValidateDTD_NoHandler_NoInput() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		ElementHandler handler = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, schema, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema_NoSchemaType_NoValidateDTD_NoHandler_NoInput_NoSchema() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		ElementHandler handler = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, schema, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	@Test
	void testParseXMLSequential_Valid_Validator_DTD_NoSchema_NoDTD_NoHandler_NoRoot_NoChildren_NoInput_NoSchema_NoSchemaType_NoValidateDTD_NoHandler_NoInput_NoSchema_NoSchemaType() throws Exception {
		InputSource xmlInput = null;
		InputSource schema = null;
		ElementHandler handler = null;
		Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, schema, handler);
		assertEquals("root", root.getLocalName());
		assertEquals(0, root.getChildCount());
	}
	
	/**
	 * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
	 * with a valid XML document and a validator.
	 */
	
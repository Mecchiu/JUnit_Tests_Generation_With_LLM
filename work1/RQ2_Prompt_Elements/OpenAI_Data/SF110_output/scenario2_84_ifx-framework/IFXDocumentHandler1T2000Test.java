// IFXDocumentHandlerTest.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandlerTest {

	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of a valid IFX document.
	*/
	@Test
	void testParseValidIFXDocument() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml"));
		IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		assertNotNull(ifxObject);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an invalid IFX document.
	*/
	@Test
	void testParseInvalidIFXDocument() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid namespace.
	*/
	@Test
	void testParseIFXDocumentWithInvalidNamespace() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-namespace.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid root element.
	*/
	@Test
	void testParseIFXDocumentWithInvalidRootElement() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-root-element.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid element.
	*/
	@Test
	void testParseIFXDocumentWithInvalidElement() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-element.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid attribute.
	*/
	@Test
	void testParseIFXDocumentWithInvalidAttribute() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-attribute.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid attribute value.
	*/
	@Test
	void testParseIFXDocumentWithInvalidAttributeValue() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-attribute-value.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid element value.
	*/
	@Test
	void testParseIFXDocumentWithInvalidElementValue() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-element-value.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid element value.
	*/
	@Test
	void testParseIFXDocumentWithInvalidElementValue2() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-element-value2.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid element value.
	*/
	@Test
	void testParseIFXDocumentWithInvalidElementValue3() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-element-value3.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* It tests the parsing of an IFX document with an invalid element value.
	*/
	@Test
	void testParseIFXDocumentWithInvalidElementValue4() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid-element-value4.xml"));
		assertThrows(IFXException.class, () -> {
			IFXObject ifxObject = IFXDocumentHandler.parse(doc);
		});
	}
}
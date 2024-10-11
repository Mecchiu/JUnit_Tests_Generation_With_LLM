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
* It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandlerTest {

	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is null.
	*/
	@Test
	public void testRead_NullInputStream() {
		try {
			IFXDocumentHandler.read(null, false, null);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is null", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is empty.
	*/
	@Test
	public void testRead_EmptyInputStream() {
		try {
			IFXDocumentHandler.read(new ByteArrayInputStream(new byte[0]), false, null);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is empty", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is not an XML stream.
	*/
	@Test
	public void testRead_NotXMLInputStream() {
		try {
			IFXDocumentHandler.read(new ByteArrayInputStream("This is not an XML stream".getBytes()), false, null);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is not an XML stream", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is an XML stream but not an IFX stream.
	*/
	@Test
	public void testRead_NotIFXInputStream() {
		try {
			IFXDocumentHandler.read(new ByteArrayInputStream("<root></root>".getBytes()), false, null);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is not an IFX stream", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is an IFX stream but not a valid IFX stream.
	*/
	@Test
	public void testRead_NotValidIFXInputStream() {
		try {
			IFXDocumentHandler.read(new ByteArrayInputStream("<IFX></IFX>".getBytes()), false, null);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is not a valid IFX stream", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is a valid IFX stream but not a valid IFX stream according to the schema.
	*/
	@Test
	public void testRead_NotValidIFXInputStreamAccordingToSchema() {
		try {
			IFXDocumentHandler.read(new ByteArrayInputStream("<IFX><SignonRq></SignonRq></IFX>".getBytes()), true, null);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is not a valid IFX stream according to the schema", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is a valid IFX stream according to the schema.
	*/
	@Test
	public void testRead_ValidIFXInputStreamAccordingToSchema() {
		try {
			IFXDocumentHandler.read(new ByteArrayInputStream("<IFX><SignonRq><ClientDt>2001-01-01</ClientDt></SignonRq></IFX>".getBytes()), true, null);
		} catch (IFXException e) {
			fail("Unexpected IFXException");
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is a valid IFX stream but not a valid IFX stream according to the schema.
	*/
	@Test
	public void testRead_NotValidIFXInputStreamAccordingToSchema_WithValidationProperties() {
		try {
			Map validationProperties = new HashMap();
			validationProperties.put("schema", "ifx_v1_0.xsd");
			validationProperties.put("namespace", "http://www.ifxforum.org/IFX/1.0");
			IFXDocumentHandler.read(new ByteArrayInputStream("<IFX><SignonRq></SignonRq></IFX>".getBytes()), true, validationProperties);
			fail("Expected IFXException");
		} catch (IFXException e) {
			assertEquals("InputStream is not a valid IFX stream according to the schema", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the case when the input stream is a valid IFX stream according to the schema.
	*/
	@Test
	public void testRead_ValidIFXInputStreamAccordingToSchema_WithValidationProperties() {
		try {
			Map validationProperties = new HashMap();
			validationProperties.put("schema", "ifx_v1_0.xsd");
			validationProperties.put("namespace", "http://www.ifxforum.org/IFX/1.0");
			IFXDocumentHandler.read(new ByteArrayInputStream("<IFX><SignonRq><ClientDt>2001-01-01</ClientDt></SignonRq></IFX>".getBytes()), true, validationProperties);
		} catch (IFXException e) {
			fail("Unexpected IFXException");
		}
	}
}
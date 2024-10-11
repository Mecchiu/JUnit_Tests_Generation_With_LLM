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
	* It tests the method with a valid IFX document.
	*/
	@Test
	void testReadValidIFXDocument() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Document doc = IFXDocumentHandler.read(istream, true, null);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and a valid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithValidSchemaLocation() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx.xsd");
		Document doc = IFXDocumentHandler.read(istream, true, validationProperties);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocation() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx-invalid.xsd");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, validationProperties);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and a valid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithValidSchemaLocationAndNoValidation() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx.xsd");
		Document doc = IFXDocumentHandler.read(istream, false, validationProperties);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocationAndNoValidation() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx-invalid.xsd");
		Document doc = IFXDocumentHandler.read(istream, false, validationProperties);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and a valid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithValidSchemaLocationAndNoValidationProperties() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Document doc = IFXDocumentHandler.read(istream, true, null);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocationAndNoValidationProperties() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, null);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with an invalid IFX document.
	*/
	@Test
	void testReadInvalidIFXDocument() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid.xml");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, null);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with an invalid IFX document and a valid schema location.
	*/
	@Test
	void testReadInvalidIFXDocumentWithValidSchemaLocation() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx.xsd");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, validationProperties);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with an invalid IFX document and an invalid schema location.
	*/
	@Test
	void testReadInvalidIFXDocumentWithInvalidSchemaLocation() throws IFXException {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx-invalid.xsd");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, validationProperties);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with an invalid IFX document and a valid schema location.
	*/
	@Test
	void testReadInvalidIFXDocument
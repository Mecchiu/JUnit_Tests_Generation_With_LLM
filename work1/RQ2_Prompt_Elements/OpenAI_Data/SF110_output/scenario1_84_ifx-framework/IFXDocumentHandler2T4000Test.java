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
	void testReadValidIFXDocument() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		IFXDocumentHandler.read(istream, true, null);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with an invalid IFX document.
	*/
	@Test
	void testReadInvalidIFXDocument() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-invalid.xml");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, null);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and a valid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithValidSchemaLocation() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx.xsd");
		IFXDocumentHandler.read(istream, true, validationProperties);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocation() throws Exception {
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
	void testReadValidIFXDocumentWithValidSchemaLocationAndNoValidation() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx.xsd");
		IFXDocumentHandler.read(istream, false, validationProperties);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocationAndNoValidation() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		Map validationProperties = new java.util.HashMap();
		validationProperties.put("http://www.ifxforum.org/ifx/2.1/ifx.xsd", "http://www.ifxforum.org/ifx/2.1/ifx-invalid.xsd");
		IFXDocumentHandler.read(istream, false, validationProperties);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and a valid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithValidSchemaLocationAndNoValidationProperties() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		IFXDocumentHandler.read(istream, true, null);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocationAndNoValidationProperties() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.read(istream, true, null);
		});
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and a valid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithValidSchemaLocationAndNoValidationPropertiesAndNoValidation() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		IFXDocumentHandler.read(istream, false, null);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* It tests the method with a valid IFX document and an invalid schema location.
	*/
	@Test
	void testReadValidIFXDocumentWithInvalidSchemaLocationAndNoValidationPropertiesAndNoValidation() throws Exception {
		InputStream istream = getClass().getResourceAsStream("/org/sourceforge/ifx/utils/ifx-valid.xml");
		IFXDocumentHandler.read(istream, false, null);
	}
}
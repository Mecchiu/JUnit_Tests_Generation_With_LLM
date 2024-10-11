// IFXDocumentHandler_1Test.java
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
* It contains one unit test case for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_1Test {
		
	private final IFXDocumentHandler IFXDocumentHandler_1;
	 
	/**
	 * Constructor to create a test object
	*
	*/
    public IFXDocumentHandler_1Test(){
		IFXDocumentHandler_1 = new IFXDocumentHandler();
	}
	
	
	/**
     * Tests creation and parsing of a document using the factory methods.
	 * @throws IFXException if there was problem parsing or reading from the specified
	 * InputStream.
	*/
	@Test
	void factoryMethodsTest() throws IFXException {
		IFXObject object = null;

		try {
			object = ifxDoc.getIfX().newIFXElement(_IFXName.IFX_XML);
		} catch (Throwable t) {
			fail("Unexpected Exception - " + t);
		}

		assertNotNull("The IFX Document could not be created.", object);
		Document document = build(object, null, null);

		assertNotNull("The expected document object could not be found.", document);
		Object value = IFXDocumentHandler_1.decode(document);
		assertNotNull("The expected decoded Document could not be found.", value);
		assertEquals("The value of the Element decoded should match the value of the object", value, object);

		try {
			IFXObject temp = ifxDoc.getIfX().newIFXElement(_IFXName.IFX_XML);
		} catch (Throwable t) {
			fail("Unexpected Exception - " + t);
		}
		Object outputObject = IFXDocumentHandler_1.decode(document);
		assertNotNull("The returned object should have an object of type IFXObject", outputObject);
		assertEquals("The decoded object is invalid",outputObject,temp);

		//Validate the following for the document
		assertValidTestDocument(object.getIFX());

		object = null;
		try {
			value = ifxDoc.getIfX().newIFXElement(_IFXName.IFX_XML);
		} catch (Throwable t) {
			fail("Unexpected Exception - " + t);
		}

		try {
			outputObject = ifxDoc.getIfX().newIFXElement(_IFXName.IFX_XML);
		} catch (Throwable t) {
			fail("Unexpected Exception - " + t);
		}
		assertNotNull("The returned object should have an object of type IFXObject", outputObject);

		try {
			value = ifxDoc.getIfX().newIFXElement(_IFXName.IFX_XML);
		} catch (Throwable t) {
			fail("Unexpected Exception - " + t);
		}
		
		assertNotNull("The decoded object should be valid",value);

		//Test getting a validator of a valid object type
		String name = "Valid";
		Object objectValidator = ifxDoc.getIfX().newIFXAttribute(_IFXName.IFX_ATT_NAME, name);

		assertNotNull("Checking validator for the name attribute", objectValidator);
	}


	/**
	 * Test the creation of a document by the factory methods
	 * @throws IFXException if there was an error during the creation of the document.
	*/
	@Test
	void factoryMethodsValid() throws Exception{
		ifxDoc.getIfX().newIFXElement("IFX_XML");
		ifxDoc.getIfX().newIFXAttribute(_IFXName.IFX_ATT_NAME, _IFXName.IFX_ATT_NAME);
		ifxDoc.getIfX().newIFXAttribute(_IFXName.IFX_ATT_LANGUAGE, "en");
		
		ifxDoc.create(_IFXName.IFX_XML, _IFXName.IFX_XML, _IFXBuilder.IFX_XMLBuilder_1);
		ifxDoc.create(_IFXName.IFX_XML);
		
		IFXObject doc = ifxDoc.getIfX();

}
}
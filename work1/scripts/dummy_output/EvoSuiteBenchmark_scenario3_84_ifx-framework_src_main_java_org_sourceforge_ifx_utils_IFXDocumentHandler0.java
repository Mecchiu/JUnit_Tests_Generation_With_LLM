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
* It contains ten unit test cases for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandlerTest {
		
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is {@code null}.
	* Expected result: {@code IllegalArgumentException} is thrown.
	*/
	@Test
	void testBuild_objIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			IFXDocumentHandler.build(null, "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code namespacePrefix} parameter is {@code null}.
	* Expected result: {@code IllegalArgumentException} is thrown.
	*/
	@Test
	void testBuild_namespacePrefixIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IllegalArgumentException} is thrown.
	*/
	@Test
	void testBuild_namespaceURIIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", null);
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespaceURIIsEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsEmpty_namespaceURIIsEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsNotEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "prefix", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespaceURIIsNotEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "uri");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsNotEmpty_namespaceURIIsNotEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "prefix", "uri");
		});
	}
}
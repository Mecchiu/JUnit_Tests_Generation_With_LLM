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
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is not {@code null}, and the {@code namespaceURI} parameter is not {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNotNull_namespaceURIIsNotNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is not {@code null}, and the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNotNull_namespaceURIIsNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", null);
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is {@code null}, and the {@code namespaceURI} parameter is not {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNull_namespaceURIIsNotNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is {@code null}, and the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNull_namespaceURIIsNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, null);
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is not {@code null}, and the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNotNull_namespaceURIIsNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", null);
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is {@code null}, and the {@code namespaceURI} parameter is not {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNull_namespaceURIIsNotNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is not {@code null}, and the {@code namespaceURI} parameter is not {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNotNull_namespaceURIIsNotNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is {@code null}, and the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNull_namespaceURIIsNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, null);
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is not {@code null}, the {@code namespacePrefix} parameter is {@code null}, and the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsNotNull_namespacePrefixIsNull_namespaceURIIsNull() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, null);
		});
	}
}
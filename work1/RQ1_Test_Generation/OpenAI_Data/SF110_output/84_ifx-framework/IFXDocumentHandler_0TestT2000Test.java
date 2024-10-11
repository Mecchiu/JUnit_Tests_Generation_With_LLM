// IFXDocumentHandler_0Test.java
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
class IFXDocumentHandler_0Test {

	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_0() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_1() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_2() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_3() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_4() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_5() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_6() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_7() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_8() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_9() throws IFXException {
		IFXObject obj = new IFXObject();
		String namespacePrefix = "";
		String namespaceURI = "";
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
}

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
* It contains ten unit test cases for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
*/
class IFXDocumentHandler_1Test {
		
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_0() throws IFXException {
		Document doc = new Document();
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = new OutputStream();
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_1() throws IFXException {
		Document doc = new Document();
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = new OutputStream();
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_2() throws IFXException {
		Document doc = new Document();
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = new OutputStream();
		IFXDocumentHandler.write(doc, indentSize, lineSep
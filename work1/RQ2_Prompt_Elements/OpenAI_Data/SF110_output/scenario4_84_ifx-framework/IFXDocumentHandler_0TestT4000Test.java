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
		IFXObject obj = null;
		String namespacePrefix = null;
		String namespaceURI = null;
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_1() throws IFXException {
		IFXObject obj = null;
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
		IFXObject obj = null;
		String namespacePrefix = "";
		String namespaceURI = null;
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_3() throws IFXException {
		IFXObject obj = null;
		String namespacePrefix = null;
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
		IFXObject obj = null;
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
		IFXObject obj = null;
		String namespacePrefix = "";
		String namespaceURI = null;
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_6() throws IFXException {
		IFXObject obj = null;
		String namespacePrefix = null;
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
		IFXObject obj = null;
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
		IFXObject obj = null;
		String namespacePrefix = "";
		String namespaceURI = null;
		Document result = IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild_9() throws IFXException {
		IFXObject obj = null;
		String namespacePrefix = null;
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
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = null;
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_1() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_2() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = null;
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_3() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_4() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_5() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = null;
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_6() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_7() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_8() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = null;
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite_9() throws IFXException {
		Document doc = null;
		int indentSize = 0;
		String lineSeparator = "";
		OutputStream ostream = null;
		IFXDocumentHandler.write(doc, indentSize, lineSeparator, ostream);
	}
}

// IFXDocumentHandler_2Test.java
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
class IFXDocumentHandler_2Test {
		
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_0() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_1() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_2() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_3() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_4() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_5() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_6() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse_7() throws IFXException {
		Document doc = null;
		IFXObject result = IFXDocumentHandler.parse(doc);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test

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
	* It tests the case when the namespace prefix is null.
	*/
	@Test
	void testBuild_1() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, null);
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null.
	*/
	@Test
	void testBuild_2() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testBuild_3() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", null);
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is not null.
	*/
	@Test
	void testBuild_4() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is not null.
	*/
	@Test
	void testBuild_5() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testBuild_6() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", null);
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is null.
	*/
	@Test
	void testBuild_7() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, null);
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is not null.
	*/
	@Test
	void testBuild_8() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is not null.
	*/
	@Test
	void testBuild_9() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testBuild_10() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", null);
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
}
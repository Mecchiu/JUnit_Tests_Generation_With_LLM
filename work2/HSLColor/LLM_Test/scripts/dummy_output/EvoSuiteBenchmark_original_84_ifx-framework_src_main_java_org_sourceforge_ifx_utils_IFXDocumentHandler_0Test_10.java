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
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
		@Test
		void testBuild() throws IOException {
			Document doc = build(null, null, null);
			assertTrue("No document should be created", doc.getRootElement()!= null);
			assertTrue("No document should be created", doc.getRootElement().isEmpty());

			Document root = build(null, null, "root");
			assertTrue("No root should be created", root.getRootElement()!= null);
			assertTrue("The document should inherit its owner namespace", doc.getRootElement().getNamespaceURI().equals(root.getNamespaceURI()));
			assertEquals(doc.getRootElement().getTree(), root.getRootElement().getTree());

			root = build(null, "p", "root");
			assertTrue("No root should be created", root.getRootElement()!= null);
			assertTrue("The document should inherit its owner namespace", doc.getRootElement().getNamespaceURI().equals(root.getNamespaceURI()));
			assertEquals(doc.getRootElement().getTree(), root.getRootElement().getTree());
		}

		@Test
		void testAddObjectNamespace() throws IOException {
			Document doc = build(null, null, null);
			Element e = doc.getRootElement();
			try {
				addObjectNamespace(e, "myns", "myns=nsname");
				assertEquals("The namespace is expected to be the new document namespace", doc.getRootElement().getNamespaceURI().equals("myns"), true);
			} catch (Exception ex) {
				assertTrue("The exception should be a DocumentException", ex instanceof DocumentException);
			}
		}
}

/**
 * Test implementation of IFXDocumentHandler.
 */
class IFXObject_0Test {
	@Test
	void testElemNotNull() throws IOException {
		Document doc = build("root", null, null);
		assertNull("The root element should not be null.", doc.getRootElement());
	}

	@Test
	void testElemEq() throws IOException {
		Document doc = build("root", null, null);
		Document doc2 = build("root", null, "root");

		assertEquals(doc, doc2);
	}

	@Test
	void testElemNotEq() throws IOException {
		Document doc = build("root", null, null);
		Document doc2 = build("root", null, "root");

		assertNotEquals(doc, doc2);
	}

	@Test
	void testElemEqNotNull() throws IOException {
		Document doc = build("root", null, null);
		Document doc2 = build("root", null, "root");

		assertNotNull("The root element should not be null.", doc.getRootElement());
		assertEquals(doc, doc2);
	}

	@Test
	void testOutputFormat() throws IOException {
		Document doc = build("root", null, null);
		Document doc2 = build("root", "ns", "ns=");

		assertEquals("The document should be in output format.", DocumentUtil.format(doc), DocumentUtil.format(doc2));
	}

	@Test
	void testAddNamespaces() throws IOException {
		Namespace namespaces = new Namespace("P", "ns");

		Document doc = build("root", null, null);
		Document doc2 = build("root", namespaces, "ns=");

		assertEquals(doc, doc2);
	}

	@Test
	void testAddElem() throws IOException {
		Document doc = build("root", null, null);
		Element e = doc.getRootElement() == null? null : doc.getRootElement().tree;

		assertEquals(null, e);
	}

	@Test
	void testAddElemNotNull() throws IOException {
		Document doc = build("root", null, null);
		Element e = doc.getRootElement();

		assertNotNull("The element should not be null.", e);
	}

	@Test
	void testAddElemEq() throws IOException {
}
}
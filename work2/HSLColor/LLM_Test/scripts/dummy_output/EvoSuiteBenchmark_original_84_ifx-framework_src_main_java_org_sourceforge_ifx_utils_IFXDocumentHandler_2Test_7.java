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
* It contains one unit test case for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {
		
    /**
     * Validates IFX XML from stdin.
     * @param indentSize the size of the indent in the output. A value of zero forces
     * the output to NOT indent. 
     * @exception IFXException if there was a problem verifying the document.
     */
    @Test
    void read(int indentSize) throws IFXException {
	Document doc = read("<root>"
				+ "<person>\n"
				+ "<name>John Smith</name>\n"
				+ "<gender>male</gender>\n"
				+ "</person>\n"
				+ "</root>", true, null);
		assertEquals("root", doc.getRootElement().getName().getLocalPart());
		assertTrue("missing name", doc.getRootElement().hasChildNodes(true));
	
		Element person = doc.getRootElement().getChild("person", "person", true);
		assertNotNull("missing name", person);
		assertEquals("person", person.getName().getLocalPart());
		assertEquals("John Smith", person.getFirstChild().getText());
		
	
		Document userDoc = read("<user>"
				+ "<name>John Smith</name>"
				+ "<email>foo@bar.com</email>"
				+ "<address><address>foo@bar.com</address></address>"
				+ "<homepage><url>http://freda.com</url></homepage>"
				+ "<location><address><street>foo-bar</street></address></location>"
				+ "<emailAddress<emailAddress>bar&test@foobar.co.uk</emailAddress></emailAddress>"
				+ "</user>"
				+ "<person><name>John Smith</name><email>foo@bar.com</email></person>"
				+ "</user>", true, null);
		assertNotNull("missing emailaddress", userDoc.getRootElement().getChild("emailAddress", "emailAddress"));
		assertNotNull("missing name", userDoc.getRootElement().getChild("name", "name", true));
		assertNotNull("missing emailaddress", userDoc.getRootElement().getChild("emailAddress", "emailAddress"));
		
		documentHasNodes(userDoc, "address","office", "address-line*", "address.street*", "mailto:");
		
	}

    /**
     * Validates output from IFXXMLStreamWriter.read()
     * @param indentSize the size of the indent in the output. A value of zero forces
     * the output to NOT indent. 
     * @exception IFXException if there was a problem validating the document.
     */
    @Test
    void readWriterNullIndentSize(int indentSize) throws IFXException {
	Document doc = build("<root/>", null, null);
		assertEquals("null indent size", indentSize, doc.getRootElement().getIndentSize());
		assertEquals("false indent", false, doc.getRootElement().getIndentInside());
		assertEquals("false indent inside", false, doc.getRootElement().getIndentInsideAtLevel());
	
		Document userDoc = build("<user/>", null, null);
		assertEquals("null indent size", indentSize, userDoc.getRootElement().getIndentSize());
		assertEquals("false indent", false, userDoc.getRootElement().getIndentInside());
		assertEquals("false indent inside", false, userDoc.getRootElement().getIndentInsideAtLevel());
	}

	/**
	* Validates output of Document as XML through
	* the standard java.io.Writer interface.
	* @param lineSeparator the line separator for the input stream.
	* A value of null implies no line separator.
	* @param document the Document to format.
	* @exception IFXException if there was a problem formatting.
	*/
	private static void documentHasNodes(Document document, String name, String namespaceURI, String defaultPrefix, String defaultNs) throws IFXException {
		
		Namespace xsi = document.getRootElement().getNamespace(Namespaces.XSI_NS);
}
}
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
public final String DOC_TESTSET[] = {
						"root0", // No child element.
						"root1a", // One child element.
						"root1b", // One child nested element.
						"root2", // One child child element.
						"root2b", // One child nested child element.
						"root3", // One child child nested child element.
						"root4", // One nested element.
						"child_1",  // One child element.
						"root5", // One child child element.
						"child_5", // One child nested child element.
						"child_6", // One child child nested child element.
						"child_7", // One nested child element.
						"child_8", // One nested child element.
						"child_9", // One nested child element.
						"child_10", // One nested child element.
						"child_11", // One nested child element.
						"root_1a", // Child element.

						"root_2", // Child element.
						"child_6",  // Child element.
						"child_7",  // Child element.
						"child_8",  // Child element.
						"child_9",  // Child element.
						"child_10", // Child element.
						"root_4",  // Child root element.
						"child_5",

						"child_4",  // Child root element.
						"child_5b", // Child nested element.
						"child_5c", // Child nested child element.
						"child_6",  // Child nested child element.
						"child_6b", // Child nested child nested child element.
						"child_7",  // Child nested child nested child element.
						"child_8",  // Child nested child element.
						"child_9",  // Child nested child element.
						"child_10", // Child nested child element.
	};

    /**
     * Constructs an empty Document object.
     */
    public IFXDocumentHandler_2Test() {
    }

////////////////// Test Method declarations //////////////////////

    @Test
    public void testRead(){
        // Tests the Document constructor.
        Document d = read(new ClassLoaderResource("org/sourceforge/ifx/utils/"+Doc_TESTSET[4]),"true","");
        assertNotNull(d);
        assertEquals(Doc_TESTSET[4], d.getDocumentElement().getName());
        assertTrue(d.getPublicId(){});
        assertTrue(d.getSystemId()!= null);
        
        // The getNamespaces() method is used internally.
        Iterator it = d.getNamespaces().iterator();
        assertNotNull(it);
    }

	@Test
	public void testReadXML() throws IOException {

		SAXBuilder sb = new SAXBuilder();
		sb.setDocumentHandler(this);

		Document document = sb.build(new ClassLoaderResource("org/sourceforge/ifx/utils/"+Doc_TESTSET[5]));

		// Test the getPublicId() method.
		assertNotNull( document.getPublicId() );
		assertEquals(Doc_TESTSET[5], document.getPublicId());

		// Test getSystemId().
		assertNotNull( document.getSystemId() );
		assertNotNull( document.getSystemId() );

		// Test setDocumentHandler(Document d, IFXDocumentHandler handler):
		document.setDocumentHandler(this);

		// Test getDocumentType(Document d)
		assertNotNull( document.getDocumentType() );
		assertEquals( "XML", document.getDocumentType().getDomName() );

		// Test setDocumentHandler(IFXDocumentHandler handler)
		document.removeAttribute ("version");
		document.setDocumentHandler(this);
		document.setDocumentType(null);
	}

	@Test
	public void testReadSAXOutput() throws IOException {

		SAXBuilder sb = new SAXBuilder();
		sb.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested = new SAXBuilder(Namespace.XML_NAMESPACE);
		sb_nested.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_1 = new SAXBuilder(Namespace.XML_NAMESPACE);
		sb_nested_1.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_2 = new SAXBuilder(Namespace.XMLNS_ATTR_NS, Namespace.XMLNS_NULLNS);
		sb_nested_2.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_3 = new SAXBuilder(Namespace.XMLNS_ATTR_NULL, Namespace.XMLNS_NULLNS);
		sb_nested_3.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_4 = new SAXBuilder(Namespace.XMLNS_ATTR_NULL,
				Namespace.XMLNS_NULLNS);
		sb_nested_4.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_5 = new SAXBuilder(Namespace.XMLNS_NULL_ATTR_NS, Namespace.XMLNS_NULL_NULLNS);
		sb_nested_5.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_6 = new SAXBuilder(Namespace.XMLNS_NULL_ATTR_NULL, Namespace.XMLNS_NULL_NULLNS);
		sb_nested_6.setDOMOutput(new XMLOutputter().getDOMOutput());

		SAXBuilder sb_nested_7 = new SAXBuilder(Namespace.XMLNS_NULL_NULL_ATTR_NS,
				Namespace.XMLNS_NULL_NULL_NULLNS);
		sb_nested_7.setDOMOutput(new XMLOutputter().getDOMOutput());

		
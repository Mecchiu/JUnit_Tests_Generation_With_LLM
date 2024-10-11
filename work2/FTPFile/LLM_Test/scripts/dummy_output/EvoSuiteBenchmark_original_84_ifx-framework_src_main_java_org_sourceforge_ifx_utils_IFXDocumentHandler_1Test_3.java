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
		/**
 		 * Test methods.
 		 */
	@Test
	public void testParsing() throws IFXException, IOException
	{
		//create the document to parse from
		Document document = buildDocument("ifx_test1_doc.xml", null, null);

		//use the DocumentBuilder() constructor to build the builder
		DocumentBuilder builder = new DocumentBuilder(document);

		//create a map from each namespace URI to its corresponding object
		Map<String, Object> map = builder.getParameterNamespaces();
	}

	@Test
	public void testValidating() throws IFXException, IOException
	{
		//create the document to parse
		Document document = buildDocument("ifx_test1.xml", null, null);

		//use the DocumentBuilder() constructor to build the builder
		DocumentBuilder builder = new DocumentBuilder(document);

		//validate using the DocumentBuilder's validate() method
		Node node = validate(builder.getDocument());
		assertNotNull(node);
	}
	
	@Test
	public void testParsing2() throws IFXException, IOException
	{
		//create the document to parse from
		Document document = buildDocument("ifx_test2_doc2.xml", null, null);

		//use the DocumentBuilder() constructor to build the builder
		DocumentBuilder builder = new DocumentBuilder(document);

		//create a map from each namespace URI to its corresponding object
		Map<String, Object> map = builder.getParameterNamespaces();
	}

	// the ifx object.
	private IFXObject ifxobj;

	/**
	 * Constructor for the Test class.
	*/
	public IFXDocumentHandler_1Test() {

	}

}
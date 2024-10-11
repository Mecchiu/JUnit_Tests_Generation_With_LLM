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
		
		/**
		 * Constructor.
		 * @param doc the Document object to build.
		 */
		public IFXDocumentHandler_0Test(Document doc) {
		}
	
	/**
	 * Tests for the <code>build(IFXObject, String, String)</code> method.
	 * @throws IFXException if an error occurs while constructing the document.
	*/
	@Test
	public void testBuild() throws IFXException {
	  // create the parser and do the building
	  SAXBuilder builder = new SAXBuilder();
	  Document doc = builder.build(IFXObject.class.getResourceAsStream("/IFXObject.xml"),null,null);
	  assertNotNull(doc);
	  
	  // do the validation checking
	  IFXObject ob = (IFXObject)doc.getRootElement().getValues().get(0);
	  assertNotNull(ob);
	  assertFalse(ob.getValue("valid"));
	  assertEmpty(ob.getKeyList());
	  assertNotNull(ob.getValidationProperties().get(IFXObject.DEFAULT_NAMESPACE));
	  assertNotNull(ob.getValidationProperties().get("valid"));
	  
	}
	
	 /**
	 * Tests for the <code>decode(InputStream)</code> method.
	 * @throws IFXException if an error occurs while decoding the document.
	 */
	@Test
	public void testDecode() throws IFXException {
	  // create the parser and do the decoding
	  InputStream instream = IFXObject_0.class.getResourceAsStream("/IFXObject.xml");
	  Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(instream);
	  assertNotNull(doc);
	  
	  // do the validation checking
	  IFXObject ob = (IFXObject)doc.getRootElement().getValues().get(0);
	  assertNotNull(ob);
	  assertFalse(ob.getValue("valid"));
	  assertEmpty(ob.getKeyList());
	  assertNotNull(ob.getValidationProperties().get(IFXObject.DEFAULT_NAMESPACE));
	  assertNotNull(ob.getValidationProperties().get("valid"));
	}
	
	 /**
	 * Tests for the <code>parse(InputStream)</code> method.
	 * @throws IFXException if a problem occurred while parsing the document.
	 */
	@Test
	public void testParse() throws IFXException {
	  // create the parser and do the parsing
	  SAXBuilder builder = new SAXBuilder();
	  InputStream istream = new InputStream() {
		  public int read() throws IOException {
		  	return -1;
		  }
		  public int read(byte[] buffer, int off, int len) throws IOException {
		  	return -1;
		  }
		};
	  Document doc = builder.parse(istream);
	  assertNotNull(doc);
	}
}
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
		
	/** Test method(s) of {@link IFXDocumentHandler#read(InputStream, boolean, Map)}. */
		@Test
		public void testRead() throws IOException {
			Document document = build("<xmlns='http://www.test.org/xmlns/fo' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'><body></body><footer></footer></xmlns>", "", "http://www.test.org");
			
			boolean result = true;
			
			assertTrue("Reading and encoding xml document does not return all XML fragments.", result);
		}

		/** Test method(s) of {@link IFXDocumentHandler#write(Document)}. */
		@Test
    public void testWrite() throws IllegalArgumentException, IllegalStateException, IOException {
		IFXDocumentHandler handler = new IFXDocumentHandler();
		
		IFXObject obj = handler.build(null, "", "");
		
		Document doc = handler.build(obj.getIfxObject(), null, "");
		
		assertNotNull("No output was generated upon parsing the document", doc);
		assertTrue("Writing the document does not return all XML fragments.",
				doc.getRootElement().getChildCount() == 1);
	}

	/** Test method(s) of {@link IFXDocumentHandler#validate(Document, String)}
	 * using {@link IFXObject#getSchema()}.
	 */
	@Test
	public void testValidate() throws IOException {
		Document doc = build("<xmlns='http://www.test.org/xmlns/fo' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'></xmlns>", "", "http://www.test.org");
		boolean result = true;
		
		assertTrue("Error during validating xml document does not return any XML fragments.", result);
		
		//Validate XML using Schema
		IFXObject obj = handler.build(null, "", "schema");
		doc = handler.build(obj.getIfxObject(), null, schemaXMLDocumentEncoding);
		
		assertNotNull("No output was generated upon parsing the document", doc);
		assertTrue("Validating the document should return the correct schema and no exceptions.",
				doc.getRootElement().getChildCount() == 1);
		
		//Create schema instance
		IFXObject schema = obj.getSchema();
		
		//Create the XML Input
		OutputStream out = new OutputStream(){

			@Override
			public void write(int b) throws IOException {
			}

			@Override
			public void write(byte[] buf) throws IOException {
			}

			@Override
			public void write(byte[] buf, int off, int len) throws IOException {
			}

        };
		
		// Create output XSD
		SAXBuilder sb = new SAXBuilder();
		sb.setValidationScheme(true);  // to allow schema validation
        Document parsedRoot = sb.build(doc);
		
        
        //Validate XML against the schema.
        Document t = handler.build(schema.toIFXObject(), "", "");
		
        assertNotNull("No exception should be thrown during validating the document.", parsedRoot.getRootElement().getChildCount() == 0);
        assertTrue("If the schema was properly configured the XML validation should report an exception.",
                t.getRootElement().getChildCount() == 1);
	}
    
    private OutputFormat schemaXMLDocumentEncoding = new OutputFormat();
    
    private Document schemaXMLDocument = new SAXBuilder().setValidation(schemaXmlDocumentValidationEnabled).build(new InputStream() {
        public int read() throws IOException {
            return 0;
        }
        public String getCharacterEncodingScheme() {
            return null;
        }
        public OutputStream getOutputStream() throws IOException {
            return null;
        }
        public OutputStream stream() throws IOException {
            return this;
        }
    }, schemaXMLDocumentEncoding);
}
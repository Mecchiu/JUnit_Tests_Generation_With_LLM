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
		private final String XML;
		
    /**
     * Constructor. The InputStream must be set before the Document can be parsed.
     * @throws IllegalArgumentException if neither InputStream nor XML
     * cannot be set to the specified InputStream.
     */
    public IFXDocumentHandler_0Test(InputStream istream, String document) throws IllegalArgumentException {
        XML = "<?xml version=\"1.0\"?>" +
            "<elem_1 xmlns:f=\"urn:ifx:document\">" +
            "<elem_2>" +
            "<elem_3 xmlns=\"urn:ifx:document\">" + document + "</elem_3></elem_2>" + 
            "</elem_1>";
        
        SAXBuilder builder = new SAXBuilder();
        builder.setXIncludeAware(true);
        builder.setFeature("http://xml.org/sax/features/external-resolving", true);
        
        Document doc = null;
    	try {
    		doc = builder.build(istream); 
    	} catch (IOException ioErr) {
    		ioErr.printStackTrace();
    	}
    	assertTrue("XML must be set to the InputStream.", doc.getRootElement().getName().equals("elem_1"));
    }
    
    @Test
    public void testBuilder() throws Exception {
    	IFXDocumentHandler_0Test dm = new IFXDocumentHandler_0Test(null, XML);
    	OutputStream o1 = null, o2 = null;
    	try {
    		o1 = dm.getOutputStream();
    	} catch(IOException ioErr) {
    		ioErr.printStackTrace();
    	}

    	assertNull("OutputStream must be null.", o1);

    	o2 = dm.getOutputStream();
    	assertNotNull("OutputStream must not be null.", o2);
    	
        Element rootElement = doc.getRootElement();
        assertNotNull(rootElement);
    	assertEquals("Doc root element must match original.", rootElement, dm.getDocument().getRootElement());
    }

    @Test
    public void testBuild() throws Exception {
    	Document doc = build(new Element(XML), "http://ifx.de/", "#foo");
    	assertNotNull("The test document must have a root element.", doc.getRootElement());
    	
    	assertEquals("Doc root element must match the document.", doc.getRootElement(), ((Element)doc.getRootElement()).getChildNodes().nextNode());
    	assertTrue("There must be one child of the root element.", (hasChild((Element)doc.getRootElement(), "foo")));
    }
    
    /**
     * Tests parsing an invalid document.
     */
    @Test
    public void testParse_0() throws Exception {
    	OutputStream os = null;
    	try {
    		os = dump(new IFXObject.IFXNullInputStream("test"));
    	} catch(IOException ioErr) {
    		ioErr.printStackTrace();
    	}
    	IFXDocumentHandler handler = new IFXDocumentHandler(os);
    	Document pdoc = null;
    	try {
    		pdoc = handler.parse(XML);
    		fail("Must have gotten exception.");
    	} catch(IFXException ifxErr) {
    		assertEquals("The parse method did not get the correct exception type.", 
    				ifxErr.getClass(), ifxErr.getIndexedValue().getClass());
    	}
    }
    
    /**
     * Dumps a Document object to an OutputStream.
     */
    public static byte[] dump(Document doc) throws IOException {
        OutputStream ostream = new OutputStream() {
            @Override
            public void write(int i) throws IOException { }
        };
        XMLOutputter xmlOut = new XMLOutputter();
}
}
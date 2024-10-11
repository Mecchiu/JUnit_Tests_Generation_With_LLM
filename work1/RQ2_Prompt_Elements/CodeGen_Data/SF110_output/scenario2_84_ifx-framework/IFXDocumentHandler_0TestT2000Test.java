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
// IFXDocumentHandler.java
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

/**
 * The IFXDocumentHandler provides methods for formatting and validating
 * IFX XML Documents.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.2 $
 */
public class IFXDocumentHandler {

    /**
     * Builds a JDOM Document object from an IFXObject.
     *
     * @param obj the IFXObject object to format.
     * @param namespacePrefix the namespace prefix to use in the output. A
     * value of null implies no prefix. If the namespaceURI is specified it
     * will be treated as the default namespace.
     * @param namespaceURI the namespace URI to use in the output. If specified
     * an xmlns declaration will be prepended to the output.
     * @return a JDOM Document object.
     * @exception IFXException if there was a problem building the document.
     */
    public static Document build(IFXObject obj, String namespacePrefix, String namespaceURI) throws IFXException {
        IFXEncoder encoder = null;
        if (namespaceURI!= null) {
            encoder = new IFXEncoder(namespacePrefix, namespaceURI);
        } else {
            encoder = new IFXEncoder();
        }
        Element element = encoder.encode(obj);
        Document doc = new Document(element);
        return doc;
    }
}

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
		
    /** The test case for build (should throw an IFXException for illegal arguments).*/
    @Test
    void testBuild_IllegalArgumentException() {
        try {
            build( null, null, null );
        }
        catch ( java.lang.Throwable ex ) 
		{
            fail( "Should have thrown an IllegalArgumentException." );
			assertThrownBy( ex, IllegalArgumentException.class, "null inputStream" );
		}
        
        //test illegal document name
   	try {
        	build( "<myDoc1/>" ); // illegal document name in input.
		}
        catch ( java.lang.Throwable ex )
		{
			assertThrownBy( ex, IllegalArgumentException.class, "document name \"<myDoc1\" is not legal" );
		}
        
        //test forbidden namespace declaration
        try {
			build( "<myDoc xmlns=\"myNS\"><foo/>"; // illegal document name in input.
			}
        catch ( java.lang.Throwable ex )
		{
			assertThrownBy( ex, IllegalArgumentException.class, "illegal legal namespace prefix (\"myNS\")" );
		}
        
        //test forbidden namespace prefix
        try {
			build( "<myDoc xmlns:foo=\"myNS\">" // illegal document name in input.
			        + "<foo xmlns=\"myNS2\"/>"            // legal prefix for namespace decl in input.
			        + "<foo>"; // illegal document name in input.
			    }
        catch ( java.lang.Throwable ex )
		{
			assertThrownBy( ex, IllegalArgumentException.class, "illegal legal namespace prefix" );
		}

        //test illegal namespace decl in the body
        try {
		    build( "<bar>My object</bar>" ); // illegal document name in body
            }
        catch ( java.lang.Throwable ex )
		{
            assertThrownBy( ex, IllegalArgumentException.class, "illegal legal namespace declaration" );
		}
        
        //test illegal namespace in the body
    	try {
        	build( "<bar xmlns=\"my NS\"><myNS2/></bar>" ); // illegal namespace declaration.
	        	
	        fail( "Should throw an IllegalArgumentException" );
			
        }
        catch ( java.lang.Throwable ex )
        {
            if ( ex.getMessage().toLowerCase().equals( "illegal namespace declaration" ) )
			{
				System.out.println( "Expected exception." );
				System.out.println( ex.getMessage() );
				return;
			}
			assertTrue( "Expected exception message not found.", ex.getMessage()!= null &&!ex.getMessage().contains( "prefix" ));
			
            assertThrownBy( ex, IllegalArgumentException.class, "illegal legal namespace declaration" );
        }
        
        //test legal content encoding and encoding
        try {
	        build( "<myDoc xmlns=\"myNS\"><text/plain/sx\"><sx/><x/>t</sx/></myDoc>" );
        }
        catch ( java.lang.Throwable ex )
		{
            assertThrownBy( ex, IllegalArgumentException.class, "illegal legal content encoding" );
        }
    }
    
    /** Test object for {@link Document#getRootElement()}. */
    private static class Document_getRootElement_0Test extends IFXResource
    {
        /** Constructor. */
        public Document_getRootElement_0Test(IFXDocumentHandler handler)
        {
            super(handler);
        }
        
		/** Tests if the root element is <myDoc1/>. */
    	public void test() throws IOException
		{
    		doc = null;
    		try {
    			doc = build("<myDoc xmlns=\"myNS\">" + 
    	    			"<foo/></myDoc>", null, null);
    		} finally {
    			doc.getRootElement().clear();
    		}
			assertEquals( doc.getRootElement().getName(), "doc" );
		}
    }
    
    /** Test object for {@link Document#getRootElement()}. */
    private static class Document_getRootElement_1Test extends IFXResource
    {
        /** Constructor. */
        public Document_getRootElement_1Test(IFXDocumentHandler handler)
		{
            super(handler);
        }
        
		/** Tests if the root element is <myDoc1>.*/
    	protected void assertRootElement(IFXDocumentHandler handler, Element expectedRootElement) throws IOException
    	{
    		XMLOutputter out = new XMLOutputter();
    		OutputStream outPut = null;
    		InputStream input;
    		try {
    			input = getIFXDocument().getInputStream();
    			outPut = getOutputStream();
    			outPut.write(input, 0, input.available());
    			handler.beginDocument();
	        	XMLOutputter.getOutputter(Constants.ENCODING).indent(0).encodeAll(new Document(createRootDocument()), outPut, false).flush();
    		} finally {
    			if (outPut!=null) {
            	    outPut.close();
            	} 
    		}
    		assertRootElement(expectedRootElement);
    	}
    	
    	/** {@inheritDoc} */
        protected Document createRootDocument() throws IOException {
            Element document = new Element("doc", Namespace.getNamespace(Constants.ROOT));
            return document;
        }

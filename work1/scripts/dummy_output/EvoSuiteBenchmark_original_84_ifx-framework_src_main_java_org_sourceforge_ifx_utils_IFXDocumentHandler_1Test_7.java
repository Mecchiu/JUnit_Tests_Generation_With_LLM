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
	 * Constructor.
	 * @exception IFXException if there was a problem with the construction of this Unit test case.
	 */
	public IFXDocumentHandler_1Test() throws IFXException {
	}

        /**
	 * Tests the parsing method. It uses the default DocumentBuilderFactory to create
	 * Document objects.
	 * @throws Exception if there was a problem creating a Document object.
	 */
	@Test
	public void testParsing() throws Exception {
		new IFXDocumentHandler();
	}


}

// Interface IFXDocumentHandler.
class IFXDocumentHandler {


	public void write(Document doc, OutputStream ostream) throws IFXException {
		//Create Document object that is initialized to be able to write XML.
		Document write = build(IFXObject.createObject(doc),"", null);
		//Create a temporary OutputStream to write the Document object into.
		OutputStream documentStream = new OutputStream() {
			@Override
			public void write(int c) throws IOException {
				ostream.write(c);
			}
		};
		//Create a new XML Outputter with the current document object as its
		//destination.
		XMLOutputter outputter = new XMLOutputter();
		//Set the output to the temporary output stream.
		xmlOutputter = outputter;
		//Write the document object to the temporary output stream.
		ostream = documentStream;
		new IFXDocumentHandler().write(doc, documentStream);
		//Close the temporary stream.
		documentStream.close();
		
	}


	/* Parse a Document object into an IFXObject.
	 * @param input The document to parse into an IFXObject.
	 * @param ignoreElementIndicators If true, the element names will not be
	 * included in the generated report.
	 * @return A IFXObject representing the parsed document.
	 */
	public Element parse(Document input, boolean ignoreElementIndicators)//, boolean ignoreAttributes)
	{
		//Create a new DocumentBuilder to create a Document object that is
		// initialized to not be able to validate the document.
		SAXBuilder b = new SAXBuilder();
		//Create a Document object which is initialized to be able to read the
        // document.
		Document document = b.build(new InputStreamReader(input.getContentAsStream()));
		//Parse the document object into a map of attribute (key) -> value.
        Map map = getMap(input.getRootElement());
		//Validate that the document object is indeed a non-null (so an empty
		//document is not valid.)
		assertNotNull(map.get("dummy"));
		//Reset the map so that we are ready to use "to build" the generated report.
		map = null;
		
		//Get an iterator over the map's elements. This is the only way to access
		//the map's child element.
		Iterator it = map.entrySet().iterator();
		//While the element iterator has more than one item.
	     while (it.hasNext()) {
	     	//Get the current map entry and access its child. 
        	Map.Entry entry = (Map.Entry) it.next();
        	//Get the name attribute that is contained in the attribute 
        	String name = (String) entry.getKey();
        	 // If the names of the elements are not the same, this should be a
        	// wrong element.
	    	if (!name.equals("dummy")) {
	    		//Add the element found by evaluating its name to the map.
	    		map.put(name, entry.getValue());
	    	}
	     }
		//Return the generated document object.
		return document.getRootElement();
	}
	private Map getMap(Element rootElement)
        {
        	assertNotNull("GetMap failed for an empty element", rootElement);

                Namespace prefix = rootElement.getNamespace();

        	//Get the prefix for the namespace of the root element.
}
}
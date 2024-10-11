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
		final static String TESTDATA =
		"<Doc>\n" +
		"  <Item id=\"1\" version=\"2\"/>\n" +
		"  <Item id=\"3\" version=\"2\"/>\n" +
		"</Doc>\n";
			
	Class<IFXObject> clazz;
	
    /**
     * Returns an Iterator of {@link IFXObject}s that correspond to the passed
     * IFXFile objects.
     * @param objects <IFXFile> objects to get {@link IFXObject}s for.
     * @return <IFXObject> Iterator of <IFXObject>s.
     * @throws IOException if there was an IOException.
     * @throws IFXException if there was an IFXException.
     */
	Iterator getDocObject(IFXFile objects[], Map map_) throws IOException, IFXException {
        SAXBuilder builder = new SAXBuilder();
        return builder.build(objects, map_).getRootElement().getChildren().iterator();
	}
	
	/**
	 * Get a {@link Document} from a String.
	 * @param str the String to parse.
	 * @return a Document object.
	 * @throws IOException if there was an IOException.
	 */
	Document getDocBySource(String str) throws IOException {
  	    SAXBuilder builder = new SAXBuilder();
		return builder.build(str);
	}

	/**
	 * Builds an IFXObject from a Document object.
	 * @param doc the Document object to parse.
	 * @param namespaces a namespace context Map.
	 * @return a IFXObject.
	 * @throws IOException if there was an IOException.
	* @throws SAXException if there is a SAXException.
	 */
	IFXObject build(Document doc, Map namespaces) throws IOException, SAXException {
  	  // Get a builder and SAX builder to build XML Document, and build
  	  // XML from the document.
  	  SAXBuilder builder = new SAXBuilder();
  	  InputStream istream1 = doc.getRootElement().getContent().getContentStream();
  	  SAXBuilder builder1 = new SAXBuilder();
		//Build Document from xml source...
  	  Document doc1 = builder1.build(new InputStreamReader(istream1, "ISO-8859-1"));
  	  SAXBuilder builder2 = new SAXBuilder();
  	  XMLOutputter xmlOut = new XMLOutputter(builder2);
  	  //XMLOutputter output = new XMLOutputter(builder.getNamespaceAware()) {};
  	  OutputStream os = doc1.getRootElement().getContent().getCharacterStream();
  	  assertNotNull(os);
  	  String output = xmlOut.outputString(doc1, 0,
  	      doc1.getRootElement());
  	  //System.out.println(output);
  	  
    try {
      istream1.close();
    } catch (IOException e) {
      // Ignore
    }
    return (IFXObject) builder.getRootElement().getContent().getDocumentElement().getContent();
	}
}
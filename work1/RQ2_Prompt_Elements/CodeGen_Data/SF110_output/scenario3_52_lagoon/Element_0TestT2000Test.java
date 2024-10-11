// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {
static final String E_XML = "<!DOCTYPE tag [ <!DOCTYPE> <!ELEMENT tag> <!ELEMENT tag> ]>";

		public static void main(String args[]) throws Exception {
		/* Create a new document that we're going to send it to. */
	
		URL url = Element_0Test.class.getResource("Element_0Test.xml");
		XMLPump pump = new XMLPump(E_XML, url);
		
		// Get the element we're to send to. This is our element to
		// write to.
		Element element = new Element(pump);
		
		// Send the element.
		pump.start();

		for(int i = 0; i < 300; ++i) {
			// Element elementToSend = new Element(pump);
			pump.send(element);
		}
	}

	public int lookupAttribute(String namespaceURI, String localName) throws SAXException {
		Attributes attrs = new AttributesImpl();
		return attrs.lookupAttribute(namespaceURI, localName);
	}
}
/* End Element_0Test.java */

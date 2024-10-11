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
		/**
		 * Test method for {@link Element#lookupAttribute(String, String)}.
		 */
		@org.junit.jupiter.api.Test
		void testLookupAttribute() {
				// prepare the elements.
                Vector<String> attributes = new Vector<String>();
                attributes.add("http://www.w3.org/1999/xhtml", "height");
                attributes.add("http://www.w3.org/1999/xhtml", "href");
                attributes.add("http://www.w3.org/1999/xhtml", "targetPrefixed");
				attributes.add("http://www.w3.org/1999/xhtml", "_self");
				attributes.add("http://www.w3.org/1999/xhtml", "className");

				attributes.add("http://www.w3.org/1999/xhtml", "name");
				attributes.add("http://www.w3.org/1999/xhtml", "style");

				// invoke method.
                Element element = new Element(attributes, null, null);

				// check result.
                assertEquals(
				"Element.lookupAttribute() returns 0 for the first attribute", 
				-1, 
				element.lookupAttribute(null, null)
				); 	
        }
}
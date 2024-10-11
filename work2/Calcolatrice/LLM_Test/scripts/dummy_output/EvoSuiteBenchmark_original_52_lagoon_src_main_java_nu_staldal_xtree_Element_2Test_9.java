// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {
		private static final String ATTRIBUTE = "atr";
	/**
	 * Constructor of Element_2Test.
	 */
    public Element_2Test() {
    }

	/**
	 * Test case of {@link Element#getAttributeNamespaceURI(int)}.
	 * Checks to see if the URI returned by {@link #lookupAttribute(URI)}
	 * will return a URI.
	 * 
	 * @throws InvalidAttributeNameException if no URI can be determined
	 * @throws InvalidAttributeValueException if no valid URI can be
	 *   determined.
	 */
    @Test
    public void testElement_1_1_LookUpAttribute() throws InvalidAttributeNameException, InvalidAttributeValueException {
        Vector listOfParsedAttributes = new Vector();
    	Element root = new Element("root");
    	Element child = new Element("child");
    	Attributes atts = new AttributesImpl();
    	
	    atts.addAttribute("name", ATTRIBUTE, "uri", "http://www.newbie.org");
	    listOfParsedAttributes.add(new NodeAndValue(child, atts));
	    atts.addAttribute("name", ATTRIBUTE, "uri", null);
	    listOfParsedAttributes.add(new NodeAndValue(root, atts));
    	
			// The URI of the element
    	Vector listOfUniqueUrls = getUrls(root);
    	String expectedURI = null;
}
}
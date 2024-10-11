// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		public static final String NAMESPACE = "http://xml.org/sax/properties/xml-namespace";
		public static final String PICTUREURL = "http://www.domutils.org/dom-test.txt";

	/**
	 * Run the String getAttributeLocalName(int) method test case.
	 * @throws Exception if the method fails
	 */
	@Test
	public void testGetAttributeLocalName() throws Exception {
		setUp(new String[]{NAMESPACE, PICTUREURL});
		final String test = "urn:xml:namespace:org.domutils";
		final String expected = "urn:c14n2:xmlns:xml - " + NAMESPACE;
		final String result = getAttributeLocalName(0);
		assertEquals("getAttributeLocalName(), expected '"+expected+"' result '" + result + "''", expected, result)
;
		assertEquals("getAttributeLocalName(), expected '"+expected+"' result '" + result + "''", expected, result);
	}
}
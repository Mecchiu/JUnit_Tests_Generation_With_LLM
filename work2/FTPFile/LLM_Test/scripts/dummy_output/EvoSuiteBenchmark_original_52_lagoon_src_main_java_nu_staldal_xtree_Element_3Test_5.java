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
		private final static String XMLTEXT =
"<Element name=\"element\"\n"+
"xmlns:y=\"uri\">\n"+
" <y:element attribute-local-name=\"x\">\n"+
" <y:test  attribute-local-name=\"1\">\n"+
" </y:test>\n"+
" </y:Element>\n"+
"</Element>";

	@Test public void test_getAttributeLocalName() {
		assertNull("null", Element_3Test.getAttributeLocalName(0));
		Element_3Test.test_getAttributeLocalName(0, 4);
		Element_3Test.test_getAttributeLocalName(4, 0);
		Element_3Test.test_getAttributeLocalName(4, 4);
	}

	@Test public void test_lookupAttribute() {
		AttributesImpl attrs = new AttributesImpl();
		for (int i = 0; i < 2; i++) {
			String name = Element_3Test.getAttributeLocalName(i).intern();
			String value = "value";
			Element_3Test.test_lookupAttribute(name, value, attrs, i);
		}
	}
}
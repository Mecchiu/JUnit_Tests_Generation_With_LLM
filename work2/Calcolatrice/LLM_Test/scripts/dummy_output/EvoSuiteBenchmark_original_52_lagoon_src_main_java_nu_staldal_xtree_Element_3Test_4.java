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
		static final String ELEM = "element3Test";
	
	@Test
	void testGetAttributeLocalName() {
		Element element = new Element();
		String result = element.getAttributeLocalName(0);
		assertEquals( "attribute", "", result);
		String name = "element";
		if (ELEM!= null) {
			name = ELEM;
		}
		assertEquals(name, "", result);
		element.setAttributeLocalName(0, "attribute");
		String name2 = "attribute";
        if (ELEM!= null) {
            name = ELEM;
        }
		assertEquals( name, "attribute", result);
		element.setAttributeLocalName(1, "attribute");
		name2 = "attribute";
		String name3 = "attribute";
	    int i = 0;
		element.putAttributeLocalName(i, name2);
		i++;
		String name4 = "attribute";
	    element.removeAttributeLocalName(i);
		Vector v = new Vector();
		element.getAttributeVector(v);
		System.out.println(v.toString());

        }
        

}
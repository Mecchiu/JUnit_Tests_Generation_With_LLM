// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {
		
    int numberOfNamespaceMappings() { return element.getNumberOfNamespaceMappings(); }
	
    /** 
	 * Test for non-fatal parsing result.
	 */
	@Test (expected=org.xml.sax.SAXException.class) @org.junit.jupiter.api.AssumableInputSource('<a xmlns="http://www.w3.org/1999/xhtml">')
		public void test_1() throws Exception {
            new Element(AttributesImpls.createAttributes("xmlns".toCharArray(), new Vector<NamespaceMapping>()), URL.create("test.xml").toString());
		}
}